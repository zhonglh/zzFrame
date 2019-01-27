package com.zz.bms.controller.base.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.zz.bms.core.db.base.service.BaseService;
import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.util.configs.AppConfig;
import com.zz.bms.util.configs.annotaions.EntityAnnotation;
import com.zz.bms.util.poi.BaseXlsExport;
import com.zz.bms.util.poi.ExcelExport;
import com.zz.bms.util.poi.excel.HssfExport;
import com.zz.bms.util.poi.excel.SxssfExport;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

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
        BaseXlsExport bxe = new BaseXlsExport();
        ExcelExport<M> aee = null;
        switch (excelType) {
            case "sxssf":
                aee = new SxssfExport(bxe);
                break;
            case "hssf":
                aee = new HssfExport(bxe);
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
        if(AppConfig.EXCEL_EXPORT_HEADER){
            header = 1;
        }

        //导出标题
        exportTitles(aee , header , topDate , AppConfig.EXCEL_ADD_NUMBER);

        //导出头信息
        exportHeader(aee);

        //导出内容
        exportContent(aee ,all , header+1 , AppConfig.EXCEL_ADD_NUMBER );

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
    protected void exportHeader(ExcelExport<M> aee ){
        if(AppConfig.EXCEL_EXPORT_HEADER){
            String headerInfo = getExcelHeaderInfo();
            List<String> headers = Arrays.asList(headerInfo);
            aee.exportHeaders(headers , getHeaderCellLength());
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
    protected String getExcelHeaderInfo(){

        EntityAnnotation ea = this.entityClass.getAnnotation(EntityAnnotation.class);
        if(ea != null){
            return ea.value();
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





}
