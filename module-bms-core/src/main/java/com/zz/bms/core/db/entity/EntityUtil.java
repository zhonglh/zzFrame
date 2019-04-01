package com.zz.bms.core.db.entity;

import com.zz.bms.util.configs.BusinessConfig;
import com.zz.bms.core.Constant;
import com.zz.bms.util.base.data.DateKit;
import com.zz.bms.util.base.java.IdUtils;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Administrator
 */
public class EntityUtil {


    /**
     * 判断是否存在对象
     * 如果数据库中没有查出对象， 表示不存在， 返回false
     * 如果数据库中有对象    id == entity.id  还表示不存在 ， 返回false,  否则返回 ture;
     * @param entity        根据条件查询出数据库里对象
     * @return
     */
    public static boolean isEntityExist(BaseEntity entity){
        if(entity == null) {
            return false;
        }else{
            return true;
        }
    }


    public static void autoSetInsertEntity(BaseEntity be, ILoginUserEntity sessionUserVO) {
        autoSetInsertEntity(be,sessionUserVO,true);
    }

    public static void autoSetInsertEntity(BaseEntity be, ILoginUserEntity sessionUserVO, boolean isSetId) {
        if(be == null || sessionUserVO == null){
            return ;
        }

        //todo , 如果是自增数字类型， 就不需要设置id
        if(isSetId) {
            be.setId(IdUtils.getId());
        }

        Timestamp currDate_ = DateKit.getCurrentDate();
        if(BusinessConfig.USE_TENANT) {
            be.setTenantId(sessionUserVO.getTenantId());
        }
        if(be instanceof BaseBusinessSimpleEntity){
            BaseBusinessSimpleEntity bbe = (BaseBusinessSimpleEntity)be;
            bbe.setCreateTime(currDate_);
            bbe.setCreateUserId(sessionUserVO.getId());
            bbe.setUpdateTime(currDate_);
            bbe.setUpdateUserId(sessionUserVO.getId());
            bbe.setVersionNo(Constant.INIT_VERSION);
        }else if(be instanceof BaseBusinessEntity){
            BaseBusinessEntity bbe = (BaseBusinessEntity)be;
            bbe.setCreateTime(currDate_);
            bbe.setCreateUserId(sessionUserVO.getId());
            bbe.setUpdateTime(currDate_);
            bbe.setUpdateUserId(sessionUserVO.getId());
            bbe.setVersionNo(Constant.INIT_VERSION);
            bbe.setDeleteFlag("0");
        }
        if(be instanceof BaseBusinessExEntity){
            BaseBusinessExEntity bbex = (BaseBusinessExEntity)be;
            bbex.setCreateUserName(sessionUserVO.getUserName());
            bbex.setUpdateUserName(sessionUserVO.getUserName());
        }
        if(be instanceof BaseBusinessSimpleExEntity ){
            BaseBusinessSimpleExEntity bbex = (BaseBusinessSimpleExEntity)be;
            bbex.setCreateUserName(sessionUserVO.getUserName());
            bbex.setUpdateUserName(sessionUserVO.getUserName());
        }
    }


    public static void autoSetUpdateEntity(BaseEntity be, ILoginUserEntity sessionUserVO) {
        Timestamp currDate_ = DateKit.getCurrentDate();
        if(be instanceof BaseBusinessEntity){
            BaseBusinessEntity bbe = (BaseBusinessEntity)be;
            bbe.setUpdateTime(currDate_);
            bbe.setUpdateUserId(sessionUserVO.getId());
        }
        if(be instanceof BaseBusinessSimpleEntity){
            BaseBusinessSimpleEntity bbe = (BaseBusinessSimpleEntity)be;
            bbe.setUpdateTime(currDate_);
            bbe.setUpdateUserId(sessionUserVO.getId());
        }
        if(be instanceof BaseBusinessExEntity){
            BaseBusinessExEntity bbex = (BaseBusinessExEntity)be;
            bbex.setUpdateUserName(sessionUserVO.getUserName());
        }
        if(be instanceof BaseBusinessSimpleExEntity){
            BaseBusinessSimpleExEntity bbex = (BaseBusinessSimpleExEntity)be;
            bbex.setUpdateUserName(sessionUserVO.getUserName());
        }
    }


}
