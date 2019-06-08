package com.zz.bms.oss.engine.engine;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.exception.CosClientException;
import com.qcloud.cos.exception.CosServiceException;
import com.qcloud.cos.model.ObjectMetadata;
import com.qcloud.cos.model.PutObjectRequest;
import com.qcloud.cos.model.UploadResult;
import com.qcloud.cos.region.Region;
import com.qcloud.cos.transfer.TransferManager;
import com.qcloud.cos.transfer.Upload;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.oss.engine.config.cloudconfig.impl.TenxunCloudConfig;
import com.zz.bms.oss.engine.enums.EnumFileEngine;
import com.zz.bms.oss.engine.enums.EnumFileType;
import com.zz.bms.oss.vo.FileVO;
import org.apache.http.entity.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.*;

/**
 * 腾讯云 实现 存储
 * @author Administrator
 */
@Component("CLOUD_TENXEN")
public class TenxunYunEngine extends AbstractEngine implements StorageProcess {

    @Autowired
    private TenxunCloudConfig config;

    private COSClient client;


    @PostConstruct
    private void init() {

        if(config.isActive()) {
            COSCredentials credentials = new BasicCOSCredentials(config.getCloudSecretId(), config.getCloudSecretKey());
            // 初始化客户端配置 设置bucket所在的区域，华南：gz 华北：tj 华东：sh
            ClientConfig clientConfig = new ClientConfig(new Region(config.getCloudRegion()));
            client = new COSClient(credentials, clientConfig);
        }

    }


    @Override
    public FileVO store(InputStream inputStream, String filename , EnumFileType enumFileType) {
        {
            // 腾讯云必需要以"/"开头
            if (!filename.startsWith("/")) {
                filename = "/" + filename;
            }
            ExecutorService threadPool = new ThreadPoolExecutor(4, 32,
                    0L, TimeUnit.MILLISECONDS,
                    new LinkedBlockingQueue<Runnable>());

            // 传入一个 threadpool, 若不传入线程池, 默认 TransferManager 中会生成一个单线程的线程池。
            TransferManager transferManager = new TransferManager(client, threadPool);

            // .....(提交上传下载请求, 如下文所属)
            // 创建上传Object的Metadata
            ObjectMetadata meta = new ObjectMetadata();
            meta.setContentType(ContentType.APPLICATION_OCTET_STREAM.getMimeType());

            try {
                // 这里有个风险，因为available返回的是int类型，有长度限制，如果文件大，这个不适用。
                meta.setContentLength(inputStream.available());
            } catch (IOException e1) {
                throw new BizException("文件流错误，" + e1.getMessage());

            }

            PutObjectRequest putObjectRequest = new PutObjectRequest(config.getCloudBucketName(), filename , inputStream, meta);
            // 本地文件上传
            Upload upload = transferManager.upload(putObjectRequest);
            // 等待传输结束（如果想同步的等待上传结束，则调用 waitForCompletion）

            try {
                UploadResult uploadResult = upload.waitForUploadResult();

            } catch (CosServiceException e) {

                throw new BizException("服务异常，" + e.getErrorMessage());

            } catch (CosClientException e) {

                throw new BizException("客户端异常，" + e.getMessage());
            } catch (InterruptedException e) {

                throw new BizException("系统异常，" + e.getMessage());
            } finally {
                // 关闭 TransferManger
                transferManager.shutdownNow();
            }
            // 例如：https://paddy-1256559626.cosbj.myqcloud.com/images/demo/20180426/0034397501f917.png
            String accessUrl =  config.getCloudDomain() + filename;


            FileVO fileVO = new FileVO();
            fileVO.setAccessUrl(accessUrl);
            return fileVO;
        }
    }

    @Override
    public boolean delete(String filename) {
        client.deleteObject(config.getCloudBucketName(), filename);
        return true;
    }

    @Override
    public Object get(String filename) {
        return client.getObject(config.getCloudBucketName(), filename);
    }

    @Override
    public boolean isActive() {
        return config.isActive();
    }



    @Override
    public EnumFileEngine getEngine() {
        return EnumFileEngine.CLOUD_TENXEN;
    }


}
