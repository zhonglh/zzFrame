package com.zz.bms.system.domain;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.annotaions.EntityAnnotation;
import com.zz.bms.annotaions.EntityAttrDBAnnotation;
import com.zz.bms.core.Constant;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.core.db.entity.BaseBusinessExEntity;
import com.zz.bms.core.enums.EnumYesNo;

/**
 * 用户 实体类
 * @author Administrator
 * @date 2018-9-7 0:01:37
 */
public class TsUserEntity extends BaseBusinessExEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;

	//用户姓名
	
	private String  userName ;

	//登录名
	
	private String  loginName ;

	//登录密码
	
	private String  loginPassword ;

	//加密盐
	
	private String  salt ;

	//状态
	//字典类型: user_status        
	private String  userStatus ;

	//上级领导
	
	private String  leadUserId ;

	//电话
	
	private String  phone ;

	//邮箱
	
	private String  email ;



	//头像
	
	private String  avatarImage ;



	//微信ID
	
	private String  openId ;

	//微信唯一ID
	
	private String  unionId ;

	//系统管理人员
	//yes_no        
	private String  systemAdmin ;

	//部门
	
	private String  depId ;

	//机构
	
	private String  organId ;

	private int pageLimit;

	//备注
	
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