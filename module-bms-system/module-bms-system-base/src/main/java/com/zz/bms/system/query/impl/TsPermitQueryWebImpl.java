package com.zz.bms.system.query.impl;


import java.io.Serializable;

import java.lang.String;

/**
* 许可 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2018-9-6 23:56:31
*/
public class TsPermitQueryWebImpl<PK extends Serializable> extends TsPermitAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;




            private String permitName_IN;
            private String permitName_NOTIN;



            private String permitCode_IN;
            private String permitCode_NOTIN;



            private String remark_IN;
            private String remark_NOTIN;



            private String deleteFlag_IN;
            private String deleteFlag_NOTIN;





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



            public String getPermitName() {
                return permitName;
            }

            public void setPermitName(String permitName) {
                this.permitName = permitName;
            }

            public String getPermitName_NE() {
                return permitName_NE;
            }

            public void setPermitName_NE(String permitName_NE) {
                this.permitName_NE = permitName_NE;
            }

            public String getPermitName_IN() {
                return permitName_IN;
            }

            public void setPermitName_IN(String permitName_IN) {
                this.permitName_IN = permitName_IN;
            }

            public String getPermitName_NOTIN() {
                return permitName_NOTIN;
            }

            public void setPermitName_NOTIN(String permitName_NOTIN) {
                this.permitName_NOTIN = permitName_NOTIN;
            }

            public String getPermitName_LIKE() {
                return permitName_LIKE;
            }

            public void setPermitName_LIKE(String permitName_LIKE) {
                this.permitName_LIKE = permitName_LIKE;
            }

            public String getPermitName_NOTLIKE() {
                return permitName_NOTLIKE;
            }

            public void setPermitName_NOTLIKE(String permitName_NOTLIKE) {
                this.permitName_NOTLIKE = permitName_NOTLIKE;
            }


            public String getPermitCode() {
                return permitCode;
            }

            public void setPermitCode(String permitCode) {
                this.permitCode = permitCode;
            }

            public String getPermitCode_NE() {
                return permitCode_NE;
            }

            public void setPermitCode_NE(String permitCode_NE) {
                this.permitCode_NE = permitCode_NE;
            }

            public String getPermitCode_IN() {
                return permitCode_IN;
            }

            public void setPermitCode_IN(String permitCode_IN) {
                this.permitCode_IN = permitCode_IN;
            }

            public String getPermitCode_NOTIN() {
                return permitCode_NOTIN;
            }

            public void setPermitCode_NOTIN(String permitCode_NOTIN) {
                this.permitCode_NOTIN = permitCode_NOTIN;
            }

            public String getPermitCode_LIKE() {
                return permitCode_LIKE;
            }

            public void setPermitCode_LIKE(String permitCode_LIKE) {
                this.permitCode_LIKE = permitCode_LIKE;
            }

            public String getPermitCode_NOTLIKE() {
                return permitCode_NOTLIKE;
            }

            public void setPermitCode_NOTLIKE(String permitCode_NOTLIKE) {
                this.permitCode_NOTLIKE = permitCode_NOTLIKE;
            }


            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public String getRemark_NE() {
                return remark_NE;
            }

            public void setRemark_NE(String remark_NE) {
                this.remark_NE = remark_NE;
            }

            public String getRemark_IN() {
                return remark_IN;
            }

            public void setRemark_IN(String remark_IN) {
                this.remark_IN = remark_IN;
            }

            public String getRemark_NOTIN() {
                return remark_NOTIN;
            }

            public void setRemark_NOTIN(String remark_NOTIN) {
                this.remark_NOTIN = remark_NOTIN;
            }

            public String getRemark_LIKE() {
                return remark_LIKE;
            }

            public void setRemark_LIKE(String remark_LIKE) {
                this.remark_LIKE = remark_LIKE;
            }

            public String getRemark_NOTLIKE() {
                return remark_NOTLIKE;
            }

            public void setRemark_NOTLIKE(String remark_NOTLIKE) {
                this.remark_NOTLIKE = remark_NOTLIKE;
            }


            public String getDeleteFlag() {
                return deleteFlag;
            }

            public void setDeleteFlag(String deleteFlag) {
                this.deleteFlag = deleteFlag;
            }

            public String getDeleteFlag_NE() {
                return deleteFlag_NE;
            }

            public void setDeleteFlag_NE(String deleteFlag_NE) {
                this.deleteFlag_NE = deleteFlag_NE;
            }

            public String getDeleteFlag_IN() {
                return deleteFlag_IN;
            }

            public void setDeleteFlag_IN(String deleteFlag_IN) {
                this.deleteFlag_IN = deleteFlag_IN;
            }

            public String getDeleteFlag_NOTIN() {
                return deleteFlag_NOTIN;
            }

            public void setDeleteFlag_NOTIN(String deleteFlag_NOTIN) {
                this.deleteFlag_NOTIN = deleteFlag_NOTIN;
            }

            public String getDeleteFlag_LIKE() {
                return deleteFlag_LIKE;
            }

            public void setDeleteFlag_LIKE(String deleteFlag_LIKE) {
                this.deleteFlag_LIKE = deleteFlag_LIKE;
            }

            public String getDeleteFlag_NOTLIKE() {
                return deleteFlag_NOTLIKE;
            }

            public void setDeleteFlag_NOTLIKE(String deleteFlag_NOTLIKE) {
                this.deleteFlag_NOTLIKE = deleteFlag_NOTLIKE;
            }
}