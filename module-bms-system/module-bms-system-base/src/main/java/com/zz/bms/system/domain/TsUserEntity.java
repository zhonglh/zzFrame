package com.zz.bms.system.domain;


import com.baomidou.mybatisplus.annotation.TableField;

import java.lang.String;

import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.constants.DictTypeConstant;
import com.zz.bms.constants.ExcelTypeConstant;
import com.zz.bms.constants.PageElementConstant;
import com.zz.bms.core.db.entity.BaseBusinessExEntity;

/**
 * 用户 实体类
 * @author Administrator
 * @date 2018-9-7 0:01:37
 */
public class TsUserEntity extends BaseBusinessExEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;


	@EntityAttrDBAnnotation(attrName="用户姓名" ,type = "varchar" ,  attrLength = 50 , notNull = true )
	@EntityAttrExcelAnnotation(excelProcess= ExcelTypeConstant.IMPORT_EXPORT)
	@EntityAttrPageAnnotation(title = "用户姓名",sort = 100 ,  existEditPage = true  , required = true  )
	private String  userName ;


	@EntityAttrDBAnnotation(attrName="登录名" ,type = "varchar" ,  attrLength = 20 , notNull = true )
	@EntityAttrExcelAnnotation(excelProcess= ExcelTypeConstant.IMPORT_EXPORT)
	@EntityAttrPageAnnotation(title = "登录名",sort = 200 , existEditPage = true  , required = true)
	private String  loginName ;


	@EntityAttrDBAnnotation(attrName="登录密码" ,type = "varchar" ,  attrLength = 128 , notNull = true )
	@EntityAttrExcelAnnotation(excelProcess= ExcelTypeConstant.ONLY_IMPORT)
	@EntityAttrPageAnnotation(title = "登录密码",sort = 300 , pageElement= PageElementConstant.password, existEditPage = true  , maxLength = 20 , minLength = 6 ,required = true)
	private String  loginPassword ;


	@EntityAttrDBAnnotation(attrName="加密盐" ,type = "varchar" ,  attrLength = 64 , notNull = false )
	@EntityAttrPageAnnotation(title = "加密盐",sort = 400 )
	private String  salt ;


	@EntityAttrDBAnnotation(attrName="用户状态" ,type = "char" ,  attrLength = 1 , notNull = true )
	@EntityAttrDictAnnotation(group = "userStatus", groupName = "用户状态" ,  isValueField = true , dictType = DictTypeConstant.USER_STATUS)
	@EntityAttrExcelAnnotation(excelProcess= ExcelTypeConstant.NONE)
	@EntityAttrPageAnnotation(title = "用户状态",sort = 500 , required = true)
	private String  userStatus ;


	@EntityAttrDBAnnotation(attrName="上级领导" ,type = "char" ,  attrLength = 32 , notNull = false )
	@EntityAttrFkAnnotation(group = "leadUser" , groupName = "上级领导" ,  isFkId = true ,   dbColumnNotNull = true, fkClass=com.zz.bms.system.bo.TsUserBO.class)
	@EntityAttrPageAnnotation(title = "上级领导" , sort = 601 )
	private String  leadUserId ;


	@EntityAttrDBAnnotation(attrName="电话" ,type = "varchar" ,  attrLength = 20 , notNull = true )
	@EntityAttrExcelAnnotation(excelProcess= ExcelTypeConstant.IMPORT_EXPORT)
	@EntityAttrPageAnnotation(title = "电话",sort = 700 , pageElement= PageElementConstant.phone, existEditPage = true  , required = true )
	private String  phone ;


	@EntityAttrDBAnnotation(attrName="邮箱" ,type = "varchar" ,  attrLength = 60 , notNull = true )
	@EntityAttrExcelAnnotation(excelProcess= ExcelTypeConstant.IMPORT_EXPORT)
	@EntityAttrPageAnnotation(title = "邮箱",sort = 800 , pageElement= PageElementConstant.email, existEditPage = true  , required = true )
	private String  email ;




	@EntityAttrDBAnnotation(attrName="头像" ,type = "char" ,  attrLength = 32  )
	@EntityAttrPageAnnotation(title = "头像",sort = 900 )
	private String  avatarImage ;




	@EntityAttrDBAnnotation(attrName="微信ID" ,type = "varchar" ,  attrLength = 64  )
	@EntityAttrPageAnnotation(title = "微信ID",sort = 1000 )
	private String  openId ;


	@EntityAttrDBAnnotation(attrName="微信唯一ID" ,type = "varchar" ,  attrLength = 64  )
	@EntityAttrPageAnnotation(title = "微信唯一ID",sort = 1100 )
	private String  unionId ;


	@EntityAttrDBAnnotation(attrName="是否系统管理人员" ,type = "char" ,  attrLength = 1  )
	@EntityAttrDictAnnotation(group = "systemAdmin", groupName = "是否系统管理人员" ,  isValueField = true , dictType = DictTypeConstant.YES_NO)
	@EntityAttrPageAnnotation(title = "是否系统管理人员" , sort = 1200 , required = true, defaultType = DefaultTypeConstant.CUSTOM , defaultValue = "EnumYESNO.NO.getVal()")
	private String  systemAdmin ;



	@EntityAttrDBAnnotation(attrName="部门" ,type = "char" ,  attrLength = 32 , notNull = false )
	@EntityAttrFkAnnotation(group = "dep" , groupName = "部门" ,    dbColumnNotNull = true, fkClass=com.zz.bms.system.bo.TsDepBO.class)
	@EntityAttrPageAnnotation(title = "部门" , sort = 1300 , existEditPage = true , hidden = true  )
	private String  depId ;




	@EntityAttrDBAnnotation(attrName="机构" ,type = "char" ,  attrLength = 32 , notNull = true )
	@EntityAttrFkAnnotation(group = "organ" , groupName = "机构" ,    dbColumnNotNull = true, fkClass=com.zz.bms.system.bo.TsOrganBO.class)
	@EntityAttrPageAnnotation(title = "机构" , sort = 1400 ,  defaultType = DefaultTypeConstant.CURRENT_USER_ORGANID )
	private String  organId ;


	@EntityAttrDBAnnotation(attrName="页记录数" ,type = "int" ,  attrLength = 11 , notNull = true )
	@EntityAttrPageAnnotation(title = "页记录数" , sort = 1500 ,  pageElement = PageElementConstant.digits)
	private int pageLimit;

	@EntityAttrDBAnnotation(attrName="备注" ,type = "varchar" ,  attrLength = 500 )
	@EntityAttrPageAnnotation(title = "备注" , sort = 1600 ,  pageElement = PageElementConstant.textarea)
	private String  remark ;




	public void setUserName(String userName){
		this.userName = userName;
	}

    public String getUserName(){
    	return this.userName;
    }


	public void setLoginName(String loginName){
		this.loginName = loginName;
	}

    public String getLoginName(){
    	return this.loginName;
    }


	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}

    public String getLoginPassword(){
    	return this.loginPassword;
    }


	public void setSalt(String salt){
		this.salt = salt;
	}

    public String getSalt(){
    	return this.salt;
    }


	public void setUserStatus(String userStatus){
		this.userStatus = userStatus;
	}

    public String getUserStatus(){
    	return this.userStatus;
    }


	public void setLeadUserId(String leadUserId){
		this.leadUserId = leadUserId;
	}

    public String getLeadUserId(){
    	return this.leadUserId;
    }


	public void setPhone(String phone){
		this.phone = phone;
	}

    public String getPhone(){
    	return this.phone;
    }


	public void setEmail(String email){
		this.email = email;
	}

    public String getEmail(){
    	return this.email;
    }

	public String getAvatarImage() {
		return avatarImage;
	}

	public void setAvatarImage(String avatarImage) {
		this.avatarImage = avatarImage;
	}

	public void setOpenId(String openId){
		this.openId = openId;
	}

    public String getOpenId(){
    	return this.openId;
    }


	public void setUnionId(String unionId){
		this.unionId = unionId;
	}

    public String getUnionId(){
    	return this.unionId;
    }


	public void setSystemAdmin(String systemAdmin){
		this.systemAdmin = systemAdmin;
	}

    public String getSystemAdmin(){
    	return this.systemAdmin;
    }


	public void setDepId(String depId){
		this.depId = depId;
	}

    public String getDepId(){
    	return this.depId;
    }


	public void setOrganId(String organId){
		this.organId = organId;
	}

    public String getOrganId(){
    	return this.organId;
    }


	public void setRemark(String remark){
		this.remark = remark;
	}

    public String getRemark(){
    	return this.remark;
    }

	public int getPageLimit() {
		return pageLimit;
	}

	public void setPageLimit(int pageLimit) {
		this.pageLimit = pageLimit;
	}
}