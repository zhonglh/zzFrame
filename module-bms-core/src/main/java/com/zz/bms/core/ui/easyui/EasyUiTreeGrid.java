package com.zz.bms.core.ui.easyui;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhonglh
 */
public class EasyUiTreeGrid extends EasyUiDataGrid implements Serializable {


    //页脚
    private List footer;


    public EasyUiTreeGrid() {
        super(0, new ArrayList());
    }

    public EasyUiTreeGrid(long total, List rows) {
        super(total, rows);
    }

    public EasyUiTreeGrid(long total, List rows , List footer) {
        super(total, rows);
        this.footer = footer;
    }

    public List getFooter() {
        return footer;
    }

    public void setFooter(List footer) {
        this.footer = footer;
    }
}
