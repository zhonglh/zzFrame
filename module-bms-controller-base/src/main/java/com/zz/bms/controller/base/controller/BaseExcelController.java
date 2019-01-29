package com.zz.bms.controller.base.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.zz.bms.core.db.base.service.BaseService;
import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.core.vo.AjaxJson;
import com.zz.bms.util.configs.AppConfig;
import com.zz.bms.util.configs.annotaions.EntityAnnotation;
import com.zz.bms.util.file.FileKit;
import com.zz.bms.util.poi.enums.EnumExcelFileType;
import com.zz.bms.util.poi.exceptions.ExcelAbsenceException;
import com.zz.bms.util.poi.exceptions.ExcelFormatException;
import com.zz.bms.util.poi.exceptions.ExcelTypeMatchingException;
import com.zz.bms.util.poi.export.BaseXlsExport;
import com.zz.bms.util.poi.export.ExcelExport;
import com.zz.bms.util.poi.export.excel.HssfExport;
import com.zz.bms.util.poi.export.excel.SxssfExport;
import com.zz.bms.util.poi.imports.DefaultExcelImport;
import com.zz.bms.util.poi.imports.ExcelImport;
import com.zz.bms.util.poi.util.ColumnUtil;
import com.zz.bms.util.poi.util.ExcelUtil;
import com.zz.bms.util.poi.vo.Column;
import com.zz.bms.util.spring.ReflectionUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
public abstract class BaseExcelController<M extends BaseEntity<PK>, PK extends Serializable, Q extends Query> extends BusinessController<M,PK,Q> {


    @Autowired
    protected BaseService<M, PK> baseService;


    public BaseExcelController(){
        super();
    }

    @RequestMapping(value = "/{excelType}/export", method = RequestMethod.GET)
    protected void export(@PathVariable("excelType") String excelType, M m , Q query, HttpServletRequest request, HttpServletResponse response) {

        if(StringUtils.isEmpty(excelType)){
            throw EnumErrorMsg.code_error.toException();
        }

        excelType = excelType.toLowerCase();
        BaseXlsExport<M> bxe = new BaseXlsExport<M>();
        bxe.setEntityClz(this.getEntityClass());

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
        Wrapper<M> wrapper = buildWrapper(query , m);
        List<M> all =  baseService.list(wrapper);

        M topDate = null;
        if(all != null && !all.isEmpty()){
            topDate = all.get(0);
        }else {
            topDate  = newModel();
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
        exportContent(aee ,all , header+1 , isAddNumberByExport() );

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
            EntityAnnotation ea = this.entityClass.getAnnotation(EntityAnnotation.class);
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
    @RequestMapping(params = "method=doExcel")
    @ResponseBody
    public AjaxJson doExcel(MultipartFile file, HttpServletResponse res, HttpServletRequest request) throws InvocationTargetException, IllegalAccessException {

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

        Method setErrorMethod = ExcelUtil.setErrorMethod(this.entityClass);
        Method getErrorMethod = ExcelUtil.getErrorMethod(this.entityClass);



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
                this.insertInfo(m , sessionUserVO);
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
            request.getSession().setAttribute(this.entityClass.getName(), list);
            return AjaxJson.fail("导入的信息中有些问题");
        }

    }

    protected void analysis(List<M> list) {

        List<Field> fs = getAllFields() ;

        List<Column> columns = getImportColumns();


        //用到的字典集合
        Map<String,?> dictMaps = null;

        //用到的外键集合, String:外键类名称  String:外键的BusinessKey  ?: 外键对象
        Map<String,Map<String,?>> fkMaps= new HashMap<String,Map<String,?>>();



        dictMaps = getDictMaps(ColumnUtil.getDictTypeCodes(fs));

    }

    /**
     * 获取所有用到的字典信息
     * todo 在 System 模块中重载
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



    protected List<M> getExcelData(MultipartFile file,EnumExcelFileType excelFileType){


        List<M> list = null;

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
                        M m = this.newModel();
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
        return ColumnUtil.getExcelColumn(this.entityClass, true);
    }


    /**
     * 获取所有的业务属性
     * @return
     */
    protected List<Field> getAllFields(){
        return ColumnUtil.getBusinessAllFields(this.entityClass,BaseEntity.class);
    }





}
