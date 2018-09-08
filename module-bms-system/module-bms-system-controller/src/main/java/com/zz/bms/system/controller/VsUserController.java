package com.zz.bms.system.controller;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.zz.bms.controller.base.controller.DefaultController;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.enums.EnumYesNo;
import com.zz.bms.core.exceptions.DbException;
import com.zz.bms.core.vo.AjaxJson;
import com.zz.bms.shiro.utils.ShiroUtils;



import com.zz.bms.system.bo.VsUserBO;
import  com.zz.bms.system.query.impl.VsUserQueryWebImpl;

import com.zz.bms.util.base.java.IdUtils;

import io.jsonwebtoken.lang.Assert;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 用户 控制层
* @author Administrator
* @date 2018-9-6 22:28:16
 */
@RequestMapping("/system/user")
@Controller
public class VsUserController extends DefaultController<VsUserBO, String , VsUserQueryWebImpl> {



	@Override
	protected boolean isExist(VsUserBO vsUserBO) {

		VsUserBO ckBO ;
		boolean isExist = false;
		VsUserBO temp = null ;

		ckBO = new VsUserBO();
		ckBO.setId( vsUserBO.getId() );
        ckBO.setLoginName(vsUserBO.getLoginName());
        temp = this.baseService.selectCheck(ckBO);
        if (isEntityExist(temp)) {return true;}

		return isExist;
	}

	@RequestMapping(value = "/{id}/updateMyProfile" , method = RequestMethod.POST)
	@ResponseBody
	public Object updateMyProfile(VsUserBO vsUserBO ,  @PathVariable("id") String id, String origPassword, String newPassword,
								  ModelMap model, HttpServletRequest request, HttpServletResponse response) {
		ILoginUserEntity loginUser = this.getSessionUser();
		if(!loginUser.getId().equals(id)){
			return AjaxJson.illegalAjax;
		}

		vsUserBO.setId(id);
		VsUserBO temp = this.baseService.selectById(id);
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
