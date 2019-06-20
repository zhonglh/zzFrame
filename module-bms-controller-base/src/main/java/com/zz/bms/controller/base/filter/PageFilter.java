package com.zz.bms.controller.base.filter;

import com.zz.bms.util.web.PaginationContext;
import org.apache.commons.lang.StringUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 */
@WebFilter(filterName = "pageFilter",urlPatterns = "/*")
public class PageFilter implements Filter {



    protected Map<String, Cookie> ReadCookieMap(HttpServletRequest request){
        Map<String, Cookie> cookieMap = new HashMap<String, Cookie>();
        Cookie[] cookies = request.getCookies ();
        if (null != cookies) {
            for ( Cookie cookie : cookies ) {
                cookieMap.put (cookie.getName (), cookie);
            }
        }
        return cookieMap;
    }

    /**
     * 根据名字获取cookie
     *
     * @param request
     * @param name      cookie名字
     * @return
     */
    protected Cookie getCookieByName(HttpServletRequest request, String name){
        Map<String, Cookie> cookieMap = ReadCookieMap (request);
        if (cookieMap.containsKey (name)) {
            Cookie cookie = (Cookie) cookieMap.get (name);
            return cookie;
        } else {
            return null;
        }
    }


    protected  String getCookieVal(Cookie cookie){
        if(cookie==null) {
            return "";
        }else {
            String val = cookie.getValue();

            try {
                val = URLDecoder.decode(val,"UTF-8");
            } catch (Exception e) {
            }
            return val;

        }
    }



    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        if(request instanceof HttpServletRequest){

            String theme = null;
            try {
                Cookie cookie = getCookieByName((HttpServletRequest) request, "theme");
                theme = getCookieVal(cookie);
            }catch(Exception e){

            }
            if(theme == null || theme.isEmpty()){
                theme = "default";
            }
            request.setAttribute("theme" , theme);

            String uri = ((HttpServletRequest) request).getRequestURI() ;
            if(!uri.endsWith("list") && !uri.endsWith("List") ){
                chain.doFilter(request, response);
            }else {
                HttpServletRequest httpRequest = (HttpServletRequest) request;

                PaginationContext.setPageNum(getPageNum(httpRequest));
                PaginationContext.setPageSize(getPageSize(httpRequest));

                try {
                    chain.doFilter(request, response);
                }
                finally {
                    PaginationContext.removePageNum();
                    PaginationContext.removePageSize();
                }
            }
        }

    }


    /**
     * 获得pager.offset参数的值
     *
     * @param request
     * @return
     */
    protected int getPageNum(HttpServletRequest request) {
        int pageNum = 1;
        try {
            String pageNums = request.getParameter("page");
            if (pageNums != null && StringUtils.isNumeric(pageNums)) {
                pageNum = Integer.parseInt(pageNums);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return pageNum;
    }

    /**
     * 设置默认每页大小
     *
     * @return
     */
    protected int getPageSize(HttpServletRequest request) {
        int pageSize = 20;    // 默认每页20条记录
        try {
            String pageSizes = request.getParameter("rows");
            if (pageSizes != null && StringUtils.isNumeric(pageSizes)) {
                pageSize = Integer.parseInt(pageSizes);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        return pageSize;
    }




    @Override
    public void init(FilterConfig fConfig) throws ServletException {}


    @Override
    public void destroy() {

    }

}