package com.zz.bms.system.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.constants.DictTypeConstant;
import com.zz.bms.constants.ExcelTypeConstant;
import com.zz.bms.enums.EnumUserStatus;
import com.zz.bms.system.domain.VsUserEntity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;


/**
* 用户 BO , 扩展 VsUserEntity 对象
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@EntityAnnotation(value="用户" , resource = "system.user")
@TableName(value="vs_user" , resultMap = "VsUserResultMap")
public class VsUserBO extends VsUserEntity implements Serializable {


    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "userStatus", groupName = "用户状态" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = DictTypeConstant.USER_STATUS)
    @EntityAttrExcelAnnotation(excelProcess= ExcelTypeConstant.ONLY_EXPORT)
    @EntityAttrPageAnnotation(title = "用户状态" , sort = 501 , required = true, defaultType = DefaultTypeConstant.CUSTOM , defaultValue = "EnumUserStatus.normal.getLabel()")
    private String userStatusName ;

    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "systemAdmin", groupName = "是否系统管理人员" ,  dbColumnName = "dict_name" , isNameField = true , dictType = DictTypeConstant.YES_NO)
    @EntityAttrExcelAnnotation(excelProcess= ExcelTypeConstant.NONE)
    @EntityAttrPageAnnotation(title = "是否系统管理人员" , sort = 201 , required = true, defaultType = DefaultTypeConstant.CUSTOM , defaultValue = "EnumYESNO.NO.getLabel()")
    private String systemAdminName ;


    @TableField(exist = false)
    @EntityAttrExcelAnnotation(excelProcess= ExcelTypeConstant.IMPORT_EXPORT)
    @EntityAttrFkAnnotation(group = "leadUser" , groupName = "上级领导" ,  isFkBusinessName = true , dbColumnName = "user_name" , dbColumnType = "varchar" , dbColumnLength = 50 , dbColumnNotNull = true, fkEntity="com.zz.bms.system.bo.TsUserBO")
    @EntityAttrPageAnnotation(title = "上级领导名称" , sort = 601 )
    private String leadUserName;


    @TableField(exist = false)
    @EntityAttrExcelAnnotation(excelProcess= ExcelTypeConstant.IMPORT_EXPORT)
    @EntityAttrFkAnnotation(group = "leadUser" , groupName = "直属领导" ,  isFkBusinessKey = true, dbColumnName = "phone" , dbColumnType = "varchar" , dbColumnLength = 20 , dbColumnNotNull = true, fkEntity="com.zz.bms.system.bo.TsUserBO")
    @EntityAttrPageAnnotation(title = "直属领导手机号" , sort = 602 )
    private String leadUserPhone;



    @TableField(exist = false)
    @EntityAttrExcelAnnotation(excelProcess= ExcelTypeConstant.ONLY_EXPORT)
    @EntityAttrPageAnnotation(title = "年龄" , sort = 1301  , maxLength=2)
    private int age =3102 ;

    @TableField(exist = false)
    @EntityAttrExcelAnnotation(excelProcess= ExcelTypeConstant.ONLY_EXPORT)
    @EntityAttrPageAnnotation(title = "工资" , sort = 1301 , maxLength=8)
    private double salary = 1210011.83 ;

    @TableField(exist = false)
    @EntityAttrExcelAnnotation(excelProcess= ExcelTypeConstant.ONLY_EXPORT)
    @EntityAttrPageAnnotation(title = "生日" , sort = 1301  , maxLength=10)
    private Date bithDay = new Date() ;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getBithDay() {
        return bithDay;
    }

    public void setBithDay(Date bithDay) {
        this.bithDay = bithDay;
    }







    public void setUserStatusName(String userStatusName){
        this.userStatusName = userStatusName;
    }

    public String getUserStatusName(){
        return this.userStatusName;
    }

    public void setSystemAdminName(String systemAdminName){
        this.systemAdminName = systemAdminName;
    }

    public String getSystemAdminName(){
        return this.systemAdminName;
    }

    public String getLeadUserName() {
        return leadUserName;
    }

    public void setLeadUserName(String leadUserName) {
        this.leadUserName = leadUserName;
    }


    public String getLeadUserPhone() {
        return leadUserPhone;
    }

    public void setLeadUserPhone(String leadUserPhone) {
        this.leadUserPhone = leadUserPhone;
    }




    @Override
    public String toString() {
        return "VsUserBO:{" +
                "loginName:'" + this.getLoginName() + '\'' +
                "userName:'" + this.getUserName() + '\'' +
                "phone:'" + this.getPhone() + '\'' +
                "email:'" + this.getEmail() + '\'' +
                '}';
    }
}
