package com.zz.bms.controller.base.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.util.configs.BusinessConfig;
import com.zz.bms.core.Constant;
import com.zz.bms.core.db.entity.*;
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
import com.zz.bms.util.spring.ReflectionUtil;
import com.zz.bms.util.spring.SpringUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @author Administrator
 */
public abstract class BaseBussinessController extends BaseController {




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
            List<Field>  fields = ReflectionUtil.getBusinessFields(be.getClass() , EntityAttrPageAnnotation.class);
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




        List<Field> list = ReflectionUtil.getBusinessFields(entity.getClass(),EntityAttrPageAnnotation.class);

        if(list != null && !list.isEmpty()){

                for (Field field : list) {
                    EntityAttrDBAnnotation dbAnnotation = field.getAnnotation(EntityAttrDBAnnotation.class);
                    EntityAttrPageAnnotation pageAnnotation = field.getAnnotation(EntityAttrPageAnnotation.class);
                    EntityAttrDictAnnotation dictAnnotation = field.getAnnotation(EntityAttrDictAnnotation.class);
                    EntityAttrFkAnnotation fkAnnotation = field.getAnnotation(EntityAttrFkAnnotation.class);

                    String name = SpringUtil.getMessage(entity.getClass().getName() + "." + field.getName());

                    Object val = ReflectionUtil.getField(field, entity);
                    boolean isEmpty = StringUtil.isEmpty(val);

                    //检查必填
                    if(checkRequired) {
                        if (isEmpty && annotaionEntityManager.isRequired(dbAnnotation, fkAnnotation, dictAnnotation, pageAnnotation)) {
                            String msg = SpringUtil.getMessage(EnumErrorMsg.check_data_required.getI18n(), name);
                            throw new BizException(EnumErrorMsg.check_data_required.getCode(), msg);
                        }
                    }

                    if(checkLength) {
                        //检查长度
                        int maxLength = annotaionEntityManager.maxLength(dbAnnotation, fkAnnotation, dictAnnotation, pageAnnotation);

                        if (!isEmpty && maxLength > 0) {

                            String msg = SpringUtil.getMessage(EnumErrorMsg.check_data_too.getI18n(), name);

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
                                    if (str.indexOf("\\.") <= maxLength - annotaionEntityManager.decimalsLength(dbAnnotation, fkAnnotation)) {
                                        msg = SpringUtil.getMessage(EnumErrorMsg.check_decimal_too.getI18n(), name);
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
                                    String msg = SpringUtil.getMessage(EnumErrorMsg.check_data_format.getI18n(), name);
                                    throw new BizException(EnumErrorMsg.check_data_format.getCode(), msg);
                                }
                            }
                        }
                    }

                }

        }

    }





}
