package com.zz.bms.core;

import com.alibaba.druid.pool.DruidDataSource;
import com.zz.bms.core.generics.AnnotaionEntity;
import com.zz.bms.core.generics.AnnotaionEntityManager;
import com.zz.bms.util.base.spring.SpringUtil;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SpringTest extends BaseTest {

    @Autowired
    private AnnotaionEntityManager aem;


    @Test
    public void testSpringStart() {
        DruidDataSource ds = (DruidDataSource) SpringUtil.getBean("dataSource");
        Assert.assertNotNull(ds);
    }


    @Test
    public void testEntityAttr1Annotaion() {
        List<AnnotaionEntity> annotaionEntities = aem.takeAnnotaions(TestEntity.class);
        Assert.assertNotNull(annotaionEntities);
        Assert.assertEquals(annotaionEntities.size() , 3);

    }


    @Test
    public void testEntityAttr2Annotaion() {
        List<AnnotaionEntity> annotaionEntities = aem.takeAnnotaions(TestExEntity.class);
        Assert.assertNotNull(annotaionEntities);
        Assert.assertEquals(annotaionEntities.size() , 4);

    }

}
