package com.zz.bms.system.logic;

import com.zz.bms.system.bo.VsUserMenuBO;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 处理菜单逻辑
 * @author Administrator
 */
public class MenuLogic {


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
        newMenus.sort((o1 , o2) -> (o1.getLevel()*levenWeight+o1.getMenuSort()) - (o2.getLevel()*levenWeight+o2.getMenuSort()));
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
        bo.setMenuSort(5);
        ums.add(bo);



        bo = new VsUserMenuBO();
        bo.setId("30");
        bo.setPid("11");
        bo.setMenuSort(15);
        ums.add(bo);

        bo = new VsUserMenuBO();
        bo.setId("4");
        bo.setPid("2");
        bo.setMenuSort(9);
        ums.add(bo);

        bo = new VsUserMenuBO();
        bo.setId("6");
        bo.setPid("3");
        bo.setMenuSort(12);
        ums.add(bo);

        bo = new VsUserMenuBO();
        bo.setId("7");
        bo.setPid("6");
        bo.setMenuSort(4);
        ums.add(bo);

        bo = new VsUserMenuBO();
        bo.setId("2");
        bo.setPid("1");
        bo.setMenuSort(2);
        ums.add(bo);

        bo = new VsUserMenuBO();
        bo.setId("3");
        bo.setPid("1");
        bo.setMenuSort(1);
        ums.add(bo);



        bo = new VsUserMenuBO();
        bo.setId("9");
        bo.setPid("4");
        bo.setMenuSort(18);
        ums.add(bo);

        List<VsUserMenuBO> list = sortMenu(ums);
        list.forEach(x -> System.out.println(x));
    }


}
