package com.zz.bms.system.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.system.domain.VsFilesUseEntity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.annotaions.EntityAnnotation;

import java.io.Serializable;



/**
* 文件使用 BO , 扩展 VsFilesUseEntity 对象
* @author Administrator
* @date 2018-9-6 23:56:31
*/
@EntityAnnotation(value="文件使用" , resource = "")
@TableName(value="vs_files_use" , resultMap = "VsFilesUseResultMap")
public class VsFilesUseBO extends VsFilesUseEntity implements Serializable {

    @TableField(exist = false)
    private String businessTypeName ;

    @TableField(exist = false)
    private String fileEngineName ;



    public void setBusinessTypeName(String businessTypeName){
        this.businessTypeName = businessTypeName;
    }

    public String getBusinessTypeName(){
        return this.businessTypeName;
    }

    public void setFileEngineName(String fileEngineName){
        this.fileEngineName = fileEngineName;
    }

    public String getFileEngineName(){
        return this.fileEngineName;
    }

}
