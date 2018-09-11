package com.zz.bms.system.bo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.zz.bms.system.domain.VsUserMenuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.zz.bms.annotaions.EntityAnnotation;

import java.io.Serializable;



/**
* 菜单 BO , 扩展 VsUserMenuEntity 对象
* @author Administrator
* @date 2018-9-6 23:56:31
*/
@EntityAnnotation(value="菜单" , resource = "")
@TableName(value="vs_user_menu" , resultMap = "VsUserMenuResultMap")
public class VsUserMenuBO extends VsUserMenuEntity implements Serializable {

    @TableField(exist = false)
    private int level ;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    @Override
    public String toString() {
        return "VsUserMenuBO{" +
                "id=" + getId() +
                "pid=" + getPid() +
                "level=" + level +
                '}';
    }
}
