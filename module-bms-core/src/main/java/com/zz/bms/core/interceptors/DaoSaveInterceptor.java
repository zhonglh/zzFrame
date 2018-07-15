package com.zz.bms.core.interceptors;

/**
 * 保存数据拦截器
 */
//@Component
//@Aspect
@Deprecated
public class DaoSaveInterceptor {
/*

    Logger logger = Logger.getLogger(DaoSaveInterceptor.class);


    @Around("execution(* com..*Dao*.save*(..))")
    public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {

        //todo 此处没有处理多个参数和 集合的情况

        Object[] objs = joinPoint.getArgs();
        if(objs == null || objs.length > 1) {
            return joinPoint.proceed(joinPoint.getArgs());
        }

        Object arg = objs[0];
        if(arg == null){
            return joinPoint.proceed(joinPoint.getArgs());
        }

        Field[] fs = ReflectionSuper.getAllField(arg.getClass());

        for(Field f : fs){
            if (f.isAnnotationPresent(EntityAttrDBAnnotation.class)) {
                f.setAccessible(true);
                EntityAttrAnnotation annotation = f.getAnnotation(EntityAttrAnnotation.class);
                Object fobj = f.get(arg);
                if(annotation.notNull()){
                    if(fobj == null || (fobj instanceof String && ((String) fobj).trim().isEmpty())){
                        //todo 此处有中文
                        throw new BizException(1000,"请先输入"+annotation.attrName());
                    }
                }

                if(annotation.attrLength() > 0){
                    if(fobj != null && fobj instanceof String){
                        if(((String) fobj).length() > annotation.attrLength()) {
                            throw new BizException(1001, annotation.attrName() + "数据过长！");
                        }
                    }
                }
            }
        }

        return joinPoint.proceed(joinPoint.getArgs());


    }
*/


}
