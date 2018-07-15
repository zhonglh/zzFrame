package com.zz.bms.redis;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

@ContextConfiguration(locations = {
        "classpath:spring-context.xml",
        "classpath:spring-mybatis.xml",
        "classpath:spring-redis.xml"
})
public abstract class BaseTest extends AbstractTransactionalJUnit4SpringContextTests {

}
