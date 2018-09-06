package com.zz.bms.system.bo;

import com.zz.bms.system.domain.VsUserEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.zz.bms.annotaions.EntityAnnotation;

import java.io.Serializable;



/**
* 用户 BO , 扩展 VsUserEntity 对象
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@EntityAnnotation(value="用户" , resource = "")
@TableName(value="vs_user" , resultMap = "VsUserResultMap")
public class VsUserBO extends VsUserEntity implements Serializable {

    private String userStatusName ;

    private String systemAdminName ;



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

}
