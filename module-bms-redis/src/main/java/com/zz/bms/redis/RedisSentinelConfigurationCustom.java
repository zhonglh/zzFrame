package com.zz.bms.redis;

import org.springframework.data.redis.connection.RedisSentinelConfiguration;

public class RedisSentinelConfigurationCustom extends RedisSentinelConfiguration {

    public RedisSentinelConfigurationCustom(String master) {
        super(master, SetSentinel.getSentinelNodes());
    }

}
