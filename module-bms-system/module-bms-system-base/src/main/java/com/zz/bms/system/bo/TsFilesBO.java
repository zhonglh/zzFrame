package com.zz.bms.system.bo;

import com.zz.bms.system.domain.TsFilesEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.zz.bms.annotaions.EntityAnnotation;

import java.io.Serializable;



/**
* 文件 BO , 扩展 TsFilesEntity 对象
* @author Administrator
* @date 2018-9-6 23:56:31
*/
@EntityAnnotation(value="文件" , resource = "")
@TableName(value="ts_files" , resultMap = "TsFilesResultMap")
public class TsFilesBO extends TsFilesEntity implements Serializable {

    private String fileEngineName ;



    public void setFileEngineName(String fileEngineName){
        this.fileEngineName = fileEngineName;
    }

    public String getFileEngineName(){
        return this.fileEngineName;
    }

}
