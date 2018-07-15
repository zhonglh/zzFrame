package com.zz.bms.redis;

import com.alibaba.druid.pool.DruidDataSource;
import com.zz.bms.redis.utils.RedisUtil;
import com.zz.bms.util.base.spring.SpringUtil;
import org.junit.Assert;
import org.junit.Test;

public class RedisTest extends BaseTest {


    @Test
    public void testSpringStart() {
        DruidDataSource ds = (DruidDataSource) SpringUtil.getBean("dataSource");
        Assert.assertNotNull(ds);
    }


    @Test
    public void testRedisConfig() {
        String key = "zz";
        String val = "i love you";
        try {
            RedisUtil.setString(key , val);
            String redisVal = RedisUtil.getString(key);
            Assert.assertEquals(val ,redisVal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
