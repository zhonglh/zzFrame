package com.zz.bms.controller.base.converteditor;

import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;
import java.math.BigDecimal;

/**
 *
 * @author Administrator
 */
public class BigDecimalConvertEditor extends PropertyEditorSupport{


    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (StringUtils.hasText(text)) {
            setValue(new BigDecimal(text));
        }
    }
}
