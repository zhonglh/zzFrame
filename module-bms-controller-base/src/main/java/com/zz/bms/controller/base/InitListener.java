package com.zz.bms.controller.base;

import com.zz.bms.core.Constant;
import com.zz.bms.core.IModuleAutoRun;
import org.apache.log4j.Logger;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;
import java.util.Map;

/**
 *
 * @author Administrator
 */
public class InitListener implements javax.servlet.ServletContextListener {

    Logger logger = Logger.getLogger(getClass());

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        Constant.servletRealPath = sce.getServletContext().getRealPath("/");
        sce.getServletContext().setAttribute("startServerTime" , System.currentTimeMillis());

        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext());
        Map<String, IModuleAutoRun> map = webApplicationContext.getBeansOfType(IModuleAutoRun.class);

        if(map != null && !map.isEmpty()){
            for(Map.Entry<String, IModuleAutoRun> entry : map.entrySet()){
                try{
                    entry.getValue().initiallzed(sce);
                }catch(Exception e){
                    logger.error(e.getMessage(),e);
                }
            }
        }

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
