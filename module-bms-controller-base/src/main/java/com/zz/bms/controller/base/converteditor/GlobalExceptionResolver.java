package com.zz.bms.controller.base.converteditor;

import com.alibaba.fastjson.JSON;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.core.vo.AjaxJson;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Administrator
 */
@Component
public class GlobalExceptionResolver implements HandlerExceptionResolver {


    Logger logger = Logger.getLogger(GlobalExceptionResolver.class);

    public static boolean isAjax(HttpServletRequest request) {
        if (request != null
                && "XMLHttpRequest".equalsIgnoreCase(request
                .getHeader("X-Requested-With"))) {
            return true;
        }
        return false;
    }

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) {
        logger.error(e);
        boolean isajax = isAjax(request);
        if(!isajax){
            if( o != null && o instanceof HandlerMethod){
                Method m = ((HandlerMethod)o).getMethod();
                if(m.isAnnotationPresent(ResponseBody.class)){
                    isajax = true;
                }
            }
        }
        if(isajax) {
            return processAjax(request,response,o,e);
        } else {
            return processNotAjax(request,response,o,e);
        }
    }

    private ModelAndView processNotAjax(HttpServletRequest request,
                                        HttpServletResponse response,
                                        Object handler,
                                        Exception e){
        Map<String, Object> model = new HashMap<String, Object>();
        String msg =  null;
        if(e instanceof BizException){
            msg = (((BizException)e).getMsg());
            model.put("exceptionMessage", msg);
            model.put("e", e);
            return new ModelAndView("common/error", model);


        }else {
            if(e.getMessage() != null && e.getMessage().indexOf("index")!=-1){
                msg = "数据重复， 请修改后重试！";
            }else {
                msg = "内部错误，请联系管理员！";
            }
            model.put("exceptionMessage", msg);
            model.put("e", e);
            return new ModelAndView("common/error", model);
        }
    }

    private ModelAndView processAjax(HttpServletRequest request,
                                     HttpServletResponse response,
                                     Object handler,
                                     Exception e){
        ModelAndView empty = new ModelAndView();
        response.setHeader("Cache-Control", "no-store");
        AjaxJson json = new AjaxJson();
        json.setSuccess(false);
        if(e instanceof BizException){
            json.setMsg(((BizException)e).getMsg());
        }else {
            if(e.getMessage() != null && e.getMessage().indexOf("index")!=-1){
                json.setMsg( "数据重复， 请修改后重试！" );
            }else {

                json.setMsg("内部错误，请联系管理员");
            }
        }
        try {
            writeResJson(response,json);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        empty.clear();
        return null;
    }



    protected void writeResJson(HttpServletResponse res,Object obj){
        res.setContentType ("application/json; charset=utf-8");
        res.setCharacterEncoding ("utf-8");
        PrintWriter pw = null;
        try {
            pw = res.getWriter ();
            if (obj instanceof String) {
                pw.write (obj.toString ());
            } else {
                String str = JSON.toJSONString(obj);

                pw.write (str);
            }
        } catch (IOException e) {
        } finally {
            if (pw != null) {
                pw.flush ();
                pw.close ();
            }
        }
    }

}
