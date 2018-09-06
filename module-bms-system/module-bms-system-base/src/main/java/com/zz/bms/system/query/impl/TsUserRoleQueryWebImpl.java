package com.zz.bms.system.query.impl;


import java.io.Serializable;

import java.lang.String;

/**
* 用户角色关联 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2018-9-6 23:56:30
*/
public class TsUserRoleQueryWebImpl<PK extends Serializable> extends TsUserRoleAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;



            private PK userId_IN;
            private PK userId_NOTIN;



            private PK roleId_IN;
            private PK roleId_NOTIN;






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


            public PK getRoleId() {
                return roleId;
            }

            public void setRoleId(PK roleId) {
                this.roleId = roleId;
            }

            public PK getRoleId_NE() {
                return roleId_NE;
            }

            public void setRoleId_NE(PK roleId_NE) {
                this.roleId_NE = roleId_NE;
            }

            public PK getRoleId_IN() {
                return roleId_IN;
            }

            public void setRoleId_IN(PK roleId_IN) {
                this.roleId_IN = roleId_IN;
            }

            public PK getRoleId_NOTIN() {
                return roleId_NOTIN;
            }

            public void setRoleId_NOTIN(PK roleId_NOTIN) {
                this.roleId_NOTIN = roleId_NOTIN;
            }

}