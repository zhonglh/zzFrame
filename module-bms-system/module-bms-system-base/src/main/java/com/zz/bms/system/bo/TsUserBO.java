package com.zz.bms.system.bo;

import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.system.domain.TsUserEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.zz.bms.annotaions.EntityAnnotation;

import java.io.Serializable;



/**
* 用户 BO , 扩展 TsUserEntity 对象
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@EntityAnnotation(value="用户" , resource = "")
@TableName(value="ts_user" , resultMap = "TsUserResultMap")
public class TsUserBO extends TsUserEntity implements Serializable , ILoginUserEntity<String> {

    private String userStatusName ;

    private String systemAdminName ;



    private String avatarImageUrl ;



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
}
