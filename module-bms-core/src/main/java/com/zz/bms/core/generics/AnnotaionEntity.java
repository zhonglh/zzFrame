package com.zz.bms.core.generics;

import java.io.Serializable;

/**
 * 将属性的所有注解集中在一起
 * @author Administrator
 */
public class AnnotaionEntity implements Serializable{


    public boolean isCheck = false;

    //检查规则  正则表达式
    //检查内容是否符合该表达式
    public String checkRule ;

    //字典类型
    public String dictType;

    //高级校验， 在Excel和普通方式都会有提现
    public boolean customCheck = false;








    public boolean isDB = true;

    //属性名称
    public String attrName;

    //属性长度
    public int attrLength = 0;

    //属性小数点长度
    public int attrDecimals = 0;

    //属性是否不能为空
    public boolean notNull = false;

    //属性序号
    public int sort = 9999999;







    public boolean isExcel = false;

    /**
     * Excel 处理逻辑
     * 0：不导入也不导出
     * 1: 只导入
     * 2: 只导出
     * 3: 导入导出
     * @return
     */
    public int excelProcess = 3;







    public boolean isPage = false;

    /**
     * 组 ， 比如项目ID, 项目编码  项目名称是一组
     * @return
     */
    public String group = "";

    /**
     * 组对应的列名称(属性名称)
     */
    public String  groupField = "";


    /**
     * 页面元素, 如input , select , check , file , lookup 等
     * @return
     */
    public String pageElement =  "input";

    /**
     * 是否隐藏
     * @return
     */
    public boolean hidden = false;

    /**
     * 是否只读
     * @return
     */
    public boolean readonly = false;

    /**
     * 如果是数字， 最小值
     * @return
     */
    public Integer min = null ;


    /**
     * 如果是数字， 最大值
     * @return
     */
    public Integer max = null ;


    /**
     * 默认值 , 会有一些特殊的值需要解析(如当前日期， 当前登录人ID)
     * @return
     */
    public String defaultVal =   "" ;


    public boolean isCheck() {
        return isCheck;
    }

    public void setCheck(boolean check) {
        isCheck = check;
    }

    public String getCheckRule() {
        return checkRule;
    }

    public void setCheckRule(String checkRule) {
        this.checkRule = checkRule;
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    public boolean isCustomCheck() {
        return customCheck;
    }

    public void setCustomCheck(boolean customCheck) {
        this.customCheck = customCheck;
    }

    public boolean isDB() {
        return isDB;
    }

    public void setDB(boolean DB) {
        isDB = DB;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public int getAttrLength() {
        return attrLength;
    }

    public void setAttrLength(int attrLength) {
        this.attrLength = attrLength;
    }

    public int getAttrDecimals() {
        return attrDecimals;
    }

    public void setAttrDecimals(int attrDecimals) {
        this.attrDecimals = attrDecimals;
    }

    public boolean isNotNull() {
        return notNull;
    }

    public void setNotNull(boolean notNull) {
        this.notNull = notNull;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public boolean isExcel() {
        return isExcel;
    }

    public void setExcel(boolean excel) {
        isExcel = excel;
    }

    public int getExcelProcess() {
        return excelProcess;
    }

    public void setExcelProcess(int excelProcess) {
        this.excelProcess = excelProcess;
    }

    public boolean isPage() {
        return isPage;
    }

    public void setPage(boolean page) {
        isPage = page;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroupField() {
        return groupField;
    }

    public void setGroupField(String groupField) {
        this.groupField = groupField;
    }

    public String getPageElement() {
        return pageElement;
    }

    public void setPageElement(String pageElement) {
        this.pageElement = pageElement;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public boolean isReadonly() {
        return readonly;
    }

    public void setReadonly(boolean readonly) {
        this.readonly = readonly;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public String getDefaultVal() {
        return defaultVal;
    }

    public void setDefaultVal(String defaultVal) {
        this.defaultVal = defaultVal;
    }
}
