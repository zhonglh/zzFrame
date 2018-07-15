package com.zz.bms.util.base.servlet;

import javax.servlet.http.HttpServletRequest;

public class RequestHeader {


    public static boolean isWx(HttpServletRequest req){


        String userAgent = req.getHeader("user-agent").toLowerCase();
        if(userAgent.indexOf("micromessenger")>-1){
            //微信客户端
            return true;
        }else{
            return false;
        }

    }
}
