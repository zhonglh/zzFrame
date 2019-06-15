package com.zz.bms.system.logic;

import com.zz.bms.system.bo.TsMenuBO;
import com.zz.bms.system.bo.TsUserBO;
import com.zz.bms.system.bo.VsUserMenuBO;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 处理菜单逻辑
 * @author Administrator
 */
public class MenuLogic {


    public static List<TsMenuBO> getAllParentMenusByView(List<TsMenuBO> allMenus  ,  List<VsUserMenuBO> nodeMenus){
        if(allMenus == null || allMenus.isEmpty() || nodeMenus == null || nodeMenus.isEmpty()){
            return null;
        }


        Map<String, TsMenuBO> allMenuMap = new HashMap<String, TsMenuBO>();
        for(TsMenuBO menu : allMenus){
            allMenuMap.put(menu.getId() , menu);
        }

        List<TsMenuBO> menus = new ArrayList<TsMenuBO>();
        for(VsUserMenuBO node : nodeMenus){
            TsMenuBO menu = allMenuMap.get(node.getId());
            if(menu != null){
                menus.add(menu);
            }
        }

        return getAllParentMenus(allMenus , menus);

    }

    public static List<TsMenuBO> getAllParentMenus(List<TsMenuBO> allMenus  ,  List<TsMenuBO> nodeMenus){
        if(allMenus == null || allMenus.isEmpty() || nodeMenus == null || nodeMenus.isEmpty()){
            return null;
        }

        Map<String, TsMenuBO> allMenuMap = new HashMap<String, TsMenuBO>();
        for(TsMenuBO menu : allMenus){
            allMenuMap.put(menu.getId() , menu);
        }

        Set<TsMenuBO>  menuSet = new HashSet<TsMenuBO>();
        for(TsMenuBO node : nodeMenus){
            if(node == null || StringUtils.isEmpty(node.getPid())){
                continue;
            }
            getParentMenus( node  , allMenuMap , menuSet );
        }
        if(menuSet.isEmpty()){
            return null;
        }else {
            return new ArrayList<>(menuSet);
        }
    }

    private static void getParentMenus(TsMenuBO node , Map<String, TsMenuBO> allMenuMap, Set<TsMenuBO>  menuSet) {
        TsMenuBO parentMenu = allMenuMap.get(node.getPid());
        if(parentMenu != null && !menuSet.contains(parentMenu)){
            menuSet.add(parentMenu);
            if(StringUtils.isNotEmpty(parentMenu.getPid())){
                getParentMenus(parentMenu , allMenuMap , menuSet);
            }
        }
    }

    /**
     * 类型转换
     * @param tsMenuBOs
     * @return
     */
    public static List<VsUserMenuBO> toVsUserMenu(List<TsMenuBO> tsMenuBOs){
        if(tsMenuBOs == null || tsMenuBOs.isEmpty()){
            return null;
        }
        List<VsUserMenuBO> userMenuBOs = new ArrayList<VsUserMenuBO>();
        for(TsMenuBO tsMenuBO : tsMenuBOs){
            VsUserMenuBO vsUserMenuBO = new VsUserMenuBO();
            vsUserMenuBO.setId(tsMenuBO.getId());
            vsUserMenuBO.setPid(tsMenuBO.getPid());
            vsUserMenuBO.setTitle(tsMenuBO.getMenuName());
            vsUserMenuBO.setIcon(tsMenuBO.getMenuIcon());
            vsUserMenuBO.setComponent(tsMenuBO.getMenuMsg());
            vsUserMenuBO.setSortno(tsMenuBO.getMenuSort());
            vsUserMenuBO.setPath(tsMenuBO.getMenuUrl());
            vsUserMenuBO.setShortcut(tsMenuBO.getShortcut());
            vsUserMenuBO.setName(tsMenuBO.getMenuCode());
            vsUserMenuBO.setLeaf(tsMenuBO.getLeaf());
            vsUserMenuBO.setLevel(tsMenuBO.getLevel());
            vsUserMenuBO.setTarget(tsMenuBO.getTarget());
            userMenuBOs.add(vsUserMenuBO);
        }
        return userMenuBOs;
    }


    /**
     * 菜单排序， 设置层级
     * @param menus
     */
    public static List<VsUserMenuBO> sortMenu(List<VsUserMenuBO> menus){

        if(menus == null || menus.isEmpty()){
            return menus;
        }
        Map<String , VsUserMenuBO> menuMap = new HashMap<String , VsUserMenuBO>();


        for(VsUserMenuBO menu : menus){
            menuMap.put(menu.getId() , menu);
            if(StringUtils.isEmpty(menu.getPid())){
                menu.setLevel(1);
            }
        }


        for(VsUserMenuBO menu : menus){
            if(menu.getLevel() > 0){
                continue;
            }else {
                setMenuLevel(menuMap , menu);
            }
        }

        List<VsUserMenuBO> newMenus =  menus.stream().filter(x -> x.getLevel() > 0).collect(Collectors.toList());
        int levenWeight = 1000000;
        newMenus.sort((o1 , o2) -> (o1.getLevel()*levenWeight+o1.getSortno()) - (o2.getLevel()*levenWeight+o2.getSortno()));
        return newMenus;

    }

    /**
     * 设置层级
     * @param menuMap
     * @param currMenu
     */
    private static void setMenuLevel(Map<String , VsUserMenuBO> menuMap , VsUserMenuBO currMenu){
        VsUserMenuBO parentMenu = menuMap.get(currMenu.getPid());
        if(parentMenu != null){
            //  'lenvl > 0' 表示已经设置Leven ,
            if(parentMenu.getLevel() > 0){
                currMenu.setLevel(parentMenu.getLevel() + 1);
            }else {
                setMenuLevel(menuMap , parentMenu);
                if(parentMenu.getLevel() > 0){
                    currMenu.setLevel(parentMenu.getLevel() + 1);
                }
            }
        }
    }






    public static void main(String[] args) {
        List<VsUserMenuBO> ums = new ArrayList<VsUserMenuBO>();
        VsUserMenuBO bo = new VsUserMenuBO();
        bo.setId("1");
        bo.setSortno(5);
        ums.add(bo);



        bo = new VsUserMenuBO();
        bo.setId("30");
        bo.setPid("11");
        bo.setSortno(15);
        ums.add(bo);

        bo = new VsUserMenuBO();
        bo.setId("4");
        bo.setPid("2");
        bo.setSortno(9);
        ums.add(bo);

        bo = new VsUserMenuBO();
        bo.setId("6");
        bo.setPid("3");
        bo.setSortno(12);
        ums.add(bo);

        bo = new VsUserMenuBO();
        bo.setId("7");
        bo.setPid("6");
        bo.setSortno(4);
        ums.add(bo);

        bo = new VsUserMenuBO();
        bo.setId("2");
        bo.setPid("1");
        bo.setSortno(2);
        ums.add(bo);

        bo = new VsUserMenuBO();
        bo.setId("3");
        bo.setPid("1");
        bo.setSortno(1);
        ums.add(bo);



        bo = new VsUserMenuBO();
        bo.setId("9");
        bo.setPid("4");
        bo.setSortno(18);
        ums.add(bo);

        List<VsUserMenuBO> list = sortMenu(ums);
        list.forEach(x -> System.out.println(x));
    }


}
