package com.zz.bms.core.ui;

import java.util.HashMap;

/**
 * Tree模型
 * 要展示为树的对象应该有树的数据格式， 比如要将部门树状态展示 ，
 * 需要有树的数据模型， 比如树类型里的id对应部门里的那个属性， text对应树的那个属性
 * @author Administrator
 */
public class TreeModel  {

    public static final String ID = "id";
    public static final String PID = "pid";
    public static final String TEXT = "text";
    public static final String CHECKED = "checked";
    public static final String CHILDREN = "children";
    public static final String ATTRIBUTES = "attributes";


}
