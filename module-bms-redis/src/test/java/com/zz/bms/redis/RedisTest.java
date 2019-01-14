package com.zz.bms.redis;

import com.alibaba.druid.pool.DruidDataSource;
import com.zz.bms.util.redis.RedisUtil;
import com.zz.bms.util.spring.SpringUtil;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

public class RedisTest extends BaseTest {


    @Resource(name="redisUtils")
    private RedisUtil redisUtil ;

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
            redisUtil.setString(key , val);
            String redisVal = redisUtil.getString(key);
            Assert.assertEquals(val ,redisVal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
