package com.zz.bms.system.controller;

import com.zz.bms.controller.base.controller.ZzDefaultController;
import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.core.exceptions.DbException;
import com.zz.bms.core.vo.AjaxJson;
import com.zz.bms.enums.EnumUserStatus;
import com.zz.bms.shiro.utils.ShiroUtils;



import com.zz.bms.system.bo.VsUserBO;
import  com.zz.bms.system.query.impl.VsUserQueryWebImpl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用户 控制层
* @author Administrator
* @date 2018-9-6 22:28:16
 */
@RequestMapping("/system/user")
@Controller
public class VsUserController extends ZzDefaultController<VsUserBO, String , VsUserQueryWebImpl> {



	@Override
	protected void isExist(VsUserBO vsUserBO) {

		VsUserBO ckBO ;
		BaseEntity temp = null ;

		ckBO = new VsUserBO();
		ckBO.setId( vsUserBO.getId() );
        ckBO.setLoginName(vsUserBO.getLoginName());
        temp = this.baseService.selectCheck(ckBO);
        if (isEntityExist(temp)) {
        	throw new BizException(EnumErrorMsg.business_error.getCode(),"该登录名已使用");
		}


		ckBO = new VsUserBO();
		ckBO.setId( vsUserBO.getId() );
		ckBO.setPhone(vsUserBO.getPhone());
		temp = this.baseService.selectCheck(ckBO);
		if (isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"该手机号已使用");
		}


		ckBO = new VsUserBO();
		ckBO.setId( vsUserBO.getId() );
		ckBO.setEmail(vsUserBO.getEmail());
		temp = this.baseService.selectCheck(ckBO);
		if (isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"该邮箱已使用");
		}

	}



	@Override
	public void setCustomInfoByInsert(VsUserBO vsUserBO){
		vsUserBO.setUserStatus(EnumUserStatus.normal.getCode());
		vsUserBO.setUserStatusName(EnumUserStatus.normal.getName());
		vsUserBO.setOrganId("11111111111111111111111111111111");
	}


	/**
	 * 修改个人设置
	 * @param vsUserBO
	 * @param id
	 * @param origPassword
	 * @param newPassword
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/{id}/updateMyProfile" , method = RequestMethod.POST)
	@ResponseBody
	public Object updateMyProfile(VsUserBO vsUserBO ,  @PathVariable("id") String id, String origPassword, String newPassword,
								  ModelMap model, HttpServletRequest request, HttpServletResponse response) {
		ILoginUserEntity loginUser = this.getSessionUser();
		if(!loginUser.getId().equals(id)){
			return AjaxJson.illegalAjax;
		}

		vsUserBO.setId(id);
		VsUserBO temp = this.baseService.getById(id);
		if(temp == null){
			throw EnumErrorMsg.no_auth.toException();
		}

		//密码至少一个不为空
		if(StringUtils.isNotEmpty(origPassword) || StringUtils.isNotEmpty(newPassword)){

			if(StringUtils.isEmpty(origPassword) || StringUtils.isEmpty(newPassword)){
				return new AjaxJson(false , "请正确的填写密码!");
			}


			if(origPassword.equalsIgnoreCase(newPassword)){
				return new AjaxJson(false , "原密码和新密码相同!");
			}

			if(!ShiroUtils.encodeSalt(origPassword , temp.getSalt()).equals(temp.getLoginPassword())){
				return new AjaxJson(false , "请输入正确的原密码!");
			}

			vsUserBO.setLoginPassword(ShiroUtils.encodeSalt(newPassword , temp.getSalt()));

		}


		setUpdateInfo(vsUserBO , loginUser);
		vsUserBO.setVersionNo(temp.getVersionNo());

		checkEntityLegality(vsUserBO);
		boolean success = false;
		try {
			Assert.notNull(vsUserBO.getId(),"出现内部错误");
			success = baseService.updateById(vsUserBO);
		}catch(Exception e){
			logger.error(e.getMessage() , e);
			throw DbException.DB_SAVE_SAME;
		}


		if(!success){
			throw DbException.DB_UPDATE_RESULT_0;
		}else {
			return AjaxJson.successAjax;
		}




	}





}
