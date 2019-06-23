package com.zz.bms.controller.base.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zz.bms.core.db.base.service.BaseService;
import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.core.enums.EnumSymbol;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.util.base.data.StringFormatKit;
import com.zz.bms.util.configs.AppConfig;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.util.poi.ExcelDictHolder;
import com.zz.bms.util.poi.enums.EnumExcelFileType;
import com.zz.bms.util.poi.exceptions.ExcelAbsenceException;
import com.zz.bms.util.poi.exceptions.ExcelFormatException;
import com.zz.bms.util.poi.exceptions.ExcelTypeMatchingException;
import com.zz.bms.util.poi.export.ExcelExport;
import com.zz.bms.util.poi.export.excelype.BaseXlsTemplet;
import com.zz.bms.util.poi.export.filetype.HssfExport;
import com.zz.bms.util.poi.export.filetype.SxssfExport;
import com.zz.bms.util.poi.imports.DefaultExcelImport;
import com.zz.bms.util.poi.imports.ExcelImport;
import com.zz.bms.util.poi.util.ColumnUtil;
import com.zz.bms.util.poi.util.ExcelUtil;
import com.zz.bms.util.poi.vo.Column;
import com.zz.bms.util.spring.ReflectionUtil;
import com.zz.bms.util.spring.SpringUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author admin
 */
public class ExcelHelper {


    public static Logger logger = Logger.getLogger(ExcelHelper.class);


    /**
     * 获取业务键内容
     * @param m
     * @param keyFieldNames
     * @param conttroller
     * @param <QueryModel>
     * @return
     */
    public static <QueryModel>  Object[] buildKeyObject(QueryModel m , EntityAttrFkAnnotation fkAnnotation,String[] keyFieldNames , IExcelConttroller conttroller ){
        Object[] result = new Object[keyFieldNames.length];

        List<Field> fs = ReflectionUtil.getAllFields(conttroller.getRwEntityClass() , BaseEntity.class);

        try{
            int index = 0;
            for(String keyFieldName : keyFieldNames){
                Field f = null;
                for(Field ff : fs){
                    EntityAttrFkAnnotation eafa = ff.getAnnotation(EntityAttrFkAnnotation.class);
                    if(eafa != null && eafa.group().equals(fkAnnotation.group()) && eafa.dbColumnName().equals(keyFieldName)){
                        f = ff;
                        break;
                    }
                }
                if(f == null){
                    return  null;
                }
                ReflectionUtil.makeAccessible(f);
                Object obj = ReflectionUtil.getField(f , m);
                result[index] = obj;
                index ++;
            }
        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException("获取业务KEY信息错误");
        }
        return result;
    }

    /**
     * 业务键值
     * @param keyObjs
     * @return
     */
    public static  String buildKey(Object[] keyObjs ){
        if(keyObjs == null || keyObjs.length == 0){
            return null;
        }

        StringBuilder sb = new StringBuilder("");
        try{
            for(Object obj : keyObjs){
                if(EntityUtil.isEmpty(obj)){
                    return null;
                }
                sb.append(obj.toString());
            }
        }catch(Exception e){
            throw new RuntimeException("获取业务KEY信息错误");
        }
        return sb.toString();
    }


    /**
     * 检查字段内容
     * @param column
     * @param setErrorMethod
     * @param m
     * @param obj
     * @param <QueryModel>
     */
    public static <QueryModel> void checkField(Column column, Method setErrorMethod, QueryModel m, Object obj) {

        if(column.isRequired()){
            if(obj == null || StringUtils.isEmpty(obj.toString())){
                errorProcess(setErrorMethod, m , "请先填写"+column.getName()+";");
            }
        }

        if(column.getLength() > 0 && obj != null){
            if(obj instanceof String && ((String)obj).length() > column.getLength()){
                errorProcess(setErrorMethod , m , column.getName()+"数据过长;");
            }else if(obj instanceof Number){
                if(obj instanceof Integer || obj.getClass() == int.class || obj instanceof Long || obj.getClass() == long.class){
                    if(obj.toString().length() > column.getLength()){
                        errorProcess(setErrorMethod , m , column.getName()+"数据过长;");
                    }
                }else {
                    //有小数点，所以要多加一位
                    if(obj.toString().length() > column.getLength()+1){
                        errorProcess(setErrorMethod , m , column.getName()+"数据过长;");
                    }
                }
            }
        }
    }

    /**
     * 错误处理
     * @param setErrorMethod
     * @param m
     * @param msg
     * @param <QueryModel>
     */
    public static <QueryModel> void errorProcess(Method setErrorMethod, QueryModel m , String msg) {
        if(setErrorMethod != null){
            try {
                setErrorMethod.invoke(m , msg);
            } catch (Exception e) {
                logger.error(e.getMessage(),e);
            }
        }else {
            throw new RuntimeException(msg);
        }
    }


    /**
     * 导出模板
     * @param excelType
     * @param topDate
     * @param conntroller
     * @param response
     * @param <RwModel>
     * @param <QueryModel>
     * @param <PK>
     */
    public static   <RwModel extends BaseEntity<PK>, QueryModel extends RwModel, PK extends Serializable>
    void download(String excelType, QueryModel topDate , IExcelConttroller conntroller , HttpServletResponse response ) {
        excelType = excelType.toLowerCase();
        BaseXlsTemplet<QueryModel> bxe = new BaseXlsTemplet<QueryModel>();
        bxe.setEntityClz(conntroller.getQueryEntityClass());

        ExcelExport<QueryModel> aee = null;
        switch (excelType) {
            case "sxssf":
                aee = new SxssfExport<QueryModel>(bxe);
                break;
            case "hssf":
                aee = new HssfExport<QueryModel>(bxe);
                break;
            case "csv":
                //aee = new SxssfExport(bxe);
                break;
        }




        int header = 0;
        String[] headerInfo = conntroller.getExcelHeaderInfo();

        if(headerInfo != null && headerInfo.length > 0){
            header = headerInfo.length;
        }

        try {

            conntroller.setDictNames();

            //导出标题
            conntroller.exportTitles(aee, header, topDate, conntroller.isAddNumberByExport());

            //导出头信息
            conntroller.exportHeader(aee, headerInfo);

            //导出内容
            List<QueryModel> all = new ArrayList<QueryModel>();
            all.add(topDate);
            conntroller.exportContent(aee, all, header + 1, conntroller.isAddNumberByExport());

            //下载文件
            conntroller.exportXls(aee, response);
        }catch(RuntimeException e){
            throw e;
        }catch(Exception e){
            throw new RuntimeException(e);
        }finally {
            ExcelDictHolder.setDictMap(null);
        }
    }


    /**
     * 导出Excel文件
     * @param response
     * @param aee
     * @param all
     * @param conntroller
     * @param <RwModel>
     * @param <QueryModel>
     * @param <PK>
     */
    public static <RwModel extends BaseEntity<PK>, QueryModel extends RwModel, PK extends Serializable>
    void exportExcel(HttpServletResponse response, ExcelExport<QueryModel> aee, List<QueryModel> all ,IExcelConttroller conntroller ) {
        QueryModel topDate = null;
        if(all != null && !all.isEmpty()){
            topDate = all.get(0);
        }else {
            topDate  = (QueryModel)conntroller.newQueryModel();
        }
        int header = 0;
        String[] headerInfo = conntroller.getExcelHeaderInfo();

        if(headerInfo != null && headerInfo.length > 0){
            header = headerInfo.length;
        }

        //导出标题
        conntroller.exportTitles(aee , header , topDate , conntroller.isAddNumberByExport());

        //导出头信息
        conntroller.exportHeader(aee , headerInfo);

        //导出内容
        List<QueryModel> allData = all;
        conntroller.exportContent(aee ,allData , header+1 , conntroller.isAddNumberByExport() );

        //导出文件
        conntroller.exportXls(aee,response);
    }


    /**
     * 分析数据
     * @param list
     * @param conttroller
     * @param <QueryModel>
     */
    public static <QueryModel> void analysis(List<QueryModel> list , IExcelConttroller conttroller) {

        List<Field> fs = conttroller.getImportAllFields() ;

        List<Column> columns = conttroller.getImportColumns();


        //用到的字典集合
        Map<String,?> dictInfoMaps = null;

        //用到的外键集合, Class:外键类  String:外键的BusinessKey  ?: 外键对象
        Map<Class,Map<String,Object>> fkKeyInfoMaps= new HashMap<Class,Map<String,Object>>();
        Map<Class,Map<String,Object>> fkNameInfoMaps= new HashMap<Class,Map<String,Object>>();


        Map<Class,Map<String,Object>> fkErrorKeyInfoMaps= new HashMap<Class,Map<String,Object>>();
        Map<Class,Map<String,Object>> fkErrorNameInfoMaps= new HashMap<Class,Map<String,Object>>();


        String[] dictTypeCodes = ColumnUtil.getDictTypeCodes(fs);
        Map<String , Map<Field,Field>> dictFieldMap = null;

        if(dictTypeCodes != null && dictTypeCodes.length > 0) {
            dictInfoMaps = conttroller.getDictMaps(dictTypeCodes);
            dictFieldMap = ColumnUtil.getDictMap(fs);
        }
        Map<String, Map<Field, List<Field>>> fkFieldMap = ColumnUtil.getFkMap(fs);

        for(Column column : columns){
            Field f = column.getField();
            EntityAttrPageAnnotation pageAnnotation = f.getAnnotation(EntityAttrPageAnnotation.class);
            EntityAttrDBAnnotation dbAnnotation = f.getAnnotation(EntityAttrDBAnnotation.class);
            EntityAttrDictAnnotation dictAnnotation = f.getAnnotation(EntityAttrDictAnnotation.class);
            EntityAttrFkAnnotation fkAnnotation = f.getAnnotation(EntityAttrFkAnnotation.class);

            if(dictAnnotation != null){
                conttroller.analysisDict(list,column,dictAnnotation,dictInfoMaps,dictFieldMap);
            }else if(fkAnnotation != null){
                conttroller.analysisFk(list,column,fkAnnotation,fkKeyInfoMaps,fkNameInfoMaps,fkErrorKeyInfoMaps,fkErrorNameInfoMaps,fkFieldMap);
            }else {
                conttroller.analysisOther(list,column);
            }
        }


    }


    /**
     * 分析外键类型的数据
     * @param list
     * @param column
     * @param fkAnnotation
     * @param fkKeyInfoMaps
     * @param fkNameInfoMaps
     * @param fkErrorKeyInfoMaps
     * @param fkErrorNameInfoMaps
     * @param fkFieldMap
     * @param controller
     * @param <RwModel>
     * @param <QueryModel>
     * @param <PK>
     */
    public static <RwModel extends BaseEntity<PK>, QueryModel extends RwModel, PK extends Serializable>
    void analysisFk(List<QueryModel> list,
                    Column column,
                    EntityAttrFkAnnotation fkAnnotation,
                    Map<Class, Map<String, Object>> fkKeyInfoMaps,
                    Map<Class, Map<String, Object>> fkNameInfoMaps,
                    Map<Class, Map<String, Object>> fkErrorKeyInfoMaps,
                    Map<Class, Map<String, Object>> fkErrorNameInfoMaps,
                    Map<String, Map<Field, List<Field>>> fkFieldMap,
                    IExcelConttroller controller) {

        Class fkClz = fkAnnotation.fkClass();
        if(fkClz == null){
            try{
                fkClz = Class.forName(fkAnnotation.fkClassName());
            }catch(Exception e){
                throw new RuntimeException(fkAnnotation.group()+" 设置外键类型错误");
            }
        }

        String serviceName = fkClz.getSimpleName().replace("BO","")+"ServiceImpl";
        serviceName = serviceName.substring(0,1).toLowerCase()+serviceName.substring(1);
        IService<QueryModel> iService = (IService<QueryModel>) SpringUtil.getBean(serviceName);

        EntityAnnotation entityAnnotation = (EntityAnnotation) fkClz.getAnnotation(EntityAnnotation.class);
        if(entityAnnotation == null){
            throw new RuntimeException(fkClz.getName()+" 类型缺少 EntityAnnotation 注解");
        }
        String[] businessKeys = entityAnnotation.businessKey();
        String businessName = entityAnnotation.businessName();
        if(businessKeys == null || businessKeys.length == 0 || StringUtils.isEmpty(businessKeys[0])){
            throw new RuntimeException(fkClz.getName()+" EntityAnnotation 注解中没有 businessKey");
        }
        if(businessName == null ||  StringUtils.isEmpty(businessName)){
            throw new RuntimeException(fkClz.getName()+" EntityAnnotation 注解中没有 businessName");
        }

        String[] keyFieldNames = businessKeys[0].split(EnumSymbol.COMMA.getCode());
        String[] nameFieldNames = businessName.split(EnumSymbol.COMMA.getCode());


        Map<Field, List<Field>> fkMap = fkFieldMap.get(fkAnnotation.group());
        if(fkMap == null){
            throw new RuntimeException(fkAnnotation.group()+" 外键设置错误");
        }

        Method setErrorMethod = ExcelUtil.setErrorMethod(controller.getRwEntityClass());


        Field fkIdField = null;
        List<Field> fkFiedList = null;

        for(Map.Entry<Field , List<Field>> fkFields : fkMap.entrySet()){
            fkIdField = fkFields.getKey();
            fkFiedList = fkFields.getValue();
            break;
        }
        ReflectionUtil.makeAccessible(fkIdField);
        Column fkIdColumn = ColumnUtil.field2Column(fkIdField);

        for(QueryModel m : list) {
            String fkId = (String)ReflectionUtil.getField(fkIdField, m);
            if(StringUtils.isNotEmpty(fkId)){
                break;
            }

            boolean isAllNull = false;
            Object fkObj = null;
            Object[] keyObjs = buildKeyObject(m , fkAnnotation,  keyFieldNames , controller);
            if(keyObjs != null && !EntityUtil.isAllEmpty(keyObjs)) {
                String key = buildKey(keyObjs);
                if (key != null) {
                    fkObj = getFkObjByKey(m, fkAnnotation,
                            keyFieldNames, key, keyObjs,
                            iService, setErrorMethod, fkIdColumn,
                            fkKeyInfoMaps , fkErrorKeyInfoMaps);
                } else {
                    ExcelHelper.errorProcess(setErrorMethod, m, fkIdColumn.getName() + " 信息填写不全 ");
                }
            }else {
                Object[] nameObjs = buildKeyObject(m, fkAnnotation, nameFieldNames, controller);
                if(!EntityUtil.isAllEmpty(nameObjs)) {
                    String key = buildKey(nameObjs);
                    if (key != null) {
                        fkObj = getFkObjByName(m, fkAnnotation,
                                nameFieldNames, key, nameObjs,
                                iService, setErrorMethod, fkIdColumn,
                                fkNameInfoMaps , fkErrorNameInfoMaps);
                    }else {
                        ExcelHelper.errorProcess(setErrorMethod, m, fkIdColumn.getName() + " 信息填写不全 ");
                    }
                }else {
                    isAllNull = true;
                }

            }



            if(fkObj == null && isAllNull){
                if(fkIdColumn.isRequired()) {
                    ExcelHelper.errorProcess(setErrorMethod, m, fkIdColumn.getName() + " 信息必须输入 ");
                }
                continue;
            }


            if(fkObj != null){
                try{
                    controller.checkEntity((BaseEntity) fkObj);
                }catch (BizException e){
                    ExcelHelper.errorProcess(setErrorMethod, m, fkIdColumn.getName() + e.getMsg());
                    continue;
                }catch (Exception e){
                    ExcelHelper.errorProcess(setErrorMethod, m, fkIdColumn.getName() + e.getMessage());
                    continue;
                }
            }

            if(fkObj != null){
                //设置值
                for(Field f : fkFiedList){
                    ReflectionUtil.makeAccessible(f);
                    EntityAttrFkAnnotation annotation = f.getAnnotation(EntityAttrFkAnnotation.class);
                    if(annotation.isFkId()){

                        PK id = null;
                        if(fkObj instanceof BaseEntity) {
                            id = (PK)((BaseEntity) fkObj).getId();
                        }else {
                            try {
                                Field idField = fkClz.getField("id");
                                id = (PK)ReflectionUtil.getField(idField , fkObj);
                            } catch (NoSuchFieldException e) {
                                logger.error(e.getMessage(),e);
                            }
                        }

                        ReflectionUtil.setField(f, m, id);
                    }else {
                        try {
                            Field field = ReflectionUtil.getField(fkClz, Object.class ,StringFormatKit.toCamelCase(annotation.dbColumnName()) );
                            ReflectionUtil.makeAccessible(field);
                            Object temp = (PK)ReflectionUtil.getField(field , fkObj);
                            ReflectionUtil.setField(f, m, temp);
                        } catch (Exception e) {
                            logger.error(e.getMessage(),e);
                        }
                    }
                }
            }
        }

    }



    public static <QueryModel> Object getFkObjByKey(QueryModel m , EntityAttrFkAnnotation fkAnnotation ,
                                             String[] keyFieldNames , String key , Object[] keyObjs ,
                                             IService<QueryModel> iService,Method setErrorMethod ,Column fkIdColumn ,
                                             Map<Class, Map<String, Object>> fkKeyInfoMaps,
                                             Map<Class, Map<String, Object>> fkErrorKeyInfoMaps){



        Class fkClz = fkAnnotation.fkClass();


        Map<String, Object> fkClzMap = fkKeyInfoMaps.get(fkClz);
        if(fkClzMap == null){
            fkClzMap = new HashMap<String,Object>();
            fkKeyInfoMaps.put(fkClz , fkClzMap);
        }


        Map<String, Object> fkErrorClzMap = fkErrorKeyInfoMaps.get(fkClz);
        if(fkErrorClzMap == null){
            fkErrorClzMap = new HashMap<String,Object>();
            fkErrorKeyInfoMaps.put(fkClz , fkErrorClzMap);
        }

        Object fkObj = fkClzMap.get(key);
        if(fkObj == null){
            if(fkErrorClzMap.containsKey(key)){
                ExcelHelper.errorProcess(setErrorMethod, m, fkIdColumn.getName() + " 信息填写错误 ");
                return null;
            }
        }

        if(fkObj == null){
            QueryWrapper<QueryModel> queryWrapper = new QueryWrapper();
            int index = 0;
            for(String fieldName : keyFieldNames){
                queryWrapper.eq(StringFormatKit.toUnderlineName(fieldName),keyObjs[index]);
                index++;
            }
            fkObj = iService.getOne(queryWrapper);
            if(fkObj != null){
                fkClzMap.put(key , fkObj);
            }else {
                fkErrorClzMap.put(key , fkObj);
                ExcelHelper.errorProcess(setErrorMethod, m, fkIdColumn.getName() + " 信息填写错误 ");
            }
        }

        return fkObj;


    }




    public static <QueryModel> Object getFkObjByName(QueryModel m , EntityAttrFkAnnotation fkAnnotation ,
                                             String[] nameFieldNames ,String key , Object[] keyObjs ,
                                             IService<QueryModel> iService,Method setErrorMethod ,Column fkIdColumn ,
                                             Map<Class, Map<String, Object>> fkNameInfoMaps ,
                                             Map<Class, Map<String, Object>> fkErrorNameInfoMaps){



        Class fkClz = fkAnnotation.fkClass();


        Map<String, Object> fkClzMap = fkNameInfoMaps.get(fkClz);
        if(fkClzMap == null){
            fkClzMap = new HashMap<String,Object>();
            fkNameInfoMaps.put(fkClz , fkClzMap);
        }

        Map<String, Object> fkErrorClzMap = fkNameInfoMaps.get(fkClz);
        if(fkErrorClzMap == null){
            fkErrorClzMap = new HashMap<String,Object>();
            fkErrorNameInfoMaps.put(fkClz , fkErrorClzMap);
        }

        Object fkObj = fkClzMap.get(key);
        if(fkObj == null && fkErrorClzMap.containsKey(key) ){
            String errorMsg =  (String)fkErrorClzMap.get(key);
            ExcelHelper.errorProcess(setErrorMethod, m, errorMsg);
            return null;
        }

        if(fkObj == null){
            QueryWrapper<QueryModel> queryWrapper = new QueryWrapper();
            int index = 0;
            for(String fieldName : nameFieldNames){
                queryWrapper.eq(StringFormatKit.toUnderlineName(fieldName),keyObjs[index]);
                index++;
            }
            List list = iService.list(queryWrapper);
            if(list != null && list.size() == 1) {
                fkObj = list.get(0);
                if (fkObj != null) {
                    fkClzMap.put(key, fkObj);
                } else {
                    fkErrorClzMap.put(key, fkIdColumn.getName() + " 信息填写错误 ");
                    ExcelHelper.errorProcess(setErrorMethod, m, fkIdColumn.getName() + " 信息填写错误 ");
                }
            }else {
                fkErrorClzMap.put(key, fkIdColumn.getName() + " 内容重复 ");
                ExcelHelper.errorProcess(setErrorMethod, m, fkIdColumn.getName() + " 内容重复 ");
            }
        }

        return fkObj;


    }



    /**
     * 分析字典类型的数据
     * @param list
     * @param column
     * @param dictAnnotation
     * @param dictInfoMaps
     * @param dictFieldMap
     * @param conttroller
     * @param <RwModel>
     * @param <QueryModel>
     * @param <PK>
     */
    public static <RwModel extends BaseEntity<PK>, QueryModel extends RwModel, PK extends Serializable>
    void analysisDict(List<QueryModel> list,
                     Column column,
                     EntityAttrDictAnnotation dictAnnotation,
                     Map<String, ?> dictInfoMaps,
                     Map<String, Map<Field, Field>> dictFieldMap,
                     IExcelConttroller conttroller) {
        if(dictAnnotation.isValueField()){
            throw new RuntimeException(dictAnnotation.group()+" Excel设置错误");
        }
        Map<Field, Field>  dictMap = dictFieldMap.get(dictAnnotation.group());
        if(dictMap == null || dictMap.isEmpty()){
            throw new RuntimeException(dictAnnotation.group()+" 不是字典类型");
        }

        Method setErrorMethod = ExcelUtil.setErrorMethod(conttroller.getRwEntityClass());

        Field dictValField = null;
        for(Map.Entry<Field , Field> dictField : dictMap.entrySet()){
            dictValField = dictField.getKey();
            break;
        }

        for(QueryModel m : list) {
            ReflectionUtil.makeAccessible(column.getField());
            String dictName = (String)ReflectionUtil.getField(column.getField(), m);
            if(StringUtils.isNotEmpty(dictName)) {
                Object dict = dictInfoMaps.get(dictAnnotation.dictType() + dictName);
                String val = conttroller.getDictVal(dict);
                if(val != null){
                    ReflectionUtil.makeAccessible(dictValField);
                    try {
                        dictValField.set(m, val);
                    }catch(Exception e){
                        logger.error(e.getMessage(),e);
                    }
                }


                ExcelHelper.checkField(ColumnUtil.field2Column(dictValField), setErrorMethod, m, val);
            }
        }

    }


    /**
     * 分析其它数据， 指非外键 非字典类型的
     * @param list
     * @param column
     * @param conttroller
     * @param <RwModel>
     * @param <QueryModel>
     * @param <PK>
     */
    public static <RwModel extends BaseEntity<PK>, QueryModel extends RwModel, PK extends Serializable>
    void analysisOther(List<QueryModel> list,Column column , IExcelConttroller conttroller) {
        Method setErrorMethod = ExcelUtil.setErrorMethod(conttroller.getRwEntityClass());
        ReflectionUtil.makeAccessible(column.getField());
        for(QueryModel m : list){
            Object obj = ReflectionUtil.getField(column.getField(),m);
            ExcelHelper.checkField(column, setErrorMethod, m, obj);

        }
    }



    /**
     * 分析并且保存Excel的数据
     * @param list
     * @param sessionUserVO
     * @return
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    public static  <RwModel extends BaseEntity<PK>, QueryModel extends RwModel, PK extends Serializable>
    List<QueryModel>  doExcelData(List<QueryModel> list , ILoginUserEntity<PK> sessionUserVO , IExcelConttroller conntroller )
    {


        boolean isAllOK = true;
        int index = 0;

        try {

            //分析每一行的数据
            conntroller.analysis(list);


            Method setErrorMethod = ExcelUtil.setErrorMethod(conntroller.getRwEntityClass());
            Method getErrorMethod = ExcelUtil.getErrorMethod(conntroller.getRwEntityClass());



            if (AppConfig.NO_ERROR_SAVE_DB) {
                for (QueryModel m : list) {
                    if (getErrorMethod != null) {
                        String errorMsg = (String) getErrorMethod.invoke(m);
                        if (StringUtils.isNotEmpty(errorMsg)) {
                            isAllOK = false;
                        }
                    }

                }

                if (isAllOK) {

                    for (QueryModel m : list) {
                        try {
                            conntroller.customExcelInsert(m, sessionUserVO, index);
                            conntroller.insertInfo(m, sessionUserVO, false, false);
                            index++;
                        } catch (BizException e) {
                            isAllOK = false;
                            if (setErrorMethod != null) {
                                setErrorMethod.invoke(m, e.getMsg());
                            } else {
                                throw e;
                            }
                        } catch (RuntimeException e) {
                            isAllOK = false;
                            if (setErrorMethod != null) {
                                setErrorMethod.invoke(m, e.getMessage());
                            } else {
                                throw e;
                            }
                        } catch (Exception e) {
                            isAllOK = false;
                            logger.error(e.getMessage(), e);
                            if (setErrorMethod != null) {
                                setErrorMethod.invoke(m, " 未知错误");
                            } else {
                                throw new RuntimeException(e);
                            }
                        }

                    }
                }


                if (isAllOK) {
                    List<RwModel> ims = new ArrayList<>();
                    for (QueryModel rm : list) {
                        ims.add(rm);
                    }

                    try {
                        conntroller.getBaseRwService().saveBatch(ims);
                    } catch (Exception e) {
                        throw new RuntimeException(" 数据错误，请重试！");
                    }
                }

            } else {
                for (QueryModel m : list) {
                    if (getErrorMethod != null) {
                        String errorMsg = (String) getErrorMethod.invoke(m);
                        if (StringUtils.isNotEmpty(errorMsg)) {
                            isAllOK = false;
                            continue;
                        }
                    }

                    try {
                        conntroller.customExcelInsert(m, sessionUserVO, index);
                        conntroller.insertInfo(m, sessionUserVO, true, false);
                        index++;
                    } catch (BizException e) {
                        isAllOK = false;
                        if (setErrorMethod != null) {
                            setErrorMethod.invoke(m, e.getMsg());
                        } else {
                            throw e;
                        }
                    } catch (RuntimeException e) {
                        isAllOK = false;
                        if (setErrorMethod != null) {
                            setErrorMethod.invoke(m, e.getMessage());
                        } else {
                            throw e;
                        }
                    } catch (Exception e) {
                        isAllOK = false;
                        logger.error(e.getMessage(), e);
                        if (setErrorMethod != null) {
                            setErrorMethod.invoke(m, "未知错误");
                        } else {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        if(isAllOK){
            return null;
        }else {
            return list;
        }

    }


    /**
     * 从文件中获取数据
     * @param file
     * @param excelFileType
     * @param conttroller
     * @param <RwModel>
     * @param <QueryModel>
     * @param <PK>
     * @return
     */
    public static  <RwModel extends BaseEntity<PK>, QueryModel extends RwModel, PK extends Serializable>
    List<QueryModel> getExcelData(MultipartFile file, EnumExcelFileType excelFileType ,IExcelConttroller conttroller){


        List<QueryModel> list = new ArrayList<QueryModel>();

        int sheetIndex = 0;
        int rowIndex = 0;
        int cellIndex = 0;

        try {

            ExcelImport ei = null;

            int startRowNum = conttroller.getExcelImportHeaderRowNum();

            if(excelFileType == EnumExcelFileType.HSSF || excelFileType == EnumExcelFileType.SXSSF || excelFileType == EnumExcelFileType.XSSF  ){
                ei = new DefaultExcelImport(file.getInputStream(),startRowNum,conttroller.isAddNumberByImport());
            }else {
                throw new RuntimeException("请选择Excel文件(xls,xlsx)");
            }
            List<Column> columns = conttroller.getImportColumns();
            List<List<Object[]>> excelData = conttroller.readExcel(ei);
            if(excelData == null || excelData.isEmpty()){
                throw new RuntimeException("请先按照模板编写数据再导入");
            }
            for(;sheetIndex < excelData.size() ; sheetIndex++){
                List<Object[]> sheetData = excelData.get(sheetIndex);
                rowIndex = 0;
                for(Object[] rowData : sheetData) {
                    if(rowData != null && rowData.length > 0) {
                        QueryModel m = (QueryModel)conttroller.newQueryModel();
                        ExcelUtil.row2Object(rowData, columns, m , conttroller.isAddNumberByImport());
                        list.add(m);
                    }
                    rowIndex ++ ;
                }
            }
            if(list == null || list.isEmpty()) {
                throw new RuntimeException("请先按照模板编写数据再导入");
            }

            return list;
        }catch(ExcelAbsenceException e){
            e.setSheetIndex(sheetIndex+1);
            e.setRowIndex(rowIndex+ 1 +conttroller.getExcelImportHeaderRowNum());
            throw e;
        }catch(ExcelTypeMatchingException e){
            e.setSheetIndex(sheetIndex+1);
            //展示列数=实际列数+1
            cellIndex = e.getCellIndex()+1;
            if(conttroller.isAddNumberByImport()){
                cellIndex ++ ;
            }
            e.setRowIndex(rowIndex +conttroller.getExcelImportHeaderRowNum());
            e.setCellIndex(cellIndex);
            throw e;

        }catch(ExcelFormatException e){
            e.setSheetIndex(sheetIndex+1);
            //展示列数=实际列数+1
            cellIndex = e.getCellIndex()+1;
            if(conttroller.isAddNumberByImport()){
                cellIndex ++ ;
            }
            e.setRowIndex(rowIndex +conttroller.getExcelImportHeaderRowNum());
            e.setCellIndex(cellIndex);
            throw e;
        }catch(RuntimeException e){
            logger.error(e.getMessage() , e);
            throw e;
        }catch(Exception e){
            logger.error(e.getMessage() , e);
            throw new RuntimeException("未知错误");
        }
    }
}
