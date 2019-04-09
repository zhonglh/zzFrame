package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.service.BaseService;
import com.zz.bms.core.db.base.service.impl.BaseGroupServiceImpl;
import com.zz.bms.system.bo.TsRoleGroupBO;
import com.zz.bms.system.service.TsRoleGroupService;
import com.zz.bms.system.service.TsRolePermitService;
import com.zz.bms.system.service.TsRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhonglh
 */
@Service
public class TsRoleGroupServiceImpl extends BaseGroupServiceImpl<TsRoleGroupBO,String> implements TsRoleGroupService {


    @Autowired
    private TsRoleService roleService;

    @Autowired
    private TsRolePermitService rolePermitService;

    /**
     * 此数组需要和 TsRoleGroupBO 对象对应
     * @return
     */
    @Override
    public BaseService[] getServices() {
        BaseService[] bss = null;
        if(bss == null) {
            bss = new BaseService[]{roleService, rolePermitService};
        }
        return bss;
    }
}
