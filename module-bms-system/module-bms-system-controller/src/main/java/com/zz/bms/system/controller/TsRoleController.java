package com.zz.bms.system.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.core.ui.easyui.EasyUiTree;
import com.zz.bms.core.ui.easyui.TreeUtil;
import com.zz.bms.system.bo.*;
import  com.zz.bms.system.query.impl.TsRoleQueryWebImpl;

import com.zz.bms.system.service.TsMenuService;
import com.zz.bms.system.service.TsRolePermitService;
import com.zz.bms.system.service.VsMenuPermitService;
import com.zz.bms.util.base.data.MyBeanUtils;
import org.apache.commons.configuration.tree.TreeUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * 角色 控制层
* @author Administrator
* @date 2018-9-6 23:56:31
 */
@RequestMapping("/system/role")
@Controller
public class TsRoleController extends ZzDefaultController<TsRoleBO, String , TsRoleQueryWebImpl> {

	@Autowired
	private TsMenuService menuService;

    @Autowired
	private TsRolePermitService rolePermitService;

	@Autowired
	private VsMenuPermitService menuPermitService;



	private static List<EasyUiTree> allPermit = null;



    /**
     * 拿到所有的许可
     * @return
     */
	private List<EasyUiTree> getAllPermitTree(){
	    if(allPermit == null) {
            synchronized (this) {
                if(allPermit == null) {


                    List<EasyUiTree> trees = new ArrayList<EasyUiTree>();
                    List<TsMenuBO> menus = menuService.list();
                    List<VsMenuPermitBO> menuPermits = menuPermitService.list();

                    List<TsMenuBO> temps = new ArrayList<>();
                    for (TsMenuBO menu : menus) {
                        trees.add(menu.toEasyUiTree());
                    }
                    for (VsMenuPermitBO menuPermit : menuPermits) {
                        trees.add(menuPermit.toEasyUiTree());
                    }

                    allPermit = trees;

                }
            }
        }


        try {
            return (List<EasyUiTree>) MyBeanUtils.deepCopy(allPermit);
        }catch(Exception e){
            throw new BizException(0,"出现错误，请重试");
        }

    }



	@RequestMapping(value = "/permitTree" , method={ RequestMethod.POST, RequestMethod.GET})
	@ResponseBody
	public EasyUiTree permitTree(String roleId){

        List<EasyUiTree> easyUiTree = getAllPermitTree();
        List<String> rolePermitIds = null;

        if(StringUtils.isNotEmpty(roleId)){
            QueryWrapper<TsRolePermitBO> queryWrapper = new QueryWrapper<TsRolePermitBO>();
            queryWrapper.lambda().eq(TsRolePermitBO::getRoleId,roleId);
            List<TsRolePermitBO> rolePermitBOs = rolePermitService.list(queryWrapper);
            if(rolePermitBOs != null && !rolePermitBOs.isEmpty()){

                rolePermitIds = new ArrayList<String>();
                for(TsRolePermitBO rolePermitBO : rolePermitBOs){
                    rolePermitIds.add(rolePermitBO.getPermitId());
                }
            }
        }

        EasyUiTree rootTree = TreeUtil.buildToTree(easyUiTree, "所有许可" , rolePermitIds);


        return rootTree;

	}




}
