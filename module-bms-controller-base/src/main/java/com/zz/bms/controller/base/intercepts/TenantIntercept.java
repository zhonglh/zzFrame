package com.zz.bms.controller.base.intercepts;


import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.shiro.utils.ShiroUtils;
import com.zz.bms.util.configs.BusinessConfig;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import java.io.Serializable;

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

        if(BusinessConfig.USE_TENANT ) {

            ILoginUserEntity loginUser = ((ILoginUserEntity)ShiroUtils.getUserEntity());

            if(loginUser != null) {

                for (Object arg : args) {


                    if (arg == null) {
                        continue;
                    } else if (arg instanceof BaseEntity) {
                        //todo
                        //问题和 Wrapper 的情况一样， 不知道要不要给 tenantId 加上值
                        Serializable tenantId = loginUser.getTenantId();
                        ((BaseEntity) arg).setTenantId(tenantId);
                    } else {
                        continue;
                    }
                }


            }

        }

        return joinPoint.proceed(args);
    }


}
