package com.zz.bms.controller.base.controller;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zz.bms.controller.base.PermissionList;
import com.zz.bms.core.Constant;
import com.zz.bms.core.db.entity.*;
import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.core.ui.Pages;
import com.zz.bms.core.ui.TreeModel;
import com.zz.bms.core.ui.easyui.EasyUiDataGrid;
import com.zz.bms.core.ui.easyui.EasyUiUtil;
import com.zz.bms.core.vo.AjaxJson;
import com.zz.bms.enums.EnumDefaultType;
import com.zz.bms.util.BaseUtil;
import com.zz.bms.util.base.BankNoValidateUtils;
import com.zz.bms.util.base.data.SerializableUtil;
import com.zz.bms.util.base.data.StringUtil;
import com.zz.bms.util.base.java.GenericsHelper;
import com.zz.bms.util.configs.BusinessConfig;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.util.configs.util.AnnotaionEntityUtil;
import com.zz.bms.util.spring.ReflectionUtil;
import com.zz.bms.util.spring.SpringUtil;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @author Administrator
 */
public abstract class BaseBusinessController<M extends BaseEntity<PK>, PK extends Serializable, Q extends Query> extends BaseCommonController<PK> {




    /**
     * 实体类型
     */
    private final Class<M> entityClass;


    public BaseBusinessController(){
        this.entityClass = GenericsHelper.getSuperClassGenricType(getClass(), 0);
    }






    protected M newModel() {
        try {
            return entityClass.newInstance();
        } catch (Exception e) {
            throw new IllegalStateException("can not instantiated model : " + this.entityClass, e);
        }
    }

    public Class<M> getEntityClass() {
        return entityClass;
    }




    /**
     * 保存前设置一些 业务定制的值
     * 保存时有特殊的值需要先设置，需要重载 ， 否则无法通过校验
     * 比如一些状态值， 比如有效状态， 在新增是如果在界面上没有设置，应该默认设置一个状态
     * @param m
     */
    protected void setCustomInfoByInsert(M m , ILoginUserEntity sessionUser){

    }

    /**
     * 更新前设置一些 业务定制的值
     * 更新时有特殊的值需要联动或定制，需要重载
     * @param m
     */
    protected void setCustomInfoByUpdate(M m){

    }

    /**
     * 设置一些旧的值
     * @param newVal
     * @param oldVal
     */
    protected M setOldValue(M newVal , M oldVal){
        return newVal;
    }


    /**
     * 增加之前要处理的
     * 比如增加前再次校验
     * 如有， 需要重载
     * @param m
     */
    protected void insertBefore(M m) {
    }


    /**
     * 插入信息
     * @param m
     * @param sessionUserVO
     */
    protected void insertInfo(M m, ILoginUserEntity<PK> sessionUserVO)  {
        throw new RuntimeException("Please overload this method first");
    }

    /**
     * 增加之后要处理的
     * 比如增加后其他功能的数据需要处理
     * 如有， 需要重载
     * @param m
     */
    protected void insertAfter(M m) {
    }



    /**
     * 查询数据转Wrapper
     * 有些特殊的界面，比如 查询条件之间是 OR 的关系而不是默认的 AND ,  或者关键字查询多个业务字段 查用户时关键字包括姓名 手机号 邮箱
     * @param query
     * @param m
     * @return
     */
    protected Wrapper buildWrapper(Q query , M m) {
        QueryWrapper wrapper =   query.buildWrapper();
        if(m instanceof BaseBusinessEntity || m instanceof BaseBusinessSimpleEntity){
            wrapper.orderByDesc(" create_time " );
        }
        return wrapper;
    }

}
