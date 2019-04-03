package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseGroupServiceImpl;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;
import com.zz.bms.system.bo.TsRoleGroupBO;
import com.zz.bms.system.service.TsRoleGroupService;

public class TsRoleGroupServiceImpl extends BaseGroupServiceImpl<TsRoleGroupBO,String> implements TsRoleGroupService {
    @Override
    public BaseDAO[] getDAO() {
        return null;
    }


}
