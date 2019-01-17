package com.zz.bms.shiro.realm;

import com.zz.bms.core.db.entity.ILoginPermitEntity;
import com.zz.bms.core.db.entity.ILoginRoleEntity;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.enums.EnumUserStatus;
import com.zz.bms.core.IUserService;
import com.zz.bms.shiro.utils.ShiroUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.Permission;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 类的功能描述.
 * shiro 认证
 * @Auther hxy
 * @Date 2017/4/27
 */

public class MyRealm extends AuthorizingRealm {

    private static final Logger logger = LoggerFactory.getLogger(MyRealm.class);

    @Autowired(required = false)
    private IUserService userService;



    /**
     * 给用户配置角色权限信息
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        ILoginUserEntity loginUser = (ILoginUserEntity)principals.getPrimaryPrincipal();

        List<ILoginRoleEntity> roles = userService.getUserRoleInfo(loginUser);

        List<ILoginPermitEntity> permits = userService.getUserPermitInfo(loginUser);

        Set<String> roleSet = new HashSet<String>();
        if(roles != null && !roles.isEmpty()){
            for(ILoginRoleEntity role : roles ){
                roleSet.add(role.getRoleName());
            }
        }

        Set<String> permissionSet = new HashSet<String>();
        if(permits != null && !permits.isEmpty()){
            for(ILoginPermitEntity permit : permits){
                permissionSet.add(permit.getPermissionCode());
            }
        }


        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        info.setRoles(roleSet);
        info.setStringPermissions(permissionSet);

        return info;
    }

    /**
     * 验证登录信息
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        String loginName= (String) token.getPrincipal();

        ILoginUserEntity user = userService.getUserEntityByLoginName(loginName);

        if(user == null){
            throw new AuthenticationException("帐号密码错误");
        }
        if(EnumUserStatus.forbidden.getVal().equals(user.getUserStatus())){
            throw new LockedAccountException("帐号被禁用,请联系管理员!");
        }

        String pw = new String ( ((UsernamePasswordToken)token).getPassword());
        System.out.println(ShiroUtils.encodeSalt(pw , user.getSalt()  ));


        SimpleAuthenticationInfo sainfo=new SimpleAuthenticationInfo(user,user.getLoginPassword(), ByteSource.Util.bytes(user.getSalt()),getName());
        return sainfo;
    }

    /**
     * 注入加密算法匹配密
     * @param credentialsMatcher
     */
    @Override
    public void setCredentialsMatcher(CredentialsMatcher credentialsMatcher) {
        HashedCredentialsMatcher shaCredentialsMatcher = new HashedCredentialsMatcher();
        shaCredentialsMatcher.setHashAlgorithmName(ShiroUtils.algorithmName);
        shaCredentialsMatcher.setHashIterations(ShiroUtils.hashIterations);
        super.setCredentialsMatcher(shaCredentialsMatcher);
    }

}
