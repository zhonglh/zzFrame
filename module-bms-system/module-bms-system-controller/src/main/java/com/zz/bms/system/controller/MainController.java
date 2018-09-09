package com.zz.bms.system.controller;

import com.zz.bms.controller.base.controller.BaseBussinessController;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.core.enums.EnumYesNo;
import com.zz.bms.system.bo.TsMyShortcutBO;
import com.zz.bms.system.bo.VsUserMenuBO;
import com.zz.bms.system.domain.TsUserEntity;
import com.zz.bms.system.query.TsMyShortcutQuery;
import com.zz.bms.system.query.VsUserMenuQuery;
import com.zz.bms.system.query.impl.TsMyShortcutQueryImpl;
import com.zz.bms.system.query.impl.VsUserMenuQueryImpl;
import com.zz.bms.system.service.TsMyShortcutService;
import com.zz.bms.system.service.VsUserMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 处理首页信息
 * @author Administrator
 */
@RequestMapping("/main")
@Controller
public class MainController extends BaseBussinessController {

    @Autowired
    private VsUserMenuService vsUserMenuService;

    @Autowired
    private TsMyShortcutService myShortcutService;


    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(ModelMap model , HttpServletRequest request , HttpServletResponse response){
        ILoginUserEntity loginUser = this.getSessionUser();
        if(loginUser instanceof TsUserEntity){
            ((TsUserEntity)loginUser).setLoginPassword(null);
        }

        model.put("loginUser" , loginUser);


        VsUserMenuQuery query = new VsUserMenuQueryImpl();
        query.userId(loginUser.getId());
        List<VsUserMenuBO> menus = vsUserMenuService.selectList(query.buildWrapper());
        if(menus == null){
            menus = new ArrayList<VsUserMenuBO>();
        }
        model.put("menus" , menus);

        List<VsUserMenuBO> shortcutMenus = new ArrayList<VsUserMenuBO>();
        for(VsUserMenuBO menu : menus){
            if(EnumYesNo.YES.getCode().equals(menu.getShortcut())){
                shortcutMenus.add(menu);
            }
        }

        TsMyShortcutQuery shortcutQuery = new TsMyShortcutQueryImpl();
        shortcutQuery.userId(loginUser.getId());
        List<TsMyShortcutBO> shortcuts = myShortcutService.selectList(shortcutQuery.buildWrapper().orderBy("orderby"));
        Map<String,String> myShortcutMap = new HashMap<String,String>();
        if(shortcuts != null && !shortcuts.isEmpty()){
            for(TsMyShortcutBO shortcut : shortcuts){
                myShortcutMap.put(shortcut.getMenuId() , shortcut.getMenuId());
            }
        }

        List<VsUserMenuBO> topShortcutMenus = new  ArrayList<VsUserMenuBO>();
        List<VsUserMenuBO> moreShortcutMenus = new  ArrayList<VsUserMenuBO>();

        for(VsUserMenuBO shortcutMenu : shortcutMenus){
            if(myShortcutMap.containsKey(shortcutMenu.getId())){
                topShortcutMenus.add(shortcutMenu);
            }else {
                moreShortcutMenus.add(shortcutMenu);
            }
        }


        model.put("topShortcutMenus" , topShortcutMenus);
        model.put("moreShortcutMenus" , moreShortcutMenus);

        return "main/home";
    }




    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String home2(HttpServletRequest request , HttpServletResponse response){
        return "main/welcome";
    }

}
