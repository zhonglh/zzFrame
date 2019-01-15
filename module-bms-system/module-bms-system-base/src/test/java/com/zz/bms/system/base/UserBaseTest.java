package com.zz.bms.system.base;

import com.alibaba.druid.pool.DruidDataSource;
import com.zz.bms.core.Constant;
import com.zz.bms.core.enums.EnumYesNo;
import com.zz.bms.enums.EnumUserStatus;
import com.zz.bms.system.bo.VsUserBO;
import com.zz.bms.system.service.VsUserService;
import com.zz.bms.util.base.data.DateKit;
import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.util.spring.SpringUtil;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

public class UserBaseTest extends BaseTest {

    @Autowired
    private VsUserService vsUserService;



    @Test
    public void testSpringStart() {
        DruidDataSource ds = (DruidDataSource) SpringUtil.getBean("dataSource");
        Assert.assertNotNull(ds);
    }


    @Test
    @Rollback(false)
    public void testCreateUser() {
        VsUserBO userEntity = buildUserEntity();
        boolean b = false;
        try{
            b = vsUserService.save(userEntity);
        }catch(Exception e){
            e.printStackTrace();
            Assert.assertEquals(1, 2);
        }

        Assert.assertEquals(true, b);

        vsUserService.removeById(userEntity.getId());
    }


    private VsUserBO buildUserEntity(){
        VsUserBO userEntity = new VsUserBO();
        userEntity.setLoginName("zz");
        userEntity.setUserName("zz name");
        userEntity.setLoginPassword("123456");
        userEntity.setSalt("12345678");
        userEntity.setPhone("13269096687");
        userEntity.setDepId("1");
        userEntity.setOrganId("1");
        userEntity.setTenantId("1");

        userEntity.setId(IdUtils.getId());
        userEntity.setCreateUserId("1");
        userEntity.setCreateTime(DateKit.getCurrentDate());
        userEntity.setCreateUserName("admin");
        userEntity.setDeleteFlag(EnumYesNo.NO.getCode());
        userEntity.setUserStatus(EnumUserStatus.normal.getCode());
        userEntity.setVersionNo(Constant.INIT_VERSION);
        return userEntity;
    }
}
