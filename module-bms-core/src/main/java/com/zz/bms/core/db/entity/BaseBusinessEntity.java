package com.zz.bms.core.db.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.annotations.Version;
import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 业务实体类
 * 包括新建，修改 的人和时间信息， 以及版本号
 * @author Administrator
 */
public abstract class BaseBusinessEntity<PK extends Serializable> extends BaseEntity<PK> implements Serializable {

    /**
     * 创建时间
     */
    private Timestamp createTime;

    /**
     * 创建人ID
     */
    private PK createUserId;


    /**
     * 修改人ID
     */
    private PK updateUserId;

    /**
     * 修改时间
     */
    private Timestamp updateTime;


    /**
     * 版本号
     */
    @Version
    private Integer versionNo ;

    /**
     * 删除标志
     * 1: 已删除    0：正常
     */
    @TableLogic
    @TableField(value = "delete_flag")
    private String deleteFlag ;


    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }


    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }


    public Integer getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(Integer versionNo) {
        this.versionNo = versionNo;
    }



    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public PK getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(PK createUserId) {
        this.createUserId = createUserId;
    }

    public PK getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(PK updateUserId) {
        this.updateUserId = updateUserId;
    }
}
