package com.zz.bms.system.dto;

import com.zz.bms.system.bo.TsRoleBO;
import com.zz.bms.system.bo.TsRolePermitBO;

import java.io.Serializable;
import java.util.List;

/**
 * 角色数据传输对象，对应界面中的所有元素
 * @author zhonglh
 */
public class TsRoleDTO extends TsRoleBO implements Serializable {

    List<TsRolePermitBO> rps;

    public List<TsRolePermitBO> getRps() {
        return rps;
    }

    public void setRps(List<TsRolePermitBO> rps) {
        this.rps = rps;
    }



    @Override
    public String toString() {
        return super.toString();
    }
}
