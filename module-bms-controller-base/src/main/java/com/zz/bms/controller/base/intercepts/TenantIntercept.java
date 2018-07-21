package com.zz.bms.controller.base.intercepts;


import com.baomidou.mybatisplus.mapper.Wrapper;
import com.zz.bms.configs.AppConfig;
import com.zz.bms.configs.BusinessConfig;
import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.shiro.utils.ShiroUtils;
import com.zz.bms.system.base.entity.TsUserEntity;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.util.ReflectionUtils;

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
                        //问题和 Wrapper 的情况一样， 不知道要不要给 tenantId 加上值
                        Serializable tenantId = loginUser.getTenantId();
                        ((BaseEntity) arg).setTenantId(tenantId);
                    } else if (arg instanceof Wrapper) {
                        //todo 加上 租户的查询
                        // 有的类在使用租户的情况下还是没有 tenant_id , 可能要想办法到 mapper 文件中去取信息
                    } else {
                        continue;
                    }
                }


            }

        }

        return joinPoint.proceed(args);
    }


}
