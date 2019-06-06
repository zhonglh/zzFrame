package com.zz.bms.system.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.exceptions.DbException;
import com.zz.bms.core.vo.AjaxJson;
import com.zz.bms.enums.EnumUserStatus;
import com.zz.bms.enums.EnumYesNo;
import com.zz.bms.shiro.utils.ShiroUtils;
import com.zz.bms.system.bo.TsUserBO;
import com.zz.bms.system.bo.VsUserBO;
import com.zz.bms.system.query.impl.TsUserQueryWebImpl;
import com.zz.bms.system.query.impl.VsUserQueryWebImpl;
import com.zz.bms.system.service.TsDictService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.Assert;
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
public class TsUserController extends ZzDefaultController<TsUserBO,VsUserBO, String , TsUserQueryWebImpl, VsUserQueryWebImpl> {

	@Autowired
	private TsDictService tsDictService;



	@Override
	protected void setCommonData(TsUserBO m, ModelMap model) {
		m.setLoginPassword(null);
		m.setSalt(null);
	}


	@Override
	public void setCustomInfoByInsert(TsUserBO tsUserBO , ILoginUserEntity<String> sessionUser){
		tsUserBO.setUserStatus(EnumUserStatus.normal.getVal());
		tsUserBO.setUserStatusName(EnumUserStatus.normal.getLabel());
		tsUserBO.setOrganId(sessionUser.getOrganId());
		tsUserBO.setPageLimit(100);
		tsUserBO.setSystemAdmin(EnumYesNo.NO.getCode());
		tsUserBO.setSystemAdminName(EnumYesNo.NO.getCode());
		tsUserBO.setSalt("2");
		tsUserBO.setLoginPassword(ShiroUtils.encodeSalt(tsUserBO.getLoginPassword() , tsUserBO.getSalt()));
	}


	/**
	 * 修改登录人自己的设置
	 * @param vsUserBO
	 * @param origPassword
	 * @param newPassword
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/updateMyProfile" , method = RequestMethod.POST)
	@ResponseBody
	public Object updateMyProfile(VsUserBO vsUserBO ,   String origPassword, String newPassword,
								  ModelMap model, HttpServletRequest request, HttpServletResponse response) {

		String id = this.getSessionUser().getId();

		vsUserBO.setId(id);
		TsUserBO temp = this.baseRwService.getById(id);
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




		setUpdateInfo(vsUserBO , this.getSessionUser());
		vsUserBO.setVersionNo(temp.getVersionNo());
		String avatarImage = vsUserBO.getAvatarImage();
		if(avatarImage == null || "undefined".equals(avatarImage) || "null".equals(avatarImage) || "".equals(avatarImage)){
			avatarImage = "";
		}

		checkEntityLegality(vsUserBO , false , true , true );
		boolean success = false;
		try {
			Assert.notNull(vsUserBO.getId(),"出现内部错误");
			success = baseRwService.updateById(vsUserBO);
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
