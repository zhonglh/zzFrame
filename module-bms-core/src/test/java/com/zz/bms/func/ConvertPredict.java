package com.zz.bms.func;



@FunctionalInterface
public interface ConvertPredict<T,V> {

    public void convert(T t,V v);
}
