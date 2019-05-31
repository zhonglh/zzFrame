package com.zz.bms.oss.engine.engine;


import com.zz.bms.oss.engine.enums.EnumFileEngine;
import com.zz.bms.oss.vo.FileVO;

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
    public FileVO store(InputStream inputStream, String filename);



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

    public EnumFileEngine getEngine();

}
