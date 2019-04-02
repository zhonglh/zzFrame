package com.zz.bms.system.bo;


import com.zz.bms.system.service.TsRolePermitService;

import java.util.List;

/**
 * 角色信息+角色许可列表
 * @author zhonglh
 */
public class TsRoleAllBO extends TsRoleBO {

    private List<TsRolePermitBO> rolePermitBOList;

    public List<TsRolePermitBO> getRolePermitBOList() {
        return rolePermitBOList;
    }

    public void setRolePermitBOList(List<TsRolePermitBO> rolePermitBOList) {
        this.rolePermitBOList = rolePermitBOList;
    }
}
