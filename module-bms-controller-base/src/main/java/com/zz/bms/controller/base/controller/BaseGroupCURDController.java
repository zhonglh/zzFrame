package com.zz.bms.controller.base.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zz.bms.core.Constant;
import com.zz.bms.core.db.entity.BaseBusinessEntity;
import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.enums.EnumSymbol;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.core.exceptions.DbException;
import com.zz.bms.core.ui.Pages;
import com.zz.bms.core.ui.TreeModel;
import com.zz.bms.core.vo.AjaxJson;
import com.zz.bms.enums.EnumTreeState;
import com.zz.bms.util.base.data.StringFormatKit;
import com.zz.bms.util.base.java.ReflectionSuper;
import com.zz.bms.util.configs.AppConfig;
import com.zz.bms.util.configs.annotaions.EntityAnnotation;
import com.zz.bms.util.configs.annotaions.GroupFieldAnnotation;
import com.zz.bms.util.web.PaginationContext;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.Assert;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * 基于多表组合的业务(主表+附表+子表等)
 * @author zhonglh
 */
public abstract class   BaseGroupCURDController<
        RwModel extends BaseEntity<PK>,
        QueryModel extends RwModel,
        PK extends Serializable,
        RwQuery extends Query,
        OnlyQuery extends RwQuery
        >
        extends BaseBusinessController<RwModel,QueryModel,PK,RwQuery,OnlyQuery>
        implements ICURDController<RwModel , QueryModel , PK>
{



    protected BaseGroupCURDController() {
        super();
        setViewPrefix(defaultViewPrefix());
        setResourceIdentity(this.getViewPrefix().replaceAll("/","\\."));
    }






    /**
     * 到列表界面
     * @param m
     * @param modelMap
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/toList" , method = RequestMethod.GET )
    public String toList(QueryModel m, ModelMap modelMap , HttpServletRequest request, HttpServletResponse response) {

        try {
            this.assertHasViewPermission();

            modelMap.put("entity", m);

            if (listAlsoSetCommonData) {
                setCommonData(m, modelMap);
            }


            processQueryString(modelMap, request);

            processPath(modelMap);

            String pageName = this.getListPageName();
            if (StringUtils.isEmpty(pageName)) {
                pageName = defaultListPageName;
            }
            return viewName(pageName);
        }catch (BizException e){
            logger.error(e.getMessage(),e);
            throw  e;
        }catch (RuntimeException e){
            logger.error(e.getMessage(),e);
            throw  e;
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            throw  new RuntimeException(e);
        }
    }


    @RequestMapping(value = "/list" , method={ RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public Object list(QueryModel m , OnlyQuery query, Pages<QueryModel> pages , Model modelMap , HttpServletRequest request, HttpServletResponse response) {

        try {
            this.assertHasViewPermission();


            if (pages.getPageNum() == 0) {
                pages.setPageNum(PaginationContext.getPageNum());
            }

            if (pages.getPageSize() == 0) {
                pages.setPageSize(PaginationContext.getPageSize());
            }

            processPages(pages, request);

            Page<QueryModel> page = new Page<QueryModel>(pages.getPageNum(), pages.getPageSize());


            ILoginUserEntity<PK> sessionUserVO = getSessionUser();

            processOnlyQuery(query, m, sessionUserVO);

            Wrapper wrapper = buildQueryWrapper(query, m);

            page = (Page<QueryModel>) baseQueryService.page(page, wrapper);

            processResult(page.getRecords());

            return toList(page);
        }catch (BizException e){
            logger.error(e.getMessage(),e);
            throw  e;
        }catch (RuntimeException e){
            logger.error(e.getMessage(),e);
            throw  e;
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            throw  new RuntimeException(e);
        }

    }





    @RequestMapping(value = "/toTree" , method={ RequestMethod.POST, RequestMethod.GET})
    public String toTree(QueryModel m,  ModelMap modelMap , HttpServletRequest request, HttpServletResponse response) {

        try {
            this.assertHasViewPermission();

            modelMap.put("entity", m);

            if (listAlsoSetCommonData) {
                setCommonData(m, modelMap);
            }


            processQueryString(modelMap, request);

            processPath(modelMap);

            String pageName = this.getTreePageName();
            if (StringUtils.isEmpty(pageName)) {
                pageName = defaultTreePageName;
            }
            return viewName(pageName);
        }catch (BizException e){
            logger.error(e.getMessage(),e);
            throw  e;
        }catch (RuntimeException e){
            logger.error(e.getMessage(),e);
            throw  e;
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            throw  new RuntimeException(e);
        }

    }

    @RequestMapping(value = "/tree" , method={ RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public Object tree(QueryModel m , OnlyQuery query, Pages<QueryModel> pages , Model modelMap , HttpServletRequest request, HttpServletResponse response) {

        try {
            this.assertHasViewPermission();

            PK id = m.getId();
            ReflectionSuper.setFieldValue(query, "id", null);

            pages.setPageNum(1);
            pages.setPageSize(Integer.MAX_VALUE);

            processPages(pages, request);

            Page<QueryModel> page = new Page<QueryModel>(pages.getPageNum(), pages.getPageSize());


            ILoginUserEntity<PK> sessionUserVO = getSessionUser();

            processOnlyQuery(query, m, sessionUserVO);


            QueryWrapper<QueryModel> wrapper = (QueryWrapper<QueryModel>) buildQueryWrapper(query, m);
            EntityAnnotation ea = m.getClass().getSuperclass().getAnnotation(EntityAnnotation.class);
            if (ea == null || StringUtils.isEmpty(ea.parentColumnName())) {
                throw EnumErrorMsg.code_error.toException();
            }


            if (id == null) {
                //增加查询条件，用括号包住
                wrapper.nested((qw) -> {
                    qw.eq(ea.parentColumnName(), "");
                    qw.or();
                    qw.isNull(ea.parentColumnName());
                    return qw;
                });

            } else {
                wrapper.eq(ea.parentColumnName(), id);
            }


            page = (Page<QueryModel>) baseQueryService.page(page, wrapper);

            processResult(page.getRecords());


            List footer = buildFooter(page);

            List<QueryModel> list = page.getRecords();

            if (list != null && !list.isEmpty()) {
                for (QueryModel temp : list) {
                    QueryWrapper<QueryModel> queryWrapper = new QueryWrapper<QueryModel>();
                    queryWrapper.eq(ea.parentColumnName(), temp.getId());
                    int count = this.baseQueryService.count(queryWrapper);
                    if (count == 0) {
                        temp.setState(EnumTreeState.OPEN.getTheValue());
                    }
                }
            }

            return list;
        }catch (BizException e){
            logger.error(e.getMessage(),e);
            throw  e;
        }catch (RuntimeException e){
            logger.error(e.getMessage(),e);
            throw  e;
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            throw  new RuntimeException(e);
        }

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
    protected List buildFooter(Page<QueryModel> page){
        return null;
    }



    /**
     * 查看界面
     * @param modelMap
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}/view", method = RequestMethod.GET)
    public String showViewForm(ModelMap modelMap, @PathVariable("id") PK id, HttpServletRequest request, HttpServletResponse response) {

        try {


            if(id == null || EntityUtil.isEmpty(id) ){
                throw EnumErrorMsg.code_error.toException();
            }

            this.assertHasViewPermission();


            QueryWrapper<QueryModel> wrapper = new QueryWrapper<QueryModel>();
            wrapper.eq("id", id);
            QueryModel m = baseQueryService.getOne(wrapper);
            if (m == null) {
                throw EnumErrorMsg.no_auth.toException();
            }
            processQueryString(modelMap, request);
            setCommonData(m, modelMap);
            customInfoByViewForm(m, modelMap);
            modelMap.addAttribute("m", m);
            modelMap.addAttribute("entity", m);


            processPath(modelMap);
            String pageName = this.getViewPageName();
            if (StringUtils.isEmpty(pageName)) {
                pageName = defaultViewPageName;
            }
            return viewName(pageName);
        }catch (BizException e){
            logger.error(e.getMessage(),e);
            throw  e;
        }catch (RuntimeException e){
            logger.error(e.getMessage(),e);
            throw  e;
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            throw  new RuntimeException(e);
        }
    }


    /**
     * 显示创建页面
     * @param m
     * @param modelMap
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String showCreateForm(RwModel m ,ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {

        try {
            this.assertHasCreatePermission();
            processQueryString(modelMap, request);
            setCommonData(m, modelMap);

            setInit(m);
            customInit(m, modelMap);
            this.baseRwService.processResult(m);
            customInfoByCreateForm(m, modelMap);

            modelMap.addAttribute("m", m);
            modelMap.addAttribute("entity", m);

            processPath(modelMap);
            String pageName = this.getAddPageName();
            if(StringUtils.isEmpty(pageName)){
                pageName = defaultAddPageName;
            }
            return viewName(pageName);

        }catch(RuntimeException re){
            logger.error(re.getMessage() ,re);
            throw re;
        }catch(Exception e){
            logger.error(e.getMessage() ,e);
            throw new RuntimeException(e);
        }

    }


    /**
     * 显示更新页面
     * @param modelMap
     * @param id
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/{id}/update", method = RequestMethod.GET)
    public String showUpdateForm(ModelMap modelMap, @PathVariable("id") PK id, HttpServletRequest request, HttpServletResponse response) {


        try {


            if(id == null || EntityUtil.isEmpty(id) ){
                throw EnumErrorMsg.code_error.toException();
            }

            //检查功能权限
            this.assertHasViewPermission();


            QueryWrapper<RwModel> wrapper = new QueryWrapper<>();
            wrapper.eq("id" , id);
            RwModel m = baseRwService.getOne(wrapper);
            if(m == null){
                throw EnumErrorMsg.no_auth.toException();
            }
            processQueryString(modelMap,request);
            setCommonData(m,modelMap);
            customInfoByUpdateForm(m , modelMap);
            modelMap.addAttribute("m", m);
            modelMap.addAttribute("entity", m);


            processPath(modelMap);
            String pageName = this.getEditPageName();
            if(StringUtils.isEmpty(pageName)){
                pageName = defaultEditPageName;
            }
            return viewName(pageName);

        }catch(RuntimeException re){
            logger.error(re.getMessage() ,re);
            throw re;
        }catch(Exception e){
            logger.error(e.getMessage() ,e);
            throw new RuntimeException(e);
        }
    }



    /**
     * 显示更新或者新增页面
     * @param modelMap
     * @param m
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/addOrUpdate", method = RequestMethod.GET)
    public String showAddOrUpdateForm(ModelMap modelMap,RwModel m, RwQuery q, HttpServletRequest request, HttpServletResponse response) {

        try {
            this.assertHasAddorViewPermission();


            QueryWrapper<RwModel> wrapper = q.buildWrapper();
            this.buildRwWrapper(q, m);
            List<RwModel> list = baseRwService.list(wrapper);
            if (list != null && list.size() > 1) {
                throw EnumErrorMsg.code_error.toException();
            }

            boolean isInsert = true;
            RwModel entity = m;
            if (list != null && list.size() == 1) {
                entity = list.get(0);
                isInsert = false;
            }
            processQueryString(modelMap, request);
            setCommonData(entity, modelMap);

            if (isInsert) {
                entity = this.baseRwService.processResult(entity);
                setInit(m);
                customInfoByCreateForm(entity, modelMap);
            } else {
                customInfoByUpdateForm(entity, modelMap);
            }


            modelMap.addAttribute("m", entity);
            modelMap.addAttribute("entity", entity);


            processPath(modelMap);
            String pageName = null;
            if (isInsert) {
                pageName = this.getAddPageName();
                if (StringUtils.isEmpty(pageName)) {
                    pageName = defaultAddPageName;
                }
            } else {
                pageName = this.getEditPageName();
                if (StringUtils.isEmpty(pageName)) {
                    pageName = defaultEditPageName;
                }
            }
            return viewName(pageName);
        }catch (BizException e){
            logger.error(e.getMessage(),e);
            throw  e;
        }catch (RuntimeException e){
            logger.error(e.getMessage(),e);
            throw  e;
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            throw  new RuntimeException(e);
        }
    }



    @RequestMapping(value = "/{id}/all", method = RequestMethod.GET)
    public String showAllPage(ModelMap modelMap, @PathVariable("id") PK id, RwQuery rwQuery ,HttpServletRequest request, HttpServletResponse response) {

        try {
            RwModel m = null;

            try {
                if (id == null || EntityUtil.isEmpty(id)) {
                    m = getModelByQuery(rwQuery);
                } else {
                    m = baseRwService.getById(id, false);
                }
            }catch (Exception e){

            }

            if(m == null){
                m = getModelByQuery(rwQuery) ;
            }


            if(m == null){
                throw EnumErrorMsg.code_error.toException();
            }



            customInfoByAllPage(m, modelMap);
            processQueryString(modelMap, request);
            modelMap.addAttribute("m", m);
            modelMap.addAttribute("entity", m);

            processPath(modelMap);
            String pageName = this.getAllPageName();
            if (StringUtils.isEmpty(pageName)) {
                pageName = defaultAllPageName;
            }
            return viewName(pageName);
        }catch (BizException e){
            logger.error(e.getMessage(),e);
            throw  e;
        }catch (RuntimeException e){
            logger.error(e.getMessage(),e);
            throw  e;
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            throw  new RuntimeException(e);
        }
    }



    /**
     * 新增操作
     * @param m
     * @param modelMap
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public Object create( RwModel m, ModelMap modelMap , HttpServletRequest request, HttpServletResponse response) {

        try{

            this.assertHasCreatePermission();

            ILoginUserEntity<PK> sessionUserVO = getSessionUser();

            this.gatherCreateInformation( m,  modelMap , sessionUserVO, request,  response);

            //插入信息
            insertInfo(m, sessionUserVO);

            AjaxJson result =  AjaxJson.ok();
            result.setId(m.getId());
            return result;

        }catch(RuntimeException re){
            logger.error(re.getMessage() ,re);
            throw re;
        }catch(Exception e){
            logger.error(e.getMessage() ,e);
            throw new RuntimeException(e);
        }
    }



    @Override
    protected void insertInfo(RwModel m, ILoginUserEntity<PK> sessionUserVO) {
        insertInfo(m , sessionUserVO , true, true);
    }

    @Override
    public void insertInfo(RwModel m, ILoginUserEntity<PK> sessionUserVO , boolean saveFlag , boolean processBOFlag) {
        //设置创建附加信息，如创建时间， 创建人
        this.setInsertInfo(m, sessionUserVO);

        //初始化默认值
        setInit(m);

        setChildFkInfo(m);

        //创建时定制的数据，如状态 等
        this.setCustomInfoByInsert(m,sessionUserVO);

        //处理创建的数据， 如反填状态名称，外键信息等
        if(processBOFlag) {
            this.processBO(m);
        }



        boolean success = false;
        try{
            //检查新增附加信息
            checkInsertInfo(m);
            //检查字段的合法性
            checkEntityLegality(m , true , true , true);

            //检查业务上是否允许增加
            this.checkCanInsert(m,sessionUserVO);

            //检查重复数据
            this.baseRwService.isExist(m);

            if(saveFlag) {
                success = baseRwService.save(m);
            }else {
                success = true;
            }

        }catch(RuntimeException e){
            logger.error(e.getMessage() , e);
            recoveryResources(m,sessionUserVO);
            throw e;
        }catch(Exception e){
            logger.error(e.getMessage() , e);
            recoveryResources(m,sessionUserVO);
            throw DbException.DB_SAVE_SAME;
        }

        if(!success){
            throw DbException.DB_INSERT_RESULT_0;
        }
    }



    @RequestMapping(value = "/{id}/update", method = {RequestMethod.POST , RequestMethod.PUT})
    @ResponseBody
    public Object update(@PathVariable("id") PK id, ModelMap modelMap, RwModel m , HttpServletRequest request, HttpServletResponse response) {


        this.assertHasUpdatePermission();


        ILoginUserEntity<PK> sessionUserVO = getSessionUser();

        this.gatherUpdateInformation( m,  modelMap , sessionUserVO, request,  response);

        QueryWrapper<RwModel> wrapper = new QueryWrapper<RwModel>();
        wrapper.eq("id" , id);
        RwModel temp = baseRwService.getOne(wrapper);
        if(temp == null){
            throw EnumErrorMsg.no_auth.toException();
        }

        if(m instanceof BaseBusinessEntity) {
            BaseBusinessEntity bbe = (BaseBusinessEntity)m;
            bbe.setVersionNo(((BaseBusinessEntity)temp).getVersionNo());
        }

        //设置一些旧的值 ,或者比对新值和旧值是否有逻辑问题
        m = setOldValue(m , temp);

        //处理更新附加信息，如更新时间  更新人等
        this.setUpdateInfo(m, sessionUserVO);

        //设置更新时的一些属性信息
        setCustomInfoByUpdate(m , sessionUserVO);


        setChildFkInfo(m);


        //处理创建的数据， 如反填状态名称，外键信息等
        this.processBO(m);




        boolean success = false;
        try {

            //检查数据合法性
            checkEntityLegality(m , false , true , true);
            Assert.notNull(m.getId(),"出现内部错误");

            this.checkCanUpdate(m , sessionUserVO);

            //检查重复数据
            this.baseRwService.isExist(m);


            success = baseRwService.updateById(m);

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
     * 显示更新或者新增页面
     * @param modelMap
     * @param m
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/addOrUpdate", method = {RequestMethod.POST , RequestMethod.PUT})
    @ResponseBody
    public Object addOrUpdate(ModelMap modelMap,RwModel m, RwQuery q, HttpServletRequest request, HttpServletResponse response) {



        if (EntityUtil.isEmpty(m.getId())) {
            try{

                this.assertHasCreatePermission();

                ILoginUserEntity<PK> sessionUserVO = getSessionUser();

                this.gatherCreateInformation( m,  modelMap , sessionUserVO, request,  response);

                //插入信息
                insertInfo(m, sessionUserVO);

                AjaxJson result =  AjaxJson.ok();
                result.setId(m.getId());
                return result;

            }catch(RuntimeException re){
                logger.error(re.getMessage() ,re);
                throw re;
            }catch(Exception e){
                logger.error(e.getMessage() ,e);
                throw new RuntimeException(e);
            }
        }else{

            //检查功能权限
            this.assertHasUpdatePermission();

            ILoginUserEntity<PK> sessionUserVO = getSessionUser();

            this.gatherUpdateInformation( m,  modelMap , sessionUserVO, request,  response);

            QueryWrapper<RwModel> wrapper = new QueryWrapper<RwModel>();
            wrapper.eq("id" , m.getId());
            RwModel temp = baseRwService.getOne(wrapper);
            if(temp == null){
                throw EnumErrorMsg.no_auth.toException();
            }

            if(m instanceof BaseBusinessEntity) {
                BaseBusinessEntity bbe = (BaseBusinessEntity)m;
                bbe.setVersionNo(((BaseBusinessEntity)temp).getVersionNo());
            }

            //设置一些旧的值 ,或者比对新值和旧值是否有逻辑问题
            m = setOldValue(m , temp);

            //处理更新附加信息，如更新时间  更新人等
            this.setUpdateInfo(m, sessionUserVO);

            //设置更新时的一些属性信息
            setCustomInfoByUpdate(m , sessionUserVO);


            setChildFkInfo(m);


            //处理创建的数据， 如反填状态名称，外键信息等
            this.processBO(m);




            boolean success = false;
            try {

                //检查数据合法性
                checkEntityLegality(m , false , true , true);
                Assert.notNull(m.getId(),"出现内部错误");

                this.checkCanUpdate(m , sessionUserVO);

                //检查重复数据
                this.baseRwService.isExist(m);


                success = baseRwService.updateById(m);

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

        try {
            this.assertHasDeletePermission();


            ILoginUserEntity<PK> sessionUserVO = getSessionUser();

            QueryWrapper<RwModel> wrapper = new QueryWrapper<RwModel>();
            wrapper.eq("id", id);
            setCustomInfoByDelete(wrapper, sessionUserVO);
            RwModel m = baseRwService.getOne(wrapper);
            if (m == null) {
                throw EnumErrorMsg.no_auth.toException();
            }

            baseRwService.specialHandler(m);

            boolean success = false;
            try {
                checkCanDelete(m, sessionUserVO);
                success = baseRwService.deleteById(m);
            } catch (RuntimeException e) {
                logger.error(e.getMessage(), e);
                throw e;
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
                throw DbException.DB_DELETE_RESULT_0;
            }

            if (!success) {
                throw EnumErrorMsg.no_auth.toException();
            }
            return AjaxJson.successAjax;
        }catch (BizException e){
            logger.error(e.getMessage(),e);
            throw  e;
        }catch (RuntimeException e){
            logger.error(e.getMessage(),e);
            throw  e;
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            throw  new RuntimeException(e);
        }
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

        try {
            this.assertHasDeletePermission();

            if (ids == null || ids.isEmpty()) {
                throw EnumErrorMsg.not_select_todelete.toException();
            }

            ILoginUserEntity<PK> sessionUserVO = getSessionUser();


            QueryWrapper<RwModel> wrapper = new QueryWrapper<>();
            String idList[] = ids.split(EnumSymbol.COMMA.getCode());
            wrapper.nested((qw) -> {
                int index = 0;
                for (String id : idList) {
                    if (index > 0) {
                        qw.or();
                    }
                    qw.eq("id", id);
                    index++;
                }
                return qw;
            });
            setCustomInfoByDelete(wrapper, sessionUserVO);

            List<RwModel> list = baseRwService.list(wrapper);

            if (list == null && list.isEmpty()) {
                throw EnumErrorMsg.no_auth.toException();
            }

            List<RwModel> deleteList = new ArrayList<RwModel>();

            for (RwModel m : list) {
                try {
                    this.checkCanDelete(m, sessionUserVO);
                    deleteList.add(m);
                } catch (Exception e) {

                }
            }

            for (RwModel m : deleteList) {
                baseRwService.specialHandler(m);
            }


            boolean success = false;
            try {
                if (deleteList != null && !deleteList.isEmpty()) {
                    success = baseRwService.deletesByIds(list);
                }
            } catch (RuntimeException e) {
                logger.error(e.getMessage(), e);
                throw e;
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
                throw DbException.DB_DELETE_RESULT_0;
            }


            if (!success) {
                throw DbException.DB_DELETE_RESULT_0;
            }
            return AjaxJson.successAjax;
        }catch (BizException e){
            logger.error(e.getMessage(),e);
            throw  e;
        }catch (RuntimeException e){
            logger.error(e.getMessage(),e);
            throw  e;
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            throw  new RuntimeException(e);
        }

    }


    /**
     * 设置组内对象的外键信息
     * @param be
     */
    protected void setChildFkInfo(BaseEntity be){
        if(be == null){
            return ;
        }

        Field[] fs = ReflectionSuper.getFields(be);
        for (Field f : fs) {
            f.setAccessible(true);
            Object val = ReflectionUtils.getField(f, be);
            if (val != null) {

                GroupFieldAnnotation gf = f.getAnnotation(GroupFieldAnnotation.class);
                if(gf == null || gf.childTableColumnName() == null || StringUtils.isEmpty(gf.childTableColumnName())){
                    throw EnumErrorMsg.code_error.toException();
                }


                if (val instanceof Collection || val.getClass().isArray()) {

                    Collection cs = null;
                    if (val.getClass().isArray()) {
                        cs = Arrays.asList(val);
                    } else {
                        cs = (Collection) val;
                    }

                    Field clsField = null;
                    for (Object obj : cs) {
                        if(obj == null){
                            continue;
                        }
                        if(clsField == null) {
                            clsField = getTheField(gf.childTableColumnName(), obj.getClass());
                        }
                        try {
                            clsField.set(obj , be.getId());
                        } catch (IllegalAccessException e) {
                            throw EnumErrorMsg.code_error.toException();
                        }

                    }

                } else {
                    Field clsField = getTheField(gf.childTableColumnName(), val.getClass());
                    try {
                        clsField.set(val , be.getId());
                    } catch (IllegalAccessException e) {
                        throw EnumErrorMsg.code_error.toException();
                    }
                }
            }
        }
    }

    private Field getTheField(String childTableColumnName, Class clz ) {

        try {
            String fieldName = StringFormatKit.toCamelCase(childTableColumnName);
            Field[] fs = ReflectionSuper.getAllField(clz);

            for(Field f : fs){
                if(f.getName().equalsIgnoreCase(fieldName)){
                    f.setAccessible(true);
                    return f;
                }
            }

        } catch (Exception e) {

        }

        throw EnumErrorMsg.code_error.toException();

    }


    /**
     * 插入对象加上插入信息 , 包括组内其他信息
     * @param be
     * @param sessionUserVO
     */
    @Override
    public void setInsertInfo(BaseEntity be , ILoginUserEntity sessionUserVO){
        if(be == null){
            return ;
        }
        EntityUtil.autoSetInsertEntity(be, sessionUserVO);

        Field[] fs = ReflectionSuper.getFields(be);
        for (Field f : fs) {
            f.setAccessible(true);
            Object val = ReflectionUtils.getField(f, be);
            if (val != null) {
                if (val instanceof Collection || val.getClass().isArray()) {

                    Collection cs = null;
                    if (val.getClass().isArray()) {
                        cs = Arrays.asList(val);
                    } else {
                        cs = (Collection) val;
                    }
                    for (Object obj : cs) {
                        if (obj instanceof BaseEntity) {
                            EntityUtil.autoSetInsertEntity((BaseEntity) obj, sessionUserVO);
                        }
                    }

                } else {
                    EntityUtil.autoSetInsertEntity((BaseEntity) val, sessionUserVO);
                }
            }
        }
    }




    /**
     * 设置初始值 ,  一般用于新增界面
     * @param be
     */
    @Override
    public void setInit(BaseEntity be) {
        if (be == null) {
            return;
        }
        super.setInit(be);


        Field[] fs = ReflectionSuper.getFields(be);
        for (Field f : fs) {
            f.setAccessible(true);
            Object val = ReflectionUtils.getField(f, be);
            if (val != null) {
                if (val instanceof Collection || val.getClass().isArray()) {

                    Collection cs = null;
                    if (val.getClass().isArray()) {
                        cs = Arrays.asList(val);
                    } else {
                        cs = (Collection) val;
                    }
                    for (Object obj : cs) {
                        if (obj instanceof BaseEntity) {
                            super.setInit((BaseEntity) obj);
                        }
                    }

                } else {
                    super.setInit((BaseEntity) val);
                }
            }
        }

    }




    /**
     * 修改对象 将 加上修改信息
     * 对应新增加的子表， 或者附表信息， 加上新增时的一些信息， 并且ID不能赋值 ， ID会在其它的地方赋值
     * @param be
     * @param sessionUserVO
     */
    @Override
    public void setUpdateInfo(BaseEntity be , ILoginUserEntity sessionUserVO){
        EntityUtil.autoSetUpdateEntity(be, sessionUserVO);


        Field[] fs = ReflectionSuper.getFields(be);
        for (Field f : fs) {
            f.setAccessible(true);
            Object val = ReflectionUtils.getField(f, be);
            if (val != null) {
                if (val instanceof Collection || val.getClass().isArray()) {
                    Collection cs = null;
                    if (val.getClass().isArray()) {
                        cs = Arrays.asList(val);
                    } else {
                        cs = (Collection) val;
                    }
                    for (Object obj : cs) {
                        if (obj instanceof BaseEntity) {
                            BaseEntity childBe = (BaseEntity) obj;
                            if(  EntityUtil.isEmpty( childBe.getId() )  ){
                                EntityUtil.autoSetInsertEntity( childBe, sessionUserVO);
                                childBe.setId(null);
                            }else{
                                EntityUtil.autoSetUpdateEntity( childBe, sessionUserVO);
                            }
                        }
                    }

                } else {
                    BaseEntity childBe = (BaseEntity) val;
                    if(  EntityUtil.isEmpty( childBe.getId() )  ) {
                        EntityUtil.autoSetInsertEntity( childBe , sessionUserVO);
                        childBe.setId(null);
                    }else {
                        EntityUtil.autoSetUpdateEntity( childBe , sessionUserVO);
                    }
                }
            }
        }
    }





    /**
     * 检查实体数据的合法性
     * @param entity            需要检查的实体
     * @param checkRequired     是否检查必填
     * @param checkLength       是否检查长度
     * @param checkRule         是否检查规则
     */
    @Override
    public void checkEntityLegality(BaseEntity entity , boolean checkRequired , boolean checkLength , boolean checkRule) {

        if(entity == null){
            return ;
        }

        super.checkEntityLegality(entity , checkRequired , checkLength , checkRule);


        Field[] fs = ReflectionSuper.getFields(entity);
        for (Field f : fs) {
            f.setAccessible(true);
            Object val = ReflectionUtils.getField(f, entity);
            if (val != null) {
                if (val instanceof Collection || val.getClass().isArray()) {

                    Collection cs = null;
                    if (val.getClass().isArray()) {
                        cs = Arrays.asList(val);
                    } else {
                        cs = (Collection) val;
                    }
                    for (Object obj : cs) {
                        if (obj instanceof BaseEntity) {
                            super.checkEntityLegality((BaseEntity) obj, checkRequired , checkLength , checkRule);
                        }
                    }

                } else {
                    super.checkEntityLegality((BaseEntity) val, checkRequired , checkLength , checkRule);
                }
            }
        }

    }





}
