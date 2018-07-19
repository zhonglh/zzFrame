package com.zz.bms.oss.engine.engine;

import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.oss.engine.config.FileSystemConfig;
import com.zz.bms.oss.engine.enums.EnumFileEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * 文件系统实现 存储
 * Java 8   NIO
 * @author Administrator
 */

@Component("FILESYSTEM")
public  class FileEngine extends AbstractEngine implements StorageProcess {

    @Autowired
    private FileSystemConfig config;

    private final Path rootLocation = Paths.get(config.getRoot());


    @Override
    public String store(InputStream inputStream, String filename) {
        try {
            Files.copy(inputStream, rootLocation.resolve(filename), StandardCopyOption.REPLACE_EXISTING);
            return filename;
        }
        catch (IOException e) {
            throw new RuntimeException ("Failed to store file " + filename, e);
        }
    }


    @Override
    public boolean delete(String filename) {
        Path file = load(filename);
        try {
            Files.delete(file);
            return true;
        } catch (IOException e) {
            throw new BizException(e);
        }
    }

    @Override
    public Object get(String filename) {
        try {
            Path file = load(filename);
            Resource resource = new UrlResource(file.toUri());
            if (resource.exists() || resource.isReadable()) {
                return resource.getFile();
            }else {
                return null;
            }
        }catch(MalformedURLException murlException){
            throw new BizException(murlException);
        }catch(Exception e){
            throw new BizException(e);
        }
    }


    public Path load(String filename) {
        return rootLocation.resolve(filename);
    }



    @Override
    public boolean isActive() {
        return config.isActive();
    }
}
