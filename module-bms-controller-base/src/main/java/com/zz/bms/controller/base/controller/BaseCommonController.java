package com.zz.bms.controller.base.controller;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zz.bms.controller.base.PermissionList;
import com.zz.bms.core.Constant;
import com.zz.bms.core.db.entity.BaseBusinessEntity;
import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.core.ui.Pages;
import com.zz.bms.core.ui.TreeModel;
import com.zz.bms.core.ui.easyui.EasyUiDataGrid;
import com.zz.bms.core.ui.easyui.EasyUiTreeGrid;
import com.zz.bms.core.ui.easyui.EasyUiUtil;
import com.zz.bms.enums.EnumDefaultType;
import com.zz.bms.util.BaseUtil;
import com.zz.bms.util.base.BaseValidateUtils;
import com.zz.bms.util.base.data.SerializableUtil;
import com.zz.bms.util.base.data.StringUtil;
import com.zz.bms.util.configs.BusinessConfig;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.util.configs.util.AnnotaionEntityUtil;
import com.zz.bms.util.spring.ReflectionUtil;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * @author Administrator
 */
public class BaseCommonController<PK extends Serializable> extends BaseController<PK>  {


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
     * 获取所有用到的字典信息
     * @param dictTypes
     * @return
     */
    protected Map<String,?> getDictMaps(String ... dictTypes) {
        throw EnumErrorMsg.code_error.toException();
    }
    protected String getDictVal (Object dict) {
        throw EnumErrorMsg.code_error.toException();
    }
    protected String getDictName (Object dict) {
        throw EnumErrorMsg.code_error.toException();
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




    protected BaseEntity<PK> newModel(Class<BaseEntity<PK>> clz) {
        try {
            return clz.newInstance();
        } catch (Exception e) {
            throw new IllegalStateException("can not instantiated model : " + clz, e);
        }
    }



    /**
     * 设置初始值 ,  一般用于新增界面
     * @param be
     */
    public void setInit(BaseEntity be){
        if(be == null){
            return ;
        }

        try {
            List<Field> fields = ReflectionUtil.getBusinessFields(be.getClass() , EntityAttrPageAnnotation.class);
            for(Field field : fields){
                EntityAttrPageAnnotation pageAnnotation = field.getAnnotation(EntityAttrPageAnnotation.class);
                if(StringUtils.isNotEmpty(pageAnnotation.defaultType())){
                    EnumDefaultType defaultType = EnumDefaultType.getEnumByValue(pageAnnotation.defaultType());
                    if (defaultType != null && defaultType != EnumDefaultType.CUSTOM) {
                        field.setAccessible(true);
                        Object fieldVal = ReflectionUtil.getField(field , be);
                        if(!BaseValidateUtils.isEmpty(fieldVal)) {
                            Object obj = BaseUtil.getDefaultValue(defaultType, this.getSessionUser());
                            field.setAccessible(true);
                            field.set(be, obj);
                        }
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
    public EasyUiTreeGrid toTreeList(List list , TreeModel treeModel){
        if(list == null) {
            return new EasyUiTreeGrid();
        }
        return toTreeList(list , treeModel , null);
    }



    /**
     * 将列表数据组织为子属性中
     * @param list
     * @param treeModel
     * @return
     */
    public EasyUiTreeGrid toTreeList(List list , TreeModel treeModel , List footer){
        if(list == null) {
            return new EasyUiTreeGrid();
        }
        return EasyUiUtil.toTreeList(list , treeModel , footer);
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
                        String msg = this.getMessage(EnumErrorMsg.check_data_required.getI18n(),name+" 为必填项", name);
                        throw new BizException(EnumErrorMsg.check_data_required.getCode(), msg);
                    }
                }

                if(checkLength && !isEmpty) {
                    //检查长度
                    int maxLength = AnnotaionEntityUtil.maxLength(dbAnnotation, fkAnnotation, dictAnnotation, pageAnnotation);

                    if ( maxLength > 0) {

                        String msg = this.getMessage(EnumErrorMsg.check_data_too.getI18n(), name+" 数据太长", name);

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
                                    msg = this.getMessage(EnumErrorMsg.check_decimal_too.getI18n(),name+" 小数位太长", name);
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
                                String msg = this.getMessage(EnumErrorMsg.check_data_format.getI18n(), name+" 格式错误", name);
                                throw new BizException(EnumErrorMsg.check_data_format.getCode(), msg);
                            }
                        }
                    }
                }

            }

        }

    }



}
