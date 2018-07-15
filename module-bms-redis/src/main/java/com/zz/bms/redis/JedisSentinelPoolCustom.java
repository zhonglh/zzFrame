package com.zz.bms.redis;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.JedisSentinelPool;

import java.util.Set;

public class JedisSentinelPoolCustom extends JedisSentinelPool {

    public JedisSentinelPoolCustom(String masterName, Set<String> sentinels, GenericObjectPoolConfig poolConfig, String password) {
        super(masterName, SetSentinel.getSentinelNodes(), poolConfig, password);
    }

    public JedisSentinelPoolCustom(String masterName, Set<String> sentinels, GenericObjectPoolConfig poolConfig, int timeout, String password, int database) {
        super(masterName, SetSentinel.getSentinelNodes(), poolConfig, timeout, password,database);
    }
}
