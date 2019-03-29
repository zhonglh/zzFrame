package com.zz.bms.enums;

import com.zz.bms.core.enums.EnumBase;

/**
 * 树的节点状态
 * @author zhonglh
 */

public enum EnumTreeState {

    OPEN("open"),
    CLOSE("closed");


    EnumTreeState(String theValue) {
        this.theValue = theValue;
    }

    String theValue ;


    public String getTheValue() {
        return theValue;
    }

}
