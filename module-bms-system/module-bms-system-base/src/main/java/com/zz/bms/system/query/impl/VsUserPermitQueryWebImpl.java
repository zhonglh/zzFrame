package com.zz.bms.system.query.impl;


import java.io.Serializable;

import java.lang.String;

/**
* 用户许可视图 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2018-9-6 23:56:31
*/
public class VsUserPermitQueryWebImpl<PK extends Serializable> extends VsUserPermitAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;




            private String permitCode_IN;
            private String permitCode_NOTIN;



            private String userName_IN;
            private String userName_NOTIN;



            private String loginName_IN;
            private String loginName_NOTIN;


            private PK userId_IN;
            private PK userId_NOTIN;






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


            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }

            public String getUserName_NE() {
                return userName_NE;
            }

            public void setUserName_NE(String userName_NE) {
                this.userName_NE = userName_NE;
            }

            public String getUserName_IN() {
                return userName_IN;
            }

            public void setUserName_IN(String userName_IN) {
                this.userName_IN = userName_IN;
            }

            public String getUserName_NOTIN() {
                return userName_NOTIN;
            }

            public void setUserName_NOTIN(String userName_NOTIN) {
                this.userName_NOTIN = userName_NOTIN;
            }

            public String getUserName_LIKE() {
                return userName_LIKE;
            }

            public void setUserName_LIKE(String userName_LIKE) {
                this.userName_LIKE = userName_LIKE;
            }

            public String getUserName_NOTLIKE() {
                return userName_NOTLIKE;
            }

            public void setUserName_NOTLIKE(String userName_NOTLIKE) {
                this.userName_NOTLIKE = userName_NOTLIKE;
            }


            public String getLoginName() {
                return loginName;
            }

            public void setLoginName(String loginName) {
                this.loginName = loginName;
            }

            public String getLoginName_NE() {
                return loginName_NE;
            }

            public void setLoginName_NE(String loginName_NE) {
                this.loginName_NE = loginName_NE;
            }

            public String getLoginName_IN() {
                return loginName_IN;
            }

            public void setLoginName_IN(String loginName_IN) {
                this.loginName_IN = loginName_IN;
            }

            public String getLoginName_NOTIN() {
                return loginName_NOTIN;
            }

            public void setLoginName_NOTIN(String loginName_NOTIN) {
                this.loginName_NOTIN = loginName_NOTIN;
            }

            public String getLoginName_LIKE() {
                return loginName_LIKE;
            }

            public void setLoginName_LIKE(String loginName_LIKE) {
                this.loginName_LIKE = loginName_LIKE;
            }

            public String getLoginName_NOTLIKE() {
                return loginName_NOTLIKE;
            }

            public void setLoginName_NOTLIKE(String loginName_NOTLIKE) {
                this.loginName_NOTLIKE = loginName_NOTLIKE;
            }

            public PK getUserId() {
                return userId;
            }

            public void setUserId(PK userId) {
                this.userId = userId;
            }

            public PK getUserId_NE() {
                return userId_NE;
            }

            public void setUserId_NE(PK userId_NE) {
                this.userId_NE = userId_NE;
            }

            public PK getUserId_IN() {
                return userId_IN;
            }

            public void setUserId_IN(PK userId_IN) {
                this.userId_IN = userId_IN;
            }

            public PK getUserId_NOTIN() {
                return userId_NOTIN;
            }

            public void setUserId_NOTIN(PK userId_NOTIN) {
                this.userId_NOTIN = userId_NOTIN;
            }

}