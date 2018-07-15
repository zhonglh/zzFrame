package com.zz.bms.controller.base.intercepts;


import com.zz.bms.configs.AppConfig;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

/**
 * 租户ID处理
 * @author Administrator
 */
@Aspect
@Order(1)
public class TenantIntercept {


    Logger logger = Logger.getLogger(TenantIntercept.class);


    @Around("execution(* com..*Service*.*(..))")
    public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {

        Object[] args = joinPoint.getArgs();
        if(AppConfig.USE_TENANT) {
            //todo 此处给所有的对象自动加入租户ID
            //args
        }
        return joinPoint.proceed(args);
    }


}
