package com.zz.bms.controller.base.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.enums.EnumSymbol;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.core.vo.AjaxJson;
import com.zz.bms.util.base.data.StringFormatKit;
import com.zz.bms.util.configs.AppConfig;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.util.file.FileKit;
import com.zz.bms.util.poi.enums.EnumExcelFileType;
import com.zz.bms.util.poi.exceptions.ExcelAbsenceException;
import com.zz.bms.util.poi.exceptions.ExcelFormatException;
import com.zz.bms.util.poi.exceptions.ExcelTypeMatchingException;
import com.zz.bms.util.poi.export.BaseXlsExport;
import com.zz.bms.util.poi.export.BaseXlsTemplet;
import com.zz.bms.util.poi.export.ExcelExport;
import com.zz.bms.util.poi.export.excel.HssfExport;
import com.zz.bms.util.poi.export.excel.SxssfExport;
import com.zz.bms.util.poi.imports.DefaultExcelImport;
import com.zz.bms.util.poi.imports.ExcelImport;
import com.zz.bms.util.poi.util.ColumnUtil;
import com.zz.bms.util.poi.util.ExcelUtil;
import com.zz.bms.util.poi.vo.Column;
import com.zz.bms.util.spring.ReflectionUtil;
import com.zz.bms.util.spring.SpringUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * 处理数据库基础的Excel 功能
 * 包括导出，导入 支持 Excel2003  Excel2007  CVS 格式
 * @author Administrator
 */
public abstract class BaseExcelController<M extends BaseEntity<PK>, PK extends Serializable, Q extends Query> extends BaseCURDController<M,PK,Q> {




    public BaseExcelController(){
        super();
    }



    /**
     * 下载模板
     * @param excelType
     * @param m
     * @param query
     * @param request
     * @param response
     */
    @RequestMapping(value = "/{excelType}/download", method = RequestMethod.GET)
    protected void download(@PathVariable("excelType") String excelType, M m , Q query,  HttpServletRequest request, HttpServletResponse response) {



        if(StringUtils.isEmpty(excelType)){
            throw EnumErrorMsg.code_error.toException();
        }

        excelType = excelType.toLowerCase();
        BaseXlsTemplet<M> bxe = new BaseXlsTemplet<M>();
        bxe.setEntityClz(this.getRwEntityClass());

        ExcelExport<M> aee = null;
        switch (excelType) {
            case "sxssf":
                aee = new SxssfExport<M>(bxe);
                break;
            case "hssf":
                aee = new HssfExport<M>(bxe);
                break;
            case "csv":
                //aee = new SxssfExport(bxe);
                break;
        }




        Page<M> page = new Page<M>(1, 1);
        processQuery(query , m);
        Wrapper wrapper = buildRwWrapper(query , m);
        page = (Page<M>)baseService.page(page , wrapper );

        M topDate = null;
        if(page.getRecords() != null && !page.getRecords().isEmpty()){
            topDate = page.getRecords().get(0);
        }else {
            topDate  = newRwModel();
        }


        int header = 0;
        String[] headerInfo = getExcelHeaderInfo();

        if(headerInfo != null && headerInfo.length > 0){
            header = headerInfo.length;
        }

        //导出标题
        exportTitles(aee , header , topDate , isAddNumberByExport());

        //导出头信息
        exportHeader(aee , headerInfo);

        //导出内容
        List<M> all = new ArrayList<M>();
        all.add(topDate);
        exportContent(aee ,all , header+1 , isAddNumberByExport() );

        //下载文件
        exportXls(aee,response);

    }

    @RequestMapping(value = "/{excelType}/export", method = RequestMethod.GET)
    protected void export(@PathVariable("excelType") String excelType, M m , Q query, HttpServletRequest request, HttpServletResponse response) {

        if(StringUtils.isEmpty(excelType)){
            throw EnumErrorMsg.code_error.toException();
        }

        excelType = excelType.toLowerCase();
        BaseXlsExport<M> bxe = new BaseXlsExport<M>();
        bxe.setEntityClz(this.getRwEntityClass());

        ExcelExport<M> aee = null;
        switch (excelType) {
            case "sxssf":
                aee = new SxssfExport<M>(bxe);
                break;
            case "hssf":
                aee = new HssfExport<M>(bxe);
                break;
            case "csv":
                //aee = new SxssfExport(bxe);
                break;

        }


        this.permissionList.assertHasViewPermission();
        Wrapper<M> wrapper = buildRwWrapper(query , m);
        List<M> all =  baseService.list(wrapper);

        M topDate = null;
        if(all != null && !all.isEmpty()){
            topDate = all.get(0);
        }else {
            topDate  = (M)newRwModel();
        }
        int header = 0;
        String[] headerInfo = getExcelHeaderInfo();

        if(headerInfo != null && headerInfo.length > 0){
            header = headerInfo.length;
        }

        //导出标题
        exportTitles(aee , header , topDate , isAddNumberByExport());

        //导出头信息
        exportHeader(aee , headerInfo);

        //导出内容
        List<M> allData = (List<M>)all;
        exportContent(aee ,allData , header+1 , isAddNumberByExport() );

        //下载文件
        exportXls(aee,response);

    }


    /**
     * 导出标题
     * @param aee
     * @param header
     * @param m
     * @param isAddNumber
     */
    protected void exportTitles(ExcelExport<M> aee , int header, M m, boolean isAddNumber){
        aee.exportTitles(header ,  m  , isAddNumber );
    }

    /**
     * 导出头信息
     * @param aee
     */
    protected void exportHeader(ExcelExport<M> aee , String[] headerInfo ){
        if(headerInfo != null && headerInfo.length > 0) {
            aee.exportHeaders(Arrays.asList(headerInfo), getHeaderCellLength());
        }

    }

    /**
     * 导出内容
     * @param aee
     * @param contents
     * @param rowIndex
     * @param isAddNumber
     */
    protected void exportContent(ExcelExport<M> aee ,List<M> contents, int rowIndex, boolean isAddNumber){
        aee.exportContent(contents ,  rowIndex  , isAddNumber );
    }


    /**
     * 计算出头信息 ， 如果有特殊需求， 可以重载
     * @return
     */
    protected String[] getExcelHeaderInfo(){
        if(AppConfig.EXCEL_EXPORT_HEADER) {
            EntityAnnotation ea = this.getRwEntityClass().getAnnotation(EntityAnnotation.class);
            if (ea != null) {
                return new String[]{ea.value()};
            } else {
                return null;
            }
        }else {
            return null;
        }
    }


    protected int getHeaderCellLength(){
        return 13;
    }

    /**
     * 下载 Excel信息
     * @param aee
     * @param response
     * @throws RuntimeException
     */
    protected void exportXls(ExcelExport<M> aee ,HttpServletResponse response) throws RuntimeException {
        aee.exportXls(response);
    }


    protected boolean isAddNumberByExport(){
        return AppConfig.EXCEL_ADD_NUMBER;
    }






    /**
     * 导入Excel
     * @param file
     * @param res
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/doExcel" , method = {RequestMethod.GET , RequestMethod.POST} )
    @ResponseBody
    public AjaxJson doExcel(MultipartFile file, HttpServletResponse res, HttpServletRequest request) throws InvocationTargetException, IllegalAccessException {

        this.permissionList.assertHasImportPermission();



        EnumExcelFileType excelFileType = null;
        try{
            String fileType = FileKit.getFileTypeByFileName(file.getOriginalFilename());
            excelFileType = EnumExcelFileType.getEnumByFileType(fileType);
            if(excelFileType == null){
                return new AjaxJson(false , "请选择Excel文件" );
            }
        }catch(Exception e){
            throw new RuntimeException(e);
        }





        List<M> list  = null;

        try {
            list  =this.getExcelData(file , excelFileType);
        }catch(ExcelAbsenceException e){
            return new AjaxJson(false , e.toString());
        }catch(ExcelTypeMatchingException e){
            return new AjaxJson(false , e.toString());
        }catch(ExcelFormatException e){
            return new AjaxJson(false , e.toString());
        }catch(RuntimeException e){
            return new AjaxJson(false , e.getMessage());
        }catch(Exception e){
            logger.error(e.getMessage() , e);
            return new AjaxJson(false ,  "未知错误");
        }



        //分析每一行的数据
        this.analysis(list);

        ILoginUserEntity<PK> sessionUserVO = getSessionUser();

        Method setErrorMethod = ExcelUtil.setErrorMethod(this.getRwEntityClass());
        Method getErrorMethod = ExcelUtil.getErrorMethod(this.getRwEntityClass());



        boolean isAllOK = true;
        int index = 0;
        for(M m : list){
            if(getErrorMethod != null){
                String errorMsg = (String)getErrorMethod.invoke(m);
                if(StringUtils.isNotEmpty(errorMsg)){
                    isAllOK = false;
                    continue;
                }
            }

            try {
                this.customExcelInsert(m , sessionUserVO , index);
                this.insertInfo(m , sessionUserVO , false);
                index ++ ;
            }catch (BizException e){
                isAllOK = false;
                if(setErrorMethod != null) {
                    setErrorMethod.invoke(m, e.getMsg());
                }else {
                    throw e;
                }
            }catch(RuntimeException e){
                isAllOK = false;
                if(setErrorMethod != null) {
                    setErrorMethod.invoke(m, e.getMessage());
                }else {
                    throw e;
                }
            }catch(Exception e){
                isAllOK = false;
                logger.error(e.getMessage(),e);
                if(setErrorMethod != null) {
                    setErrorMethod.invoke(m, "未知错误");
                }else {
                    throw new RuntimeException(e);
                }
            }
        }

        if(isAllOK) {
            return AjaxJson.ok();
        }else {
            request.getSession().setAttribute(this.getRwEntityClass().getName(), list);
            return AjaxJson.fail("导入的信息中有些问题");
        }

    }

    /**
     * Excel导入数据的自定义方法
     * 可以将导入顺序插入的数据库中等
     * @param m
     * @param sessionUserVO
     * @param index
     */
    protected void customExcelInsert(M m, ILoginUserEntity<PK> sessionUserVO, int index){
        //m.setImportOrder(index);
    }

    /**
     * 解析数据
     * @param list
     */
    protected void analysis(List<M> list) {

        List<Field> fs = getImportAllFields() ;

        List<Column> columns = getImportColumns();


        //用到的字典集合
        Map<String,?> dictInfoMaps = null;

        //用到的外键集合, String:外键类名称  String:外键的BusinessKey  ?: 外键对象
        Map<Class,Map<String,Object>> fkInfoMaps= new HashMap<Class,Map<String,Object>>();

        String[] dictTypeCodes = ColumnUtil.getDictTypeCodes(fs);
        Map<String , Map<Field,Field>> dictFieldMap = null;

        if(dictTypeCodes != null && dictTypeCodes.length > 0) {
            dictInfoMaps = getDictMaps(dictTypeCodes);
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
                analysisDict(list,column,dictAnnotation,dictInfoMaps,dictFieldMap);
            }else if(fkAnnotation != null){
                analysisFk(list,column,fkAnnotation,fkInfoMaps,fkFieldMap);
            }else {
                analysisOther(list,column);
            }
        }


    }



    /**
     * 分析处理外键属性数据
     * @param list
     * @param column
     * @param fkAnnotation
     * @param fkInfoMaps
     */
    protected void analysisFk(List<M> list,
                              Column column,
                              EntityAttrFkAnnotation fkAnnotation,
                              Map<Class, Map<String, Object>> fkInfoMaps,
                              Map<String, Map<Field, List<Field>>> fkFieldMap) {
        Class fkClz = fkAnnotation.fkClass();
        if(fkClz == null){
            try{
                fkClz = Class.forName(fkAnnotation.fkClassName());
            }catch(Exception e){
                throw new RuntimeException(fkAnnotation.group()+"设置外键类型错误");
            }
        }

        String serviceName = fkClz.getSimpleName().replace("BO","")+"Service";
        serviceName = serviceName.substring(0,1).toLowerCase()+serviceName.substring(1);
        IService<M> iService = (IService<M>)SpringUtil.getBean(serviceName);

        EntityAnnotation entityAnnotation = (EntityAnnotation) fkClz.getAnnotation(EntityAnnotation.class);
        if(entityAnnotation == null){
            throw new RuntimeException(fkClz.getName()+"类型缺少 EntityAnnotation 注解");
        }
        String[] businessKeys = entityAnnotation.businessKey();
        if(businessKeys == null || businessKeys.length == 0 || StringUtils.isEmpty(businessKeys[0])){
            throw new RuntimeException(fkClz.getName()+"EntityAnnotation 注解中没有 businessKey");
        }

        String[] keyFieldNames = businessKeys[0].split(EnumSymbol.COMMA.getCode());


        Map<Field, List<Field>> fkMap = fkFieldMap.get(fkAnnotation.group());
        if(fkMap == null){
            throw new RuntimeException(fkAnnotation.group()+"外键设置错误");
        }

        Method setErrorMethod = ExcelUtil.setErrorMethod(this.getRwEntityClass());


        Field fkIdField = null;
        List<Field> fkFiedList = null;

        for(Map.Entry<Field , List<Field>> fkFields : fkMap.entrySet()){
            fkIdField = fkFields.getKey();
            fkFiedList = fkFields.getValue();
            break;
        }
        ReflectionUtil.makeAccessible(fkIdField);
        Column fkIdColumn = ColumnUtil.field2Column(fkIdField);

        for(M m : list) {
            String fkId = (String)ReflectionUtil.getField(fkIdField, m);
            if(StringUtils.isNotEmpty(fkId)){
                break;
            }

            Object[] keyObjs = buildKeyObject(m  , keyFieldNames);
            String key = buildKey(keyObjs);
            if(key == null){
                if(fkIdColumn.isRequired()) {
                    errorProcess(setErrorMethod, m, fkIdColumn.getName() + "信息填写不全");
                }
                continue;
            }

            Map<String, Object> fkClzMap = fkInfoMaps.get(fkClz);
            if(fkClzMap == null){
                fkClzMap = new HashMap<String,Object>();
                fkInfoMaps.put(fkClz , fkClzMap);
            }

            Object fkObj = fkClzMap.get(key);
            if(fkObj == null){
                QueryWrapper<M> queryWrapper = new QueryWrapper();
                int index = 0;
                for(String fieldName : keyFieldNames){
                    queryWrapper.eq(StringFormatKit.toUnderlineName(fieldName),keyObjs[index]);
                    index++;
                }
                fkObj = iService.getOne(queryWrapper);
                if(fkObj != null){
                    fkClzMap.put(key , fkObj);
                }else {
                    errorProcess(setErrorMethod, m, fkIdColumn.getName() + "信息填写错误");
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
                            Field field = fkClz.getField(StringFormatKit.toCamelCase(annotation.dbColumnName()));
                            Object temp = (PK)ReflectionUtil.getField(field , fkObj);
                            ReflectionUtil.setField(f, m, temp);
                        } catch (NoSuchFieldException e) {
                            logger.error(e.getMessage(),e);
                        }
                    }
                }
            }


        }



    }



    private Object[] buildKeyObject(M m , String[] keyFieldNames ){
        Object[] result = new Object[keyFieldNames.length];

        try{
            int index = 0;
            for(String keyFieldName : keyFieldNames){
                Field f = this.getRwEntityClass().getField(keyFieldName);
                ReflectionUtil.makeAccessible(f);
                Object obj = ReflectionUtil.getField(f , m);
                result[index] = obj;
                index ++;
            }
        }catch(Exception e){
            throw new RuntimeException("获取业务KEY信息错误");
        }
        return result;
    }

    private String buildKey(Object[] keyObjs ){
        if(keyObjs == null || keyObjs.length == 0){
            return null;
        }

        StringBuilder sb = new StringBuilder("");
        try{
            for(Object obj : keyObjs){
                if(obj == null){
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
     * 分析处理字典类属性
     * @param list
     * @param column
     * @param dictAnnotation
     * @param dictInfoMaps
     * @param dictFieldMap
     */
    protected void analysisDict(List<M> list,
                                Column column,
                                EntityAttrDictAnnotation dictAnnotation,
                                Map<String, ?> dictInfoMaps,
                                Map<String, Map<Field, Field>> dictFieldMap) {
        if(dictAnnotation.isValueField()){
            throw new RuntimeException(dictAnnotation.group()+" Excel设置错误");
        }
        Map<Field, Field>  dictMap = dictFieldMap.get(dictAnnotation.group());
        if(dictMap == null || dictMap.isEmpty()){
            throw new RuntimeException(dictAnnotation.group()+" 不是字典类型");
        }

        Method setErrorMethod = ExcelUtil.setErrorMethod(this.getRwEntityClass());

        Field dictValField = null;
        for(Map.Entry<Field , Field> dictField : dictMap.entrySet()){
            dictValField = dictField.getKey();
            break;
        }

        for(M m : list) {
            ReflectionUtil.makeAccessible(column.getField());
            String dictName = (String)ReflectionUtil.getField(column.getField(), m);
            if(StringUtils.isNotEmpty(dictName)) {
                Object dict = dictInfoMaps.get(dictAnnotation.dictType() + dictName);
                String val = this.getDictVal(dict);
                if(val != null){
                    ReflectionUtil.makeAccessible(dictValField);
                    try {
                        dictValField.set(m, val);
                    }catch(Exception e){
                        logger.error(e.getMessage(),e);
                    }
                }


                checkField(ColumnUtil.field2Column(dictValField), setErrorMethod, m, val);
            }
        }

    }

    /**
     * 分析处理属性数据普通
     * @param list
     * @param column
     */
    protected void analysisOther(List<M> list,Column column) {
       Method setErrorMethod = ExcelUtil.setErrorMethod(this.getRwEntityClass());
        ReflectionUtil.makeAccessible(column.getField());
        for(M m : list){
            Object obj = ReflectionUtil.getField(column.getField(),m);
            checkField(column, setErrorMethod, m, obj);

        }
    }

    private void checkField(Column column, Method setErrorMethod, M m, Object obj) {

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

    private void errorProcess(Method setErrorMethod, M m , String msg) {
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





    protected List<M> getExcelData(MultipartFile file,EnumExcelFileType excelFileType){


        List<M> list = new ArrayList<M>();

        int sheetIndex = 0;
        int rowIndex = 0;
        int cellIndex = 0;

        try {

            ExcelImport ei = null;

            int startRowNum = getExcelImportHeaderRowNum();

            if(excelFileType == EnumExcelFileType.HSSF || excelFileType == EnumExcelFileType.SXSSF || excelFileType == EnumExcelFileType.XSSF  ){
                ei = new DefaultExcelImport(file.getInputStream(),startRowNum,isAddNumberByImport());
            }else {
                throw new RuntimeException("请选择Excel文件(xls,xlsx)");
            }
            List<Column> columns = getImportColumns();
            List<List<Object[]>> excelData = readExcel(ei);
            if(excelData == null || excelData.isEmpty()){
                throw new RuntimeException("请先按照模板编写数据再导入");
            }
            for(;sheetIndex < excelData.size() ; sheetIndex++){
                List<Object[]> sheetData = excelData.get(sheetIndex);
                rowIndex = 0;
                for(Object[] rowData : sheetData) {
                    if(rowData != null && rowData.length > 0) {
                        M m = this.newRwModel();
                        ExcelUtil.row2Object(rowData, columns, m);
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
            e.setRowIndex(rowIndex+ 1 +getExcelImportHeaderRowNum());
            throw e;
        }catch(ExcelTypeMatchingException e){
            e.setSheetIndex(sheetIndex+1);
            //展示列数=实际列数+1
            cellIndex = e.getCellIndex()+1;
            if(isAddNumberByImport()){
                cellIndex ++ ;
            }
            e.setRowIndex(rowIndex +getExcelImportHeaderRowNum());
            e.setCellIndex(cellIndex);
            throw e;

        }catch(ExcelFormatException e){
            e.setSheetIndex(sheetIndex+1);
            //展示列数=实际列数+1
            cellIndex = e.getCellIndex()+1;
            if(isAddNumberByImport()){
                cellIndex ++ ;
            }
            e.setRowIndex(rowIndex +getExcelImportHeaderRowNum());
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

    protected boolean isAddNumberByImport(){
        return AppConfig.EXCEL_ADD_NUMBER;
    }

    protected int getExcelImportHeaderRowNum(){
        if(AppConfig.EXCEL_EXPORT_HEADER) {
            return 2;
        }else {
            return 1;
        }
    }

    /**
     * 读取Excel数据
     * @param ei
     * @return
     */
    protected List<List<Object[]>> readExcel(ExcelImport ei){
        List<List<Object[]>> result = null;
        if(AppConfig.EXCEL_IMPORT_ALLSHEET){
            List<List<Object[]>> list = ei.readExcelAllSheet();
            result = list;
        }else {
            result = new ArrayList<List<Object[]>>();
            result.add(ei.readExcel());
        }
        return result;
    }


    protected List<Column> getImportColumns(){
        return ColumnUtil.getExcelColumn(this.getRwEntityClass(), true);
    }


    /**
     * 获取所有的业务属性
     * @return
     */
    protected List<Field> getImportAllFields(){
        return ColumnUtil.getBusinessAllFields(this.getRwEntityClass(),BaseEntity.class);
    }





}
