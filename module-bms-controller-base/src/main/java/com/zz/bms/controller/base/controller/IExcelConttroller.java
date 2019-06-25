package com.zz.bms.controller.base.controller;

import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.util.configs.annotaions.EntityAttrDictAnnotation;
import com.zz.bms.util.configs.annotaions.EntityAttrFkAnnotation;
import com.zz.bms.util.poi.enums.EnumExcelFileType;
import com.zz.bms.util.poi.export.ExcelExport;
import com.zz.bms.util.poi.imports.ExcelImport;
import com.zz.bms.util.poi.vo.Column;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

public interface IExcelConttroller<RwModel extends BaseEntity<PK>,
        QueryModel extends RwModel,
        PK extends Serializable>
        extends ICURDController<RwModel , QueryModel , PK> {










    public String[] getExcelHeaderInfo() ;


    public void exportTitles(ExcelExport<QueryModel> aee , int header, QueryModel m, boolean isAddNumber);


    public boolean isAddNumberByExport() ;


    public void exportHeader(ExcelExport<QueryModel> aee , String[] headerInfo );

    public void exportContent(ExcelExport<QueryModel> aee ,List<QueryModel> contents, int rowIndex, boolean isAddNumber) ;

    public void exportXls(ExcelExport<QueryModel> aee , HttpServletResponse response) throws RuntimeException ;










    public void customExcelInsert(QueryModel m, ILoginUserEntity<PK> sessionUserVO, int index);


    /**
     * 解析数据
     * @param list
     */
    public void analysis(List<QueryModel> list)  ;


    /**
     * 分析外键列
     * @param list
     * @param column
     * @param fkAnnotation
     * @param fkKeyInfoMaps
     * @param fkNameInfoMaps
     * @param fkErrorKeyInfoMaps
     * @param fkErrorNameInfoMaps
     * @param fkFieldMap
     */
    public void analysisFk(List<QueryModel> list,
                           Column column,
                           EntityAttrFkAnnotation fkAnnotation,
                           Map<Class, Map<String, Object>> fkKeyInfoMaps,
                           Map<Class, Map<String, Object>> fkNameInfoMaps,
                           Map<Class, Map<String, Object>> fkErrorKeyInfoMaps,
                           Map<Class, Map<String, Object>> fkErrorNameInfoMaps,
                           Map<String, Map<Field, List<Field>>> fkFieldMap) ;

    /**
     * 分析字典列
     * @param list
     * @param column
     * @param dictAnnotation
     * @param dictInfoMaps
     * @param dictFieldMap
     */
    public void analysisDict(List<QueryModel> list,
                             Column column,
                             EntityAttrDictAnnotation dictAnnotation,
                             Map<String, ?> dictInfoMaps,
                             Map<String, Map<Field, Field>> dictFieldMap) ;


    /**
     * 分析非外键非字典列
     * @param list
     * @param column
     */
    public void analysisOther(List<QueryModel> list,Column column) ;


    /**
     * 自定义分析
     * @param list
     * @param columns
     */
    public void customAnalysis(List<QueryModel> list,List<Column> columns) ;




    /**
     * 检查外键对象是否有效
     * @param be
     */
    public void checkEntity(BaseEntity be) ;




    public <QueryModel> List<QueryModel> getExcelData(MultipartFile file, EnumExcelFileType excelFileType) ;


    public List<List<Object[]>> readExcel(ExcelImport ei) ;


    public int getExcelImportHeaderRowNum() ;


    public List<Column> getImportColumns() ;


    public List<Field> getImportAllFields() ;


    public void setDictNames() ;

    public boolean isAddNumberByImport() ;




}
