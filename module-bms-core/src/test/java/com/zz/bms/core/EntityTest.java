package com.zz.bms.core;

import com.zz.bms.core.db.entity.BaseBusinessEntity;
import com.zz.bms.core.db.entity.BaseBusinessExEntity;
import com.zz.bms.core.db.entity.BaseEntity;
import org.junit.Test;

public class EntityTest {

    @Test
    public void test(){
        boolean b = BaseBusinessExEntity.class.isAssignableFrom(BaseEntity.class);
        System.out.println(b);

        b = BaseBusinessEntity.class.isAssignableFrom(BaseEntity.class);
        System.out.println(b);

    }
}
