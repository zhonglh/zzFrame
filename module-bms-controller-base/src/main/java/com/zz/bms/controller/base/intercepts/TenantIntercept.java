package com.zz.bms.controller.base.intercepts;


import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.shiro.utils.ShiroUtils;
import com.zz.bms.util.configs.BusinessConfig;
import com.zz.bms.util.configs.annotaions.EntityAnnotation;
import javafx.print.Collation;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;

/**
 * 租户ID处理
 * @author Administrator
 */
@Aspect
@Order(1)
public class TenantIntercept {


    Logger logger = Logger.getLogger(TenantIntercept.class);

    public TenantIntercept(){
        System.out.println("....TenantIntercept.......");
    }


    @Around("execution(* com..*Service*.*(..))")
    public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {

        Object[] args = joinPoint.getArgs();

        if(BusinessConfig.USE_TENANT && BusinessConfig.IS_CHECK_Tenant) {

            ILoginUserEntity loginUser = ((ILoginUserEntity)ShiroUtils.getUserEntity());

            if(loginUser != null) {

                for (Object arg : args) {


                    if (arg == null) {
                        continue;
                    }else if (arg instanceof BaseEntity) {
                        EntityAnnotation ea = arg.getClass().getAnnotation(EntityAnnotation.class);
                        if(ea == null){
                            ea = arg.getClass().getSuperclass().getAnnotation(EntityAnnotation.class);
                        }
                        if(ea != null && ea.haveTenant()) {
                            Serializable tenantId = loginUser.getTenantId();
                            BaseEntity be = (BaseEntity) arg;
                            if (EntityUtil.isEmpty(be.getTenantId())) {
                                be.setTenantId(tenantId);
                            }
                        }
                    }else if (arg instanceof Collation || arg.getClass().isArray()) {
                        Collection cs = null;
                        if(arg.getClass().isArray()){
                            cs = Arrays.asList(arg);
                        }else {
                            cs =  (Collection)arg;
                        }
                        if(cs != null && !cs.isEmpty()) {
                            Serializable tenantId = loginUser.getTenantId();
                            Object first = cs.toArray()[0];
                            if(first != null && first instanceof BaseEntity) {
                                EntityAnnotation ea = first.getClass().getAnnotation(EntityAnnotation.class);
                                if(ea == null){
                                    ea = first.getClass().getSuperclass().getAnnotation(EntityAnnotation.class);
                                }
                                if (ea != null && ea.haveTenant()) {
                                    for (Object obj : cs) {
                                        BaseEntity be = (BaseEntity) obj;
                                        if (be != null && EntityUtil.isEmpty(be.getTenantId())) {
                                            be.setTenantId(tenantId);
                                        }
                                    }
                                }
                            }
                        }

                    } else {
                        continue;
                    }
                }


            }

        }

        return joinPoint.proceed(args);
    }


}
