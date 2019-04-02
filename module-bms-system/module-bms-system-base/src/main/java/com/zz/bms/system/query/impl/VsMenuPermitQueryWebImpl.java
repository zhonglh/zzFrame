package com.zz.bms.system.query.impl;


import java.io.Serializable;

import java.lang.String;

/**
* 菜单许可关联 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2019-4-1 13:52:04
*/
public class VsMenuPermitQueryWebImpl<PK extends Serializable> extends VsMenuPermitAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;




            private String menuId_IN;
            private String menuId_NOTIN;



            private String permitId_IN;
            private String permitId_NOTIN;



            private String permitCode_IN;
            private String permitCode_NOTIN;



            private String permitName_IN;
            private String permitName_NOTIN;





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



            public String getMenuId() {
                return menuId;
            }

            public void setMenuId(String menuId) {
                this.menuId = menuId;
            }

            public String getMenuId_NE() {
                return menuId_NE;
            }

            public void setMenuId_NE(String menuId_NE) {
                this.menuId_NE = menuId_NE;
            }

            public String getMenuId_IN() {
                return menuId_IN;
            }

            public void setMenuId_IN(String menuId_IN) {
                this.menuId_IN = menuId_IN;
            }

            public String getMenuId_NOTIN() {
                return menuId_NOTIN;
            }

            public void setMenuId_NOTIN(String menuId_NOTIN) {
                this.menuId_NOTIN = menuId_NOTIN;
            }

            public String getMenuId_LIKE() {
                return menuId_LIKE;
            }

            public void setMenuId_LIKE(String menuId_LIKE) {
                this.menuId_LIKE = menuId_LIKE;
            }

            public String getMenuId_NOTLIKE() {
                return menuId_NOTLIKE;
            }

            public void setMenuId_NOTLIKE(String menuId_NOTLIKE) {
                this.menuId_NOTLIKE = menuId_NOTLIKE;
            }


            public String getPermitId() {
                return permitId;
            }

            public void setPermitId(String permitId) {
                this.permitId = permitId;
            }

            public String getPermitId_NE() {
                return permitId_NE;
            }

            public void setPermitId_NE(String permitId_NE) {
                this.permitId_NE = permitId_NE;
            }

            public String getPermitId_IN() {
                return permitId_IN;
            }

            public void setPermitId_IN(String permitId_IN) {
                this.permitId_IN = permitId_IN;
            }

            public String getPermitId_NOTIN() {
                return permitId_NOTIN;
            }

            public void setPermitId_NOTIN(String permitId_NOTIN) {
                this.permitId_NOTIN = permitId_NOTIN;
            }

            public String getPermitId_LIKE() {
                return permitId_LIKE;
            }

            public void setPermitId_LIKE(String permitId_LIKE) {
                this.permitId_LIKE = permitId_LIKE;
            }

            public String getPermitId_NOTLIKE() {
                return permitId_NOTLIKE;
            }

            public void setPermitId_NOTLIKE(String permitId_NOTLIKE) {
                this.permitId_NOTLIKE = permitId_NOTLIKE;
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
}