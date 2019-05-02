package com.zz.bms.system.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zz.bms.controller.base.controller.BaseController;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.enums.EnumYesNo;
import com.zz.bms.shiro.utils.ShiroUtils;
import com.zz.bms.system.bo.TsMyShortcutBO;
import com.zz.bms.system.bo.TsNotificationBO;
import com.zz.bms.system.bo.VsUserMenuBO;
import com.zz.bms.system.domain.TsUserEntity;
import com.zz.bms.system.logic.MenuLogic;
import com.zz.bms.system.query.TsMyShortcutQuery;
import com.zz.bms.system.query.TsNotificationQuery;
import com.zz.bms.system.query.VsUserMenuQuery;
import com.zz.bms.system.query.impl.TsMyShortcutQueryImpl;
import com.zz.bms.system.query.impl.TsNotificationQueryImpl;
import com.zz.bms.system.query.impl.VsUserMenuQueryImpl;
import com.zz.bms.system.service.TsMyShortcutService;
import com.zz.bms.system.service.TsNotificationService;
import com.zz.bms.system.service.VsUserMenuService;
import com.zz.bms.system.websocket.ZzSendNotify;
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
public class MainController extends BaseController {

    @Autowired
    private VsUserMenuService vsUserMenuService;

    @Autowired
    private TsMyShortcutService myShortcutService;

    @Autowired
    private TsNotificationService tsNotificationService;


    @Autowired
    private ZzSendNotify sendNotify;


    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String home2(HttpServletRequest request , HttpServletResponse response){
        return "main/welcome";
    }

    /**
     * 主页
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(ModelMap model , HttpServletRequest request , HttpServletResponse response) {
        final ILoginUserEntity loginUser = this.getSessionUser();
        if (loginUser instanceof TsUserEntity) {
            ((TsUserEntity) loginUser).setLoginPassword(null);
        }

        model.put("loginUser", loginUser);
        model.put("userSessoinId",ShiroUtils.getSession().getId());

        try {
            //处理菜单
            VsUserMenuQuery query = new VsUserMenuQueryImpl();
            query.userId(loginUser.getId());
            QueryWrapper<VsUserMenuBO> qw = query.buildWrapper();
            qw.orderByAsc("level");
            List<VsUserMenuBO> menus = vsUserMenuService.list();

            if(menus != null && !menus.isEmpty()) {
                menus = MenuLogic.sortMenu(menus);
                menus.sort ((o1, o2) -> o1.getSortIndex() - o2.getSortIndex() );
            }else {
                menus = new ArrayList<VsUserMenuBO>();
            }
            model.put("menus", menus);

        //处理快捷菜单
        List<VsUserMenuBO> shortcutMenus = new ArrayList<VsUserMenuBO>();
        for (VsUserMenuBO menu : menus) {
            if (EnumYesNo.YES.getCode().equals(menu.getLeaf()) && EnumYesNo.YES.getCode().equals(menu.getShortcut())) {
                shortcutMenus.add(menu);
            }
        }
        TsMyShortcutQuery shortcutQuery = new TsMyShortcutQueryImpl();
        shortcutQuery.userId(loginUser.getId());
        QueryWrapper shortcutQ = shortcutQuery.buildWrapper();
        shortcutQ.orderByAsc("orderby");
        List<TsMyShortcutBO> shortcuts = myShortcutService.list(shortcutQ);
        Map<String, String> myShortcutMap = new HashMap<String, String>();
        if (shortcuts != null && !shortcuts.isEmpty()) {
            for (TsMyShortcutBO shortcut : shortcuts) {
                myShortcutMap.put(shortcut.getMenuId(), shortcut.getMenuId());
            }
        }
        List<VsUserMenuBO> topShortcutMenus = new ArrayList<VsUserMenuBO>();
        List<VsUserMenuBO> moreShortcutMenus = new ArrayList<VsUserMenuBO>();
        for (VsUserMenuBO shortcutMenu : shortcutMenus) {
            if (myShortcutMap.containsKey(shortcutMenu.getId())) {
                topShortcutMenus.add(shortcutMenu);
            } else {
                moreShortcutMenus.add(shortcutMenu);
            }
        }
        model.put("topShortcutMenus", topShortcutMenus);
        model.put("moreShortcutMenus", moreShortcutMenus);


        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        //处理未读通知数
        //todo
        /*TsNotificationQuery notifyQuery = new TsNotificationQueryImpl();
        notifyQuery.toUserId(loginUser.getId());
        notifyQuery.isRead(EnumYesNo.NO.getCode());

        int count = tsNotificationService.count(notifyQuery.buildWrapper());
        model.put("notReadNotifyCount", count);*/
        model.put("notReadNotifyCount", 0);
        //todo 测试使用 , 后期需要删除
        //testNotify(loginUser);

        return "main/home";
    }


    /**
     * 测试发送通知， 正式版本需要可删除
     * @param loginUser
     */
    private void testNotify(ILoginUserEntity loginUser){
        //todo , 测试用 正式环境要删除
        for (int i = 0; i < 10; i++){
            new Thread(new Aaa(i+1 , sendNotify , loginUser)).start();
        }
    }


    static class Aaa implements Runnable{
        ZzSendNotify sendNotify;
        ILoginUserEntity loginUser;
        int index ;
        public Aaa(int index , ZzSendNotify sendNotify , ILoginUserEntity loginUser){
            this.index = index;
            this.sendNotify = sendNotify;
            this.loginUser = loginUser;
        }

        @Override
        public void run() {
            long stime = 1000 * 10 * index;
            try {
                Thread.sleep(stime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            TsNotificationBO notify = new TsNotificationBO();
            //todo
            //notify.setToUserId((String) loginUser.getId());
            notify.setTitle("aaa");
            notify.setContent("dfsadweqq    这是一个动画显示的\r\n对话框，用于显示信息。对话框窗口weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这可以移动，调整尺寸，<br>默认可通过 这vd sdafa  weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这 ewfe  背景：在项目中，<br>登录页验证用户名和密码是否匹配，如果不匹配，则抖动输入框，提示用户输入错误 fweif efdeadsffff efeqr er   qerefadqw  qeqweqweqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这是一个动画显示的对话框，背景：在项目中，登录页验证用户名和密码是否匹配，如果不weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这匹配，则抖动输入框，提示用户输入错误 用于显示信息。对话框窗口可以移动，调dfsadweqq    这是一个动画显示的对话框，用于显示信息。对话框窗口weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这可以移动，调整尺寸，<br>默认可通过 这vd sdafa  weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可\n以移动，调整尺寸，<br>默认可通过 这 ewfe  背景：在项目中，<br>登录页验证用户名和密码是否匹配，如果不匹配，则抖动输入框，提示用户输入错误 fweif efdeadsffff efeqr er   qerefadqw  qeqweqweqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这是一个动画显示的对话框，背景：在项目中，登录页验证用户名和密码是否匹配，如果不weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这匹配，则抖动输入框，提示用户输入错误 用于显示dfsadweqq    这是一个动画显示的对话框，用于显示信息。对话框窗口weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这可以移动，调整尺寸，<br>默认可通过 这vd sdafa  weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这 ewfe  背景：在项目中，<br>登录页验证用户名和密码是否匹配，如果不匹配，则抖动输入框，提示用户输入错误 fweif efdeadsffff efeqr er   qerefadqw  qeqweqweqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这是一个动画显示的对话框，背景：在项目中，登录页验证用户名和密码是否匹配，如果不weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这匹配，则抖动输入框，提示dfsadweqq    这是一个动画显示的对话框，用于显示信息。对话框窗口weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这可以移动，调整尺寸，<br>默认可通过 这vd sdafa  weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这 ewfe  背景：在项目中，<br>登录页验证用户名和密码是否匹配，如果不匹配，则抖动输入框，提示用户输入错误 fweif efdeadsffff efeqr er   qerefadqw  qeqweqweqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这是一个动画显示的对话框，背景：在项目中，登录页验证用户名和密码是否匹配，如果不weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话\n框窗口可以移动，调整尺寸，<br>默认可通过 这weqq    这是一个动画显示的对话框，用于显示信息。对话框窗口可以移动，\n调整尺寸，<br>默认可通过 这匹配，则抖动输入框，提示用户输入错误 用于显示信息。对话框窗口可以移动，调整尺寸，默认可通过 用户输入错误 用于显示信息。对话框窗口可以移动，调整尺寸，默认可通过 信息。对话框窗口可以移动，调整尺寸，默认可通过 整尺寸，默认可通过    ");
            sendNotify.sendNotify(notify, loginUser);
        }
    }

}
