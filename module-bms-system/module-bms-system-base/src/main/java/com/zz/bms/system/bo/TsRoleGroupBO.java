package com.zz.bms.system.bo;
import com.zz.bms.util.configs.annotaions.GroupFieldAnnotation;


import com.zz.bms.system.bo.TsRolePermitBO ;

import java.io.Serializable;
import java.util.List;



/**
* TsRoleGroup BO , 扩展 TsRoleBO 对象
* 角色 数据传输对象，对应界面中的所有元素
* 注意： 对象属性需要和 TsRoleGroupServiceImpl.getServices 对应
* @author Administrator
* @author Administrator
* @date 2019-4-10 11:08:53
*/
public class TsRoleGroupBO extends TsRoleBO implements Serializable {


    @GroupFieldAnnotation(childTableColumnName = "role_id" , filedName = "角色许可关联")
    List<TsRolePermitBO> rolePermitList ;

    public List<TsRolePermitBO> getRolePermitList() {
        return rolePermitList;
    }

    public void setRolePermitList(List<TsRolePermitBO> rolePermitList) {
        this.rolePermitList = rolePermitList;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
