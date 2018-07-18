package com.zz.bms.oss.engine.engine;

import com.aliyun.oss.OSSClient;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.oss.engine.cloudconfig.impl.AliCloudConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.InputStream;

/**
 * @author Administrator
 */
@Component("CLOUD_ALI")
public class AliYunEngine extends AbstractEngine implements StorageProcess {

    @Autowired
    private AliCloudConfig config;


    private OSSClient client;

    public void AliYunEngine(){

    }


    private void init() {
        client = new OSSClient(config.getCloudEndPoint(),
                config.getCloudSecretId(),
                config.getCloudSecretKey());
    }

    @Override
    public String store(InputStream inputStream, String path) {
        try {
            client.putObject(config.getCloudBucketName(), path, inputStream);
        } catch (Exception e) {
            throw new BizException("上传文件失败，请检查配置信息");
        }

        return config.getCloudDomain() + "/" + path;
    }

    @Override
    public void delete(String filename) {
        client.deleteObject(config.getCloudBucketName() ,filename);
    }
}
