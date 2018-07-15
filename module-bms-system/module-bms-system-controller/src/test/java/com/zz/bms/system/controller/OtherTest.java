package com.zz.bms.system.controller;

import com.zz.bms.core.vo.AjaxJson;
import org.aspectj.weaver.loadtime.Aj;
import org.junit.Test;

public class OtherTest {

    @Test
    public void testOther(){
        AjaxJson aj = AjaxJson.fail("aaa");
        System.out.println(aj.getCode());
        System.out.println(aj.isSuccess());
        System.out.println(aj.getMsg());
    }
}
