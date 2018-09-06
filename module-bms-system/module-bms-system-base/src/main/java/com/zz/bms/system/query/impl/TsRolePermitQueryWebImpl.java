package com.zz.bms.system.query.impl;


import java.io.Serializable;

import java.lang.String;

/**
* 角色许可关联 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2018-9-6 23:56:30
*/
public class TsRolePermitQueryWebImpl<PK extends Serializable> extends TsRolePermitAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;



            private PK roleId_IN;
            private PK roleId_NOTIN;



            private PK permitId_IN;
            private PK permitId_NOTIN;






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


            public PK getPermitId() {
                return permitId;
            }

            public void setPermitId(PK permitId) {
                this.permitId = permitId;
            }

            public PK getPermitId_NE() {
                return permitId_NE;
            }

            public void setPermitId_NE(PK permitId_NE) {
                this.permitId_NE = permitId_NE;
            }

            public PK getPermitId_IN() {
                return permitId_IN;
            }

            public void setPermitId_IN(PK permitId_IN) {
                this.permitId_IN = permitId_IN;
            }

            public PK getPermitId_NOTIN() {
                return permitId_NOTIN;
            }

            public void setPermitId_NOTIN(PK permitId_NOTIN) {
                this.permitId_NOTIN = permitId_NOTIN;
            }

}