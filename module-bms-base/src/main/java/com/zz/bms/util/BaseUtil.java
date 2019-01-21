package com.zz.bms.util;

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
            case "CURRENT_YEAR":
                result = date.get(Calendar.YEAR);
                break;
            case "CURRENT_MONTH":
                result = date.get(Calendar.MONTH) + 1;
                break;
            case "CURRENT_DATE":
                result = new Date();
                break;
            case "CURRENT_TIME":
                result = new Timestamp(System.currentTimeMillis());
                break;


            case "CURRENT_USERID":
                result = loginUser.getId();
                break;
            case "CURRENT_USERNAME":
                result = loginUser.getUserName();
                break;
            case "CURRENT_USER_LEADID":
                result = loginUser.getLeadId();
                break;
            case "CURRENT_USER_LEADNAME":
                result = loginUser.getLeadName();
                break;


            case "CURRENT_USER_DEPTID":
                result = loginUser.getDepId();
                break;
            case "CURRENT_USER_DEPTNAME":
                result = loginUser.getDepName();
                break;
            case "CURRENT_USER_ORGAID":
                result = loginUser.getOrganId();
                break;
            case "CURRENT_USER_ORGANAME":
                result = loginUser.getOrganName();
                break;

            default:
                break;

        }

        return result;
    }

}
