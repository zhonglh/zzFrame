package com.zz.bms.system.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.enums.EnumYesNo;
import com.zz.bms.system.domain.TsUserEntity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.util.configs.annotaions.EntityAnnotation;

import java.io.Serializable;



/**
* 用户 BO , 扩展 TsUserEntity 对象
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@EntityAnnotation(value="用户" , resource = "")
@TableName(value="ts_user" , resultMap = "TsUserResultMap")
public class TsUserBO extends TsUserEntity implements IBoEntity ,Serializable , ILoginUserEntity<String> {

    @TableField(exist = false)
    private String userStatusName ;

    @TableField(exist = false)
    private String systemAdminName ;



    @TableField(exist = false)
    private String avatarImageUrl ;


    @Override
    public String getDepName() {
        return null;
    }

    @Override
    public String getOrganName() {
        return null;
    }

    @Override
    public String getTenantName() {
        return null;
    }

    @Override
    public boolean isSystemUser() {
        return EnumYesNo.YES.getCode().equals(this.getSystemAdmin());
    }

    @Override
    public String getLeadId() {
        return null;
    }

    @Override
    public String getLeadName() {
        return null;
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

    public String getAvatarImageUrl() {
        return avatarImageUrl;
    }

    public void setAvatarImageUrl(String avatarImageUrl) {
        this.avatarImageUrl = avatarImageUrl;
    }

    @Override
    public boolean isTable() {
        return true;
    }


    @Override
    public String toString() {
        return this.getUserName();
    }


}
