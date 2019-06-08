package com.zz.bms.system.controller;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring-context.xml",
        "classpath:spring-mybatis.xml",
        "classpath:spring-util-redis.xml"
})
public abstract class BaseTest extends AbstractTransactionalJUnit4SpringContextTests {

}

