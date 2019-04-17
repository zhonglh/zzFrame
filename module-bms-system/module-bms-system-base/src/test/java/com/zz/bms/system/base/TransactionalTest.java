package com.zz.bms.system.base;

import com.zz.bms.enums.EnumRoleStatus;
import com.zz.bms.enums.EnumRoleType;
import com.zz.bms.enums.EnumUserStatus;
import com.zz.bms.enums.EnumYesNo;
import com.zz.bms.system.bo.*;
import com.zz.bms.system.domain.TsRolePermitEntity;
import com.zz.bms.system.service.TsRoleGroupService;
import com.zz.bms.system.service.TsRoleService;
import com.zz.bms.system.service.TsUserRoleService;
import com.zz.bms.system.service.TsUserService;
import com.zz.bms.util.base.java.IdUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionalTest extends BaseTest {


    @Autowired
    private TsRoleGroupService roleGroupService;

    @Test
    public void testGetById() {


        TsRoleGroupBO tsrole = new TsRoleGroupBO();
        tsrole.setId("1");
        tsrole.setRoleType(EnumRoleType.USER_ROLE.getVal());
        tsrole.setRoleName("rrr");
        tsrole.setRoleCode("eee");
        tsrole.setRoleStatus(EnumRoleStatus.normal.getVal());
        tsrole.setCreateUserId("1");
        tsrole.setCreateUserName("11");
        tsrole.setCreateTime(new Timestamp(System.currentTimeMillis()));
        tsrole.setTenantId("1");
        tsrole.setOrganId("1");
        tsrole.setVersionNo(0);

        List<TsRolePermitBO> rps = new ArrayList<TsRolePermitBO>();
        TsRolePermitBO rp = new TsRolePermitBO();
        rp.setRoleId("1");
        rp.setPermitId("2");
        //rp.setId(IdUtils.getId());
        rps.add(rp);


        tsrole.setRolePermitList(rps);

        roleGroupService.save(tsrole);
    }

}
