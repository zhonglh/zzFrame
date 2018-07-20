package com.zz.bms.system.base.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.zz.bms.annotaions.EntityAnnotation;
import com.zz.bms.annotaions.EntityAttrDBAnnotation;
import com.zz.bms.core.Constant;
import com.zz.bms.core.db.entity.BaseBusinessExEntity;
import com.zz.bms.core.db.entity.ILoginUserEntity;

import java.io.Serializable;

/**
 * 用户实体类
 * @author Administrator
 */
@EntityAnnotation(value="用户" , resource = "sys.user")
@TableName(value="ts_user" , resultMap = "TsUserResultMap")
public class TsUserEntity extends BaseBusinessExEntity<String> implements  ILoginUserEntity, Serializable {

    @EntityAttrDBAnnotation(attrName="用户姓名", attrLength=60  ,  notNull = true)
    private String userName;




    @EntityAttrDBAnnotation(attrName="用户登录名", attrLength=20  ,  notNull = true)
    private String loginName;


    @EntityAttrDBAnnotation(attrName="登录密码", attrLength=128  ,  notNull = true)
    private String loginPassword;



    @EntityAttrDBAnnotation(attrName="加密盐", attrLength=64  , notNull = true)
    private String salt;




    @EntityAttrDBAnnotation(attrName="状态", attrLength=1  ,  notNull = true )
    private String status;




    @EntityAttrDBAnnotation(attrName="上级领导",sort=60    )
    private String leadId;




    @EntityAttrDBAnnotation(attrName="电话",sort=70  , attrLength=20    )
    private String phone;




    @EntityAttrDBAnnotation(attrName="邮箱",sort=80  , attrLength=60    )
    private String email;



    @EntityAttrDBAnnotation(attrName="头像地址", attrLength=128    )
    private String avatarUrl;



    @EntityAttrDBAnnotation(attrName="备注", attrLength=512    )
    private String remark;


    @EntityAttrDBAnnotation(attrName="微信Open ID",sort=10  , attrLength=64    )
    private String openId;




    @EntityAttrDBAnnotation(attrName="微信Union ID",sort=11  , attrLength=64   )
    private String unionId;




    @EntityAttrDBAnnotation(attrName="系统管理人员",sort=12  , attrLength=1   )
    private String systemAdmin;




    @EntityAttrDBAnnotation(attrName="部门ID",sort=13  , attrLength=32     )
    private String depId;




    @EntityAttrDBAnnotation(attrName="机构ID",sort=14  , attrLength=32     )
    private String organId;





    @Override
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLeadId() {
        return leadId;
    }

    public void setLeadId(String leadId) {
        this.leadId = leadId;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getSystemAdmin() {
        return systemAdmin;
    }

    public void setSystemAdmin(String systemAdmin) {
        this.systemAdmin = systemAdmin;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getOrganId() {
        return organId;
    }

    public void setOrganId(String organId) {
        this.organId = organId;
    }


}
