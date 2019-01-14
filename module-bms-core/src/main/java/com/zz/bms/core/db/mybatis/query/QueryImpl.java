package com.zz.bms.core.db.mybatis.query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zz.bms.core.enums.EnumSearchOperator;
import com.zz.bms.core.exceptions.InternalException;
import com.zz.bms.util.base.data.StringFormatKit;
import com.zz.bms.util.base.java.ReflectionSuper;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Administrator
 */
public abstract class QueryImpl<M,PK extends Serializable> implements Query<M,PK> , Serializable{

    protected static String splitStr = "_";

    protected List<String> isNulls = new ArrayList<String>();
    protected List<String> isNotNulls = new ArrayList<String>();


    protected List<Query> ors = new ArrayList<Query>();


    public void orQuery(Query query){
        ors.add(query);
    }

    /**
     * 属性转列名, 如userName ==> user_name
     * 驼峰转下划线
     * @param fieldname
     * @return
     */
    protected String getVolumnByField(String fieldname){
        return StringFormatKit.toUnderlineName(fieldname);
    }



    @Override
    public QueryWrapper<M> buildWrapper(){
        QueryWrapper<M> wrapper = new QueryWrapper<>();
        return buildWrapper(wrapper);
    }


    @Override
    public QueryWrapper<M> buildWrapper(QueryWrapper wrapper){
        return buildWrapper(wrapper , false);
    }

    @Override
    public QueryWrapper<M> buildWrapper(QueryWrapper wrapper , boolean orBoolean){

        AtomicInteger ai = new AtomicInteger(0);

        if(!isNulls.isEmpty()){
            for(String fieldName : isNulls) {
                try {
                    analysis(ai , orBoolean , wrapper, fieldName+splitStr+EnumSearchOperator.isNull, null);
                } catch (IllegalAccessException e) {
                    throw new InternalException(e);
                }
            }
        }

        if(!isNotNulls.isEmpty()){
            for(String fieldName : isNotNulls) {
                try {
                    analysis(ai , orBoolean ,wrapper, fieldName+splitStr+ EnumSearchOperator.isNotNull, null);
                } catch (IllegalAccessException e) {
                    throw new InternalException(e);
                }
            }
        }

        Field[] fields = ReflectionSuper.getAllField(this.getClass() , QueryImpl.class);


        for(Field field : fields){
            boolean isStatic = Modifier.isStatic(field.getModifiers());
            if(isStatic){
                continue;
            }
            String fieldProperties = field.getName();
            try {
                field.setAccessible(true);
                Object fieldvalue = field.get(this);
                if(fieldvalue != null) {
                    if(fieldvalue instanceof String){
                        if(!((String)fieldvalue).trim().isEmpty()){
                            analysis(ai , orBoolean ,wrapper, fieldProperties, fieldvalue);
                        }
                    }else {
                        analysis(ai , orBoolean ,wrapper, fieldProperties, fieldvalue);
                    }

                }
            } catch (IllegalAccessException e) {
                throw new InternalException(e);
            }
        }


        if(ors != null && !ors.isEmpty()){
            for(Query orQuery : ors){
                orQuery.buildWrapper(wrapper , true);
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
    protected void analysis(AtomicInteger ai , boolean orBoolean ,QueryWrapper<M> wrapper , String fieldProperties , Object fieldValue) throws IllegalAccessException{
        EnumSearchOperator searchType = null;
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

        int count = ai.getAndIncrement();
        if(orBoolean && count > 0){
            wrapper.or();
        }

        switch (searchType){
            case eq:
                wrapper.eq(columnName , fieldValue);
                break;
            case ne:
                wrapper.ne(columnName , fieldValue);
                break;
            case gte:
                wrapper.ge(columnName , fieldValue);
                break;
            case gt:
                wrapper.gt(columnName , fieldValue);
                break;
            case lte:
                wrapper.le(columnName , fieldValue);
                break;
            case lt:
                wrapper.lt(columnName , fieldValue);
                break;
            case like:
                wrapper.like(columnName , fieldValue.toString());
                break;
            case notLike:
                wrapper.notLike(columnName , fieldValue.toString());
                break;
            case in:
                if(fieldValue instanceof String){
                    wrapper.in(columnName, ((String) fieldValue).split(","));
                }else {
                    wrapper.in(columnName, (Collection) fieldValue);
                }
                break;
            case notIn:
                if(fieldValue instanceof String){
                    wrapper.notIn(columnName , ((String) fieldValue).split(","));
                }else {
                    wrapper.notIn(columnName , (Collection) fieldValue);
                }
                break;
            case isNull:
                wrapper.isNull(columnName);
                break;
            case isNotNull:
                wrapper.isNotNull(columnName);
                break;

            default:


        }

    }


    private EnumSearchOperator getSearchType(String searchType) throws IllegalAccessException{
        if(StringUtils.isEmpty(searchType)){
            return EnumSearchOperator.eq ;
        }else {
            try {
                return EnumSearchOperator.valueOf(searchType.toLowerCase());
            }catch (Exception e){
                throw new IllegalAccessException(this.getClass().getName() +" fields setting error , by suffix is '"+ searchType +"'");
            }
        }
    }


}
