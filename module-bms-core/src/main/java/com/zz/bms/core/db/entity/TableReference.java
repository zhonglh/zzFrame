package com.zz.bms.core.db.entity;

import com.zz.bms.core.enums.EnumErrorMsg;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 表的引用参照设置
 * @author zhonglh
 */
@Deprecated
public class TableReference implements Serializable {

    private static final Map<String , TableReference> map = new ConcurrentHashMap<String , TableReference>();

    private String parentTableName ;
    private String childTableName ;

    private String parentTableColumnName;
    private String childTableColumnName;


    public TableReference(String parentTableName, String childTableName,
                          String parentTableColumnName, String childTableColumnName) {
        this.parentTableName = parentTableName.toLowerCase();
        this.childTableName = childTableName.toLowerCase();
        this.parentTableColumnName = parentTableColumnName.toLowerCase();
        this.childTableColumnName = childTableColumnName.toLowerCase();
    }

    public static void addTableReference(String parentTableName, String childTableName,
                                    String parentTableColumnName, String childTableColumnName){
        TableReference tr = new TableReference(parentTableName, childTableName,parentTableColumnName, childTableColumnName);
        String key = new StringBuffer(tr.getParentTableName()).append(" ").append(tr.getChildTableName()).toString();
        map.put(key , tr);
    }


    public static String getChildTableColumnName(String parentTableName, String childTableName){
        String key = new StringBuffer(parentTableName.toLowerCase()).append(" ").
                append(childTableName.toLowerCase()).toString();
        TableReference tr = map.get(key);
        if(tr == null){
            throw EnumErrorMsg.code_error.toException();
        }
        return tr.getChildTableColumnName();
    }

    public String getParentTableName() {
        return parentTableName;
    }

    public void setParentTableName(String parentTableName) {
        this.parentTableName = parentTableName.toLowerCase();
    }

    public String getChildTableName() {
        return childTableName;
    }

    public void setChildTableName(String childTableName) {
        this.childTableName = childTableName.toLowerCase();
    }

    public String getParentTableColumnName() {
        return parentTableColumnName;
    }

    public void setParentTableColumnName(String parentTableColumnName) {
        this.parentTableColumnName = parentTableColumnName.toLowerCase();
    }

    public String getChildTableColumnName() {
        return childTableColumnName;
    }

    public void setChildTableColumnName(String childTableColumnName) {
        this.childTableColumnName = childTableColumnName.toLowerCase();
    }
}
