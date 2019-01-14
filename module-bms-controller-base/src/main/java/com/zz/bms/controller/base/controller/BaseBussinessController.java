package com.zz.bms.controller.base.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zz.bms.annotaions.EntityAttrCheckAnnotation;
import com.zz.bms.annotaions.EntityAttrDBAnnotation;
import com.zz.bms.annotaions.EntityAttrPageAnnotation;
import com.zz.bms.configs.BusinessConfig;
import com.zz.bms.core.Constant;
import com.zz.bms.core.db.entity.*;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.core.ui.Pages;
import com.zz.bms.core.ui.TreeModel;
import com.zz.bms.core.ui.easyui.EasyUiDataGrid;
import com.zz.bms.core.ui.easyui.EasyUiUtil;
import com.zz.bms.core.vo.AjaxJson;
import com.zz.bms.util.base.BankNoValidateUtils;
import com.zz.bms.util.base.data.DateKit;
import com.zz.bms.util.base.data.SerializableUtil;
import com.zz.bms.util.base.data.StringUtil;
import com.zz.bms.util.spring.ReflectionUtil;
import com.zz.bms.util.spring.SpringUtil;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
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



    public void setInit(BaseEntity be){

        //todo  ,设置初始值

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








    /**
     * 检查实体数据的合法性
     * @param entity
     */
    public void checkEntityLegality(BaseEntity entity){

        List<Field> list = ReflectionUtil.getBusinessFields(entity.getClass(),EntityAttrPageAnnotation.class);

        if(list != null && !list.isEmpty()){
                for (Field field : list) {

                    EntityAttrDBAnnotation eaa = field.getAnnotation(EntityAttrDBAnnotation.class);

                    String name = SpringUtil.getMessage(entity.getClass().getName() + "." + field.getName());

                    Object val = ReflectionUtil.getField(field, entity);
                    boolean isEmpty = StringUtil.isEmpty(val);

                    if (isEmpty) {
                        continue;
                    }

                    //检查长度
                    if(eaa.attrLength() >0 && !isEmpty){

                        String msg = SpringUtil.getMessage(EnumErrorMsg.check_data_too.getI18n(), name);

                        if(val instanceof String){
                            if(((String)val).length() > eaa.attrLength() ){
                                throw new BizException(EnumErrorMsg.check_data_too.getCode(), msg);
                            }
                        }

                        if(val instanceof Double || val instanceof BigDecimal){
                            String str = val.toString();
                            if((str.length() - 1 ) > eaa.attrLength()){
                                throw new BizException(EnumErrorMsg.check_data_too.getCode(), msg);
                            }else {
                                if(str.indexOf("\\.")<= str.length() - eaa.attrDecimals()){
                                    msg = SpringUtil.getMessage(EnumErrorMsg.check_decimal_too.getI18n(), name);
                                    throw new BizException(EnumErrorMsg.check_decimal_too.getCode(), msg);
                                }
                            }
                        }
                    }

                    EntityAttrCheckAnnotation eac = field.getAnnotation(EntityAttrCheckAnnotation.class);
                    //检查规则
                    if(eac != null && !eac.checkRule().isEmpty()){
                        if(!Pattern.matches(eac.checkRule() ,val.toString())){
                            String msg = SpringUtil.getMessage(EnumErrorMsg.check_data_format.getI18n(), name);
                            throw new BizException(EnumErrorMsg.check_data_format.getCode(), msg);
                        }
                    }

                }

        }
    }



    /**
     * 检查实体数据的必填项和合法性
     * @param entity
     */
    public void checkEntityRequired(BaseEntity entity){
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



        List<Field> list = ReflectionUtil.getBusinessFields(entity.getClass(),EntityAttrPageAnnotation.class);

        if(list != null && !list.isEmpty()){

                for (Field field : list) {
                    EntityAttrDBAnnotation eaa = field.getAnnotation(EntityAttrDBAnnotation.class);

                    String name = SpringUtil.getMessage(entity.getClass().getName() + "." + field.getName());

                    Object val = ReflectionUtil.getField(field, entity);
                    boolean isEmpty = StringUtil.isEmpty(val);

                    //检查必填
                    if (eaa.notNull() && isEmpty) {
                        String msg = SpringUtil.getMessage(EnumErrorMsg.check_data_required.getI18n(), name);
                        throw new BizException(EnumErrorMsg.check_data_required.getCode(), msg);
                    }

                    //检查长度
                    if(eaa.attrLength() >0 && !isEmpty){

                        String msg = SpringUtil.getMessage(EnumErrorMsg.check_data_too.getI18n(), name);

                        if(val instanceof String){
                            if(((String)val).length() > eaa.attrLength() ){
                                throw new BizException(EnumErrorMsg.check_data_too.getCode(), msg);
                            }
                        }

                        if(val instanceof Double || val instanceof BigDecimal){
                            String str = val.toString();
                            if((str.length() - 1 ) > eaa.attrLength()){
                                throw new BizException(EnumErrorMsg.check_data_too.getCode(), msg);
                            }else {
                                if(str.indexOf("\\.")<= str.length() - eaa.attrDecimals()){
                                    msg = SpringUtil.getMessage(EnumErrorMsg.check_decimal_too.getI18n(), name);
                                    throw new BizException(EnumErrorMsg.check_decimal_too.getCode(), msg);
                                }
                            }
                        }
                    }

                    EntityAttrCheckAnnotation eac = field.getAnnotation(EntityAttrCheckAnnotation.class);
                    //检查规则
                    if(eac != null && !eac.checkRule().isEmpty()){
                        if(!Pattern.matches(eac.checkRule() ,val.toString())){
                            String msg = SpringUtil.getMessage(EnumErrorMsg.check_data_format.getI18n(), name);
                            throw new BizException(EnumErrorMsg.check_data_format.getCode(), msg);
                        }
                    }

                }

        }

    }





}
