package com.zz.bms.system.service.impl;

import com.zz.bms.core.IUserService;
import com.zz.bms.core.db.entity.ILoginPermitEntity;
import com.zz.bms.core.db.entity.ILoginRoleEntity;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.core.enums.EnumYesNo;
import com.zz.bms.system.dao.TsUserDAO;
import com.zz.bms.system.query.TsPermitQuery;
import com.zz.bms.system.query.TsUserQuery;
import com.zz.bms.system.query.VsUserPermitQuery;
import com.zz.bms.system.query.impl.TsPermitQueryImpl;
import com.zz.bms.system.query.impl.TsUserQueryImpl;
import com.zz.bms.system.query.impl.VsUserPermitQueryImpl;
import com.zz.bms.system.service.TsPermitService;
import com.zz.bms.system.service.TsUserRoleService;
import com.zz.bms.system.service.TsUserService;
import com.zz.bms.system.service.VsUserPermitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 登录用户服务实现类
 * @author Administrator
 */
@Service
public class UserServiceImpl implements IUserService<String> {


    @Autowired
    private TsUserService tsUserService ;


    @Autowired
    private TsPermitService tsPermitService ;


    @Autowired
    private TsUserRoleService tsUserRoleService ;


    @Autowired
    private VsUserPermitService vsUserPermitService;



    @Override
    public ILoginUserEntity getUserEntityByLoginName(String loginName) {

        TsUserQuery userQuery = new TsUserQueryImpl();
        userQuery.loginName(loginName);
        return tsUserService.getOne(userQuery.buildWrapper());

    }

    @Override
    public List<ILoginRoleEntity> getUserRoleInfo(ILoginUserEntity loginUserEntity) {
        //todo 后期加上 vs_user_role 视图来处理
        return null;
    }

    @Override
    public List<ILoginPermitEntity> getUserPermitInfo(ILoginUserEntity loginUserEntity) {
        if(EnumYesNo.YES.getCode().equals(loginUserEntity.isSystemUser())) {
            //系统管理人查询所有的许可
            TsPermitQuery query = new TsPermitQueryImpl();
            query.deleteFlag(EnumYesNo.NO.getCode());
            return tsPermitService.list(query.buildWrapper());
        }else {
            VsUserPermitQuery query = new VsUserPermitQueryImpl();
            query.userId(loginUserEntity.getId());
            return vsUserPermitService.list(query.buildWrapper());
        }
    }
}


