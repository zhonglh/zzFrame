package com.zz.bms.core.ui.easyui;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zz.bms.core.ui.Pages;
import com.zz.bms.core.ui.TreeModel;

import java.util.List;

/**
 * EasyUI 的工具类
 * @author Administrator
 */
public class EasyUiUtil {




    public static List toTree(List list , TreeModel treeModel){
        //todo
        return null;
    }
    public static List toTreeList(List list , TreeModel treeModel){
        //todo
        return null;
    }

    public static EasyUiDataGrid toDataGrid(Pages pages){
        return new EasyUiDataGrid(pages.getTotal() , pages.getResults());
    }


    public static EasyUiDataGrid toDataGrid(Page page){
        return new EasyUiDataGrid(page.getTotal() ,page.getRecords());
    }



}
