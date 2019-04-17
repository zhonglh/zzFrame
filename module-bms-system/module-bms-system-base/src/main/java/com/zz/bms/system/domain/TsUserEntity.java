package com.zz.bms.system.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.util.configs.annotaions.*;

import com.zz.bms.core.Constant;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.core.db.entity.BaseBusinessExEntity;
/**
 * 用户 实体类
 * @author Administrator
 * @date 2019-4-10 11:08:55
 */
public class TsUserEntity extends com.zz.bms.core.db.entity.BaseBusinessExEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;



    @EntityAttrDBAnnotation(attrName="用户姓名" ,attrColumn="user_name"  , type = "VARCHAR"      ,  attrLength = 50 , notNull = true )
    @EntityAttrPageAnnotation(title = "用户姓名",sort = 200  , pageElement = "text"            , maxLength = 50        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
	private String  userName ;



    @EntityAttrDBAnnotation(attrName="登录名" ,attrColumn="login_name"  , type = "VARCHAR"      ,  attrLength = 20 , notNull = true )
    @EntityAttrPageAnnotation(title = "登录名",sort = 300  , pageElement = "text"            , maxLength = 20        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
	private String  loginName ;



    @EntityAttrDBAnnotation(attrName="登录密码" ,attrColumn="login_password"  , type = "VARCHAR"      ,  attrLength = 128 , notNull = false )
    @EntityAttrPageAnnotation(title = "登录密码",sort = 400  , pageElement = "text"            , maxLength = 128        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "1")
	private String  loginPassword ;



    @EntityAttrDBAnnotation(attrName="加密盐" ,attrColumn="salt"  , type = "VARCHAR"      ,  attrLength = 64 , notNull = false )
    @EntityAttrPageAnnotation(title = "加密盐",sort = 500  , pageElement = "text"            , maxLength = 64        ,required=false )
	private String  salt ;



    @EntityAttrDictAnnotation(group = "userStatus", groupName = "状态" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "user_status")
    @EntityAttrDBAnnotation(attrName="状态" ,attrColumn="user_status"  , type = "CHAR"      ,  attrLength = 1 , notNull = true )
    @EntityAttrPageAnnotation(title = "状态",sort = 600  , pageElement = "select"            , maxLength = 1        ,required=true )
    //字典类型: user_status        
	private String  userStatus ;



    @EntityAttrFkAnnotation(group = "leadUserId",  groupName = "上级领导" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsUserBO.class)
    @EntityAttrDBAnnotation(attrName="上级领导" ,attrColumn="lead_user_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "上级领导",sort = 700  , pageElement = "text"            , maxLength = 32        ,required=false )
	private String  leadUserId ;



    @EntityAttrDBAnnotation(attrName="电话" ,attrColumn="phone"  , type = "VARCHAR"      ,  attrLength = 20 , notNull = true )
    @EntityAttrPageAnnotation(title = "电话",sort = 800  , pageElement = "text"            , maxLength = 20        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
	private String  phone ;



    @EntityAttrDBAnnotation(attrName="邮箱" ,attrColumn="email"  , type = "VARCHAR"      ,  attrLength = 60 , notNull = true )
    @EntityAttrPageAnnotation(title = "邮箱",sort = 900  , pageElement = "text"            , maxLength = 60        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
	private String  email ;



    @EntityAttrDBAnnotation(attrName="头像" ,attrColumn="avatar_image"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "头像",sort = 1000  , pageElement = "singleimage"            , maxLength = 32        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
	private String  avatarImage ;



    @EntityAttrDBAnnotation(attrName="微信ID" ,attrColumn="open_id"  , type = "VARCHAR"      ,  attrLength = 64 , notNull = false )
    @EntityAttrPageAnnotation(title = "微信ID",sort = 1100  , pageElement = "text"            , maxLength = 64        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
	private String  openId ;



    @EntityAttrDBAnnotation(attrName="微信唯一ID" ,attrColumn="union_id"  , type = "VARCHAR"      ,  attrLength = 64 , notNull = false )
    @EntityAttrPageAnnotation(title = "微信唯一ID",sort = 1200  , pageElement = "text"            , maxLength = 64        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
	private String  unionId ;



    @EntityAttrDictAnnotation(group = "systemAdmin", groupName = "系统管理人员" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "yes_no")
    @EntityAttrDBAnnotation(attrName="系统管理人员" ,attrColumn="system_admin"  , type = "CHAR"      ,  attrLength = 1 , notNull = true )
    @EntityAttrPageAnnotation(title = "系统管理人员",sort = 1300  , pageElement = "select"            , maxLength = 1        ,required=true )
    //yes_no        
	private String  systemAdmin ;



    @EntityAttrFkAnnotation(group = "depId",  groupName = "部门" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsDepBO.class)
    @EntityAttrDBAnnotation(attrName="部门" ,attrColumn="dep_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "部门",sort = 1400  , pageElement = "text"            , maxLength = 32        ,required=false )
	private String  depId ;



    @EntityAttrDBAnnotation(attrName="每页记录数" ,attrColumn="page_limit"  , type = "INT"      ,  attrLength = 10 , notNull = true )
    @EntityAttrPageAnnotation(title = "每页记录数",sort = 1600  , pageElement = "text"            , maxLength = 10        ,required=true )
	private Integer  pageLimit ;



    @EntityAttrDBAnnotation(attrName="备注" ,attrColumn="remark"  , type = "VARCHAR"      ,  attrLength = 500 , notNull = false )
    @EntityAttrPageAnnotation(title = "备注",sort = 1700  , pageElement = "textarea"            , maxLength = 500        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
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


	public void setAvatarImage(String avatarImage){
		this.avatarImage = avatarImage;
	}

    public String getAvatarImage(){
    	return this.avatarImage;
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



	public void setPageLimit(Integer pageLimit){
		this.pageLimit = pageLimit;
	}

    public Integer getPageLimit(){
    	return this.pageLimit;
    }


	public void setRemark(String remark){
		this.remark = remark;
	}

    public String getRemark(){
    	return this.remark;
    }


	
}