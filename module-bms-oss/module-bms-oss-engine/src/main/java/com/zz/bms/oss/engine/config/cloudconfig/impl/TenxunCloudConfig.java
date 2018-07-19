package com.zz.bms.oss.engine.config.cloudconfig.impl;

import com.zz.bms.oss.engine.config.cloudconfig.CloudConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * 腾讯云设置
 * @author Administrator
 */
@Component
public class TenxunCloudConfig implements CloudConfig {



    @Value("#{tenxunyun.domain}")
    private String domain;


    @Value("#{tenxunyun.prefix}")
    private String prefix;


    @Value("#{tenxunyun.bucketName}")
    private String bucketName;

    private String endPoint;

    @Value("#{tenxunyun.accessKey}")
    private String accessKeyId;

    @Value("#{tenxunyun.secretKey}")
    private String accessKeySecret;


    @Value("#{tenxunyun.active}")
    private boolean active;


    @Override
    public String getCloudDomain() {
        return domain;
    }

    @Override
    public String getCloudPrefix() {
        return prefix;
    }

    @Override
    public String getCloudEndPoint() {
        return endPoint;
    }

    @Override
    public String getCloudAppId() {
        return null;
    }

    @Override
    public String getCloudSecretId() {
        return accessKeyId;
    }

    @Override
    public String getCloudSecretKey() {
        return accessKeySecret;
    }

    @Override
    public String getCloudBucketName() {
        return bucketName;
    }

    @Override
    public String getCloudRegion() {
        return null;
    }

    @Override
    public boolean isActive() {
        return active;
    }
}
