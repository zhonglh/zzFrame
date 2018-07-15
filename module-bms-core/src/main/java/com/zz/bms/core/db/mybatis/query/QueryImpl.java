package com.zz.bms.core.db.mybatis.query;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.zz.bms.core.enums.EnumSearchType;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Administrator
 */
public abstract class QueryImpl<M,PK extends Serializable> implements Query<M,PK> , Serializable{

    protected static String splitStr = "_";

    protected List<String> isNulls = new ArrayList<String>();
    protected List<String> isNotNulls = new ArrayList<String>();

    /**
     * 属性转列名, 如userName ==> user_name
     * @param fieldname
     * @return
     */
    protected String getVolumnByField(String fieldname){
        //todo 属性转列名
        return fieldname;
    }

    @Override
    public Wrapper<M> buildWrapper(){

        Wrapper<M> wrapper = new EntityWrapper<M>();

        if(!isNulls.isEmpty()){
            for(String fieldName : isNulls) {
                wrapper.isNull(getVolumnByField(fieldName));
            }
        }

        if(!isNotNulls.isEmpty()){
            for(String fieldName : isNotNulls) {
                wrapper.isNotNull(getVolumnByField(fieldName));
            }
        }


        Field[] fields = this.getClass().getFields();
        for(Field field : fields){
            String fieldProperties = field.getName();
            try {
                field.setAccessible(true);
                Object fieldvalue = field.get(this);
                if(fieldvalue != null) {
                    analysis(wrapper, fieldProperties, fieldvalue);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return wrapper;

    }

    /**
     * 解析每个字段
     * @param wrapper
     * @param fieldProperties
     * @param fieldValue
     */
    protected void analysis(Wrapper<M> wrapper , String fieldProperties , Object fieldValue) throws IllegalAccessException{
        EnumSearchType searchType = null;
        String fieldName = null;

        String[] fields = fieldProperties.split(splitStr);
        if(fields.length == 1){
            fieldName = fields[0];
            searchType = getSearchType(null);
        }else if(fields.length >= 2){
            fieldName = StringUtils.join(fields , splitStr , 0  , fields.length -1);
            searchType = getSearchType(fields[fields.length - 1]);
        }

        String columnName = this.getVolumnByField(fieldName);

        switch (searchType){
            case eq:
                wrapper.eq(columnName , fieldValue);
                break;
            case ne:
                wrapper.ne(columnName , fieldValue);
                break;
            case ge:
                wrapper.ge(columnName , fieldValue);
                break;
            case gt:
                wrapper.gt(columnName , fieldValue);
                break;
            case le:
                wrapper.le(columnName , fieldValue);
                break;
            case lt:
                wrapper.lt(columnName , fieldValue);
                break;
            case like:
                wrapper.like(columnName , fieldValue.toString());
                break;
            case notlike:
                wrapper.notLike(columnName , fieldValue.toString());
                break;
            case in:
                wrapper.in(columnName , (Collection) fieldValue);
                break;
            case notin:
                wrapper.notIn(columnName , (Collection) fieldValue);
                break;
            default:

        }

    }


    private EnumSearchType getSearchType(String searchType) throws IllegalAccessException{
        if(StringUtils.isEmpty(searchType)){
            return EnumSearchType.eq ;
        }else {
            try {
                return EnumSearchType.valueOf(searchType.toLowerCase());
            }catch (Exception e){
                throw new IllegalAccessException(this.getClass().getName() +" fields setting error , by suffix is '"+ searchType +"'");
            }
        }
    }


}
