package com.zz.bms.util.base.spring;

import javax.servlet.http.HttpServletRequest;

public class ThreadLocalRequestHolder {

    private static final ThreadLocal<HttpServletRequest> requests =
    		new ThreadLocal<HttpServletRequest>() {

                    public HttpServletRequest initialValue(){
                        return null;
                    }
        	};

    public static HttpServletRequest getRequests() {
        return requests.get();
    }
    public static void setRequests(HttpServletRequest request) {
        requests.set(request);
    }
}
