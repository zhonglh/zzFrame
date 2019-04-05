package com.zz.bms.controller.base.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zz.bms.core.db.entity.BaseBusinessEntity;
import com.zz.bms.core.db.entity.BaseBusinessSimpleEntity;
import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.util.base.java.GenericsHelper;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;

/**
 * @author Administrator
 */
public abstract class BaseBusinessController<
        RwModel extends BaseEntity<PK>,
        QueryModel extends RwModel,
        PK extends Serializable,
        RwQuery extends Query,
        OnlyQuery extends RwQuery
        > extends BaseCommonController<PK> {


    public final String defaultEditPageName = "editForm";
    public final String defaultAddPageName = "editForm";
    public final String defaultViewPageName = "viewForm";
    public final String defaultListPageName = "list";
    public final String defaultTreePageName = "tree";


    /**
     * 实体类型
     */
    private final Class<QueryModel> queryEntityClass;


    private final Class<RwModel> rwEntityClass;


    public BaseBusinessController(){
        this.queryEntityClass = GenericsHelper.getSuperClassGenricType(getClass(), 0);
        this.rwEntityClass = GenericsHelper.getSuperClassGenricType(getClass(), 1);
    }






    protected QueryModel newQueryModel() {
        try {
            return queryEntityClass.newInstance();
        } catch (Exception e) {
            throw new IllegalStateException("can not instantiated model : " + this.queryEntityClass, e);
        }
    }

    public Class<QueryModel> getQueryEntityClass() {
        return queryEntityClass;
    }



    protected RwModel newRwModel() {
        try {
            return rwEntityClass.newInstance();
        } catch (Exception e) {
            throw new IllegalStateException("can not instantiated model : " + this.queryEntityClass, e);
        }
    }

    public Class<RwModel> getRwEntityClass() {
        return rwEntityClass;
    }



    /**
     * 收集信息
     * 如果spring mvc 无法自动将请求的一部分信息放入到对象中 ， 通过此方法来实现
     * @param m
     * @param model
     * @param request
     * @param response
     */
    protected void gatherCreateInformation(RwModel m, ModelMap model , ILoginUserEntity<PK> sessionUserVO, HttpServletRequest request, HttpServletResponse response){

    }

    /**
     * 保存前设置一些 业务定制的值
     * 保存时有特殊的值需要先设置，需要重载 ， 否则无法通过校验
     * 比如一些状态值， 比如有效状态， 在新增是如果在界面上没有设置，应该默认设置一个状态
     * @param m
     */
    protected void setCustomInfoByInsert(RwModel m , ILoginUserEntity sessionUser){

    }




    /**
     * 收集信息
     * 如果spring mvc 无法自动将请求的一部分信息放入到对象中 ， 通过此方法来实现
     * @param m
     * @param model
     * @param request
     * @param response
     */
    protected void gatherUpdateInformation(RwModel m, ModelMap model , ILoginUserEntity<PK> sessionUserVO, HttpServletRequest request, HttpServletResponse response){

    }

    /**
     * 更新前设置一些 业务定制的值
     * 更新时有特殊的值需要联动或定制，需要重载
     * @param m
     */
    protected void setCustomInfoByUpdate(RwModel m, ILoginUserEntity sessionUser){

    }

    /**
     * 设置一些旧的值
     * @param newVal
     * @param oldVal
     */
    protected RwModel setOldValue(RwModel newVal ,RwModel oldVal){
        return newVal;
    }



    /**
     * 插入信息
     * @param m
     * @param sessionUserVO
     */
    protected void insertInfo(RwModel m, ILoginUserEntity<PK> sessionUserVO)  {
        throw new RuntimeException("Please overload this method first");
    }




    /**
     * 查询数据转Wrapper
     * 基于查询组织Wrapper
     * 有些特殊的界面，比如 查询条件之间是 OR 的关系而不是默认的 AND ,  或者关键字查询多个业务字段 查用户时关键字包括姓名 手机号 邮箱
     * @param query
     * @param m
     * @return
     */
    protected Wrapper buildQueryWrapper(OnlyQuery query , QueryModel m) {
        QueryWrapper wrapper =   query.buildWrapper();
        if(m instanceof BaseBusinessEntity || m instanceof BaseBusinessSimpleEntity){
            wrapper.orderByDesc(" create_time " );
        }
        return wrapper;
    }

    /**
     * 查询数据转Wrapper
     * 基于读写组织Wrapper
     * 有些特殊的界面，比如 查询条件之间是 OR 的关系而不是默认的 AND ,  或者关键字查询多个业务字段 查用户时关键字包括姓名 手机号 邮箱
     * @param query
     * @param m
     * @return
     */
    protected Wrapper buildRwWrapper(RwQuery query , RwModel m) {
        QueryWrapper wrapper =   query.buildWrapper();
        return wrapper;
    }

    /**
     * 检查是否可以新增
     * @param m
     * @param sessionUserVO
     */
    protected  void checkCanInsert(RwModel m, ILoginUserEntity<PK> sessionUserVO){
        //如果有问题，直接 throw BizException
        //比如上级或者其它数据已经锁定， 不能修改
    }

    /**
     * 检查是否可以修改
     * @param m
     * @param sessionUserVO
     */
    protected void checkCanUpdate(RwModel m, ILoginUserEntity<PK> sessionUserVO){
        //如果有问题，直接 throw BizException
        //比如已经归档 ，或者正在审批， 不能修改
        //比如上级或者其它数据已经锁定， 不能修改
    }


    /**
     * 检查是否可以删除
     * @param m
     * @param sessionUserVO
     */
    protected void checkCanDelete(RwModel m, ILoginUserEntity<PK> sessionUserVO){
        //如果有问题，直接 throw BizException
        //比如已经归档 ，或者正在审批， 不能删除
        //比如上级或者其它数据已经锁定， 不能删除
    }
}
