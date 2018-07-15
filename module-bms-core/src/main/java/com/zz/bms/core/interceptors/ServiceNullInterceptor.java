package com.zz.bms.core.interceptors;


import com.zz.bms.core.enums.EnumErrorMsg;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * DAO findById 拦截
 */
@Component
@Aspect
public class ServiceNullInterceptor {



    Logger logger = Logger.getLogger(ServiceNullInterceptor.class);


    @Around("execution(* com..*Service*.findById(..))")
    public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {

        Object result = joinPoint.proceed(joinPoint.getArgs());
        if(result == null) {
            throw EnumErrorMsg.no_auth.toException();
        }else{
            return result;
        }

    }

}
