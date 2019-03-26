package com.zz.bms.core.ui;

import java.util.HashMap;

/**
 * Tree模型
 * 要展示为树的对象应该有树的数据格式， 比如要将部门树状态展示 ，
 * 需要有树的数据模型， 比如树类型里的id对应部门里的那个属性， text对应树的那个属性
 * @author Administrator
 */
public class TreeModel extends HashMap {

    public static final String ID = "id";
    public static final String PID = "pid";
    public static final String TEXT = "text";
    public static final String CHECKED = "checked";
    public static final String CHILDREN = "children";
    public static final String ATTRIBUTES = "attributes";

    public TreeModel(){

    }


    public TreeModel toTreeModel(String pid , String text){
        return toTreeModel ("id" , pid,text , null);
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
        this.put(ID , id);
        this.put(PID , pid);
        this.put(TEXT , text);
        if(children != null && !children.isEmpty()) {
            this.put(CHILDREN, children);
        }
        return this;
    }
    public TreeModel toTreeModel(String id , String pid , String text , String checked , String children , String attributes ){
        this.put(ID , id);
        this.put(PID , pid);
        this.put(TEXT , text);
        if(checked != null && !checked.isEmpty()) {
            this.put(CHECKED , checked);
        }
        if(children != null && !children.isEmpty()) {
            this.put(CHILDREN, children);
        }
        if(attributes != null && !attributes.isEmpty()) {
            this.put(ATTRIBUTES , attributes);
        }
        return this;
    }

}
