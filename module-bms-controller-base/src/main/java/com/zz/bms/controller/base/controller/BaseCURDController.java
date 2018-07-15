package com.zz.bms.controller.base.controller;

import com.zz.bms.controller.base.PermissionList;
import com.zz.bms.controller.base.vo.SessionUserVO;
import com.zz.bms.core.db.base.service.BaseService;
import com.zz.bms.core.db.entity.BaseBusinessEntity;
import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.exceptions.DbException;
import com.zz.bms.core.search.RepositoryHelper;
import com.zz.bms.core.search.Searchable;
import com.zz.bms.core.search.callback.SearchCallback;
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
import java.util.Arrays;
import java.util.List;

/**
 * 处理数据库基础的增加 修改 读取 删除 功能
 * @author Administrator
 */
public abstract class BaseCURDController<M extends BaseEntity<PK>, PK extends Serializable> extends BaseBussinessController {




    protected BaseService<M, PK> baseService;

    private boolean listAlsoSetCommonData = true;

    protected PermissionList permissionList = null;

    private String resourceIdentity = null;


    /**
     * 实体类型
     */
    private final Class<M> entityClass;

    private String viewPrefix;


    protected BaseCURDController() {
        this.entityClass = GenericsHelper.getSuperClassGenricType(getClass(), 0);
        setViewPrefix(defaultViewPrefix());
        setResourceIdentity(getResourceIdentity());
    }


    /**
     * 到列表界面
     * @param m
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "toList" , method = RequestMethod.GET)
    public String toList(M m, ModelMap model , HttpServletRequest request, HttpServletResponse response) {

        this.permissionList.assertHasViewPermission();

        model.put("entity" ,m);

        if (listAlsoSetCommonData) {
            setCommonData(model);
        }
        return viewName("list");
    }


    @RequestMapping(value = "list" , method = RequestMethod.GET)
    @ResponseBody
    public Object list(M m , Searchable searchable, Pages pages , Model model , HttpServletRequest request, HttpServletResponse response) {

            this.permissionList.assertHasViewPermission();


        if(pages.getPageNum() == 0) {
            pages.setPageNum(PaginationContext.getPageNum());
        }

        if(pages.getPageSize() == 0) {
            pages.setPageSize(PaginationContext.getPageSize());
        }


        m.setSearchSql(RepositoryHelper.prepareQL(searchable , SearchCallback.DEFAULT ));

        //todo
        Pages<M> pages1 = null; //baseService.findPageList(m , pages);
        return toList(pages1);

    }


    /**
     * 查看界面
     * @param model
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}/view", method = RequestMethod.GET)
    public String showViewForm(ModelMap model, @PathVariable("id") PK id) {

            this.permissionList.assertHasViewPermission();

        setCommonData(model);
        M m = baseService.selectById(id) ;
        model.addAttribute("m", m);
        return viewName("viewForm");
    }



    @RequestMapping(value = "create", method = RequestMethod.GET)
    public String showCreateForm(M m ,ModelMap model) {

            this.permissionList.assertHasCreatePermission();

        setCommonData(model);

        setInit(m);

        model.addAttribute("m",  m);
        return viewName("editForm");
    }



    @RequestMapping(value = "{id}/update", method = RequestMethod.GET)
    public String showUpdateForm(ModelMap model, @PathVariable("id") PK id) {

            this.permissionList.assertHasUpdatePermission();

        setCommonData(model);
        M m = baseService.selectById(id) ;
        model.addAttribute("m", m);
        return viewName("editForm");
    }






    @RequestMapping(value = "create", method = RequestMethod.POST)
    @ResponseBody
    public Object create( M m, ModelMap model,BindingResult result, RedirectAttributes redirectAttributes) {

            this.permissionList.assertHasCreatePermission();


        if (isExist(m)) {throw DbException.DB_SAVE_SAME;}


        SessionUserVO sessionUserVO = getSessionUser();

        this.setInsertInfo(m, sessionUserVO);
        checkEntityRequired(m);

        boolean success = false;
        try{
            success = baseService.insert(m);
        }catch(Exception e){
            throw DbException.DB_SAVE_SAME;
        }

        if(!success){
            throw DbException.DB_INSERT_RESULT_0;
        }


        return AjaxJson.successAjax;

    }


    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Object update(
            ModelMap model, M m , BindingResult result,
            RedirectAttributes redirectAttributes) {

            this.permissionList.assertHasUpdatePermission();


        if (isExist(m)) {throw DbException.DB_SAVE_SAME;}

        SessionUserVO sessionUserVO = getSessionUser();

        M temp = baseService.selectById(m.getId());
        if(m instanceof BaseBusinessEntity) {
            BaseBusinessEntity bbe = (BaseBusinessEntity)m;
            bbe.setVersionNo(((BaseBusinessEntity)temp).getVersionNo());
        }
        this.setUpdateInfo(m, sessionUserVO);
        checkEntityLegality(m);

        boolean success = false;
        try {
            success = baseService.updateById(m);
        }catch(Exception e){
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
     * @param redirectAttributes
     * @return
     */
    @RequestMapping(value = "{id}/delete", method = RequestMethod.POST)
    @ResponseBody
    public Object delete(         @PathVariable("id") PK id,           RedirectAttributes redirectAttributes) {


            this.permissionList.assertHasDeletePermission();

        M m = baseService.selectById(id);

        boolean success = false;
        try {
            success = baseService.deleteById(m);
        }catch(Exception e){
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
     * @param redirectAttributes
     * @return
     */
    @RequestMapping(value = "batch/delete", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Object deleteInBatch(
            @RequestParam(value = "ids", required = false) PK[] ids,
            RedirectAttributes redirectAttributes) {


            this.permissionList.assertHasDeletePermission();

        if(ids == null || ids.length == 0){
            throw EnumErrorMsg.not_select_todelete.toException();
        }


        List<M> list = baseService.selectBatchIds(Arrays.asList(ids));

        if(list == null && list.isEmpty()){
            throw EnumErrorMsg.no_auth.toException();
        }


        boolean success = false;
        try {
            success = baseService.deletesByIds(list) ;
        }catch(Exception e){
            throw DbException.DB_DELETE_RESULT_0;
        }



        if(!success){
            throw DbException.DB_DELETE_RESULT_0;
        }
        return AjaxJson.successAjax;

    }









    /**
     * 新增或者修改时，检验数据是否唯一(单条件)
     *
     * @param m
     */
    @RequestMapping(value="checkUnique"  ,method = RequestMethod.GET)
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
    @RequestMapping(value = "checkAllUnique"  ,method = RequestMethod.GET)
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
     * 提供自己的 资源ID
     * @return
     */
    public abstract String getResourceIdentity() ;


    /**
     * 设置通用数据
     * 在新增 或编辑界面，  提供下拉数据等
     * @param model
     */
    protected abstract void setCommonData(ModelMap model)  ;

    /**
     * 是否重复
     * @param m
     * @return
     */
    protected abstract boolean isExist(M m) ;




}
