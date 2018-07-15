package com.zz.bms.core.interceptors;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by Administrator on 2017/5/2.
 */

//@Component
@Aspect
public class TimerInterceptor{

    Logger logger = Logger.getLogger(TimerInterceptor.class);


    @Around("execution(* com..*Controller.*(..))")
    public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        String method = joinPoint.getSignature().toString();

        Object result = joinPoint.proceed(joinPoint.getArgs());

        long end = System.currentTimeMillis();
        long use = end - start;
        if(use > 500) {
            logger.info("\r\n use time:" + method + " Used:" + use);
        }
        return result;
        
    }
    
}
