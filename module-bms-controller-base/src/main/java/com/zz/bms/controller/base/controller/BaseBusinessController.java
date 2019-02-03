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

public abstract class BaseBusinessController<M extends BaseEntity<PK>, PK extends Serializable, Q extends Query> extends BaseController<M,PK> {


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
    private String resourceIdentity = null;


    /**
     * 实体类型
     */
    protected final Class<M> entityClass;


    public BaseBusinessController(){
        this.entityClass = GenericsHelper.getSuperClassGenricType(getClass(), 0);
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
    protected void setResourceIdentity(String resourceIdentity) {
        if (!org.springframework.util.StringUtils.isEmpty(resourceIdentity)) {
            this.resourceIdentity = resourceIdentity ;
            permissionList = PermissionList.newPermissionList(resourceIdentity);
        }
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
     * 是否重复
     * @param m
     * @return
     */
    protected void isExist(M m) {
        throw new RuntimeException("Please overload this method first");
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









    /**
     * 检查银行卡是否正确
     * @param bankNo
     * @return
     */
    public AjaxJson checkBankNo(String bankNo){
        String result = BankNoValidateUtils.luhmCheck(bankNo);
        if(result.equals("true")){
            return AjaxJson.successAjax;
        }else {
            return  new AjaxJson(false,result);
        }
    }


    /**
     * 设置初始值 ,  一般用于新增界面
     * @param be
     */
    public void setInit(BaseEntity be){

        try {
            List<Field> fields = ReflectionUtil.getBusinessFields(be.getClass() , EntityAttrPageAnnotation.class);
            for(Field field : fields){
                EntityAttrPageAnnotation pageAnnotation = field.getAnnotation(EntityAttrPageAnnotation.class);
                if(StringUtils.isNotEmpty(pageAnnotation.defaultType())){
                    EnumDefaultType defaultType = EnumDefaultType.getEnumByValue(pageAnnotation.defaultType());
                    if(defaultType != null && defaultType != EnumDefaultType.CUSTOM) {
                        Object obj = BaseUtil.getDefaultValue(defaultType , this.getSessionUser());
                        field.setAccessible(true);
                        field.set(be, obj);
                    }
                }
            }

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }


    /**
     * 插入对象加上插入信息
     * @param be
     * @param sessionUserVO
     */
    public void setInsertInfo(BaseEntity be , ILoginUserEntity sessionUserVO){
        EntityUtil.autoSetInsertEntity(be, sessionUserVO);
    }


    /**
     * 修改对象 将 加上修改信息
     * @param be
     * @param sessionUserVO
     */
    public void setUpdateInfo(BaseEntity be , ILoginUserEntity sessionUserVO){
        EntityUtil.autoSetUpdateEntity(be, sessionUserVO);
    }


    /**
     * 将列表数据组织为子属性中
     * @param list
     * @param treeModel
     * @return
     */
    public List toTree(List list , TreeModel treeModel){
        if(list == null) {
            return new ArrayList();
        }
        return EasyUiUtil.toTree(list , treeModel);
    }



    /**
     * 将列表数据组织为子属性中
     * @param list
     * @param treeModel
     * @return
     */
    public List toTreeList(List list , TreeModel treeModel){
        if(list == null) {
            return new ArrayList();
        }
        return EasyUiUtil.toTreeList(list , treeModel);
    }

    /**
     * 将公共的列表信息转换为UI中需要的格式
     * @param pages
     * @return
     */
    public EasyUiDataGrid toList(Pages pages ){
        return EasyUiUtil.toDataGrid(pages);
    }

    public EasyUiDataGrid toList(Page page ){
        return EasyUiUtil.toDataGrid(page);
    }








    public void checkInsertInfo(BaseEntity entity){
        if(entity == null || SerializableUtil.isEmpty(entity.getId())){
            throw EnumErrorMsg.code_error.toException();
        }
        if(BusinessConfig.USE_TENANT && SerializableUtil.isEmpty(entity.getTenantId())){
            throw EnumErrorMsg.code_error.toException();
        }

        if(entity instanceof BaseBusinessEntity){
            BaseBusinessEntity businessEntity = (BaseBusinessEntity)entity;
            if(SerializableUtil.isEmpty(businessEntity.getCreateUserId())){
                throw EnumErrorMsg.code_error.toException();
            }
            if(businessEntity.getCreateTime() == null){
                throw EnumErrorMsg.code_error.toException();
            }
            if(businessEntity.getVersionNo() == null){
                businessEntity.setVersionNo(Constant.INIT_VERSION);
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
    public void checkEntityLegality(BaseEntity entity , boolean checkRequired , boolean checkLength , boolean checkRule){




        List<Field> list = ReflectionUtil.getBusinessFields(entity.getClass(),BaseEntity.class);

        if(list != null && !list.isEmpty()){

            for (Field field : list) {

                //不存在的列(扩展列)不校验
                TableField tableField = field.getAnnotation(TableField.class);
                if(tableField != null && !tableField.exist()){
                    continue;
                }

                EntityAttrDBAnnotation dbAnnotation = field.getAnnotation(EntityAttrDBAnnotation.class);
                EntityAttrPageAnnotation pageAnnotation = field.getAnnotation(EntityAttrPageAnnotation.class);
                EntityAttrDictAnnotation dictAnnotation = field.getAnnotation(EntityAttrDictAnnotation.class);
                EntityAttrFkAnnotation fkAnnotation = field.getAnnotation(EntityAttrFkAnnotation.class);

                String name = this.getMessage(entity.getClass().getName() + "." + field.getName() , pageAnnotation.title());

                ReflectionUtil.makeAccessible(field);
                Object val = ReflectionUtil.getField(field, entity);
                boolean isEmpty = StringUtil.isEmpty(val);

                //检查必填
                if(checkRequired) {
                    if (isEmpty && AnnotaionEntityUtil.isRequired(dbAnnotation, fkAnnotation, dictAnnotation, pageAnnotation)) {
                        String msg = this.getMessage(EnumErrorMsg.check_data_required.getI18n(),name+" 字段为必填项", name);
                        throw new BizException(EnumErrorMsg.check_data_required.getCode(), msg);
                    }
                }

                if(checkLength && !isEmpty) {
                    //检查长度
                    int maxLength = AnnotaionEntityUtil.maxLength(dbAnnotation, fkAnnotation, dictAnnotation, pageAnnotation);

                    if ( maxLength > 0) {

                        String msg = this.getMessage(EnumErrorMsg.check_data_too.getI18n(), name+"字段数据太长", name);

                        if (val instanceof String) {
                            if (((String) val).length() > maxLength) {
                                throw new BizException(EnumErrorMsg.check_data_too.getCode(), msg);
                            }
                        }

                        if (val instanceof Double || val instanceof BigDecimal) {
                            String str = val.toString();
                            if ((str.length() - 1) > maxLength) {
                                throw new BizException(EnumErrorMsg.check_data_too.getCode(), msg);
                            } else {
                                if (str.indexOf("\\.") <= maxLength - AnnotaionEntityUtil.decimalsLength(dbAnnotation, fkAnnotation)) {
                                    msg = this.getMessage(EnumErrorMsg.check_decimal_too.getI18n(),name+"字段小数位太长", name);
                                    throw new BizException(EnumErrorMsg.check_decimal_too.getCode(), msg);
                                }
                            }
                        }
                    }
                }


                if(checkRule) {
                    //检查规则
                    EntityAttrCheckAnnotation eac = field.getAnnotation(EntityAttrCheckAnnotation.class);

                    if (eac != null && eac.checkRule() != null && eac.checkRule().length > 0 && val != null) {
                        for (String cr : eac.checkRule()) {
                            if (!Pattern.matches(cr, val.toString())) {
                                String msg = this.getMessage(EnumErrorMsg.check_data_format.getI18n(), name+"字段格式错误", name);
                                throw new BizException(EnumErrorMsg.check_data_format.getCode(), msg);
                            }
                        }
                    }
                }

            }

        }

    }

}
