package com.zz.bms.core.ui;

import java.util.HashMap;

/**
 * Tree模型
 * 要展示为树的对象应该有树的数据格式， 比如要将部门树状态展示 ，
 * 需要有树的数据模型， 比如树类型里的id对应部门里的那个属性， text对应树的那个属性
 * @author Administrator
 */
public class TreeModel extends HashMap {

    public TreeModel(){

    }


    /**
     * 转为easyui tree类型的TreeModel
     * @param id
     * @param pid
     * @param text
     * @param children
     * @return
     */
    public TreeModel toTreeModel(String id , String pid , String text ,  String children  ){
        this.put("id" , id);
        this.put("pid" , pid);
        this.put("text" , text);
        if(children != null && !children.isEmpty()) {
            this.put("children", children);
        }
        return this;
    }
    public TreeModel toTreeModel(String id , String pid , String text , String checked , String children , String attributes ){
        this.put("id" , id);
        this.put("pid" , pid);
        this.put("text" , text);
        if(checked != null && !checked.isEmpty()) {
            this.put("checked" , checked);
        }
        if(children != null && !children.isEmpty()) {
            this.put("children", children);
        }
        if(attributes != null && !attributes.isEmpty()) {
            this.put("attributes" , attributes);
        }
        return this;
    }

}
