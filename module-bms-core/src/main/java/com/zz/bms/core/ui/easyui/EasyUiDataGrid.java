package com.zz.bms.core.ui.easyui;

import java.io.Serializable;
import java.util.List;

/**
 * easyui 的表格数据对象
 * @author Administrator
 */
public class EasyUiDataGrid implements Serializable {


    //总记录数
    private long total ;

    //显示的记录
    private List rows;


    public EasyUiDataGrid(long total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
