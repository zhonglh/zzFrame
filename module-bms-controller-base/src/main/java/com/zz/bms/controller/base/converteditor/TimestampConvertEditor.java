package com.zz.bms.controller.base.converteditor;

import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Administrator
 */
public class TimestampConvertEditor extends PropertyEditorSupport {
	
	private SimpleDateFormat datetimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	

	private SimpleDateFormat datetimeFormat1 = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	private SimpleDateFormat dateFormat1 = new SimpleDateFormat("MM/dd/yyyy");
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if (StringUtils.hasText(text)) {
			try {
				if (text.indexOf(":") == -1 && text.length() <= 10) {
					setValue(new Timestamp(this.dateFormat.parse(text).getTime()));
				} else if (text.indexOf(":") > 0 && text.length() <= 19) {
					setValue(new Timestamp(this.datetimeFormat.parse(text).getTime()));
				} else if (text.indexOf(":") > 0 && text.length() > 19) {
					text = text.substring(0,19);
					setValue(new Timestamp(this.datetimeFormat.parse(text).getTime()));
				} else {
					throw new IllegalArgumentException(
							"Could not parse date, date format is error ");
				}
			} catch (Exception ex) {
				try{

					if (text.indexOf(":") == -1 && text.length() <= 10) {
						setValue(new Timestamp(this.dateFormat1.parse(text).getTime()));
						return ;
					} else if (text.indexOf(":") > 0 && text.length() <= 19) {
						setValue(new Timestamp(this.datetimeFormat1.parse(text).getTime()));
						return ;
					} else if (text.indexOf(":") > 0 && text.length() > 19) {
						text = text.substring(0,19);
						setValue(new Timestamp(this.datetimeFormat1.parse(text).getTime()));
						return ;
					}
				} catch (ParseException ex1) {
					
				}
				
				IllegalArgumentException iae = new IllegalArgumentException("Could not parse date: " + ex.getMessage());
				iae.initCause(ex);
				throw iae;
			}
		} else {
			setValue(null);
		}
	}

}
