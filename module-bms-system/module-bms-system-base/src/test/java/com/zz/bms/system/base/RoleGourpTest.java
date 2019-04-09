package com.zz.bms.system.base;

import com.alibaba.druid.pool.DruidDataSource;
import com.zz.bms.system.bo.TsRoleGroupBO;
import com.zz.bms.system.service.TsRoleGroupService;
import com.zz.bms.system.service.VsUserService;
import com.zz.bms.util.spring.SpringUtil;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleGourpTest extends BaseTest {

    @Autowired
    private TsRoleGroupService roleGroupService;


    @Test
    public void testSpringStart() {
        DruidDataSource ds = (DruidDataSource) SpringUtil.getBean("dataSource");
        Assert.assertNotNull(ds);
    }


    @Test
    //@Rollback(false)
    public void testGetById() {
        String roleId = "f73b1e592cde4593949bf94f8d444c1f";
        TsRoleGroupBO role = roleGroupService.getById(roleId , true);
        System.out.println(role);
    }


}
