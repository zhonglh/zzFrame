package com.zz.bms.core.generics;


import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.util.spring.ReflectionUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.*;

/**
 * 处理类属性中的所有注解
 * 将所有的注解汇聚在 AnnotaionEntity 类里
 * @author Administrator
 */
@Component
public class AnnotaionEntityManager {

    /**
     * 获取属性(字段)是否必填
     * @param dbAnnotation
     * @param fkAnnotation
     * @param dictAnnotation
     * @param pageAnnotation
     * @return
     */
    public boolean isRequired(EntityAttrDBAnnotation dbAnnotation ,
                         EntityAttrFkAnnotation fkAnnotation ,
                         EntityAttrDictAnnotation dictAnnotation,
                         EntityAttrPageAnnotation pageAnnotation){
        if(!pageAnnotation.required()){
            return false;
        }
        if(dbAnnotation != null){
            return dbAnnotation.notNull();
        }
        if(fkAnnotation != null){
            return fkAnnotation.dbColumnNotNull();
        }
        if(dictAnnotation != null){
            return dictAnnotation.dbColumnNotNull();
        }

        throw EnumErrorMsg.code_error.toException();
    }


    /**
     * 获取属性(字段)最大长度
     * @param dbAnnotation
     * @param fkAnnotation
     * @param dictAnnotation
     * @param pageAnnotation
     * @return
     */
    public int  maxLength(EntityAttrDBAnnotation dbAnnotation ,
                              EntityAttrFkAnnotation fkAnnotation ,
                              EntityAttrDictAnnotation dictAnnotation,
                              EntityAttrPageAnnotation pageAnnotation){

        int pageMaxLength = pageAnnotation.maxLength();

        if(dbAnnotation != null){
            return Math.min(pageMaxLength , dbAnnotation.attrLength());
        }
        if(fkAnnotation != null){
            return Math.min(pageMaxLength , fkAnnotation.dbColumnLength());
        }
        if(dictAnnotation != null){
            return Math.min(pageMaxLength , dictAnnotation.dbColumnLength());
        }

        throw EnumErrorMsg.code_error.toException();
    }

    public int  decimalsLength(EntityAttrDBAnnotation dbAnnotation ,
                          EntityAttrFkAnnotation fkAnnotation ){



        if(dbAnnotation != null){
            return dbAnnotation.attrDecimals();
        }
        if(fkAnnotation != null){
            return fkAnnotation.dbColumnDecimals();
        }

        throw EnumErrorMsg.code_error.toException();
    }




    //todo
    //Anntotain 重新编写过，  需要调整所有的逻辑


    public List<AnnotaionEntity>  takeAnnotaions(Class clz){
        List<AnnotaionEntity> list = new ArrayList<AnnotaionEntity>();
        List<Field> fields = ReflectionUtil.getBusinessFields(clz , EntityAttrPageAnnotation.class);
        if(fields == null || fields.isEmpty()){
            return list;
        }

        //用于处理同组的序号， 将同组的列放在一起
        Map<String,List<AnnotaionEntity>> groupMap = new HashMap<String,List<AnnotaionEntity>>();

        for(Field field : fields ){

            Class<?> ft = field.getType();

            AnnotaionEntity ae = new AnnotaionEntity();

            if(!field.isAnnotationPresent(EntityAttrDBAnnotation.class)){
                ae.setDB(false);
                throw EnumErrorMsg.code_error.toException();
            }else {
                EntityAttrDBAnnotation dbAnnotation = field.getAnnotation(EntityAttrDBAnnotation.class);
                ae.setAttrName(dbAnnotation.attrName());
                ae.setAttrLength(dbAnnotation.attrLength());
                ae.setAttrDecimals(dbAnnotation.attrDecimals());
                ae.setNotNull(dbAnnotation.notNull());
                ae.setSort(dbAnnotation.sort());
            }

            if(field.isAnnotationPresent(EntityAttrCheckAnnotation.class)){
                EntityAttrCheckAnnotation checkAnnotation = field.getAnnotation(EntityAttrCheckAnnotation.class);
                ae.setCheck(true);
                //todo
                //ae.setCheckRule(checkAnnotation.checkRule());
                //ae.setDictType(checkAnnotation.dictType());
                ae.setCustomCheck(ae.customCheck);
            }

            if(field.isAnnotationPresent(EntityAttrPageAnnotation.class)){
                EntityAttrPageAnnotation pageAnnotation = field.getAnnotation(EntityAttrPageAnnotation.class);
                ae.setPage(true);
                //todo
                //ae.setGroup(pageAnnotation.group());
                //ae.setGroupField(pageAnnotation.groupField());
                if(StringUtils.isNotEmpty(ae.getGroup())){
                    List aes = groupMap.get(ae.getGroup());
                    if(aes == null){
                        aes = new ArrayList<AnnotaionEntity>();
                        groupMap.put(ae.getGroup() , aes) ;
                    }
                    aes.add(ae);
                }
                ae.setPageElement(pageAnnotation.pageElement());
                ae.setHidden(pageAnnotation.hidden());
                ae.setReadonly(pageAnnotation.readonly());

                //todo 解析初始值 , 配合 EnumPageElement
                ae.setDefaultType(pageAnnotation.defaultType());
                ae.setDefaultVal(pageAnnotation.defaultValue());

                if(ft.isAssignableFrom(Number.class)) {
                    ae.setMin(pageAnnotation.min());
                    ae.setMax(pageAnnotation.max());
                }
            }

            list.add(ae);


        }

        if(!groupMap.isEmpty()){
            Collection<List<AnnotaionEntity>> values = groupMap.values();
            for(List<AnnotaionEntity> aes : values){
                if(aes == null || aes.size() < 2){
                    continue;
                }

                Collections.sort(aes , new Comparator<AnnotaionEntity>(){
                    @Override
                    public int compare(AnnotaionEntity o1, AnnotaionEntity o2) {
                        return o1.sort > o2.sort ? 1 : -1;
                    }
                });

                AnnotaionEntity init = aes.get(0);
                for(int index = 1 ; index < aes.size();index++ ){
                    AnnotaionEntity ae = aes.get(index);
                    ae.setSort(init.sort + index );
                }
            }
        }


        Collections.sort(list , new Comparator<AnnotaionEntity>(){
            @Override
            public int compare(AnnotaionEntity o1, AnnotaionEntity o2) {
                return o1.sort > o2.sort ? 1 : -1;
            }
        });
        return list;

    }


}
