package com.zz.bms.system.base.mybatisplus;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.zz.bms.system.domain.TsUserEntity;
import com.zz.bms.system.domain.VsUserEntity;
import org.junit.Assert;
import org.junit.Test;

public class SqlTest  {

    @Test
    public void testSQL1(){
        EntityWrapper<VsUserEntity> ew = new EntityWrapper<VsUserEntity>();
        ew.setEntity(new VsUserEntity());
        ew.where("user_name={0}", "'zhangsan'").and("id=1")
                .orNew()
                .orNew("user_status={0}", "0").and("status=1")
                .notLike("user_nickname", "notvalue")
                .andNew("new=xx").like("hhh", "ddd")
                .andNew("pwd=11").andNew()
                .isNotNull("n1,n2").isNull("n3")
                .groupBy("x1").groupBy("x2,x3")
                .having("x1=11").having("x3=433")
                .orderBy("dd").orderBy("d1,d2");
        System.out.println(ew.getSqlSegment());
    }



    @Test
    public void testSQL2(){
        EntityWrapper<VsUserEntity> ew = new EntityWrapper<VsUserEntity>();

        ew.like("email" , "111").or();
        ew.like("user_name" , "111").or();
        ew.like("phone" , "111");

        ew.andNew();


        ew.isNotNull("aa").eq("status" , "1");
        System.out.println(ew.getSqlSegment());
    }


    @Test
    public void testSQL3(){

        EntityWrapper<TsUserEntity> ew = new EntityWrapper<>();
        ew.addFilter("name={0}", "'123'").orderBy("id,name");
        String sqlSegment = ew.originalSql();
        System.err.println("testNoTSQL = " + sqlSegment);

        Assert.assertEquals("AND (name=?)\nORDER BY id,name", sqlSegment);
    }

}
