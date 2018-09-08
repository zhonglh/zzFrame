package com.zz.bms.core.vo;

import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.exceptions.BizException;

import java.util.Map;

/**
 * $.ajax后需要接受的JSON
 *
 *
 * @author Administrator
 */
public class AjaxJson {

	//是否成功
	private boolean success = true;

	//状态码
	private int code ;

	// 提示信息
	private String msg ;

	//地址
	private String url;

	// 其他信息
	private Object obj = null;

	// 其他参数
	private Map<String, Object> attributes;

	public static final AjaxJson errorAjax = EnumErrorMsg.fail.toAjaxJson();
	public static final AjaxJson successAjax = EnumErrorMsg.success.toAjaxJson();

	public static final AjaxJson illegalAjax = EnumErrorMsg.illegal.toAjaxJson();

	public static final AjaxJson notAuthAjax = EnumErrorMsg.no_auth.toAjaxJson();




	public AjaxJson() {
	}
	public AjaxJson(boolean success) {
		this.success = success;if(success){
			this.code = EnumErrorMsg.success.getCode();
		}else {
			this.code = EnumErrorMsg.fail.getCode();
		}
	}
	public AjaxJson(boolean success, String msg) {

		this.success = success;
		if(success){
			this.code = EnumErrorMsg.success.getCode();
		}else {
			this.code = EnumErrorMsg.fail.getCode();
		}
		this.msg = msg;
	}


	public AjaxJson(int  code, String msg) {

		if(code != EnumErrorMsg.success.getCode()){
			this.success = false;
		}else {
			this.success = true;
		}
		this.code = code;
		this.msg = msg;
	}

	public AjaxJson(boolean success, String msg,String url) {

		this.success = success;if(success){
			this.code = EnumErrorMsg.success.getCode();
		}else {
			this.code = EnumErrorMsg.fail.getCode();
		}
		this.msg = msg;
		this.url = url;
	}
	public AjaxJson(EnumErrorMsg error) {
		this.success = (error.getCode() == EnumErrorMsg.success.getCode());
		this.msg = error.getMsg();
	}
	public AjaxJson(BizException bizex) {
		this.success = false;
		this.code = bizex.getCode();
		this.msg = bizex.getMsg();
	}


	/**
	 * 用于链式编程
	 * @return
	 */
	public static AjaxJson ok(){
		return EnumErrorMsg.success.toAjaxJson();
	}
	public static AjaxJson ok(String msg){
		return new AjaxJson(true,msg);
	}

	public static AjaxJson fail(){
		return EnumErrorMsg.fail.toAjaxJson();
	}
	public static AjaxJson fail(String msg){
		return new AjaxJson(false,msg);
	}



	//set get

	public Map<String, Object> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}


	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}
