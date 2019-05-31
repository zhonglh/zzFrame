package com.zz.bms.oss.engine.engine;

import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.oss.engine.config.cloudconfig.impl.QiniuCloudConfig;
import com.zz.bms.oss.engine.enums.EnumFileEngine;
import com.zz.bms.oss.vo.FileVO;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;

/**
 * 七牛云 实现 存储
 * @author Administrator
 */
@Component("CLOUD_QINIU")
public class QiniuYunEngine extends AbstractEngine implements StorageProcess {

    private UploadManager uploadManager;
    private Auth auth;
    private BucketManager bucketManager;
    private String token;

    @Autowired
    private QiniuCloudConfig config;



    @PostConstruct
    private void init() {
        if(config.isActive()) {
            Configuration cfg = new Configuration(Zone.autoZone());
            uploadManager = new UploadManager(cfg);
            auth = Auth.create(config.getCloudSecretId(), config.getCloudSecretKey());
            token = auth.uploadToken(config.getCloudBucketName());
            bucketManager = new BucketManager(auth, cfg);
        }

    }


    @Override
    public FileVO store(InputStream inputStream, String filename) {
        try {
            byte[] data = IOUtils.toByteArray(inputStream);
            String accessUrl =  this.upload(data, filename);

            FileVO fileVO = new FileVO();
            fileVO.setAccessUrl(accessUrl);
            return fileVO;
        } catch (IOException e) {
            throw new BizException("上传文件失败", e);
        }
    }

    @Override
    public boolean delete(String filename) {
        try {
            Response response = bucketManager.delete(config.getCloudBucketName() , filename);
            return response.isOK();
        } catch (QiniuException e) {
            throw new BizException(e);
        }
    }

    @Override
    public Object get(String filename) {
        try {
            return bucketManager.stat(config.getCloudBucketName() , filename);
        } catch (QiniuException e) {
            throw new BizException(e);
        }
    }

    @Override
    public boolean isActive() {
        return config.isActive();
    }


    @Override
    public EnumFileEngine getEngine() {
        return EnumFileEngine.CLOUD_QINIU;
    }


    public String upload(byte[] data, String path) {
        try {
            Response res = uploadManager.put(data, path, token);
            if (!res.isOK()) {
                throw new RuntimeException("上传七牛出错：" + res.toString());
            }
        } catch (Exception e) {
            throw new BizException("上传文件失败，请核对七牛配置信息", e);
        }

        return config.getCloudDomain() + "/" + path;
    }
}
