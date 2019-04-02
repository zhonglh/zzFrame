package com.zz.bms.core.ui.easyui;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * easyui tree
 * @author Administrator
 */
public class EasyUiTree implements Serializable {


    public static final String TREE_TYPE = "treeType";

    private String id;
    private String pid;
    private String text;
    private String state;
    private boolean checked;
    private List<EasyUiTree> children;
    private Map attributes;


    public static EasyUiTree processData(List<EasyUiTree> list){
        return processData(list, "全部");
    }
    public static EasyUiTree processData(List<EasyUiTree> list , String rootNodeName){
        if(list == null || list.isEmpty()){
            return null;
        }

       return  TreeUtil.buildToTree(list , rootNodeName);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public Map getAttributes() {
        return attributes;
    }

    public void setAttributes(Map attributes) {
        this.attributes = attributes;
    }

    public List<EasyUiTree> getChildren() {
        return children;
    }

    public void setChildren(List<EasyUiTree> children) {
        this.children = children;
    }
}
