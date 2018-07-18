package com.zz.bms.oss.engine.cloudconfig.impl;

import com.zz.bms.oss.engine.cloudconfig.CloudConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 阿里云设置
 * @author Administrator
 */
@Component
public class AliCloudConfig implements CloudConfig{

    @Value("#{aliyun.domain}")
    private String domain;


    @Value("#{aliyun.bucketName}")
    private String bucketName;

    @Value("#{aliyun.endPoint}")
    private String endPoint;

    @Value("#{aliyun.accessKeyId}")
    private String accessKeyId;

    @Value("#{aliyun.accessKeySecret}")
    private String accessKeySecret;


    @Value("#{aliyun.active}")
    private boolean active;


    @Override
    public String getCloudDomain() {
        return null;
    }

    @Override
    public String getCloudPrefix() {
        return domain;
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
