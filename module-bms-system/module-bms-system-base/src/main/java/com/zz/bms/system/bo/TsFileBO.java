package com.zz.bms.system.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.system.domain.TsFileEntity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.util.configs.annotaions.EntityAnnotation;

import java.io.Serializable;



/**
* 文件 BO , 扩展 TsFileEntity 对象
* @author Administrator
* @date 2018-9-6 23:56:31
*/
@EntityAnnotation(value="文件" , resource = "")
@TableName(value="ts_file" , resultMap = "TsFileResultMap")
public class TsFileBO extends TsFileEntity implements Serializable {

    @TableField(exist = false)
    private String fileEngineName ;



    public void setFileEngineName(String fileEngineName){
        this.fileEngineName = fileEngineName;
    }

    public String getFileEngineName(){
        return this.fileEngineName;
    }

}
