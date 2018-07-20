package com.zz.bms.shiro.realm;

import com.zz.bms.shiro.utils.ShiroUtils;
import com.zz.bms.system.base.entity.TsUserEntity;
import com.zz.bms.system.base.logic.enums.EnumUserStatus;
import com.zz.bms.system.base.logic.query.SystemQueryFactory;
import com.zz.bms.system.base.logic.query.TsUserQuery;
import com.zz.bms.system.base.service.TsUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 类的功能描述.
 * shiro 认证
 * @Auther hxy
 * @Date 2017/4/27
 */

public class MyRealm extends AuthorizingRealm {

    private static final Logger logger = LoggerFactory.getLogger(MyRealm.class);
    @Autowired
    private TsUserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();


        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        String loginName= (String) token.getPrincipal();

        TsUserQuery userQuery = SystemQueryFactory.buildTsUserQuery();
        userQuery.loginName(loginName);
        TsUserEntity user = userService.selectOne(userQuery.buildWrapper());

        if(user == null){
            throw new AuthenticationException("帐号密码错误");
        }
        if(EnumUserStatus.forbidden.getCode().equals(user.getStatus())){
            throw new LockedAccountException("帐号被禁用,请联系管理员!");
        }

        String pw = new String ( ((UsernamePasswordToken)token).getPassword());
        System.out.println(ShiroUtils.encodeSalt(pw , user.getSalt()  ));


        SimpleAuthenticationInfo sainfo=new SimpleAuthenticationInfo(user,user.getLoginPassword(), ByteSource.Util.bytes(user.getSalt()),getName());
        return sainfo;
    }

    @Override
    public void setCredentialsMatcher(CredentialsMatcher credentialsMatcher) {
        HashedCredentialsMatcher shaCredentialsMatcher = new HashedCredentialsMatcher();
        shaCredentialsMatcher.setHashAlgorithmName(ShiroUtils.algorithmName);
        shaCredentialsMatcher.setHashIterations(ShiroUtils.hashIterations);
        super.setCredentialsMatcher(shaCredentialsMatcher);
    }

}
