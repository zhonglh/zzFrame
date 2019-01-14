package com.zz.bms.shiro.filter;

import com.zz.bms.shiro.utils.ShiroUtils;
import com.zz.bms.util.web.WebUtils;
import org.apache.shiro.web.filter.authz.RolesAuthorizationFilter;
import org.apache.shiro.web.servlet.ShiroHttpServletRequest;
import org.apache.shiro.web.servlet.ShiroHttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


/**
 * 类UserAuthorizationFilter的功能描述:
 * @author Administrator
 */
public class UserAuthorizationFilter extends RolesAuthorizationFilter {
	Logger log = LoggerFactory.getLogger(getClass());
	
	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws IOException {
		if (WebUtils.isAjax((HttpServletRequest)request)) {// 是否为ajax请求
			Map<String,String> resp = new HashMap<String,String>();
			if (ShiroUtils.getUserEntity() == null) {
				resp.put("code", "504");
				resp.put("desc", "您没有登录或登录已超时，请重新登录");
			} else {
				resp.put("code", "403");
				resp.put("desc", "对不起，您没有该权限");
			}


			return false;
		}
		return super.onAccessDenied(request, new ShiroHttpServletResponse((HttpServletResponse)response, getServletContext(), (ShiroHttpServletRequest)request){
			@Override
			public String encodeRedirectURL(String url) {
				return url;
			}
		});
	}

	@Override
	public boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue)
			throws IOException {
		if (ShiroUtils.getUserEntity() == null) {
			return false;
		}
		return super.isAccessAllowed(request, response, mappedValue);
	}
}
