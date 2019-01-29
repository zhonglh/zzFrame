package com.zz.bms.system.base;

import com.zz.bms.system.bo.VsUserBO;
import com.zz.bms.system.service.VsUserService;
import com.zz.bms.util.configs.AppConfig;
import com.zz.bms.util.poi.cell.CellOperation;
import com.zz.bms.util.poi.export.BaseXlsExport;
import com.zz.bms.util.poi.export.ExcelExport;
import com.zz.bms.util.poi.export.excel.HssfExport;
import com.zz.bms.util.poi.export.excel.SxssfExport;
import com.zz.bms.util.poi.export.excel.XssfExport;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExcelTest extends BaseTest {


    @Autowired
    private VsUserService vsUserService;


    boolean isAddNumber = true;
    List<VsUserBO> list = null;

    @Before
    public void setup(){
        list = vsUserService.list();
        //AppConfig.EXCEL_OPERATION_MODEL = CellOperation.OPERATION_MODEL_STRING ;
    }

    @Test
    public void textSxssfExcel(){
        BaseXlsExport<VsUserBO> bxe = new BaseXlsExport<VsUserBO>();
        ExcelExport<VsUserBO> ee = new SxssfExport<VsUserBO>(bxe);


        VsUserBO vsUserBO = new VsUserBO();
        ee.exportTitles(2 , vsUserBO , false);
        ee.exportHeaders(Arrays.asList("华路时代" , "定义时尚"));
        ee.exportContent(list, 2+ 1 , null , false );
        ee.exportXls("c:\\zlhSxssf.xlsx");
    }


    @Test
    public void textXssfExcel(){

        BaseXlsExport<VsUserBO> bxe = new BaseXlsExport<VsUserBO>();
        ExcelExport<VsUserBO> ee = new XssfExport<VsUserBO>(bxe);
        VsUserBO vsUserBO = new VsUserBO();
        ee.exportTitles(2 , vsUserBO , isAddNumber);
        ee.exportHeaders(Arrays.asList("华路时代" , "定义时尚"));
        ee.exportContent(list, 2+ 1 , null , isAddNumber );
        ee.exportXls("c:\\zlhXssf.xlsx");
    }



    @Test
    public void textHssfExcel(){

        BaseXlsExport<VsUserBO> bxe = new BaseXlsExport<VsUserBO>();
        ExcelExport<VsUserBO> ee = new HssfExport<VsUserBO>(bxe);

        VsUserBO vsUserBO = new VsUserBO();
        ee.exportTitles(2 , vsUserBO , false);
        ee.exportHeaders(Arrays.asList("华路时代" , "定义时尚"));
        ee.exportContent(list, 2+ 1 , null , false );
        ee.exportXls("c:\\zlhHssf.xls");
    }
}
