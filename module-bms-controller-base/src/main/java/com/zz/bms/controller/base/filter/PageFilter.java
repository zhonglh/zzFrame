package com.zz.bms.controller.base.filter;

import com.zz.bms.util.web.PaginationContext;
import org.apache.commons.lang.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author Administrator
 */
public class PageFilter implements Filter {
    public PageFilter() {}


    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        if(request instanceof HttpServletRequest){
            String uri = ((HttpServletRequest) request).getRequestURI() ;
            if(!uri.endsWith("list") && !uri.endsWith("searchList")){
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