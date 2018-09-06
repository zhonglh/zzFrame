package com.zz.bms.system.query.impl;


import java.io.Serializable;

import java.lang.String;
import java.lang.Integer;

/**
* 字典类型 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2018-9-6 23:56:30
*/
public class TsDictTypeQueryWebImpl<PK extends Serializable> extends TsDictTypeAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;



            private PK pid_IN;
            private PK pid_NOTIN;




            private String dictTypeCode_IN;
            private String dictTypeCode_NOTIN;



            private String dictTypeName_IN;
            private String dictTypeName_NOTIN;


            private String dictTypeShowable_IN;
            private String dictTypeShowable_NOTIN;



            private String dictAddable_IN;
            private String dictAddable_NOTIN;



            private String dictUpdate_IN;
            private String dictUpdate_NOTIN;



            private String dictDelete_IN;
            private String dictDelete_NOTIN;





        //todo INT orderby;




            public PK getId() {
                return id;
            }

            public void setId(PK id) {
                this.id = id;
            }

            public PK getId_NE() {
                return id_NE;
            }

            public void setId_NE(PK id_NE) {
                this.id_NE = id_NE;
            }

            public PK getId_IN() {
                return id_IN;
            }

            public void setId_IN(PK id_IN) {
                this.id_IN = id_IN;
            }

            public PK getId_NOTIN() {
                return id_NOTIN;
            }

            public void setId_NOTIN(PK id_NOTIN) {
                this.id_NOTIN = id_NOTIN;
            }


            public PK getPid() {
                return pid;
            }

            public void setPid(PK pid) {
                this.pid = pid;
            }

            public PK getPid_NE() {
                return pid_NE;
            }

            public void setPid_NE(PK pid_NE) {
                this.pid_NE = pid_NE;
            }

            public PK getPid_IN() {
                return pid_IN;
            }

            public void setPid_IN(PK pid_IN) {
                this.pid_IN = pid_IN;
            }

            public PK getPid_NOTIN() {
                return pid_NOTIN;
            }

            public void setPid_NOTIN(PK pid_NOTIN) {
                this.pid_NOTIN = pid_NOTIN;
            }



            public String getDictTypeCode() {
                return dictTypeCode;
            }

            public void setDictTypeCode(String dictTypeCode) {
                this.dictTypeCode = dictTypeCode;
            }

            public String getDictTypeCode_NE() {
                return dictTypeCode_NE;
            }

            public void setDictTypeCode_NE(String dictTypeCode_NE) {
                this.dictTypeCode_NE = dictTypeCode_NE;
            }

            public String getDictTypeCode_IN() {
                return dictTypeCode_IN;
            }

            public void setDictTypeCode_IN(String dictTypeCode_IN) {
                this.dictTypeCode_IN = dictTypeCode_IN;
            }

            public String getDictTypeCode_NOTIN() {
                return dictTypeCode_NOTIN;
            }

            public void setDictTypeCode_NOTIN(String dictTypeCode_NOTIN) {
                this.dictTypeCode_NOTIN = dictTypeCode_NOTIN;
            }

            public String getDictTypeCode_LIKE() {
                return dictTypeCode_LIKE;
            }

            public void setDictTypeCode_LIKE(String dictTypeCode_LIKE) {
                this.dictTypeCode_LIKE = dictTypeCode_LIKE;
            }

            public String getDictTypeCode_NOTLIKE() {
                return dictTypeCode_NOTLIKE;
            }

            public void setDictTypeCode_NOTLIKE(String dictTypeCode_NOTLIKE) {
                this.dictTypeCode_NOTLIKE = dictTypeCode_NOTLIKE;
            }


            public String getDictTypeName() {
                return dictTypeName;
            }

            public void setDictTypeName(String dictTypeName) {
                this.dictTypeName = dictTypeName;
            }

            public String getDictTypeName_NE() {
                return dictTypeName_NE;
            }

            public void setDictTypeName_NE(String dictTypeName_NE) {
                this.dictTypeName_NE = dictTypeName_NE;
            }

            public String getDictTypeName_IN() {
                return dictTypeName_IN;
            }

            public void setDictTypeName_IN(String dictTypeName_IN) {
                this.dictTypeName_IN = dictTypeName_IN;
            }

            public String getDictTypeName_NOTIN() {
                return dictTypeName_NOTIN;
            }

            public void setDictTypeName_NOTIN(String dictTypeName_NOTIN) {
                this.dictTypeName_NOTIN = dictTypeName_NOTIN;
            }

            public String getDictTypeName_LIKE() {
                return dictTypeName_LIKE;
            }

            public void setDictTypeName_LIKE(String dictTypeName_LIKE) {
                this.dictTypeName_LIKE = dictTypeName_LIKE;
            }

            public String getDictTypeName_NOTLIKE() {
                return dictTypeName_NOTLIKE;
            }

            public void setDictTypeName_NOTLIKE(String dictTypeName_NOTLIKE) {
                this.dictTypeName_NOTLIKE = dictTypeName_NOTLIKE;
            }

            public String getDictTypeShowable() {
                return dictTypeShowable;
            }

            public void setDictTypeShowable(String dictTypeShowable) {
                this.dictTypeShowable = dictTypeShowable;
            }

            public String getDictTypeShowable_NE() {
                return dictTypeShowable_NE;
            }

            public void setDictTypeShowable_NE(String dictTypeShowable_NE) {
                this.dictTypeShowable_NE = dictTypeShowable_NE;
            }

            public String getDictTypeShowable_IN() {
                return dictTypeShowable_IN;
            }

            public void setDictTypeShowable_IN(String dictTypeShowable_IN) {
                this.dictTypeShowable_IN = dictTypeShowable_IN;
            }

            public String getDictTypeShowable_NOTIN() {
                return dictTypeShowable_NOTIN;
            }

            public void setDictTypeShowable_NOTIN(String dictTypeShowable_NOTIN) {
                this.dictTypeShowable_NOTIN = dictTypeShowable_NOTIN;
            }


            public String getDictAddable() {
                return dictAddable;
            }

            public void setDictAddable(String dictAddable) {
                this.dictAddable = dictAddable;
            }

            public String getDictAddable_NE() {
                return dictAddable_NE;
            }

            public void setDictAddable_NE(String dictAddable_NE) {
                this.dictAddable_NE = dictAddable_NE;
            }

            public String getDictAddable_IN() {
                return dictAddable_IN;
            }

            public void setDictAddable_IN(String dictAddable_IN) {
                this.dictAddable_IN = dictAddable_IN;
            }

            public String getDictAddable_NOTIN() {
                return dictAddable_NOTIN;
            }

            public void setDictAddable_NOTIN(String dictAddable_NOTIN) {
                this.dictAddable_NOTIN = dictAddable_NOTIN;
            }


            public String getDictUpdate() {
                return dictUpdate;
            }

            public void setDictUpdate(String dictUpdate) {
                this.dictUpdate = dictUpdate;
            }

            public String getDictUpdate_NE() {
                return dictUpdate_NE;
            }

            public void setDictUpdate_NE(String dictUpdate_NE) {
                this.dictUpdate_NE = dictUpdate_NE;
            }

            public String getDictUpdate_IN() {
                return dictUpdate_IN;
            }

            public void setDictUpdate_IN(String dictUpdate_IN) {
                this.dictUpdate_IN = dictUpdate_IN;
            }

            public String getDictUpdate_NOTIN() {
                return dictUpdate_NOTIN;
            }

            public void setDictUpdate_NOTIN(String dictUpdate_NOTIN) {
                this.dictUpdate_NOTIN = dictUpdate_NOTIN;
            }


            public String getDictDelete() {
                return dictDelete;
            }

            public void setDictDelete(String dictDelete) {
                this.dictDelete = dictDelete;
            }

            public String getDictDelete_NE() {
                return dictDelete_NE;
            }

            public void setDictDelete_NE(String dictDelete_NE) {
                this.dictDelete_NE = dictDelete_NE;
            }

            public String getDictDelete_IN() {
                return dictDelete_IN;
            }

            public void setDictDelete_IN(String dictDelete_IN) {
                this.dictDelete_IN = dictDelete_IN;
            }

            public String getDictDelete_NOTIN() {
                return dictDelete_NOTIN;
            }

            public void setDictDelete_NOTIN(String dictDelete_NOTIN) {
                this.dictDelete_NOTIN = dictDelete_NOTIN;
            }


            public Integer getOrderby() {
                return orderby;
            }

            public void setOrderby(Integer orderby) {
                this.orderby = orderby;
            }

            public Integer getOrderby_NE() {
                return orderby_NE;
            }

            public void setOrderby_NE(Integer orderby_NE) {
                this.orderby_NE = orderby_NE;
            }

            public Integer getOrderby_GT() {
                return orderby_GT;
            }

            public void setOrderby_GT(Integer orderby_GT) {
                this.orderby_GT = orderby_GT;
            }

            public Integer getOrderby_GE() {
                return orderby_GE;
            }

            public void setOrderby_GE(Integer orderby_GE) {
                this.orderby_GE = orderby_GE;
            }

            public Integer getOrderby_LT() {
                return orderby_LT;
            }

            public void setOrderby_LT(Integer orderby_LT) {
                this.orderby_LT = orderby_LT;
            }

            public Integer getOrderby_LE() {
                return orderby_LE;
            }

            public void setOrderby_LE(Integer orderby_LE) {
                this.orderby_LE = orderby_LE;
            }

}