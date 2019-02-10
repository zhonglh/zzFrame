package com.zz.bms.util;

import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.enums.EnumDefaultType;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Administrator
 */
public class BaseUtil {




    public static Object getDefaultValue(EnumDefaultType defaultValue , ILoginUserEntity loginUser){

        if(defaultValue == null){
            return null;
        }
        Calendar date = Calendar.getInstance();

        Object result = null;
        switch (defaultValue.getVal()){
            case DefaultTypeConstant.CURRENT_YEAR:
                result = date.get(Calendar.YEAR);
                break;
            case DefaultTypeConstant.CURRENT_MONTH:
                result = date.get(Calendar.MONTH) + 1;
                break;
            case DefaultTypeConstant.CURRENT_DATE:
                result = new Date();
                break;
            case DefaultTypeConstant.CURRENT_TIME:
                result = new Timestamp(System.currentTimeMillis());
                break;


            case DefaultTypeConstant.CURRENT_USERID:
                result = loginUser.getId();
                break;
            case DefaultTypeConstant.CURRENT_USERNAME:
                result = loginUser.getUserName();
                break;
            case DefaultTypeConstant.CURRENT_USER_LEADID:
                result = loginUser.getLeadId();
                break;
            case DefaultTypeConstant.CURRENT_USER_LEADNAME:
                result = loginUser.getLeadName();
                break;


            case DefaultTypeConstant.CURRENT_USER_DEPTID:
                result = loginUser.getDepId();
                break;
            case DefaultTypeConstant.CURRENT_USER_DEPTNAME:
                result = loginUser.getDepName();
                break;
            case DefaultTypeConstant.CURRENT_USER_ORGANID:
                result = loginUser.getOrganId();
                break;
            case DefaultTypeConstant.CURRENT_USER_ORGANNAME:
                result = loginUser.getOrganName();
                break;

            case DefaultTypeConstant.CURRENT_USER_TENANTID:
                result = loginUser.getTenantId();
                break;

            case DefaultTypeConstant.CURRENT_USER_TENANTNAME:
                result = loginUser.getTenantName();
                break;

            default:
                break;

        }

        return result;
    }

}
