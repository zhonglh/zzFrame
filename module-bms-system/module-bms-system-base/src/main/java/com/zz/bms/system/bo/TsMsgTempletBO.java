package com.zz.bms.system.bo;

import com.zz.bms.system.domain.TsMsgTempletEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.zz.bms.annotaions.EntityAnnotation;

import java.io.Serializable;



/**
* 消息模板 BO , 扩展 TsMsgTempletEntity 对象
* @author Administrator
* @date 2018-9-6 23:56:31
*/
@EntityAnnotation(value="消息模板" , resource = "")
@TableName(value="ts_msg_templet" , resultMap = "TsMsgTempletResultMap")
public class TsMsgTempletBO extends TsMsgTempletEntity implements Serializable {

    private String msgTempletTypeName ;

    private String msgLanguageName ;

    private String templetEffectiveName ;



    public void setMsgTempletTypeName(String msgTempletTypeName){
        this.msgTempletTypeName = msgTempletTypeName;
    }

    public String getMsgTempletTypeName(){
        return this.msgTempletTypeName;
    }

    public void setMsgLanguageName(String msgLanguageName){
        this.msgLanguageName = msgLanguageName;
    }

    public String getMsgLanguageName(){
        return this.msgLanguageName;
    }

    public void setTempletEffectiveName(String templetEffectiveName){
        this.templetEffectiveName = templetEffectiveName;
    }

    public String getTempletEffectiveName(){
        return this.templetEffectiveName;
    }

}
