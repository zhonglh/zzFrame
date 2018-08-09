package com.zz.bms.controller.base.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.zz.bms.configs.AppConfig;
import com.zz.bms.controller.base.PermissionList;
import com.zz.bms.core.Constant;
import com.zz.bms.core.db.base.service.BaseService;
import com.zz.bms.core.db.entity.*;
import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.exceptions.DbException;
import com.zz.bms.core.ui.Pages;
import com.zz.bms.core.vo.AjaxJson;
import com.zz.bms.util.base.java.GenericsHelper;
import com.zz.bms.util.base.spring.PaginationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;
import java.util.List;

/**
 * 处理数据库基础的增加 修改 读取 删除 功能
 * @author Administrator
 */
public abstract class BaseCURDController<M extends BaseEntity<PK>, PK extends Serializable  , Q extends Query > extends BaseBussinessController {

    public final String defaultEditPageName = "editForm";
    public final String defaultAddPageName = "editForm";
    public final String defaultViewPageName = "viewForm";
    public final String defaultListPageName = "list";


    protected BaseService<M, PK> baseService;

    /**
     * 判断列表是否需要设置一些公共信息
     */
    protected boolean listAlsoSetCommonData = true;

    /**
     * 本功能总的权限列表
     */
    protected PermissionList permissionList = null;

    /**
     * 本功能的资源名称
     */
    protected String resourceIdentity = null;






    /**
     * 实体类型
     */
    protected final Class<M> entityClass;

    protected String viewPrefix;


    protected BaseCURDController() {
        this.entityClass = GenericsHelper.getSuperClassGenricType(getClass(), 0);
        setViewPrefix(defaultViewPrefix());
        setResourceIdentity(this.getViewPrefix().replaceAll("/","\\."));
    }


    /**
     * 到列表界面
     * @param m
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/toList" , method = RequestMethod.GET )
    public String toList(M m,  ModelMap model , HttpServletRequest request, HttpServletResponse response) {

        this.permissionList.assertHasViewPermission();

        model.put("entity" ,m);

        if (listAlsoSetCommonData) {
            setCommonData(m,model);
        }


        String prefix =  getViewPrefix();
        String tableid = prefix.replaceAll("/" , "");

        model.put(Constant.TABLEID, tableid);
        model.put(Constant.CURR_PARENT_URL, prefix);

        //todo 处理面包屑 菜单路径
        if(AppConfig.USE_CRUMB) {
            model.put(Constant.BREADCRUMB, "");
        }

        String pageName = this.getListPageName();
        if(StringUtils.isEmpty(pageName)){
            pageName = defaultListPageName;
        }
        return viewName(pageName);
    }



    @RequestMapping(value = "/list" , method = RequestMethod.GET)
    @ResponseBody
    public Object list(M m , Q query, Pages<M> pages , Model model , HttpServletRequest request, HttpServletResponse response) {

        this.permissionList.assertHasViewPermission();


        if(pages.getPageNum() == 0) {
            pages.setPageNum(PaginationContext.getPageNum());
        }

        if(pages.getPageSize() == 0) {
            pages.setPageSize(PaginationContext.getPageSize());
        }

        processPages(pages , request);

        Page<M> page = new Page<M>(pages.getPageNum(), pages.getPageSize());

        processQuery(query , m);

        Wrapper wrapper = buildWrapper(query , m);

        page = baseService.selectPage(page , wrapper );

        processResult(page.getRecords());

        return toList(page);

    }



    /**
     * 查看界面
     * @param model
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}/view", method = RequestMethod.GET)
    public String showViewForm(ModelMap model, @PathVariable("id") PK id, HttpServletRequest request, HttpServletResponse response) {

        this.permissionList.assertHasViewPermission();


        Wrapper<M> wrapper = new EntityWrapper<M>();
        wrapper.eq("id" , id);
        M m = baseService.selectOne(wrapper);
        if(m == null){
            throw EnumErrorMsg.no_auth.toException();
        }

        setCommonData(m,model);
        customInfoByViewForm(m , model);
        model.addAttribute("m", m);
        model.addAttribute("entity", m);

        String pageName = this.getViewPageName();
        if(StringUtils.isEmpty(pageName)){
            pageName = defaultViewPageName;
        }
        return viewName(pageName);
    }



    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String showCreateForm(M m ,ModelMap model, HttpServletRequest request, HttpServletResponse response) {

        this.permissionList.assertHasCreatePermission();

        setCommonData(m,model);

        setInit(m);
        customInfoByCreateForm(m , model);
        model.addAttribute("m",  m);
        model.addAttribute("entity", m);

        String pageName = this.getAddPageName();
        if(StringUtils.isEmpty(pageName)){
            pageName = defaultAddPageName;
        }
        return viewName(pageName);
    }



    @RequestMapping(value = "/{id}/update", method = RequestMethod.GET)
    public String showUpdateForm(ModelMap model, @PathVariable("id") PK id, HttpServletRequest request, HttpServletResponse response) {

        this.permissionList.assertHasUpdatePermission();


        Wrapper<M> wrapper = new EntityWrapper<M>();
        wrapper.eq("id" , id);
        M m = baseService.selectOne(wrapper);
        if(m == null){
            throw EnumErrorMsg.no_auth.toException();
        }

        setCommonData(m,model);
        customInfoByUpdateForm(m , model);
        model.addAttribute("m", m);
        model.addAttribute("entity", m);

        String pageName = this.getEditPageName();
        if(StringUtils.isEmpty(pageName)){
            pageName = defaultEditPageName;
        }
        return viewName(pageName);
    }



    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public Object create( M m, ModelMap model , HttpServletRequest request, HttpServletResponse response) {

        this.permissionList.assertHasCreatePermission();


        if (isExist(m)) {throw DbException.DB_SAVE_SAME;}


        ILoginUserEntity<PK> sessionUserVO = getSessionUser();

        this.setInsertInfo(m, sessionUserVO);
        this.setCustomInfoByInsert(m);
        this.processBO(m);
        checkEntityRequired(m);

        boolean success = false;
        try{
            insertBefore(m);
            success = baseService.insert(m);
            insertAfter(m);

        }catch(Exception e){
            logger.error(e.getMessage() , e);
            throw DbException.DB_SAVE_SAME;
        }

        if(!success){
            throw DbException.DB_INSERT_RESULT_0;
        }


        return AjaxJson.successAjax;

    }



    @RequestMapping(value = "/{id}/update", method = RequestMethod.POST)
    @ResponseBody
    public Object update(@PathVariable("id") PK id, ModelMap model, M m , HttpServletRequest request, HttpServletResponse response) {

        this.permissionList.assertHasUpdatePermission();


        if (isExist(m)) {throw DbException.DB_SAVE_SAME;}

        ILoginUserEntity<PK> sessionUserVO = getSessionUser();


        Wrapper<M> wrapper = new EntityWrapper<M>();
        wrapper.eq("id" , id);
        M temp = baseService.selectOne(wrapper);
        if(temp == null){
            throw EnumErrorMsg.no_auth.toException();
        }



        if(m instanceof BaseBusinessEntity) {
            BaseBusinessEntity bbe = (BaseBusinessEntity)m;
            bbe.setVersionNo(((BaseBusinessEntity)temp).getVersionNo());
        }
        this.setUpdateInfo(m, sessionUserVO);
        setCustomInfoByUpdate(m);
        this.processBO(m);
        checkEntityLegality(m);

        boolean success = false;
        try {
            updateBefore(m);
            success = baseService.updateById(m);
            updateAfter(m);
        }catch(Exception e){
            logger.error(e.getMessage() , e);
            throw DbException.DB_SAVE_SAME;
        }

        if(!success){
            throw DbException.DB_UPDATE_RESULT_0;
        }else {
            return AjaxJson.successAjax;
        }
    }



    /**
     * 单条删除
     * @param id
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/{id}/delete", method = {RequestMethod.POST, RequestMethod.DELETE})
    @ResponseBody
    public Object delete(         @PathVariable("id") PK id , HttpServletRequest request, HttpServletResponse response) {


        this.permissionList.assertHasDeletePermission();

        Wrapper<M> wrapper = new EntityWrapper<M>();
        wrapper.eq("id" , id);
        setCustomInfoByDelete(wrapper);
        M m = baseService.selectOne(wrapper);
        if(m == null){
            throw EnumErrorMsg.no_auth.toException();
        }

        boolean success = false;
        try {
            deleteBefore(m);
            success = baseService.deleteById(m);
            deleteAfter(m);
        }catch(Exception e){
            logger.error(e.getMessage() , e);
            throw DbException.DB_DELETE_RESULT_0;
        }

        if(!success){
            throw EnumErrorMsg.no_auth.toException();
        }
        return AjaxJson.successAjax;
    }



    /**
     * 批量删除
     * @param ids
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/batch/delete" ,method = {RequestMethod.POST, RequestMethod.DELETE})
    @ResponseBody
    public Object deleteInBatch(@RequestParam(value = "ids", required = false) String ids, HttpServletRequest request, HttpServletResponse response) {


        this.permissionList.assertHasDeletePermission();

        if(ids == null || ids.isEmpty()){
            throw EnumErrorMsg.not_select_todelete.toException();
        }



        Wrapper<M> wrapper = new EntityWrapper<M>();
        String idList[] = ids.split(",");
        int index = 0;
        for(String id : idList) {
            if(index > 0){
                wrapper.or();
            }
            wrapper.eq("id", id);
            index ++;
        }

        setCustomInfoByDelete(wrapper);

        List<M> list = baseService.selectList(wrapper);

        if(list == null && list.isEmpty()){
            throw EnumErrorMsg.no_auth.toException();
        }


        boolean success = false;
        try {
            success = baseService.deletesByIds(list) ;
        }catch(Exception e){
            logger.error(e.getMessage() , e);
            throw DbException.DB_DELETE_RESULT_0;
        }



        if(!success){
            throw DbException.DB_DELETE_RESULT_0;
        }
        return AjaxJson.successAjax;

    }





    /**
     * 权限前缀：如sys:user
     * 则生成的新增权限为 sys:user:create
     */
    public void setResourceIdentity(String resourceIdentity) {
        if (!StringUtils.isEmpty(resourceIdentity)) {
            this.resourceIdentity = resourceIdentity ;
            permissionList = PermissionList.newPermissionList(resourceIdentity);
        }
    }












    /**
     * 是否重复
     * @param m
     * @return
     */
    protected boolean isExist(M m) {
        return false;
    }


    /**
     * 新增或者修改时，检验数据是否唯一(单条件)
     *
     * @param m
     */
    @RequestMapping(value="/checkUnique"  ,method = RequestMethod.GET)
    @ResponseBody
    public Object checkUnique(M m) {
        M temp = baseService.selectCheck(m);
        if (isEntityExist(temp)) {
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
    public AjaxJson checkAllUnique(M m) {
        boolean isExist = this.isExist(m);
        if (isExist) {
            throw DbException.DB_SAVE_SAME;
        }
        else {
            return AjaxJson.successAjax;
        }
    }









    /**
     * 当前模块 视图的前缀
     * 默认
     * 1、获取当前类头上的@RequestMapping中的value作为前缀
     * 2、如果没有就使用当前模型小写的简单类名
     */
    public void setViewPrefix(String viewPrefix) {
        if (viewPrefix.startsWith("/")) {
            viewPrefix = viewPrefix.substring(1);
        }
        this.viewPrefix = viewPrefix;
    }

    public String getViewPrefix() {
        return viewPrefix;
    }

    protected M newModel() {
        try {
            return entityClass.newInstance();
        } catch (Exception e) {
            throw new IllegalStateException("can not instantiated model : " + this.entityClass, e);
        }
    }

    /**
     * 获取视图名称：即prefixViewName + "/" + suffixName
     *
     * @return
     */
    public String viewName(String suffixName) {
        if (!suffixName.startsWith("/")) {
            suffixName = "/" + suffixName;
        }
        return getViewPrefix() + suffixName;
    }


    /**
     * @param backURL null 将重定向到默认getViewPrefix()
     * @return
     */
    protected String redirectToUrl(String backURL) {
        if (StringUtils.isEmpty(backURL)) {
            backURL = getViewPrefix();
        }
        if (!backURL.startsWith("/") && !backURL.startsWith("http")) {
            backURL = "/" + backURL;
        }
        return "redirect:" + backURL;
    }

    protected String defaultViewPrefix() {
        String currentViewPrefix = "";
        RequestMapping requestMapping = AnnotationUtils.findAnnotation(getClass(), RequestMapping.class);
        if (requestMapping != null && requestMapping.value().length > 0) {
            currentViewPrefix = requestMapping.value()[0];
        }

        if (StringUtils.isEmpty(currentViewPrefix)) {
            currentViewPrefix = this.entityClass.getSimpleName();
        }

        return currentViewPrefix;
    }


    /**
     * 设置基础service
     *
     * @param baseService
     */
    @Autowired
    public void setBaseService(BaseService<M, PK> baseService) {
        this.baseService = baseService;
    }






























    /**
     * 列表也设置common data
     */
    public void setListAlsoSetCommonData(boolean listAlsoSetCommonData) {
        this.listAlsoSetCommonData = listAlsoSetCommonData;
    }


    /**
     * 处理查询参数
     * 查询参数如果需要特殊处理， 需要重载
     * @param query
     */
    protected void processQuery(Q query , M m){

    }

    /**
     * 处理查询结果
     * 查询结果数据需要特殊处理， 需要重载
     * @param records
     */
    protected void processResult(List<M> records){

    }


    /**
     * 保存或修改之前， 处理BO中属性的值
     * 如反填 状态名称的值
     * @param m
     */
    protected void processBO(M m){

    }


    /**
     * 保存前设置一些 业务定制的值
     * 保存时有特殊的值需要先设置，需要重载 ， 否则无法通过校验
     * 比如一些状态值， 比如有效状态， 在新增是如果在界面上没有设置，应该默认设置一个状态
     * @param m
     */
    protected void setCustomInfoByInsert(M m){

    }

    /**
     * 更新前设置一些 业务定制的值
     * 更新时有特殊的值需要联动或定制，需要重载
     * @param m
     */
    protected void setCustomInfoByUpdate(M m){

    }

    /**
     * 对删除的数据再次过滤
     * 比如规定不能删除admin的用户,不能删除正在审批的数据等 ,
     * 如有， 需要重载
     * @param wrapper
     */
    protected void setCustomInfoByDelete(Wrapper<M> wrapper) {

    }







    /**
     * 查询数据转Wrapper
     * 有些特殊的界面，比如 查询条件之间是 OR 的关系而不是默认的 AND ,  或者关键字查询多个业务字段 查用户时关键字包括姓名 手机号 邮箱
     * @param query
     * @param m
     * @return
     */
    protected Wrapper buildWrapper(Q query , M m) {
        Wrapper wrapper =   query.buildWrapper();
        if(m instanceof BaseBusinessEntity || m instanceof BaseBusinessSimpleEntity){
            wrapper.orderBy(" create_time " , false);
        }
        return wrapper;
    }





    /**
     * 查看界面一些定制的操作
     * 如有， 需要重载
     * @param m
     * @param model
     */
    protected void customInfoByViewForm(M m, ModelMap model) {
    }

    /**
     * 增加界面一些定制的操作
     * 如有， 需要重载
     * @param model
     */
    protected void customInfoByCreateForm(M m, ModelMap model) {
    }


    /**
     * 修改界面一些定制的操作
     * 如有， 需要重载
     * @param m
     * @param model
     */
    protected void customInfoByUpdateForm(M m, ModelMap model) {
    }



    /**
     * 设置通用数据
     * 在新增  修改 列表 等界面 ，  提供下拉数据或者其他数据等
     * 如有， 需要重载
     * @param m
     * @param model
     */
    protected void setCommonData(M m ,ModelMap model) {
    }


    /**
     * 修改之前要处理的
     * 比如修改前再次校验
     * 如有， 需要重载
     * @param m
     */
    protected void updateBefore(M m) {

    }

    /**
     * 修改之后要处理的
     * 比如修改后其他功能的数据需要处理
     * 如有， 需要重载
     * @param m
     */
    protected void updateAfter(M m) {
    }





    /**
     * 删除之前要处理的
     * 比如删除前再次校验
     * 如有， 需要重载
     * @param m
     */
    protected void deleteBefore(M m) {
    }
    /**
     * 删除之后要处理的
     * 比如删除后其他功能的数据需要删除或者修改
     * 如有， 需要重载
     * @param m
     */
    protected void deleteAfter(M m) {
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
     * 增加之后要处理的
     * 比如增加后其他功能的数据需要处理
     * 如有， 需要重载
     * @param m
     */
    protected void insertAfter(M m) {
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

}
