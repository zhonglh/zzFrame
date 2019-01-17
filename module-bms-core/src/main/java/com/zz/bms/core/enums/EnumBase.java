package com.zz.bms.core.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

/**
 * @author Administrator
 */
public interface EnumBase<T extends Serializable> extends IEnum<T>{

    /**
     * 获取值
     * @return
     */
    T getVal();

    /**
     * 获取名称
     * @return
     */
    T getLabel();



}
