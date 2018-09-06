package com.zz.bms.system.query.impl;


import java.io.Serializable;

import java.lang.String;
import java.lang.Integer;

/**
* 菜单 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2018-9-6 23:56:31
*/
public class VsUserMenuQueryWebImpl<PK extends Serializable> extends VsUserMenuAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;



            private PK pid_IN;
            private PK pid_NOTIN;




            private String title_IN;
            private String title_NOTIN;



            private String icon_IN;
            private String icon_NOTIN;



            private String component_IN;
            private String component_NOTIN;




        //todo INT sortno;


            private String path_IN;
            private String path_NOTIN;



            private String name_IN;
            private String name_NOTIN;



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



            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getTitle_NE() {
                return title_NE;
            }

            public void setTitle_NE(String title_NE) {
                this.title_NE = title_NE;
            }

            public String getTitle_IN() {
                return title_IN;
            }

            public void setTitle_IN(String title_IN) {
                this.title_IN = title_IN;
            }

            public String getTitle_NOTIN() {
                return title_NOTIN;
            }

            public void setTitle_NOTIN(String title_NOTIN) {
                this.title_NOTIN = title_NOTIN;
            }

            public String getTitle_LIKE() {
                return title_LIKE;
            }

            public void setTitle_LIKE(String title_LIKE) {
                this.title_LIKE = title_LIKE;
            }

            public String getTitle_NOTLIKE() {
                return title_NOTLIKE;
            }

            public void setTitle_NOTLIKE(String title_NOTLIKE) {
                this.title_NOTLIKE = title_NOTLIKE;
            }


            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getIcon_NE() {
                return icon_NE;
            }

            public void setIcon_NE(String icon_NE) {
                this.icon_NE = icon_NE;
            }

            public String getIcon_IN() {
                return icon_IN;
            }

            public void setIcon_IN(String icon_IN) {
                this.icon_IN = icon_IN;
            }

            public String getIcon_NOTIN() {
                return icon_NOTIN;
            }

            public void setIcon_NOTIN(String icon_NOTIN) {
                this.icon_NOTIN = icon_NOTIN;
            }

            public String getIcon_LIKE() {
                return icon_LIKE;
            }

            public void setIcon_LIKE(String icon_LIKE) {
                this.icon_LIKE = icon_LIKE;
            }

            public String getIcon_NOTLIKE() {
                return icon_NOTLIKE;
            }

            public void setIcon_NOTLIKE(String icon_NOTLIKE) {
                this.icon_NOTLIKE = icon_NOTLIKE;
            }


            public String getComponent() {
                return component;
            }

            public void setComponent(String component) {
                this.component = component;
            }

            public String getComponent_NE() {
                return component_NE;
            }

            public void setComponent_NE(String component_NE) {
                this.component_NE = component_NE;
            }

            public String getComponent_IN() {
                return component_IN;
            }

            public void setComponent_IN(String component_IN) {
                this.component_IN = component_IN;
            }

            public String getComponent_NOTIN() {
                return component_NOTIN;
            }

            public void setComponent_NOTIN(String component_NOTIN) {
                this.component_NOTIN = component_NOTIN;
            }

            public String getComponent_LIKE() {
                return component_LIKE;
            }

            public void setComponent_LIKE(String component_LIKE) {
                this.component_LIKE = component_LIKE;
            }

            public String getComponent_NOTLIKE() {
                return component_NOTLIKE;
            }

            public void setComponent_NOTLIKE(String component_NOTLIKE) {
                this.component_NOTLIKE = component_NOTLIKE;
            }

            public Integer getSortno() {
                return sortno;
            }

            public void setSortno(Integer sortno) {
                this.sortno = sortno;
            }

            public Integer getSortno_NE() {
                return sortno_NE;
            }

            public void setSortno_NE(Integer sortno_NE) {
                this.sortno_NE = sortno_NE;
            }

            public Integer getSortno_GT() {
                return sortno_GT;
            }

            public void setSortno_GT(Integer sortno_GT) {
                this.sortno_GT = sortno_GT;
            }

            public Integer getSortno_GE() {
                return sortno_GE;
            }

            public void setSortno_GE(Integer sortno_GE) {
                this.sortno_GE = sortno_GE;
            }

            public Integer getSortno_LT() {
                return sortno_LT;
            }

            public void setSortno_LT(Integer sortno_LT) {
                this.sortno_LT = sortno_LT;
            }

            public Integer getSortno_LE() {
                return sortno_LE;
            }

            public void setSortno_LE(Integer sortno_LE) {
                this.sortno_LE = sortno_LE;
            }



            public String getPath() {
                return path;
            }

            public void setPath(String path) {
                this.path = path;
            }

            public String getPath_NE() {
                return path_NE;
            }

            public void setPath_NE(String path_NE) {
                this.path_NE = path_NE;
            }

            public String getPath_IN() {
                return path_IN;
            }

            public void setPath_IN(String path_IN) {
                this.path_IN = path_IN;
            }

            public String getPath_NOTIN() {
                return path_NOTIN;
            }

            public void setPath_NOTIN(String path_NOTIN) {
                this.path_NOTIN = path_NOTIN;
            }

            public String getPath_LIKE() {
                return path_LIKE;
            }

            public void setPath_LIKE(String path_LIKE) {
                this.path_LIKE = path_LIKE;
            }

            public String getPath_NOTLIKE() {
                return path_NOTLIKE;
            }

            public void setPath_NOTLIKE(String path_NOTLIKE) {
                this.path_NOTLIKE = path_NOTLIKE;
            }


            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getName_NE() {
                return name_NE;
            }

            public void setName_NE(String name_NE) {
                this.name_NE = name_NE;
            }

            public String getName_IN() {
                return name_IN;
            }

            public void setName_IN(String name_IN) {
                this.name_IN = name_IN;
            }

            public String getName_NOTIN() {
                return name_NOTIN;
            }

            public void setName_NOTIN(String name_NOTIN) {
                this.name_NOTIN = name_NOTIN;
            }

            public String getName_LIKE() {
                return name_LIKE;
            }

            public void setName_LIKE(String name_LIKE) {
                this.name_LIKE = name_LIKE;
            }

            public String getName_NOTLIKE() {
                return name_NOTLIKE;
            }

            public void setName_NOTLIKE(String name_NOTLIKE) {
                this.name_NOTLIKE = name_NOTLIKE;
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