package com.zz.bms.system.base;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zz.bms.system.domain.VsUserEntity;
import org.junit.Test;

public class SqlTest {


    @Test
    public void testSql(){

        /*
        QueryWrapper<VsUserEntity> ew = new QueryWrapper<VsUserEntity>();
        ew.setEntity(new VsUserEntity());
        ew.("user_name={0}", "'zhangsan'").and("id=1")
                .orNew("user_status={0}", "0").or("status=1")
                .notLike("user_nickname", "notvalue")
                .andNew("new=xx").like("hhh", "ddd")
                .andNew("pwd=11").isNotNull("n1,n2").isNull("n3")
                .groupBy("x1").groupBy("x2,x3")
                .having("x1=11").having("x3=433")
                .orderBy("dd").orderBy("d1,d2");
        System.out.println(ew.getSqlSegment());
        */
    }
}
