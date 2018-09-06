package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.VsUserEntity;
import com.zz.bms.system.query.VsUserQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 用户 查询实现类
* 用于链式查询
* @author Administrator
* @date 2018-9-6 23:56:30
*/
public class VsUserQueryImpl<PK extends Serializable> extends VsUserAbstractQueryImpl<PK> implements VsUserQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;


        private List<String> userName_IN;
        private List<String> userName_NOTIN;

        private List<String> loginName_IN;
        private List<String> loginName_NOTIN;

        private List<String> loginPassword_IN;
        private List<String> loginPassword_NOTIN;

        private List<String> salt_IN;
        private List<String> salt_NOTIN;
        private List<String> userStatus_IN;
        private List<String> userStatus_NOTIN;

        private List<PK> leadUserId_IN;
        private List<PK> leadUserId_NOTIN;


        private List<String> phone_IN;
        private List<String> phone_NOTIN;

        private List<String> email_IN;
        private List<String> email_NOTIN;

        private List<String> avatarUrl_IN;
        private List<String> avatarUrl_NOTIN;

        private List<String> openId_IN;
        private List<String> openId_NOTIN;

        private List<String> unionId_IN;
        private List<String> unionId_NOTIN;
        private List<String> systemAdmin_IN;
        private List<String> systemAdmin_NOTIN;


        private List<String> depId_IN;
        private List<String> depId_NOTIN;

        private List<String> organId_IN;
        private List<String> organId_NOTIN;

        private List<String> remark_IN;
        private List<String> remark_NOTIN;

        private List<String> deleteFlag_IN;
        private List<String> deleteFlag_NOTIN;

        private List<String> createUserId_IN;
        private List<String> createUserId_NOTIN;

        private List<String> createUserName_IN;
        private List<String> createUserName_NOTIN;

        private List<String> updateUserId_IN;
        private List<String> updateUserId_NOTIN;

        private List<String> updateUserName_IN;
        private List<String> updateUserName_NOTIN;

        private List<String> tenantId_IN;
        private List<String> tenantId_NOTIN;

        private List<String> depName_IN;
        private List<String> depName_NOTIN;

        private List<String> organName_IN;
        private List<String> organName_NOTIN;

        private List<String> tenantName_IN;
        private List<String> tenantName_NOTIN;


        @Override
        public VsUserQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public VsUserQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public VsUserQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public VsUserQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public VsUserQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public VsUserQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }



        @Override
        public VsUserQuery userName(String userName) {
            if(!IdUtils.isEmpty(userName)){
                this.userName = userName;
            }
            return this;
        }

        @Override
        public VsUserQuery userNameNot(String userNameNot) {
            if(!IdUtils.isEmpty(userNameNot)){
                this.userName_NE = userNameNot;
            }
            return this;
        }

        @Override
        public VsUserQuery userNameLike(String userNameLike) {
            if(!IdUtils.isEmpty(userNameLike)){
                this.userName_LIKE = userNameLike;
            }
            return this;
        }

        @Override
        public VsUserQuery userNameNotLike(String userNameNotLike) {
            if(!IdUtils.isEmpty(userNameNotLike)){
                this.userName_NOTLIKE = userNameNotLike;
            }
            return this;
        }

        @Override
        public VsUserQuery userNameIn(String userNameIn) {
            if(!IdUtils.isEmpty(userNameIn)){
                if(this.userName_IN == null){
                    this.userName_IN = new ArrayList<String>();
                }
                this.userName_IN.add( userNameIn );
            }
            return this;
        }

        @Override
        public VsUserQuery userNameNotIn(String userNameNotIn) {
            if(!IdUtils.isEmpty(userNameNotIn)){
                if(this.userName_NOTIN == null){
                    this.userName_NOTIN = new ArrayList<String>();
                }
                this.userName_NOTIN.add( userNameNotIn );
            }
            return this;
        }

        @Override
        public VsUserQuery userNameIsNull() {
            this.isNulls.add("userName");
            return this;
        }

        @Override
        public VsUserQuery userNameIsNotNull() {
            this.isNotNulls.add("userName");
            return this;
        }



        @Override
        public VsUserQuery loginName(String loginName) {
            if(!IdUtils.isEmpty(loginName)){
                this.loginName = loginName;
            }
            return this;
        }

        @Override
        public VsUserQuery loginNameNot(String loginNameNot) {
            if(!IdUtils.isEmpty(loginNameNot)){
                this.loginName_NE = loginNameNot;
            }
            return this;
        }

        @Override
        public VsUserQuery loginNameLike(String loginNameLike) {
            if(!IdUtils.isEmpty(loginNameLike)){
                this.loginName_LIKE = loginNameLike;
            }
            return this;
        }

        @Override
        public VsUserQuery loginNameNotLike(String loginNameNotLike) {
            if(!IdUtils.isEmpty(loginNameNotLike)){
                this.loginName_NOTLIKE = loginNameNotLike;
            }
            return this;
        }

        @Override
        public VsUserQuery loginNameIn(String loginNameIn) {
            if(!IdUtils.isEmpty(loginNameIn)){
                if(this.loginName_IN == null){
                    this.loginName_IN = new ArrayList<String>();
                }
                this.loginName_IN.add( loginNameIn );
            }
            return this;
        }

        @Override
        public VsUserQuery loginNameNotIn(String loginNameNotIn) {
            if(!IdUtils.isEmpty(loginNameNotIn)){
                if(this.loginName_NOTIN == null){
                    this.loginName_NOTIN = new ArrayList<String>();
                }
                this.loginName_NOTIN.add( loginNameNotIn );
            }
            return this;
        }

        @Override
        public VsUserQuery loginNameIsNull() {
            this.isNulls.add("loginName");
            return this;
        }

        @Override
        public VsUserQuery loginNameIsNotNull() {
            this.isNotNulls.add("loginName");
            return this;
        }



        @Override
        public VsUserQuery loginPassword(String loginPassword) {
            if(!IdUtils.isEmpty(loginPassword)){
                this.loginPassword = loginPassword;
            }
            return this;
        }

        @Override
        public VsUserQuery loginPasswordNot(String loginPasswordNot) {
            if(!IdUtils.isEmpty(loginPasswordNot)){
                this.loginPassword_NE = loginPasswordNot;
            }
            return this;
        }

        @Override
        public VsUserQuery loginPasswordLike(String loginPasswordLike) {
            if(!IdUtils.isEmpty(loginPasswordLike)){
                this.loginPassword_LIKE = loginPasswordLike;
            }
            return this;
        }

        @Override
        public VsUserQuery loginPasswordNotLike(String loginPasswordNotLike) {
            if(!IdUtils.isEmpty(loginPasswordNotLike)){
                this.loginPassword_NOTLIKE = loginPasswordNotLike;
            }
            return this;
        }

        @Override
        public VsUserQuery loginPasswordIn(String loginPasswordIn) {
            if(!IdUtils.isEmpty(loginPasswordIn)){
                if(this.loginPassword_IN == null){
                    this.loginPassword_IN = new ArrayList<String>();
                }
                this.loginPassword_IN.add( loginPasswordIn );
            }
            return this;
        }

        @Override
        public VsUserQuery loginPasswordNotIn(String loginPasswordNotIn) {
            if(!IdUtils.isEmpty(loginPasswordNotIn)){
                if(this.loginPassword_NOTIN == null){
                    this.loginPassword_NOTIN = new ArrayList<String>();
                }
                this.loginPassword_NOTIN.add( loginPasswordNotIn );
            }
            return this;
        }

        @Override
        public VsUserQuery loginPasswordIsNull() {
            this.isNulls.add("loginPassword");
            return this;
        }

        @Override
        public VsUserQuery loginPasswordIsNotNull() {
            this.isNotNulls.add("loginPassword");
            return this;
        }



        @Override
        public VsUserQuery salt(String salt) {
            if(!IdUtils.isEmpty(salt)){
                this.salt = salt;
            }
            return this;
        }

        @Override
        public VsUserQuery saltNot(String saltNot) {
            if(!IdUtils.isEmpty(saltNot)){
                this.salt_NE = saltNot;
            }
            return this;
        }

        @Override
        public VsUserQuery saltLike(String saltLike) {
            if(!IdUtils.isEmpty(saltLike)){
                this.salt_LIKE = saltLike;
            }
            return this;
        }

        @Override
        public VsUserQuery saltNotLike(String saltNotLike) {
            if(!IdUtils.isEmpty(saltNotLike)){
                this.salt_NOTLIKE = saltNotLike;
            }
            return this;
        }

        @Override
        public VsUserQuery saltIn(String saltIn) {
            if(!IdUtils.isEmpty(saltIn)){
                if(this.salt_IN == null){
                    this.salt_IN = new ArrayList<String>();
                }
                this.salt_IN.add( saltIn );
            }
            return this;
        }

        @Override
        public VsUserQuery saltNotIn(String saltNotIn) {
            if(!IdUtils.isEmpty(saltNotIn)){
                if(this.salt_NOTIN == null){
                    this.salt_NOTIN = new ArrayList<String>();
                }
                this.salt_NOTIN.add( saltNotIn );
            }
            return this;
        }

        @Override
        public VsUserQuery saltIsNull() {
            this.isNulls.add("salt");
            return this;
        }

        @Override
        public VsUserQuery saltIsNotNull() {
            this.isNotNulls.add("salt");
            return this;
        }


        @Override
        public VsUserQuery userStatus(String userStatus) {
            if(!IdUtils.isEmpty(userStatus)){
                this.userStatus = userStatus;
            }
            return this;
        }

        @Override
        public VsUserQuery userStatusNot(String userStatusNot) {
            if(!IdUtils.isEmpty(userStatusNot)){
                this.userStatus_NE = userStatusNot;
            }
            return this;
        }

        @Override
        public VsUserQuery userStatusIn(String userStatusIn) {
            if(!IdUtils.isEmpty(userStatusIn)){
                if(this.userStatus_IN == null){
                    this.userStatus_IN = new ArrayList<String>();
                }
                this.userStatus_IN.add( userStatusIn );
            }
            return this;
        }

        @Override
        public VsUserQuery userStatusNotIn(String userStatusNotIn) {
            if(!IdUtils.isEmpty(userStatusNotIn)){
                if(this.userStatus_NOTIN == null){
                    this.userStatus_NOTIN = new ArrayList<String>();
                }
                this.userStatus_NOTIN.add( userStatusNotIn );
            }
            return this;
        }

        @Override
        public VsUserQuery userStatusIsNull() {
            this.isNulls.add("userStatus");
            return this;
        }

        @Override
        public VsUserQuery userStatusIsNotNull() {
            this.isNotNulls.add("userStatus");
            return this;
        }


        @Override
        public VsUserQuery leadUserId(PK leadUserId) {
            if(!IdUtils.isEmpty(leadUserId)){
                this.leadUserId = leadUserId;
            }
            return this;
        }

        @Override
        public VsUserQuery leadUserIdNot(PK leadUserIdNot) {
            if(!IdUtils.isEmpty(leadUserIdNot)){
                this.leadUserId_NE = leadUserIdNot;
            }
            return this;
        }

        @Override
        public VsUserQuery leadUserIdIn(PK leadUserIdIn) {
            if(!IdUtils.isEmpty(leadUserIdIn)){
                if(this.leadUserId_IN == null){
                    this.leadUserId_IN = new ArrayList<PK>();
                }
                this.leadUserId_IN.add( leadUserIdIn );
            }
            return this;
        }

        @Override
        public VsUserQuery leadUserIdNotIn(PK leadUserIdNotIn) {
            if(!IdUtils.isEmpty(leadUserIdNotIn)){
                if(this.leadUserId_NOTIN == null){
                    this.leadUserId_NOTIN = new ArrayList<PK>();
                }
                this.leadUserId_NOTIN.add( leadUserIdNotIn );
            }
            return this;
        }

        @Override
        public VsUserQuery leadUserIdIsNull() {
            this.isNulls.add("leadUserId");
            return this;
        }

        @Override
        public VsUserQuery leadUserIdIsNotNull() {
            this.isNotNulls.add("leadUserId");
            return this;
        }



        @Override
        public VsUserQuery phone(String phone) {
            if(!IdUtils.isEmpty(phone)){
                this.phone = phone;
            }
            return this;
        }

        @Override
        public VsUserQuery phoneNot(String phoneNot) {
            if(!IdUtils.isEmpty(phoneNot)){
                this.phone_NE = phoneNot;
            }
            return this;
        }

        @Override
        public VsUserQuery phoneLike(String phoneLike) {
            if(!IdUtils.isEmpty(phoneLike)){
                this.phone_LIKE = phoneLike;
            }
            return this;
        }

        @Override
        public VsUserQuery phoneNotLike(String phoneNotLike) {
            if(!IdUtils.isEmpty(phoneNotLike)){
                this.phone_NOTLIKE = phoneNotLike;
            }
            return this;
        }

        @Override
        public VsUserQuery phoneIn(String phoneIn) {
            if(!IdUtils.isEmpty(phoneIn)){
                if(this.phone_IN == null){
                    this.phone_IN = new ArrayList<String>();
                }
                this.phone_IN.add( phoneIn );
            }
            return this;
        }

        @Override
        public VsUserQuery phoneNotIn(String phoneNotIn) {
            if(!IdUtils.isEmpty(phoneNotIn)){
                if(this.phone_NOTIN == null){
                    this.phone_NOTIN = new ArrayList<String>();
                }
                this.phone_NOTIN.add( phoneNotIn );
            }
            return this;
        }

        @Override
        public VsUserQuery phoneIsNull() {
            this.isNulls.add("phone");
            return this;
        }

        @Override
        public VsUserQuery phoneIsNotNull() {
            this.isNotNulls.add("phone");
            return this;
        }



        @Override
        public VsUserQuery email(String email) {
            if(!IdUtils.isEmpty(email)){
                this.email = email;
            }
            return this;
        }

        @Override
        public VsUserQuery emailNot(String emailNot) {
            if(!IdUtils.isEmpty(emailNot)){
                this.email_NE = emailNot;
            }
            return this;
        }

        @Override
        public VsUserQuery emailLike(String emailLike) {
            if(!IdUtils.isEmpty(emailLike)){
                this.email_LIKE = emailLike;
            }
            return this;
        }

        @Override
        public VsUserQuery emailNotLike(String emailNotLike) {
            if(!IdUtils.isEmpty(emailNotLike)){
                this.email_NOTLIKE = emailNotLike;
            }
            return this;
        }

        @Override
        public VsUserQuery emailIn(String emailIn) {
            if(!IdUtils.isEmpty(emailIn)){
                if(this.email_IN == null){
                    this.email_IN = new ArrayList<String>();
                }
                this.email_IN.add( emailIn );
            }
            return this;
        }

        @Override
        public VsUserQuery emailNotIn(String emailNotIn) {
            if(!IdUtils.isEmpty(emailNotIn)){
                if(this.email_NOTIN == null){
                    this.email_NOTIN = new ArrayList<String>();
                }
                this.email_NOTIN.add( emailNotIn );
            }
            return this;
        }

        @Override
        public VsUserQuery emailIsNull() {
            this.isNulls.add("email");
            return this;
        }

        @Override
        public VsUserQuery emailIsNotNull() {
            this.isNotNulls.add("email");
            return this;
        }



        @Override
        public VsUserQuery avatarUrl(String avatarUrl) {
            if(!IdUtils.isEmpty(avatarUrl)){
                this.avatarUrl = avatarUrl;
            }
            return this;
        }

        @Override
        public VsUserQuery avatarUrlNot(String avatarUrlNot) {
            if(!IdUtils.isEmpty(avatarUrlNot)){
                this.avatarUrl_NE = avatarUrlNot;
            }
            return this;
        }

        @Override
        public VsUserQuery avatarUrlLike(String avatarUrlLike) {
            if(!IdUtils.isEmpty(avatarUrlLike)){
                this.avatarUrl_LIKE = avatarUrlLike;
            }
            return this;
        }

        @Override
        public VsUserQuery avatarUrlNotLike(String avatarUrlNotLike) {
            if(!IdUtils.isEmpty(avatarUrlNotLike)){
                this.avatarUrl_NOTLIKE = avatarUrlNotLike;
            }
            return this;
        }

        @Override
        public VsUserQuery avatarUrlIn(String avatarUrlIn) {
            if(!IdUtils.isEmpty(avatarUrlIn)){
                if(this.avatarUrl_IN == null){
                    this.avatarUrl_IN = new ArrayList<String>();
                }
                this.avatarUrl_IN.add( avatarUrlIn );
            }
            return this;
        }

        @Override
        public VsUserQuery avatarUrlNotIn(String avatarUrlNotIn) {
            if(!IdUtils.isEmpty(avatarUrlNotIn)){
                if(this.avatarUrl_NOTIN == null){
                    this.avatarUrl_NOTIN = new ArrayList<String>();
                }
                this.avatarUrl_NOTIN.add( avatarUrlNotIn );
            }
            return this;
        }

        @Override
        public VsUserQuery avatarUrlIsNull() {
            this.isNulls.add("avatarUrl");
            return this;
        }

        @Override
        public VsUserQuery avatarUrlIsNotNull() {
            this.isNotNulls.add("avatarUrl");
            return this;
        }



        @Override
        public VsUserQuery openId(String openId) {
            if(!IdUtils.isEmpty(openId)){
                this.openId = openId;
            }
            return this;
        }

        @Override
        public VsUserQuery openIdNot(String openIdNot) {
            if(!IdUtils.isEmpty(openIdNot)){
                this.openId_NE = openIdNot;
            }
            return this;
        }

        @Override
        public VsUserQuery openIdLike(String openIdLike) {
            if(!IdUtils.isEmpty(openIdLike)){
                this.openId_LIKE = openIdLike;
            }
            return this;
        }

        @Override
        public VsUserQuery openIdNotLike(String openIdNotLike) {
            if(!IdUtils.isEmpty(openIdNotLike)){
                this.openId_NOTLIKE = openIdNotLike;
            }
            return this;
        }

        @Override
        public VsUserQuery openIdIn(String openIdIn) {
            if(!IdUtils.isEmpty(openIdIn)){
                if(this.openId_IN == null){
                    this.openId_IN = new ArrayList<String>();
                }
                this.openId_IN.add( openIdIn );
            }
            return this;
        }

        @Override
        public VsUserQuery openIdNotIn(String openIdNotIn) {
            if(!IdUtils.isEmpty(openIdNotIn)){
                if(this.openId_NOTIN == null){
                    this.openId_NOTIN = new ArrayList<String>();
                }
                this.openId_NOTIN.add( openIdNotIn );
            }
            return this;
        }

        @Override
        public VsUserQuery openIdIsNull() {
            this.isNulls.add("openId");
            return this;
        }

        @Override
        public VsUserQuery openIdIsNotNull() {
            this.isNotNulls.add("openId");
            return this;
        }



        @Override
        public VsUserQuery unionId(String unionId) {
            if(!IdUtils.isEmpty(unionId)){
                this.unionId = unionId;
            }
            return this;
        }

        @Override
        public VsUserQuery unionIdNot(String unionIdNot) {
            if(!IdUtils.isEmpty(unionIdNot)){
                this.unionId_NE = unionIdNot;
            }
            return this;
        }

        @Override
        public VsUserQuery unionIdLike(String unionIdLike) {
            if(!IdUtils.isEmpty(unionIdLike)){
                this.unionId_LIKE = unionIdLike;
            }
            return this;
        }

        @Override
        public VsUserQuery unionIdNotLike(String unionIdNotLike) {
            if(!IdUtils.isEmpty(unionIdNotLike)){
                this.unionId_NOTLIKE = unionIdNotLike;
            }
            return this;
        }

        @Override
        public VsUserQuery unionIdIn(String unionIdIn) {
            if(!IdUtils.isEmpty(unionIdIn)){
                if(this.unionId_IN == null){
                    this.unionId_IN = new ArrayList<String>();
                }
                this.unionId_IN.add( unionIdIn );
            }
            return this;
        }

        @Override
        public VsUserQuery unionIdNotIn(String unionIdNotIn) {
            if(!IdUtils.isEmpty(unionIdNotIn)){
                if(this.unionId_NOTIN == null){
                    this.unionId_NOTIN = new ArrayList<String>();
                }
                this.unionId_NOTIN.add( unionIdNotIn );
            }
            return this;
        }

        @Override
        public VsUserQuery unionIdIsNull() {
            this.isNulls.add("unionId");
            return this;
        }

        @Override
        public VsUserQuery unionIdIsNotNull() {
            this.isNotNulls.add("unionId");
            return this;
        }


        @Override
        public VsUserQuery systemAdmin(String systemAdmin) {
            if(!IdUtils.isEmpty(systemAdmin)){
                this.systemAdmin = systemAdmin;
            }
            return this;
        }

        @Override
        public VsUserQuery systemAdminNot(String systemAdminNot) {
            if(!IdUtils.isEmpty(systemAdminNot)){
                this.systemAdmin_NE = systemAdminNot;
            }
            return this;
        }

        @Override
        public VsUserQuery systemAdminIn(String systemAdminIn) {
            if(!IdUtils.isEmpty(systemAdminIn)){
                if(this.systemAdmin_IN == null){
                    this.systemAdmin_IN = new ArrayList<String>();
                }
                this.systemAdmin_IN.add( systemAdminIn );
            }
            return this;
        }

        @Override
        public VsUserQuery systemAdminNotIn(String systemAdminNotIn) {
            if(!IdUtils.isEmpty(systemAdminNotIn)){
                if(this.systemAdmin_NOTIN == null){
                    this.systemAdmin_NOTIN = new ArrayList<String>();
                }
                this.systemAdmin_NOTIN.add( systemAdminNotIn );
            }
            return this;
        }

        @Override
        public VsUserQuery systemAdminIsNull() {
            this.isNulls.add("systemAdmin");
            return this;
        }

        @Override
        public VsUserQuery systemAdminIsNotNull() {
            this.isNotNulls.add("systemAdmin");
            return this;
        }



        @Override
        public VsUserQuery depId(String depId) {
            if(!IdUtils.isEmpty(depId)){
                this.depId = depId;
            }
            return this;
        }

        @Override
        public VsUserQuery depIdNot(String depIdNot) {
            if(!IdUtils.isEmpty(depIdNot)){
                this.depId_NE = depIdNot;
            }
            return this;
        }

        @Override
        public VsUserQuery depIdLike(String depIdLike) {
            if(!IdUtils.isEmpty(depIdLike)){
                this.depId_LIKE = depIdLike;
            }
            return this;
        }

        @Override
        public VsUserQuery depIdNotLike(String depIdNotLike) {
            if(!IdUtils.isEmpty(depIdNotLike)){
                this.depId_NOTLIKE = depIdNotLike;
            }
            return this;
        }

        @Override
        public VsUserQuery depIdIn(String depIdIn) {
            if(!IdUtils.isEmpty(depIdIn)){
                if(this.depId_IN == null){
                    this.depId_IN = new ArrayList<String>();
                }
                this.depId_IN.add( depIdIn );
            }
            return this;
        }

        @Override
        public VsUserQuery depIdNotIn(String depIdNotIn) {
            if(!IdUtils.isEmpty(depIdNotIn)){
                if(this.depId_NOTIN == null){
                    this.depId_NOTIN = new ArrayList<String>();
                }
                this.depId_NOTIN.add( depIdNotIn );
            }
            return this;
        }

        @Override
        public VsUserQuery depIdIsNull() {
            this.isNulls.add("depId");
            return this;
        }

        @Override
        public VsUserQuery depIdIsNotNull() {
            this.isNotNulls.add("depId");
            return this;
        }



        @Override
        public VsUserQuery organId(String organId) {
            if(!IdUtils.isEmpty(organId)){
                this.organId = organId;
            }
            return this;
        }

        @Override
        public VsUserQuery organIdNot(String organIdNot) {
            if(!IdUtils.isEmpty(organIdNot)){
                this.organId_NE = organIdNot;
            }
            return this;
        }

        @Override
        public VsUserQuery organIdLike(String organIdLike) {
            if(!IdUtils.isEmpty(organIdLike)){
                this.organId_LIKE = organIdLike;
            }
            return this;
        }

        @Override
        public VsUserQuery organIdNotLike(String organIdNotLike) {
            if(!IdUtils.isEmpty(organIdNotLike)){
                this.organId_NOTLIKE = organIdNotLike;
            }
            return this;
        }

        @Override
        public VsUserQuery organIdIn(String organIdIn) {
            if(!IdUtils.isEmpty(organIdIn)){
                if(this.organId_IN == null){
                    this.organId_IN = new ArrayList<String>();
                }
                this.organId_IN.add( organIdIn );
            }
            return this;
        }

        @Override
        public VsUserQuery organIdNotIn(String organIdNotIn) {
            if(!IdUtils.isEmpty(organIdNotIn)){
                if(this.organId_NOTIN == null){
                    this.organId_NOTIN = new ArrayList<String>();
                }
                this.organId_NOTIN.add( organIdNotIn );
            }
            return this;
        }

        @Override
        public VsUserQuery organIdIsNull() {
            this.isNulls.add("organId");
            return this;
        }

        @Override
        public VsUserQuery organIdIsNotNull() {
            this.isNotNulls.add("organId");
            return this;
        }



        @Override
        public VsUserQuery remark(String remark) {
            if(!IdUtils.isEmpty(remark)){
                this.remark = remark;
            }
            return this;
        }

        @Override
        public VsUserQuery remarkNot(String remarkNot) {
            if(!IdUtils.isEmpty(remarkNot)){
                this.remark_NE = remarkNot;
            }
            return this;
        }

        @Override
        public VsUserQuery remarkLike(String remarkLike) {
            if(!IdUtils.isEmpty(remarkLike)){
                this.remark_LIKE = remarkLike;
            }
            return this;
        }

        @Override
        public VsUserQuery remarkNotLike(String remarkNotLike) {
            if(!IdUtils.isEmpty(remarkNotLike)){
                this.remark_NOTLIKE = remarkNotLike;
            }
            return this;
        }

        @Override
        public VsUserQuery remarkIn(String remarkIn) {
            if(!IdUtils.isEmpty(remarkIn)){
                if(this.remark_IN == null){
                    this.remark_IN = new ArrayList<String>();
                }
                this.remark_IN.add( remarkIn );
            }
            return this;
        }

        @Override
        public VsUserQuery remarkNotIn(String remarkNotIn) {
            if(!IdUtils.isEmpty(remarkNotIn)){
                if(this.remark_NOTIN == null){
                    this.remark_NOTIN = new ArrayList<String>();
                }
                this.remark_NOTIN.add( remarkNotIn );
            }
            return this;
        }

        @Override
        public VsUserQuery remarkIsNull() {
            this.isNulls.add("remark");
            return this;
        }

        @Override
        public VsUserQuery remarkIsNotNull() {
            this.isNotNulls.add("remark");
            return this;
        }



        @Override
        public VsUserQuery deleteFlag(String deleteFlag) {
            if(!IdUtils.isEmpty(deleteFlag)){
                this.deleteFlag = deleteFlag;
            }
            return this;
        }

        @Override
        public VsUserQuery deleteFlagNot(String deleteFlagNot) {
            if(!IdUtils.isEmpty(deleteFlagNot)){
                this.deleteFlag_NE = deleteFlagNot;
            }
            return this;
        }

        @Override
        public VsUserQuery deleteFlagLike(String deleteFlagLike) {
            if(!IdUtils.isEmpty(deleteFlagLike)){
                this.deleteFlag_LIKE = deleteFlagLike;
            }
            return this;
        }

        @Override
        public VsUserQuery deleteFlagNotLike(String deleteFlagNotLike) {
            if(!IdUtils.isEmpty(deleteFlagNotLike)){
                this.deleteFlag_NOTLIKE = deleteFlagNotLike;
            }
            return this;
        }

        @Override
        public VsUserQuery deleteFlagIn(String deleteFlagIn) {
            if(!IdUtils.isEmpty(deleteFlagIn)){
                if(this.deleteFlag_IN == null){
                    this.deleteFlag_IN = new ArrayList<String>();
                }
                this.deleteFlag_IN.add( deleteFlagIn );
            }
            return this;
        }

        @Override
        public VsUserQuery deleteFlagNotIn(String deleteFlagNotIn) {
            if(!IdUtils.isEmpty(deleteFlagNotIn)){
                if(this.deleteFlag_NOTIN == null){
                    this.deleteFlag_NOTIN = new ArrayList<String>();
                }
                this.deleteFlag_NOTIN.add( deleteFlagNotIn );
            }
            return this;
        }

        @Override
        public VsUserQuery deleteFlagIsNull() {
            this.isNulls.add("deleteFlag");
            return this;
        }

        @Override
        public VsUserQuery deleteFlagIsNotNull() {
            this.isNotNulls.add("deleteFlag");
            return this;
        }



        @Override
        public VsUserQuery createUserId(String createUserId) {
            if(!IdUtils.isEmpty(createUserId)){
                this.createUserId = createUserId;
            }
            return this;
        }

        @Override
        public VsUserQuery createUserIdNot(String createUserIdNot) {
            if(!IdUtils.isEmpty(createUserIdNot)){
                this.createUserId_NE = createUserIdNot;
            }
            return this;
        }

        @Override
        public VsUserQuery createUserIdLike(String createUserIdLike) {
            if(!IdUtils.isEmpty(createUserIdLike)){
                this.createUserId_LIKE = createUserIdLike;
            }
            return this;
        }

        @Override
        public VsUserQuery createUserIdNotLike(String createUserIdNotLike) {
            if(!IdUtils.isEmpty(createUserIdNotLike)){
                this.createUserId_NOTLIKE = createUserIdNotLike;
            }
            return this;
        }

        @Override
        public VsUserQuery createUserIdIn(String createUserIdIn) {
            if(!IdUtils.isEmpty(createUserIdIn)){
                if(this.createUserId_IN == null){
                    this.createUserId_IN = new ArrayList<String>();
                }
                this.createUserId_IN.add( createUserIdIn );
            }
            return this;
        }

        @Override
        public VsUserQuery createUserIdNotIn(String createUserIdNotIn) {
            if(!IdUtils.isEmpty(createUserIdNotIn)){
                if(this.createUserId_NOTIN == null){
                    this.createUserId_NOTIN = new ArrayList<String>();
                }
                this.createUserId_NOTIN.add( createUserIdNotIn );
            }
            return this;
        }

        @Override
        public VsUserQuery createUserIdIsNull() {
            this.isNulls.add("createUserId");
            return this;
        }

        @Override
        public VsUserQuery createUserIdIsNotNull() {
            this.isNotNulls.add("createUserId");
            return this;
        }



        @Override
        public VsUserQuery createUserName(String createUserName) {
            if(!IdUtils.isEmpty(createUserName)){
                this.createUserName = createUserName;
            }
            return this;
        }

        @Override
        public VsUserQuery createUserNameNot(String createUserNameNot) {
            if(!IdUtils.isEmpty(createUserNameNot)){
                this.createUserName_NE = createUserNameNot;
            }
            return this;
        }

        @Override
        public VsUserQuery createUserNameLike(String createUserNameLike) {
            if(!IdUtils.isEmpty(createUserNameLike)){
                this.createUserName_LIKE = createUserNameLike;
            }
            return this;
        }

        @Override
        public VsUserQuery createUserNameNotLike(String createUserNameNotLike) {
            if(!IdUtils.isEmpty(createUserNameNotLike)){
                this.createUserName_NOTLIKE = createUserNameNotLike;
            }
            return this;
        }

        @Override
        public VsUserQuery createUserNameIn(String createUserNameIn) {
            if(!IdUtils.isEmpty(createUserNameIn)){
                if(this.createUserName_IN == null){
                    this.createUserName_IN = new ArrayList<String>();
                }
                this.createUserName_IN.add( createUserNameIn );
            }
            return this;
        }

        @Override
        public VsUserQuery createUserNameNotIn(String createUserNameNotIn) {
            if(!IdUtils.isEmpty(createUserNameNotIn)){
                if(this.createUserName_NOTIN == null){
                    this.createUserName_NOTIN = new ArrayList<String>();
                }
                this.createUserName_NOTIN.add( createUserNameNotIn );
            }
            return this;
        }

        @Override
        public VsUserQuery createUserNameIsNull() {
            this.isNulls.add("createUserName");
            return this;
        }

        @Override
        public VsUserQuery createUserNameIsNotNull() {
            this.isNotNulls.add("createUserName");
            return this;
        }


        @Override
        public VsUserQuery createTime(Timestamp createTime) {
            if(!IdUtils.isEmpty(createTime)){
                this.createTime = createTime;
            }
            return this;
        }

        @Override
        public VsUserQuery createTimeNot(Timestamp createTimeNot) {
            if(!IdUtils.isEmpty(createTimeNot)){
                this.createTime_NE = createTimeNot;
            }
            return this;
        }

        @Override
        public VsUserQuery createTimeGreaterThan(Timestamp createTimeGreaterThan){
            if(createTimeGreaterThan != null){
                this.createTime_GT = createTimeGreaterThan;
            }
            return this;
        }


        @Override
        public VsUserQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual){
            if(createTimeGreaterEqual != null){
                this.createTime_GE = createTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public VsUserQuery createTimeLessThan(Timestamp createTimeLessThan){
            if(createTimeLessThan != null){
                this.createTime_LT = createTimeLessThan;
            }
            return this;
        }

        @Override
        public VsUserQuery createTimeLessEqual(Timestamp createTimeLessEqual){
            if(createTimeLessEqual != null){
                this.createTime_LE = createTimeLessEqual;
            }
            return this;
        }


        @Override
        public VsUserQuery updateUserId(String updateUserId) {
            if(!IdUtils.isEmpty(updateUserId)){
                this.updateUserId = updateUserId;
            }
            return this;
        }

        @Override
        public VsUserQuery updateUserIdNot(String updateUserIdNot) {
            if(!IdUtils.isEmpty(updateUserIdNot)){
                this.updateUserId_NE = updateUserIdNot;
            }
            return this;
        }

        @Override
        public VsUserQuery updateUserIdLike(String updateUserIdLike) {
            if(!IdUtils.isEmpty(updateUserIdLike)){
                this.updateUserId_LIKE = updateUserIdLike;
            }
            return this;
        }

        @Override
        public VsUserQuery updateUserIdNotLike(String updateUserIdNotLike) {
            if(!IdUtils.isEmpty(updateUserIdNotLike)){
                this.updateUserId_NOTLIKE = updateUserIdNotLike;
            }
            return this;
        }

        @Override
        public VsUserQuery updateUserIdIn(String updateUserIdIn) {
            if(!IdUtils.isEmpty(updateUserIdIn)){
                if(this.updateUserId_IN == null){
                    this.updateUserId_IN = new ArrayList<String>();
                }
                this.updateUserId_IN.add( updateUserIdIn );
            }
            return this;
        }

        @Override
        public VsUserQuery updateUserIdNotIn(String updateUserIdNotIn) {
            if(!IdUtils.isEmpty(updateUserIdNotIn)){
                if(this.updateUserId_NOTIN == null){
                    this.updateUserId_NOTIN = new ArrayList<String>();
                }
                this.updateUserId_NOTIN.add( updateUserIdNotIn );
            }
            return this;
        }

        @Override
        public VsUserQuery updateUserIdIsNull() {
            this.isNulls.add("updateUserId");
            return this;
        }

        @Override
        public VsUserQuery updateUserIdIsNotNull() {
            this.isNotNulls.add("updateUserId");
            return this;
        }



        @Override
        public VsUserQuery updateUserName(String updateUserName) {
            if(!IdUtils.isEmpty(updateUserName)){
                this.updateUserName = updateUserName;
            }
            return this;
        }

        @Override
        public VsUserQuery updateUserNameNot(String updateUserNameNot) {
            if(!IdUtils.isEmpty(updateUserNameNot)){
                this.updateUserName_NE = updateUserNameNot;
            }
            return this;
        }

        @Override
        public VsUserQuery updateUserNameLike(String updateUserNameLike) {
            if(!IdUtils.isEmpty(updateUserNameLike)){
                this.updateUserName_LIKE = updateUserNameLike;
            }
            return this;
        }

        @Override
        public VsUserQuery updateUserNameNotLike(String updateUserNameNotLike) {
            if(!IdUtils.isEmpty(updateUserNameNotLike)){
                this.updateUserName_NOTLIKE = updateUserNameNotLike;
            }
            return this;
        }

        @Override
        public VsUserQuery updateUserNameIn(String updateUserNameIn) {
            if(!IdUtils.isEmpty(updateUserNameIn)){
                if(this.updateUserName_IN == null){
                    this.updateUserName_IN = new ArrayList<String>();
                }
                this.updateUserName_IN.add( updateUserNameIn );
            }
            return this;
        }

        @Override
        public VsUserQuery updateUserNameNotIn(String updateUserNameNotIn) {
            if(!IdUtils.isEmpty(updateUserNameNotIn)){
                if(this.updateUserName_NOTIN == null){
                    this.updateUserName_NOTIN = new ArrayList<String>();
                }
                this.updateUserName_NOTIN.add( updateUserNameNotIn );
            }
            return this;
        }

        @Override
        public VsUserQuery updateUserNameIsNull() {
            this.isNulls.add("updateUserName");
            return this;
        }

        @Override
        public VsUserQuery updateUserNameIsNotNull() {
            this.isNotNulls.add("updateUserName");
            return this;
        }


        @Override
        public VsUserQuery updateTime(Timestamp updateTime) {
            if(!IdUtils.isEmpty(updateTime)){
                this.updateTime = updateTime;
            }
            return this;
        }

        @Override
        public VsUserQuery updateTimeNot(Timestamp updateTimeNot) {
            if(!IdUtils.isEmpty(updateTimeNot)){
                this.updateTime_NE = updateTimeNot;
            }
            return this;
        }

        @Override
        public VsUserQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan){
            if(updateTimeGreaterThan != null){
                this.updateTime_GT = updateTimeGreaterThan;
            }
            return this;
        }


        @Override
        public VsUserQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual){
            if(updateTimeGreaterEqual != null){
                this.updateTime_GE = updateTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public VsUserQuery updateTimeLessThan(Timestamp updateTimeLessThan){
            if(updateTimeLessThan != null){
                this.updateTime_LT = updateTimeLessThan;
            }
            return this;
        }

        @Override
        public VsUserQuery updateTimeLessEqual(Timestamp updateTimeLessEqual){
            if(updateTimeLessEqual != null){
                this.updateTime_LE = updateTimeLessEqual;
            }
            return this;
        }

        @Override
        public VsUserQuery versionNo(Integer versionNo) {
            if(!IdUtils.isEmpty(versionNo)){
                this.versionNo = versionNo;
            }
            return this;
        }

        @Override
        public VsUserQuery versionNoNot(Integer versionNoNot) {
            if(!IdUtils.isEmpty(versionNoNot)){
                this.versionNo_NE = versionNoNot;
            }
            return this;
        }

        @Override
        public VsUserQuery versionNoGreaterThan(Integer versionNoGreaterThan){
            if(versionNoGreaterThan != null){
                this.versionNo_GT = versionNoGreaterThan;
            }
            return this;
        }

        @Override
        public VsUserQuery versionNoGreaterEqual(Integer versionNoGreaterEqual){
            if(versionNoGreaterEqual != null){
                this.versionNo_GE = versionNoGreaterEqual;
            }
            return this;
        }

        @Override
        public VsUserQuery versionNoLessThan(Integer versionNoLessThan){
            if(versionNoLessThan != null){
                this.versionNo_LT = versionNoLessThan;
            }
            return this;
        }

        @Override
        public VsUserQuery versionNoLessEqual(Integer versionNoLessEqual){
            if(versionNoLessEqual != null){
                this.versionNo_LE = versionNoLessEqual;
            }
            return this;
        }


        @Override
        public VsUserQuery tenantId(String tenantId) {
            if(!IdUtils.isEmpty(tenantId)){
                this.tenantId = tenantId;
            }
            return this;
        }

        @Override
        public VsUserQuery tenantIdNot(String tenantIdNot) {
            if(!IdUtils.isEmpty(tenantIdNot)){
                this.tenantId_NE = tenantIdNot;
            }
            return this;
        }

        @Override
        public VsUserQuery tenantIdLike(String tenantIdLike) {
            if(!IdUtils.isEmpty(tenantIdLike)){
                this.tenantId_LIKE = tenantIdLike;
            }
            return this;
        }

        @Override
        public VsUserQuery tenantIdNotLike(String tenantIdNotLike) {
            if(!IdUtils.isEmpty(tenantIdNotLike)){
                this.tenantId_NOTLIKE = tenantIdNotLike;
            }
            return this;
        }

        @Override
        public VsUserQuery tenantIdIn(String tenantIdIn) {
            if(!IdUtils.isEmpty(tenantIdIn)){
                if(this.tenantId_IN == null){
                    this.tenantId_IN = new ArrayList<String>();
                }
                this.tenantId_IN.add( tenantIdIn );
            }
            return this;
        }

        @Override
        public VsUserQuery tenantIdNotIn(String tenantIdNotIn) {
            if(!IdUtils.isEmpty(tenantIdNotIn)){
                if(this.tenantId_NOTIN == null){
                    this.tenantId_NOTIN = new ArrayList<String>();
                }
                this.tenantId_NOTIN.add( tenantIdNotIn );
            }
            return this;
        }

        @Override
        public VsUserQuery tenantIdIsNull() {
            this.isNulls.add("tenantId");
            return this;
        }

        @Override
        public VsUserQuery tenantIdIsNotNull() {
            this.isNotNulls.add("tenantId");
            return this;
        }



        @Override
        public VsUserQuery depName(String depName) {
            if(!IdUtils.isEmpty(depName)){
                this.depName = depName;
            }
            return this;
        }

        @Override
        public VsUserQuery depNameNot(String depNameNot) {
            if(!IdUtils.isEmpty(depNameNot)){
                this.depName_NE = depNameNot;
            }
            return this;
        }

        @Override
        public VsUserQuery depNameLike(String depNameLike) {
            if(!IdUtils.isEmpty(depNameLike)){
                this.depName_LIKE = depNameLike;
            }
            return this;
        }

        @Override
        public VsUserQuery depNameNotLike(String depNameNotLike) {
            if(!IdUtils.isEmpty(depNameNotLike)){
                this.depName_NOTLIKE = depNameNotLike;
            }
            return this;
        }

        @Override
        public VsUserQuery depNameIn(String depNameIn) {
            if(!IdUtils.isEmpty(depNameIn)){
                if(this.depName_IN == null){
                    this.depName_IN = new ArrayList<String>();
                }
                this.depName_IN.add( depNameIn );
            }
            return this;
        }

        @Override
        public VsUserQuery depNameNotIn(String depNameNotIn) {
            if(!IdUtils.isEmpty(depNameNotIn)){
                if(this.depName_NOTIN == null){
                    this.depName_NOTIN = new ArrayList<String>();
                }
                this.depName_NOTIN.add( depNameNotIn );
            }
            return this;
        }

        @Override
        public VsUserQuery depNameIsNull() {
            this.isNulls.add("depName");
            return this;
        }

        @Override
        public VsUserQuery depNameIsNotNull() {
            this.isNotNulls.add("depName");
            return this;
        }



        @Override
        public VsUserQuery organName(String organName) {
            if(!IdUtils.isEmpty(organName)){
                this.organName = organName;
            }
            return this;
        }

        @Override
        public VsUserQuery organNameNot(String organNameNot) {
            if(!IdUtils.isEmpty(organNameNot)){
                this.organName_NE = organNameNot;
            }
            return this;
        }

        @Override
        public VsUserQuery organNameLike(String organNameLike) {
            if(!IdUtils.isEmpty(organNameLike)){
                this.organName_LIKE = organNameLike;
            }
            return this;
        }

        @Override
        public VsUserQuery organNameNotLike(String organNameNotLike) {
            if(!IdUtils.isEmpty(organNameNotLike)){
                this.organName_NOTLIKE = organNameNotLike;
            }
            return this;
        }

        @Override
        public VsUserQuery organNameIn(String organNameIn) {
            if(!IdUtils.isEmpty(organNameIn)){
                if(this.organName_IN == null){
                    this.organName_IN = new ArrayList<String>();
                }
                this.organName_IN.add( organNameIn );
            }
            return this;
        }

        @Override
        public VsUserQuery organNameNotIn(String organNameNotIn) {
            if(!IdUtils.isEmpty(organNameNotIn)){
                if(this.organName_NOTIN == null){
                    this.organName_NOTIN = new ArrayList<String>();
                }
                this.organName_NOTIN.add( organNameNotIn );
            }
            return this;
        }

        @Override
        public VsUserQuery organNameIsNull() {
            this.isNulls.add("organName");
            return this;
        }

        @Override
        public VsUserQuery organNameIsNotNull() {
            this.isNotNulls.add("organName");
            return this;
        }



        @Override
        public VsUserQuery tenantName(String tenantName) {
            if(!IdUtils.isEmpty(tenantName)){
                this.tenantName = tenantName;
            }
            return this;
        }

        @Override
        public VsUserQuery tenantNameNot(String tenantNameNot) {
            if(!IdUtils.isEmpty(tenantNameNot)){
                this.tenantName_NE = tenantNameNot;
            }
            return this;
        }

        @Override
        public VsUserQuery tenantNameLike(String tenantNameLike) {
            if(!IdUtils.isEmpty(tenantNameLike)){
                this.tenantName_LIKE = tenantNameLike;
            }
            return this;
        }

        @Override
        public VsUserQuery tenantNameNotLike(String tenantNameNotLike) {
            if(!IdUtils.isEmpty(tenantNameNotLike)){
                this.tenantName_NOTLIKE = tenantNameNotLike;
            }
            return this;
        }

        @Override
        public VsUserQuery tenantNameIn(String tenantNameIn) {
            if(!IdUtils.isEmpty(tenantNameIn)){
                if(this.tenantName_IN == null){
                    this.tenantName_IN = new ArrayList<String>();
                }
                this.tenantName_IN.add( tenantNameIn );
            }
            return this;
        }

        @Override
        public VsUserQuery tenantNameNotIn(String tenantNameNotIn) {
            if(!IdUtils.isEmpty(tenantNameNotIn)){
                if(this.tenantName_NOTIN == null){
                    this.tenantName_NOTIN = new ArrayList<String>();
                }
                this.tenantName_NOTIN.add( tenantNameNotIn );
            }
            return this;
        }

        @Override
        public VsUserQuery tenantNameIsNull() {
            this.isNulls.add("tenantName");
            return this;
        }

        @Override
        public VsUserQuery tenantNameIsNotNull() {
            this.isNotNulls.add("tenantName");
            return this;
        }



	
}