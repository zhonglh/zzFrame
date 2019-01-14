package com.zz.bms.controller.base.converteditor;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

import java.sql.Timestamp;
import java.util.Date;

public class MyWebBinding implements WebBindingInitializer {

	@Override
	public void initBinder(WebDataBinder binder) {


		binder.registerCustomEditor(Date.class, new DateConvertEditor());
		binder.registerCustomEditor(Timestamp.class, new DateConvertEditor());
		binder.registerCustomEditor(java.math.BigDecimal.class, new BigDecimalConvertEditor());
	}


}
