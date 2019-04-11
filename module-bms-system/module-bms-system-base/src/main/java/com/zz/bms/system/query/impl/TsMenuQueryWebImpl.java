package com.zz.bms.system.query.impl;


import java.io.Serializable;

import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 菜单 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2019-4-11 14:06:18
*/
public class TsMenuQueryWebImpl<PK extends Serializable> extends TsMenuAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;




            private String menuName_IN;
            private String menuName_NOTIN;



            private String menuCode_IN;
            private String menuCode_NOTIN;


            private PK pid_IN;
            private PK pid_NOTIN;





        //todo INT menuSort;


            private String menuUrl_IN;
            private String menuUrl_NOTIN;



            private String menuMsg_IN;
            private String menuMsg_NOTIN;



            private String menuIcon_IN;
            private String menuIcon_NOTIN;



            private String menuRedirect_IN;
            private String menuRedirect_NOTIN;


            private String shortcut_IN;
            private String shortcut_NOTIN;





        //todo INT level;

            private String leaf_IN;
            private String leaf_NOTIN;




            private String remark_IN;
            private String remark_NOTIN;



            private String deleteFlag_IN;
            private String deleteFlag_NOTIN;



            private String createUserId_IN;
            private String createUserId_NOTIN;



            private String createUserName_IN;
            private String createUserName_NOTIN;




        //todo TIMESTAMP createTime;


            private String updateUserId_IN;
            private String updateUserId_NOTIN;



            private String updateUserName_IN;
            private String updateUserName_NOTIN;




        //todo TIMESTAMP updateTime;



        //todo INT versionNo;




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



            public String getMenuName() {
                return menuName;
            }

            public void setMenuName(String menuName) {
                this.menuName = menuName;
            }

            public String getMenuName_NE() {
                return menuName_NE;
            }

            public void setMenuName_NE(String menuName_NE) {
                this.menuName_NE = menuName_NE;
            }

            public String getMenuName_IN() {
                return menuName_IN;
            }

            public void setMenuName_IN(String menuName_IN) {
                this.menuName_IN = menuName_IN;
            }

            public String getMenuName_NOTIN() {
                return menuName_NOTIN;
            }

            public void setMenuName_NOTIN(String menuName_NOTIN) {
                this.menuName_NOTIN = menuName_NOTIN;
            }

            public String getMenuName_LIKE() {
                return menuName_LIKE;
            }

            public void setMenuName_LIKE(String menuName_LIKE) {
                this.menuName_LIKE = menuName_LIKE;
            }

            public String getMenuName_NOTLIKE() {
                return menuName_NOTLIKE;
            }

            public void setMenuName_NOTLIKE(String menuName_NOTLIKE) {
                this.menuName_NOTLIKE = menuName_NOTLIKE;
            }


            public String getMenuCode() {
                return menuCode;
            }

            public void setMenuCode(String menuCode) {
                this.menuCode = menuCode;
            }

            public String getMenuCode_NE() {
                return menuCode_NE;
            }

            public void setMenuCode_NE(String menuCode_NE) {
                this.menuCode_NE = menuCode_NE;
            }

            public String getMenuCode_IN() {
                return menuCode_IN;
            }

            public void setMenuCode_IN(String menuCode_IN) {
                this.menuCode_IN = menuCode_IN;
            }

            public String getMenuCode_NOTIN() {
                return menuCode_NOTIN;
            }

            public void setMenuCode_NOTIN(String menuCode_NOTIN) {
                this.menuCode_NOTIN = menuCode_NOTIN;
            }

            public String getMenuCode_LIKE() {
                return menuCode_LIKE;
            }

            public void setMenuCode_LIKE(String menuCode_LIKE) {
                this.menuCode_LIKE = menuCode_LIKE;
            }

            public String getMenuCode_NOTLIKE() {
                return menuCode_NOTLIKE;
            }

            public void setMenuCode_NOTLIKE(String menuCode_NOTLIKE) {
                this.menuCode_NOTLIKE = menuCode_NOTLIKE;
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


            public Integer getMenuSort() {
                return menuSort;
            }

            public void setMenuSort(Integer menuSort) {
                this.menuSort = menuSort;
            }

            public Integer getMenuSort_NE() {
                return menuSort_NE;
            }

            public void setMenuSort_NE(Integer menuSort_NE) {
                this.menuSort_NE = menuSort_NE;
            }

            public Integer getMenuSort_GT() {
                return menuSort_GT;
            }

            public void setMenuSort_GT(Integer menuSort_GT) {
                this.menuSort_GT = menuSort_GT;
            }

            public Integer getMenuSort_GE() {
                return menuSort_GE;
            }

            public void setMenuSort_GE(Integer menuSort_GE) {
                this.menuSort_GE = menuSort_GE;
            }

            public Integer getMenuSort_LT() {
                return menuSort_LT;
            }

            public void setMenuSort_LT(Integer menuSort_LT) {
                this.menuSort_LT = menuSort_LT;
            }

            public Integer getMenuSort_LE() {
                return menuSort_LE;
            }

            public void setMenuSort_LE(Integer menuSort_LE) {
                this.menuSort_LE = menuSort_LE;
            }



            public String getMenuUrl() {
                return menuUrl;
            }

            public void setMenuUrl(String menuUrl) {
                this.menuUrl = menuUrl;
            }

            public String getMenuUrl_NE() {
                return menuUrl_NE;
            }

            public void setMenuUrl_NE(String menuUrl_NE) {
                this.menuUrl_NE = menuUrl_NE;
            }

            public String getMenuUrl_IN() {
                return menuUrl_IN;
            }

            public void setMenuUrl_IN(String menuUrl_IN) {
                this.menuUrl_IN = menuUrl_IN;
            }

            public String getMenuUrl_NOTIN() {
                return menuUrl_NOTIN;
            }

            public void setMenuUrl_NOTIN(String menuUrl_NOTIN) {
                this.menuUrl_NOTIN = menuUrl_NOTIN;
            }

            public String getMenuUrl_LIKE() {
                return menuUrl_LIKE;
            }

            public void setMenuUrl_LIKE(String menuUrl_LIKE) {
                this.menuUrl_LIKE = menuUrl_LIKE;
            }

            public String getMenuUrl_NOTLIKE() {
                return menuUrl_NOTLIKE;
            }

            public void setMenuUrl_NOTLIKE(String menuUrl_NOTLIKE) {
                this.menuUrl_NOTLIKE = menuUrl_NOTLIKE;
            }


            public String getMenuMsg() {
                return menuMsg;
            }

            public void setMenuMsg(String menuMsg) {
                this.menuMsg = menuMsg;
            }

            public String getMenuMsg_NE() {
                return menuMsg_NE;
            }

            public void setMenuMsg_NE(String menuMsg_NE) {
                this.menuMsg_NE = menuMsg_NE;
            }

            public String getMenuMsg_IN() {
                return menuMsg_IN;
            }

            public void setMenuMsg_IN(String menuMsg_IN) {
                this.menuMsg_IN = menuMsg_IN;
            }

            public String getMenuMsg_NOTIN() {
                return menuMsg_NOTIN;
            }

            public void setMenuMsg_NOTIN(String menuMsg_NOTIN) {
                this.menuMsg_NOTIN = menuMsg_NOTIN;
            }

            public String getMenuMsg_LIKE() {
                return menuMsg_LIKE;
            }

            public void setMenuMsg_LIKE(String menuMsg_LIKE) {
                this.menuMsg_LIKE = menuMsg_LIKE;
            }

            public String getMenuMsg_NOTLIKE() {
                return menuMsg_NOTLIKE;
            }

            public void setMenuMsg_NOTLIKE(String menuMsg_NOTLIKE) {
                this.menuMsg_NOTLIKE = menuMsg_NOTLIKE;
            }


            public String getMenuIcon() {
                return menuIcon;
            }

            public void setMenuIcon(String menuIcon) {
                this.menuIcon = menuIcon;
            }

            public String getMenuIcon_NE() {
                return menuIcon_NE;
            }

            public void setMenuIcon_NE(String menuIcon_NE) {
                this.menuIcon_NE = menuIcon_NE;
            }

            public String getMenuIcon_IN() {
                return menuIcon_IN;
            }

            public void setMenuIcon_IN(String menuIcon_IN) {
                this.menuIcon_IN = menuIcon_IN;
            }

            public String getMenuIcon_NOTIN() {
                return menuIcon_NOTIN;
            }

            public void setMenuIcon_NOTIN(String menuIcon_NOTIN) {
                this.menuIcon_NOTIN = menuIcon_NOTIN;
            }

            public String getMenuIcon_LIKE() {
                return menuIcon_LIKE;
            }

            public void setMenuIcon_LIKE(String menuIcon_LIKE) {
                this.menuIcon_LIKE = menuIcon_LIKE;
            }

            public String getMenuIcon_NOTLIKE() {
                return menuIcon_NOTLIKE;
            }

            public void setMenuIcon_NOTLIKE(String menuIcon_NOTLIKE) {
                this.menuIcon_NOTLIKE = menuIcon_NOTLIKE;
            }


            public String getMenuRedirect() {
                return menuRedirect;
            }

            public void setMenuRedirect(String menuRedirect) {
                this.menuRedirect = menuRedirect;
            }

            public String getMenuRedirect_NE() {
                return menuRedirect_NE;
            }

            public void setMenuRedirect_NE(String menuRedirect_NE) {
                this.menuRedirect_NE = menuRedirect_NE;
            }

            public String getMenuRedirect_IN() {
                return menuRedirect_IN;
            }

            public void setMenuRedirect_IN(String menuRedirect_IN) {
                this.menuRedirect_IN = menuRedirect_IN;
            }

            public String getMenuRedirect_NOTIN() {
                return menuRedirect_NOTIN;
            }

            public void setMenuRedirect_NOTIN(String menuRedirect_NOTIN) {
                this.menuRedirect_NOTIN = menuRedirect_NOTIN;
            }

            public String getMenuRedirect_LIKE() {
                return menuRedirect_LIKE;
            }

            public void setMenuRedirect_LIKE(String menuRedirect_LIKE) {
                this.menuRedirect_LIKE = menuRedirect_LIKE;
            }

            public String getMenuRedirect_NOTLIKE() {
                return menuRedirect_NOTLIKE;
            }

            public void setMenuRedirect_NOTLIKE(String menuRedirect_NOTLIKE) {
                this.menuRedirect_NOTLIKE = menuRedirect_NOTLIKE;
            }

            public String getShortcut() {
                return shortcut;
            }

            public void setShortcut(String shortcut) {
                this.shortcut = shortcut;
            }

            public String getShortcut_NE() {
                return shortcut_NE;
            }

            public void setShortcut_NE(String shortcut_NE) {
                this.shortcut_NE = shortcut_NE;
            }

            public String getShortcut_IN() {
                return shortcut_IN;
            }

            public void setShortcut_IN(String shortcut_IN) {
                this.shortcut_IN = shortcut_IN;
            }

            public String getShortcut_NOTIN() {
                return shortcut_NOTIN;
            }

            public void setShortcut_NOTIN(String shortcut_NOTIN) {
                this.shortcut_NOTIN = shortcut_NOTIN;
            }


            public Integer getLevel() {
                return level;
            }

            public void setLevel(Integer level) {
                this.level = level;
            }

            public Integer getLevel_NE() {
                return level_NE;
            }

            public void setLevel_NE(Integer level_NE) {
                this.level_NE = level_NE;
            }

            public Integer getLevel_GT() {
                return level_GT;
            }

            public void setLevel_GT(Integer level_GT) {
                this.level_GT = level_GT;
            }

            public Integer getLevel_GE() {
                return level_GE;
            }

            public void setLevel_GE(Integer level_GE) {
                this.level_GE = level_GE;
            }

            public Integer getLevel_LT() {
                return level_LT;
            }

            public void setLevel_LT(Integer level_LT) {
                this.level_LT = level_LT;
            }

            public Integer getLevel_LE() {
                return level_LE;
            }

            public void setLevel_LE(Integer level_LE) {
                this.level_LE = level_LE;
            }


            public String getLeaf() {
                return leaf;
            }

            public void setLeaf(String leaf) {
                this.leaf = leaf;
            }

            public String getLeaf_NE() {
                return leaf_NE;
            }

            public void setLeaf_NE(String leaf_NE) {
                this.leaf_NE = leaf_NE;
            }

            public String getLeaf_IN() {
                return leaf_IN;
            }

            public void setLeaf_IN(String leaf_IN) {
                this.leaf_IN = leaf_IN;
            }

            public String getLeaf_NOTIN() {
                return leaf_NOTIN;
            }

            public void setLeaf_NOTIN(String leaf_NOTIN) {
                this.leaf_NOTIN = leaf_NOTIN;
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


            public String getCreateUserId() {
                return createUserId;
            }

            public void setCreateUserId(String createUserId) {
                this.createUserId = createUserId;
            }

            public String getCreateUserId_NE() {
                return createUserId_NE;
            }

            public void setCreateUserId_NE(String createUserId_NE) {
                this.createUserId_NE = createUserId_NE;
            }

            public String getCreateUserId_IN() {
                return createUserId_IN;
            }

            public void setCreateUserId_IN(String createUserId_IN) {
                this.createUserId_IN = createUserId_IN;
            }

            public String getCreateUserId_NOTIN() {
                return createUserId_NOTIN;
            }

            public void setCreateUserId_NOTIN(String createUserId_NOTIN) {
                this.createUserId_NOTIN = createUserId_NOTIN;
            }

            public String getCreateUserId_LIKE() {
                return createUserId_LIKE;
            }

            public void setCreateUserId_LIKE(String createUserId_LIKE) {
                this.createUserId_LIKE = createUserId_LIKE;
            }

            public String getCreateUserId_NOTLIKE() {
                return createUserId_NOTLIKE;
            }

            public void setCreateUserId_NOTLIKE(String createUserId_NOTLIKE) {
                this.createUserId_NOTLIKE = createUserId_NOTLIKE;
            }


            public String getCreateUserName() {
                return createUserName;
            }

            public void setCreateUserName(String createUserName) {
                this.createUserName = createUserName;
            }

            public String getCreateUserName_NE() {
                return createUserName_NE;
            }

            public void setCreateUserName_NE(String createUserName_NE) {
                this.createUserName_NE = createUserName_NE;
            }

            public String getCreateUserName_IN() {
                return createUserName_IN;
            }

            public void setCreateUserName_IN(String createUserName_IN) {
                this.createUserName_IN = createUserName_IN;
            }

            public String getCreateUserName_NOTIN() {
                return createUserName_NOTIN;
            }

            public void setCreateUserName_NOTIN(String createUserName_NOTIN) {
                this.createUserName_NOTIN = createUserName_NOTIN;
            }

            public String getCreateUserName_LIKE() {
                return createUserName_LIKE;
            }

            public void setCreateUserName_LIKE(String createUserName_LIKE) {
                this.createUserName_LIKE = createUserName_LIKE;
            }

            public String getCreateUserName_NOTLIKE() {
                return createUserName_NOTLIKE;
            }

            public void setCreateUserName_NOTLIKE(String createUserName_NOTLIKE) {
                this.createUserName_NOTLIKE = createUserName_NOTLIKE;
            }

            public Timestamp getCreateTime() {
                return createTime;
            }

            public void setCreateTime(Timestamp createTime) {
                this.createTime = createTime;
            }

            public Timestamp getCreateTime_NE() {
                return createTime_NE;
            }

            public void setCreateTime_NE(Timestamp createTime_NE) {
                this.createTime_NE = createTime_NE;
            }

            public Timestamp getCreateTime_GT() {
                return createTime_GT;
            }

            public void setCreateTime_GT(Timestamp createTime_GT) {
                this.createTime_GT = createTime_GT;
            }

            public Timestamp getCreateTime_GE() {
                return createTime_GE;
            }

            public void setCreateTime_GE(Timestamp createTime_GE) {
                this.createTime_GE = createTime_GE;
            }

            public Timestamp getCreateTime_LT() {
                return createTime_LT;
            }

            public void setCreateTime_LT(Timestamp createTime_LT) {
                this.createTime_LT = createTime_LT;
            }

            public Timestamp getCreateTime_LE() {
                return createTime_LE;
            }

            public void setCreateTime_LE(Timestamp createTime_LE) {
                this.createTime_LE = createTime_LE;
            }


            public String getUpdateUserId() {
                return updateUserId;
            }

            public void setUpdateUserId(String updateUserId) {
                this.updateUserId = updateUserId;
            }

            public String getUpdateUserId_NE() {
                return updateUserId_NE;
            }

            public void setUpdateUserId_NE(String updateUserId_NE) {
                this.updateUserId_NE = updateUserId_NE;
            }

            public String getUpdateUserId_IN() {
                return updateUserId_IN;
            }

            public void setUpdateUserId_IN(String updateUserId_IN) {
                this.updateUserId_IN = updateUserId_IN;
            }

            public String getUpdateUserId_NOTIN() {
                return updateUserId_NOTIN;
            }

            public void setUpdateUserId_NOTIN(String updateUserId_NOTIN) {
                this.updateUserId_NOTIN = updateUserId_NOTIN;
            }

            public String getUpdateUserId_LIKE() {
                return updateUserId_LIKE;
            }

            public void setUpdateUserId_LIKE(String updateUserId_LIKE) {
                this.updateUserId_LIKE = updateUserId_LIKE;
            }

            public String getUpdateUserId_NOTLIKE() {
                return updateUserId_NOTLIKE;
            }

            public void setUpdateUserId_NOTLIKE(String updateUserId_NOTLIKE) {
                this.updateUserId_NOTLIKE = updateUserId_NOTLIKE;
            }


            public String getUpdateUserName() {
                return updateUserName;
            }

            public void setUpdateUserName(String updateUserName) {
                this.updateUserName = updateUserName;
            }

            public String getUpdateUserName_NE() {
                return updateUserName_NE;
            }

            public void setUpdateUserName_NE(String updateUserName_NE) {
                this.updateUserName_NE = updateUserName_NE;
            }

            public String getUpdateUserName_IN() {
                return updateUserName_IN;
            }

            public void setUpdateUserName_IN(String updateUserName_IN) {
                this.updateUserName_IN = updateUserName_IN;
            }

            public String getUpdateUserName_NOTIN() {
                return updateUserName_NOTIN;
            }

            public void setUpdateUserName_NOTIN(String updateUserName_NOTIN) {
                this.updateUserName_NOTIN = updateUserName_NOTIN;
            }

            public String getUpdateUserName_LIKE() {
                return updateUserName_LIKE;
            }

            public void setUpdateUserName_LIKE(String updateUserName_LIKE) {
                this.updateUserName_LIKE = updateUserName_LIKE;
            }

            public String getUpdateUserName_NOTLIKE() {
                return updateUserName_NOTLIKE;
            }

            public void setUpdateUserName_NOTLIKE(String updateUserName_NOTLIKE) {
                this.updateUserName_NOTLIKE = updateUserName_NOTLIKE;
            }

            public Timestamp getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(Timestamp updateTime) {
                this.updateTime = updateTime;
            }

            public Timestamp getUpdateTime_NE() {
                return updateTime_NE;
            }

            public void setUpdateTime_NE(Timestamp updateTime_NE) {
                this.updateTime_NE = updateTime_NE;
            }

            public Timestamp getUpdateTime_GT() {
                return updateTime_GT;
            }

            public void setUpdateTime_GT(Timestamp updateTime_GT) {
                this.updateTime_GT = updateTime_GT;
            }

            public Timestamp getUpdateTime_GE() {
                return updateTime_GE;
            }

            public void setUpdateTime_GE(Timestamp updateTime_GE) {
                this.updateTime_GE = updateTime_GE;
            }

            public Timestamp getUpdateTime_LT() {
                return updateTime_LT;
            }

            public void setUpdateTime_LT(Timestamp updateTime_LT) {
                this.updateTime_LT = updateTime_LT;
            }

            public Timestamp getUpdateTime_LE() {
                return updateTime_LE;
            }

            public void setUpdateTime_LE(Timestamp updateTime_LE) {
                this.updateTime_LE = updateTime_LE;
            }

            public Integer getVersionNo() {
                return versionNo;
            }

            public void setVersionNo(Integer versionNo) {
                this.versionNo = versionNo;
            }

            public Integer getVersionNo_NE() {
                return versionNo_NE;
            }

            public void setVersionNo_NE(Integer versionNo_NE) {
                this.versionNo_NE = versionNo_NE;
            }

            public Integer getVersionNo_GT() {
                return versionNo_GT;
            }

            public void setVersionNo_GT(Integer versionNo_GT) {
                this.versionNo_GT = versionNo_GT;
            }

            public Integer getVersionNo_GE() {
                return versionNo_GE;
            }

            public void setVersionNo_GE(Integer versionNo_GE) {
                this.versionNo_GE = versionNo_GE;
            }

            public Integer getVersionNo_LT() {
                return versionNo_LT;
            }

            public void setVersionNo_LT(Integer versionNo_LT) {
                this.versionNo_LT = versionNo_LT;
            }

            public Integer getVersionNo_LE() {
                return versionNo_LE;
            }

            public void setVersionNo_LE(Integer versionNo_LE) {
                this.versionNo_LE = versionNo_LE;
            }

}