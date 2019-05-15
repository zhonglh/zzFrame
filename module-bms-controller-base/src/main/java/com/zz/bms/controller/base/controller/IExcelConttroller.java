package com.zz.bms.controller.base.controller;

import com.zz.bms.util.poi.enums.EnumExcelFileType;
import com.zz.bms.util.poi.imports.ExcelImport;
import com.zz.bms.util.poi.vo.Column;
import org.springframework.web.multipart.MultipartFile;

import java.lang.reflect.Field;
import java.util.List;

public interface IExcelConttroller {


    public <QueryModel> List<QueryModel> getExcelData(MultipartFile file, EnumExcelFileType excelFileType) ;


    public List<List<Object[]>> readExcel(ExcelImport ei) ;


    public int getExcelImportHeaderRowNum() ;


    public List<Column> getImportColumns() ;


    public List<Field> getImportAllFields() ;


    public void setDictNames() ;

    public boolean isAddNumberByImport() ;




}
