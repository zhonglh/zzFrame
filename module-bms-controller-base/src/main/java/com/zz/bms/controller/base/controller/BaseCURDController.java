package com.zz.bms.controller.base.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zz.bms.core.ui.TreeModel;
import com.zz.bms.util.configs.AppConfig;
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
import com.zz.bms.util.web.PaginationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.Assert;
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
public abstract class BaseCURDController<M extends BaseEntity<PK>, PK extends Serializable  , Q extends Query > extends BaseBusinessController<M,PK,Q> {

    public final String defaultEditPageName = "editForm";
    public final String defaultAddPageName = "editForm";
    public final String defaultViewPageName = "viewForm";
    public final String defaultListPageName = "list";


    @Autowired
    protected BaseService<M, PK> baseService;


    protected String viewPrefix;


    protected BaseCURDController() {
        super();
        setViewPrefix(defaultViewPrefix());
        setResourceIdentity(this.getViewPrefix().replaceAll("/","\\."));
    }


    /**
     * 处理各种路径
     * @param model
     */
    protected void processPath(ModelMap model) {
        String prefix =  getViewPrefix();
        String tableid = prefix.replaceAll("/" , "");
        model.put(Constant.TABLEID, tableid);
        model.put(Constant.CURR_PARENT_URL, prefix);
        //todo 处理面包屑 菜单路径
        if(AppConfig.USE_CRUMB) {
            model.put(Constant.BREADCRUMB, "");
        }
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


        processPath(model);

        String pageName = this.getListPageName();
        if(StringUtils.isEmpty(pageName)){
            pageName = defaultListPageName;
        }
        return viewName(pageName);
    }


    @RequestMapping(value = "/list" , method={ RequestMethod.POST, RequestMethod.GET})
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


        page = (Page<M>)baseService.page(page , wrapper );

        processResult(page.getRecords());

        return toList(page);

    }





    @RequestMapping(value = "/tree" , method={ RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public Object tree(M m , Q query, Pages<M> pages , Model model , HttpServletRequest request, HttpServletResponse response) {

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


        page = (Page<M>)baseService.page(page , wrapper );

        processResult(page.getRecords());

        TreeModel treeModel = buildTreeModel();

        List footer = buildFooter(page);

        return toTreeList(page.getRecords() , treeModel , footer);

    }

    /**
     * 设置树的配置
     * @return
     */
    protected TreeModel buildTreeModel(){
        return null;
    }

    /**
     * 设置树的页脚
     * @param page
     * @return
     */
    protected List buildFooter(Page<M> page){
        return null;
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


        QueryWrapper<M> wrapper = new QueryWrapper<M>();
        wrapper.eq("id" , id);
        M m = baseService.getOne(wrapper);
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


    /**
     * 显示创建页面
     * @param m
     * @param model
     * @param request
     * @param response
     * @return
     */
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


    /**
     * 显示更新页面
     * @param model
     * @param id
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/{id}/update", method = RequestMethod.GET)
    public String showUpdateForm(ModelMap model, @PathVariable("id") PK id, HttpServletRequest request, HttpServletResponse response) {

        this.permissionList.assertHasUpdatePermission();


        QueryWrapper<M> wrapper = new QueryWrapper<>();
        wrapper.eq("id" , id);
        M m = baseService.getOne(wrapper);
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


    /**
     * 新增操作
     * @param m
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public Object create( M m, ModelMap model , HttpServletRequest request, HttpServletResponse response) {

        this.permissionList.assertHasCreatePermission();

        ILoginUserEntity<PK> sessionUserVO = getSessionUser();

        //插入信息
        insertInfo(m, sessionUserVO);

        AjaxJson result =  AjaxJson.ok();
        result.setId(m.getId());
        return result;
    }


    @Override
    protected void insertInfo(M m, ILoginUserEntity<PK> sessionUserVO) {
        insertInfo(m , sessionUserVO , true);
    }

    protected void insertInfo(M m, ILoginUserEntity<PK> sessionUserVO , boolean processBO) {
        //设置创建附加信息，如创建时间， 创建人
        this.setInsertInfo(m, sessionUserVO);

        //初始化默认值
        setInit(m);

        //创建时定制的数据，如状态 等
        this.setCustomInfoByInsert(m,sessionUserVO);

        //处理创建的数据， 如反填状态名称，外键信息等
        if(processBO) {
            this.processBO(m);
        }


        //检查重复数据
        isExist(m);

        boolean success = false;
        try{
            //创建前的一些特殊处理
            insertBefore(m);
            //检查新增附加信息
            checkInsertInfo(m);
            //检查字段的合法性
            checkEntityLegality(m , true , true , true);
            success = baseService.save(m);
            insertAfter(m);

        }catch(RuntimeException e){
            logger.error(e.getMessage() , e);
            throw e;
        }catch(Exception e){
            logger.error(e.getMessage() , e);
            throw DbException.DB_SAVE_SAME;
        }

        if(!success){
            throw DbException.DB_INSERT_RESULT_0;
        }
    }


    @RequestMapping(value = "/{id}/update", method = {RequestMethod.POST , RequestMethod.PUT})
    @ResponseBody
    public Object update(@PathVariable("id") PK id, ModelMap model, M m , HttpServletRequest request, HttpServletResponse response) {

        this.permissionList.assertHasUpdatePermission();


        ILoginUserEntity<PK> sessionUserVO = getSessionUser();


        QueryWrapper<M> wrapper = new QueryWrapper<>();
        wrapper.eq("id" , id);
        M temp = baseService.getOne(wrapper);
        if(temp == null){
            throw EnumErrorMsg.no_auth.toException();
        }

        if(m instanceof BaseBusinessEntity) {
            BaseBusinessEntity bbe = (BaseBusinessEntity)m;
            bbe.setVersionNo(((BaseBusinessEntity)temp).getVersionNo());
        }

        //设置一些旧的值
        m = setOldValue(m , temp);

        //处理更新附加信息，如更新时间  更新人等
        this.setUpdateInfo(m, sessionUserVO);

        //设置更新时的一些属性信息
        setCustomInfoByUpdate(m);


        //处理创建的数据， 如反填状态名称，外键信息等
        this.processBO(m);


        //检查重复数据
        isExist(m);


        boolean success = false;
        try {
            //更新前特殊的处理
            updateBefore(m);

            //检查数据合法性
            checkEntityLegality(m , false , true , true);
            Assert.notNull(m.getId(),"出现内部错误");
            success = baseService.updateById(m);
            updateAfter(m);

        }catch(RuntimeException e){
            logger.error(e.getMessage() , e);
            throw e;
        }catch(Exception e){
            logger.error(e.getMessage() , e);
            throw DbException.DB_SAVE_SAME;
        }

        if(!success){
            throw DbException.DB_UPDATE_RESULT_0;
        }else {

            AjaxJson result =  AjaxJson.ok();
            result.setId(m.getId());
            return result;
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

        QueryWrapper<M> wrapper = new QueryWrapper<>();
        wrapper.eq("id" , id);
        setCustomInfoByDelete(wrapper);
        M m = baseService.getOne(wrapper);
        if(m == null){
            throw EnumErrorMsg.no_auth.toException();
        }

        baseService.specialHandler(m);

        boolean success = false;
        try {
            deleteBefore(m);
            success = baseService.deleteById(m);
            deleteAfter(m);
        }catch(RuntimeException e){
            logger.error(e.getMessage() , e);
            throw e;
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



        QueryWrapper<M> wrapper = new QueryWrapper<>();
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

        List<M> list = baseService.list(wrapper);

        if(list == null && list.isEmpty()){
            throw EnumErrorMsg.no_auth.toException();
        }

        for(M m : list){
            baseService.specialHandler(m);
        }


        boolean success = false;
        try {
            success = baseService.deletesByIds(list) ;
        }catch(RuntimeException e){
            logger.error(e.getMessage() , e);
            throw e;
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
     * 新增或者修改时，检验数据是否唯一(单条件) , 界面上校验， 比如注册时校验用户名唯一
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
        this.isExist(m);
        return AjaxJson.successAjax;
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
            currentViewPrefix = this.getEntityClass().getSimpleName();
        }

        return currentViewPrefix;
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
        this.baseService.processResult(m);
        //this.baseService.specialHandler(m);
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
