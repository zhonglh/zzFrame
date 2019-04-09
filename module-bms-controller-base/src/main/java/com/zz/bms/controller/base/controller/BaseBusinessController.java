package com.zz.bms.controller.base.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zz.bms.core.db.base.service.BaseService;
import com.zz.bms.core.db.entity.*;
import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.core.exceptions.DbException;
import com.zz.bms.core.vo.AjaxJson;
import com.zz.bms.util.base.java.GenericsHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;
import java.util.List;

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
    public final String defaultAllPageName = "allPage";
    public final String defaultViewPageName = "viewForm";
    public final String defaultListPageName = "list";
    public final String defaultTreePageName = "tree";



    @Autowired
    protected BaseService<QueryModel, PK> baseQueryService;

    @Autowired
    protected BaseService<RwModel, PK> baseRwService;


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





    /**
     * 新增或者修改时，检验数据是否唯一(单条件) , 界面上校验， 比如注册时校验用户名唯一
     *
     * @param m
     */
    @RequestMapping(value="/checkUnique"  ,method = RequestMethod.GET)
    @ResponseBody
    public Object checkUnique(RwModel m) {
        RwModel temp = baseRwService.selectCheck(m);
        if (EntityUtil.isEntityExist(temp)) {
            throw DbException.DB_SAVE_SAME;
        }
        else {
            return AjaxJson.successAjax;
        }
    }

    /**
     * 新增或者修改时，检验数据是否唯一(多条件)
     *
     * @param m
     */
    @RequestMapping(value = "/checkAllUnique"  ,method = RequestMethod.GET)
    @ResponseBody
    public AjaxJson checkAllUnique(RwModel m, ModelMap model , HttpServletRequest request, HttpServletResponse response) {

        ILoginUserEntity<PK> sessionUserVO = getSessionUser();

        if(EntityUtil.isEmpty(m.getId())){
            this.gatherCreateInformation(m , model , sessionUserVO , request, response);
        }else {
            this.gatherUpdateInformation(m , model , sessionUserVO , request, response);
        }
        this.baseRwService.isExist(m);
        return AjaxJson.successAjax;
    }







    protected void processRwQuery(RwQuery query , RwModel m  , ILoginUserEntity<PK> sessionUserVO){

    }

    /**
     * 处理查询参数
     * 查询参数如果需要特殊处理， 需要重载
     * @param query
     */
    protected void processOnlyQuery(OnlyQuery query , QueryModel m  , ILoginUserEntity<PK> sessionUserVO){

    }

    /**
     * 处理查询结果
     * 查询结果数据需要特殊处理， 需要重载
     * @param records
     */
    protected void processResult(List records){

    }

    /**
     * 保存或修改之前， 处理BO中属性的值
     * 如反填 状态名称的值
     * @param m
     */
    protected void processBO(RwModel m){
        //todo
        //this.baseService.processResult(m);
        //this.baseService.specialHandler(m);
    }

    /**
     * 对删除的数据再次过滤
     * 比如规定不能删除admin的用户,不能删除正在审批的数据等 ,
     * 如有， 需要重载
     * @param wrapper
     */
    protected void setCustomInfoByDelete(Wrapper<RwModel> wrapper ,ILoginUserEntity<PK> sessionUserVO  ) {

    }

    /**
     * 查看界面一些定制的操作
     * 如有， 需要重载
     * @param m
     * @param model
     */
    protected void customInfoByViewForm(RwModel m, ModelMap model) {
    }

    /**
     * 增加界面一些定制的操作
     * 如有， 需要重载
     * @param model
     */
    protected void customInfoByCreateForm(RwModel m, ModelMap model) {

    }


    /**
     * 所有界面一些定制的操作
     * 如有， 需要重载
     * @param model
     */
    protected void customInfoByAllPage(RwModel m, ModelMap model) {

    }

    /**
     * 修改界面一些定制的操作
     * 如有， 需要重载
     * @param m
     * @param model
     */
    protected void customInfoByUpdateForm(RwModel m, ModelMap model) {

    }

    /**
     * 设置通用数据
     * 在新增  修改 列表 等界面 ，  提供下拉数据或者其他数据等
     * 如有， 需要重载
     * @param m
     * @param model
     */
    protected void setCommonData(RwModel m ,ModelMap model) {

    }



    /**
     * 返回新增页面指定的Page 名称
     * 如果没有指定，将会使用默认的名称: editForm  对应新增页面为 editForm.jsp
     * @return
     */
    protected String getAddPageName(){
        return null;
    }

    /**
     * 所有的界面
     * 包括主表， 附表 + 子表
     * @return
     */
    protected String getAllPageName(){
        return null;
    }


    /**
     * 返回编辑页面指定的Page 名称
     * 如果没有指定，将会使用默认的名称: editForm  对应编辑页面为 editForm.jsp
     * @return
     */
    protected String getEditPageName(){
        return null;
    }


    /**
     * 返回查看页面指定的Page 名称
     * 如果没有指定，将会使用默认的名称: viewForm  对应编辑页面为 viewForm.jsp
     * @return
     */
    protected String getViewPageName(){
        return null;
    }


    /**
     * 返回列表页面指定的Page 名称
     * 如果没有指定，将会使用默认的名称: listForm  对应编辑页面为 list.jsp
     * @return
     */
    protected String getListPageName(){
        return null;
    }


    /**
     * 返回列表页面指定的Page 名称
     * 如果没有指定，将会使用默认的名称: listForm  对应编辑页面为 list.jsp
     * @return
     */
    protected String getTreePageName(){
        return null;
    }
}
