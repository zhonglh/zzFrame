package com.zz.bms.core.db.mybatis;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 自定义填充处理器
 * @author Administrator
 */
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("ctime", new Date(), metaObject);
        this.setFieldValByName("createDate", new Timestamp(System.currentTimeMillis()), metaObject);
        this.setFieldValByName("createTime", new Timestamp(System.currentTimeMillis()), metaObject);
    }

    @Override
    public boolean openUpdateFill() {
        return false;
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        // 关闭更新填充、这里不执行
    }
}
