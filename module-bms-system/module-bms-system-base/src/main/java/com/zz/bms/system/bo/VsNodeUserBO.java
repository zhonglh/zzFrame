package com.zz.bms.system.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.system.domain.VsNodeUserEntity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.util.configs.annotaions.EntityAnnotation;

import java.io.Serializable;



/**
* 有效用户 BO , 扩展 VsNodeUserEntity 对象
* @author Administrator
* @date 2018-9-6 23:56:31
*/
@EntityAnnotation(value="有效用户" , resource = "")
@TableName(value="vs_node_user" , resultMap = "VsNodeUserResultMap")
public class VsNodeUserBO extends VsNodeUserEntity implements Serializable {

    @TableField(exist = false)
    private String userStatusName ;

    @TableField(exist = false)
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
