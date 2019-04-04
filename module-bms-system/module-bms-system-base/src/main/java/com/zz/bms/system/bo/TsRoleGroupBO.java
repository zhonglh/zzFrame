package com.zz.bms.system.bo;

import java.io.Serializable;
import java.util.List;

/**
 * 角色数据传输对象，对应界面中的所有元素
 * 注意： 对象属性需要和 TsRoleGroupServiceImpl.getServices 对应
 * @author zhonglh
 */
public class TsRoleGroupBO extends TsRoleBO implements Serializable {

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
