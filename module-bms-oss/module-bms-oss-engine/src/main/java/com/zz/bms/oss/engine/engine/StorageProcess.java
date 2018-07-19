package com.zz.bms.oss.engine.engine;


import java.io.InputStream;

/**
 * 存储器操作接口
 * @author Administrator
 */
public interface StorageProcess {

    /**
     * 储存文件
     * @param inputStream
     * @param filename
     */
    public String store(InputStream inputStream, String filename);


    /**
     * 获取路径
     * @param prefix
     * @return
     */
    public String getPath(String prefix) ;

    /**
     * 删除文件
     * @param filename
     */
    public boolean delete(String filename);

    /**
     * 获取文件
     * @param filename
     * @return
     */
    public Object get(String filename);

    /**
     * Engine 是否有效
     * @return
     */
    public boolean isActive();

}
