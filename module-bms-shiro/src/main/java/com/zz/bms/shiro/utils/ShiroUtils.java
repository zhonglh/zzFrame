package com.zz.bms.shiro.utils;

import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.subject.Subject;


/**
 * 类ShiroUtils的功能描述:
 * Shiro工具类
 * @author Administrator
 */
public class ShiroUtils {

	/**  加密算法 */
	public final static String algorithmName = "SHA-256";
	/**
	 * 加密散列次数
	 */
	public static final int hashIterations= 2;

	public static String encodeSalt(String password, String salt) {
		return new SimpleHash(algorithmName, password, salt, hashIterations).toString();
	}

	public static Session getSession() {
		return SecurityUtils.getSubject().getSession();
	}

	public static Subject getSubject() {
		return SecurityUtils.getSubject();
	}

	public static <T> T getUserEntity() {
		return  (T)SecurityUtils.getSubject().getPrincipal();
	}

	public static <T> T getUserId() {
		return (T)((BaseEntity)getUserEntity()).getId();
	}
	
	public static void setSessionAttribute(Object key, Object value) {
		getSession().setAttribute(key, value);
	}

	public static Object getSessionAttribute(Object key) {
		return getSession().getAttribute(key);
	}

	public static boolean isLogin() {
		return SecurityUtils.getSubject().getPrincipal() != null;
	}

	public static void logout() {
		SecurityUtils.getSubject().logout();
	}
	
	public static String getKaptcha(String key) {
		String kaptcha = getSessionAttribute(key).toString();
		getSession().removeAttribute(key);
		return kaptcha;
	}


	/**
	 * 刷新 subject Principal
	 * @param loginUser
	 */
	public static void refreshPrincipal(ILoginUserEntity loginUser){
		Subject subject = SecurityUtils.getSubject();
		ILoginUserEntity shiroUser = (ILoginUserEntity)subject.getPrincipal();
		PrincipalCollection principalCollection = subject.getPrincipals();

		shiroUser = loginUser;
		String realmName = principalCollection.getRealmNames().iterator().next();
		PrincipalCollection newPrincipalCollection = new SimplePrincipalCollection(shiroUser, realmName);
		//重新加载Principal
		subject.runAs(newPrincipalCollection);
	}


	public static void main(String[] args) {
		System.out.println(encodeSalt("123456","1"));

	}

}
