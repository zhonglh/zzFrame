package com.zz.bms.system.bo;
import com.zz.bms.util.configs.annotaions.GroupFieldAnnotation;


import com.zz.bms.system.bo.TsRolePermitBO ;

import java.io.Serializable;
import java.util.List;



/**
* TsPermitGroup BO , 扩展 TsPermitBO 对象
* 许可 数据传输对象，对应界面中的所有元素
* 注意： 对象属性需要和 TsPermitGroupServiceImpl.getServices 对应
* @author Administrator
* @author Administrator
* @date 2019-4-10 11:08:51
*/
public class TsPermitGroupBO extends TsPermitBO implements Serializable {


    @GroupFieldAnnotation(childTableColumnName = "permit_id" , filedName = "角色许可关联")
    List<TsRolePermitBO> rolePermitBOList ;


    public List<TsRolePermitBO>  getRolePermitBOList(){
        return rolePermitBOList ;
    }
    public void setRolePermitBOList(List<TsRolePermitBO> rolePermitBOList ){
        this.rolePermitBOList = rolePermitBOList;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
