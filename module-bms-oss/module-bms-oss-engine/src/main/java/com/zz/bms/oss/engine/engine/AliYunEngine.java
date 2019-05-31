package com.zz.bms.oss.engine.engine;

import com.aliyun.oss.OSSClient;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.oss.engine.config.cloudconfig.impl.AliCloudConfig;
import com.zz.bms.oss.engine.enums.EnumFileEngine;
import com.zz.bms.oss.vo.FileVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.InputStream;

/**
 * 阿里云 实现 存储
 * @author Administrator
 */
@Component("CLOUD_ALI")
public class AliYunEngine extends AbstractEngine implements StorageProcess {

    @Autowired
    private AliCloudConfig config;


    private OSSClient client;

    public void AliYunEngine(){

    }

    @PostConstruct
    private void init() {
        if(config.isActive()) {
            client = new OSSClient(config.getCloudEndPoint(),
                    config.getCloudSecretId(),
                    config.getCloudSecretKey());
        }
    }

    @Override
    public FileVO store(InputStream inputStream, String path) {
        try {
            client.putObject(config.getCloudBucketName(), path, inputStream);
        } catch (Exception e) {
            throw new BizException("上传文件失败，请检查配置信息");
        }

        String accessUrl =  config.getCloudDomain() + "/" + path;
        FileVO fileVO = new FileVO();
        fileVO.setAccessUrl(accessUrl);
        return fileVO;
    }

    @Override
    public boolean delete(String filename) {
        try {
            client.deleteObject(config.getCloudBucketName(), filename);
        }catch (Exception e){
            throw new BizException("删除文件失败，请检查配置信息");
        }
        return true;
    }

    @Override
    public Object get(String filename) {
        try {
            return client.getObject(config.getCloudBucketName(), filename);
        }catch (Exception e){
            throw new BizException("获取文件失败，请检查配置信息");
        }
    }

    @Override
    public boolean isActive() {
        return config.isActive();
    }

    @Override
    public EnumFileEngine getEngine() {
        return EnumFileEngine.CLOUD_ALI;
    }
}
