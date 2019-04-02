package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.VsNodeUserEntity;
import com.zz.bms.system.query.VsNodeUserQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* VIEW 查询实现类
* 用于链式查询
* @author Administrator
* @date 2019-4-1 13:52:04
*/
public class VsNodeUserQueryImpl<PK extends Serializable> extends VsNodeUserAbstractQueryImpl<PK> implements VsNodeUserQuery<PK>, Serializable  {

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

        private List<String> avatarImage_IN;
        private List<String> avatarImage_NOTIN;

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


        @Override
        public VsNodeUserQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public VsNodeUserQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }



        @Override
        public VsNodeUserQuery userName(String userName) {
            if(!IdUtils.isEmpty(userName)){
                this.userName = userName;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery userNameNot(String userNameNot) {
            if(!IdUtils.isEmpty(userNameNot)){
                this.userName_NE = userNameNot;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery userNameLike(String userNameLike) {
            if(!IdUtils.isEmpty(userNameLike)){
                this.userName_LIKE = userNameLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery userNameNotLike(String userNameNotLike) {
            if(!IdUtils.isEmpty(userNameNotLike)){
                this.userName_NOTLIKE = userNameNotLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery userNameIn(String userNameIn) {
            if(!IdUtils.isEmpty(userNameIn)){
                if(this.userName_IN == null){
                    this.userName_IN = new ArrayList<String>();
                }
                this.userName_IN.add( userNameIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery userNameNotIn(String userNameNotIn) {
            if(!IdUtils.isEmpty(userNameNotIn)){
                if(this.userName_NOTIN == null){
                    this.userName_NOTIN = new ArrayList<String>();
                }
                this.userName_NOTIN.add( userNameNotIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery userNameIsNull() {
            this.isNulls.add("userName");
            return this;
        }

        @Override
        public VsNodeUserQuery userNameIsNotNull() {
            this.isNotNulls.add("userName");
            return this;
        }



        @Override
        public VsNodeUserQuery loginName(String loginName) {
            if(!IdUtils.isEmpty(loginName)){
                this.loginName = loginName;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery loginNameNot(String loginNameNot) {
            if(!IdUtils.isEmpty(loginNameNot)){
                this.loginName_NE = loginNameNot;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery loginNameLike(String loginNameLike) {
            if(!IdUtils.isEmpty(loginNameLike)){
                this.loginName_LIKE = loginNameLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery loginNameNotLike(String loginNameNotLike) {
            if(!IdUtils.isEmpty(loginNameNotLike)){
                this.loginName_NOTLIKE = loginNameNotLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery loginNameIn(String loginNameIn) {
            if(!IdUtils.isEmpty(loginNameIn)){
                if(this.loginName_IN == null){
                    this.loginName_IN = new ArrayList<String>();
                }
                this.loginName_IN.add( loginNameIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery loginNameNotIn(String loginNameNotIn) {
            if(!IdUtils.isEmpty(loginNameNotIn)){
                if(this.loginName_NOTIN == null){
                    this.loginName_NOTIN = new ArrayList<String>();
                }
                this.loginName_NOTIN.add( loginNameNotIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery loginNameIsNull() {
            this.isNulls.add("loginName");
            return this;
        }

        @Override
        public VsNodeUserQuery loginNameIsNotNull() {
            this.isNotNulls.add("loginName");
            return this;
        }



        @Override
        public VsNodeUserQuery loginPassword(String loginPassword) {
            if(!IdUtils.isEmpty(loginPassword)){
                this.loginPassword = loginPassword;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery loginPasswordNot(String loginPasswordNot) {
            if(!IdUtils.isEmpty(loginPasswordNot)){
                this.loginPassword_NE = loginPasswordNot;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery loginPasswordLike(String loginPasswordLike) {
            if(!IdUtils.isEmpty(loginPasswordLike)){
                this.loginPassword_LIKE = loginPasswordLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery loginPasswordNotLike(String loginPasswordNotLike) {
            if(!IdUtils.isEmpty(loginPasswordNotLike)){
                this.loginPassword_NOTLIKE = loginPasswordNotLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery loginPasswordIn(String loginPasswordIn) {
            if(!IdUtils.isEmpty(loginPasswordIn)){
                if(this.loginPassword_IN == null){
                    this.loginPassword_IN = new ArrayList<String>();
                }
                this.loginPassword_IN.add( loginPasswordIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery loginPasswordNotIn(String loginPasswordNotIn) {
            if(!IdUtils.isEmpty(loginPasswordNotIn)){
                if(this.loginPassword_NOTIN == null){
                    this.loginPassword_NOTIN = new ArrayList<String>();
                }
                this.loginPassword_NOTIN.add( loginPasswordNotIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery loginPasswordIsNull() {
            this.isNulls.add("loginPassword");
            return this;
        }

        @Override
        public VsNodeUserQuery loginPasswordIsNotNull() {
            this.isNotNulls.add("loginPassword");
            return this;
        }



        @Override
        public VsNodeUserQuery salt(String salt) {
            if(!IdUtils.isEmpty(salt)){
                this.salt = salt;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery saltNot(String saltNot) {
            if(!IdUtils.isEmpty(saltNot)){
                this.salt_NE = saltNot;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery saltLike(String saltLike) {
            if(!IdUtils.isEmpty(saltLike)){
                this.salt_LIKE = saltLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery saltNotLike(String saltNotLike) {
            if(!IdUtils.isEmpty(saltNotLike)){
                this.salt_NOTLIKE = saltNotLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery saltIn(String saltIn) {
            if(!IdUtils.isEmpty(saltIn)){
                if(this.salt_IN == null){
                    this.salt_IN = new ArrayList<String>();
                }
                this.salt_IN.add( saltIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery saltNotIn(String saltNotIn) {
            if(!IdUtils.isEmpty(saltNotIn)){
                if(this.salt_NOTIN == null){
                    this.salt_NOTIN = new ArrayList<String>();
                }
                this.salt_NOTIN.add( saltNotIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery saltIsNull() {
            this.isNulls.add("salt");
            return this;
        }

        @Override
        public VsNodeUserQuery saltIsNotNull() {
            this.isNotNulls.add("salt");
            return this;
        }


        @Override
        public VsNodeUserQuery userStatus(String userStatus) {
            if(!IdUtils.isEmpty(userStatus)){
                this.userStatus = userStatus;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery userStatusNot(String userStatusNot) {
            if(!IdUtils.isEmpty(userStatusNot)){
                this.userStatus_NE = userStatusNot;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery userStatusIn(String userStatusIn) {
            if(!IdUtils.isEmpty(userStatusIn)){
                if(this.userStatus_IN == null){
                    this.userStatus_IN = new ArrayList<String>();
                }
                this.userStatus_IN.add( userStatusIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery userStatusNotIn(String userStatusNotIn) {
            if(!IdUtils.isEmpty(userStatusNotIn)){
                if(this.userStatus_NOTIN == null){
                    this.userStatus_NOTIN = new ArrayList<String>();
                }
                this.userStatus_NOTIN.add( userStatusNotIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery userStatusIsNull() {
            this.isNulls.add("userStatus");
            return this;
        }

        @Override
        public VsNodeUserQuery userStatusIsNotNull() {
            this.isNotNulls.add("userStatus");
            return this;
        }


        @Override
        public VsNodeUserQuery leadUserId(PK leadUserId) {
            if(!IdUtils.isEmpty(leadUserId)){
                this.leadUserId = leadUserId;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery leadUserIdNot(PK leadUserIdNot) {
            if(!IdUtils.isEmpty(leadUserIdNot)){
                this.leadUserId_NE = leadUserIdNot;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery leadUserIdIn(PK leadUserIdIn) {
            if(!IdUtils.isEmpty(leadUserIdIn)){
                if(this.leadUserId_IN == null){
                    this.leadUserId_IN = new ArrayList<PK>();
                }
                this.leadUserId_IN.add( leadUserIdIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery leadUserIdNotIn(PK leadUserIdNotIn) {
            if(!IdUtils.isEmpty(leadUserIdNotIn)){
                if(this.leadUserId_NOTIN == null){
                    this.leadUserId_NOTIN = new ArrayList<PK>();
                }
                this.leadUserId_NOTIN.add( leadUserIdNotIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery leadUserIdIsNull() {
            this.isNulls.add("leadUserId");
            return this;
        }

        @Override
        public VsNodeUserQuery leadUserIdIsNotNull() {
            this.isNotNulls.add("leadUserId");
            return this;
        }



        @Override
        public VsNodeUserQuery phone(String phone) {
            if(!IdUtils.isEmpty(phone)){
                this.phone = phone;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery phoneNot(String phoneNot) {
            if(!IdUtils.isEmpty(phoneNot)){
                this.phone_NE = phoneNot;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery phoneLike(String phoneLike) {
            if(!IdUtils.isEmpty(phoneLike)){
                this.phone_LIKE = phoneLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery phoneNotLike(String phoneNotLike) {
            if(!IdUtils.isEmpty(phoneNotLike)){
                this.phone_NOTLIKE = phoneNotLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery phoneIn(String phoneIn) {
            if(!IdUtils.isEmpty(phoneIn)){
                if(this.phone_IN == null){
                    this.phone_IN = new ArrayList<String>();
                }
                this.phone_IN.add( phoneIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery phoneNotIn(String phoneNotIn) {
            if(!IdUtils.isEmpty(phoneNotIn)){
                if(this.phone_NOTIN == null){
                    this.phone_NOTIN = new ArrayList<String>();
                }
                this.phone_NOTIN.add( phoneNotIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery phoneIsNull() {
            this.isNulls.add("phone");
            return this;
        }

        @Override
        public VsNodeUserQuery phoneIsNotNull() {
            this.isNotNulls.add("phone");
            return this;
        }



        @Override
        public VsNodeUserQuery email(String email) {
            if(!IdUtils.isEmpty(email)){
                this.email = email;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery emailNot(String emailNot) {
            if(!IdUtils.isEmpty(emailNot)){
                this.email_NE = emailNot;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery emailLike(String emailLike) {
            if(!IdUtils.isEmpty(emailLike)){
                this.email_LIKE = emailLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery emailNotLike(String emailNotLike) {
            if(!IdUtils.isEmpty(emailNotLike)){
                this.email_NOTLIKE = emailNotLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery emailIn(String emailIn) {
            if(!IdUtils.isEmpty(emailIn)){
                if(this.email_IN == null){
                    this.email_IN = new ArrayList<String>();
                }
                this.email_IN.add( emailIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery emailNotIn(String emailNotIn) {
            if(!IdUtils.isEmpty(emailNotIn)){
                if(this.email_NOTIN == null){
                    this.email_NOTIN = new ArrayList<String>();
                }
                this.email_NOTIN.add( emailNotIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery emailIsNull() {
            this.isNulls.add("email");
            return this;
        }

        @Override
        public VsNodeUserQuery emailIsNotNull() {
            this.isNotNulls.add("email");
            return this;
        }



        @Override
        public VsNodeUserQuery avatarImage(String avatarImage) {
            if(!IdUtils.isEmpty(avatarImage)){
                this.avatarImage = avatarImage;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery avatarImageNot(String avatarImageNot) {
            if(!IdUtils.isEmpty(avatarImageNot)){
                this.avatarImage_NE = avatarImageNot;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery avatarImageLike(String avatarImageLike) {
            if(!IdUtils.isEmpty(avatarImageLike)){
                this.avatarImage_LIKE = avatarImageLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery avatarImageNotLike(String avatarImageNotLike) {
            if(!IdUtils.isEmpty(avatarImageNotLike)){
                this.avatarImage_NOTLIKE = avatarImageNotLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery avatarImageIn(String avatarImageIn) {
            if(!IdUtils.isEmpty(avatarImageIn)){
                if(this.avatarImage_IN == null){
                    this.avatarImage_IN = new ArrayList<String>();
                }
                this.avatarImage_IN.add( avatarImageIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery avatarImageNotIn(String avatarImageNotIn) {
            if(!IdUtils.isEmpty(avatarImageNotIn)){
                if(this.avatarImage_NOTIN == null){
                    this.avatarImage_NOTIN = new ArrayList<String>();
                }
                this.avatarImage_NOTIN.add( avatarImageNotIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery avatarImageIsNull() {
            this.isNulls.add("avatarImage");
            return this;
        }

        @Override
        public VsNodeUserQuery avatarImageIsNotNull() {
            this.isNotNulls.add("avatarImage");
            return this;
        }



        @Override
        public VsNodeUserQuery openId(String openId) {
            if(!IdUtils.isEmpty(openId)){
                this.openId = openId;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery openIdNot(String openIdNot) {
            if(!IdUtils.isEmpty(openIdNot)){
                this.openId_NE = openIdNot;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery openIdLike(String openIdLike) {
            if(!IdUtils.isEmpty(openIdLike)){
                this.openId_LIKE = openIdLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery openIdNotLike(String openIdNotLike) {
            if(!IdUtils.isEmpty(openIdNotLike)){
                this.openId_NOTLIKE = openIdNotLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery openIdIn(String openIdIn) {
            if(!IdUtils.isEmpty(openIdIn)){
                if(this.openId_IN == null){
                    this.openId_IN = new ArrayList<String>();
                }
                this.openId_IN.add( openIdIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery openIdNotIn(String openIdNotIn) {
            if(!IdUtils.isEmpty(openIdNotIn)){
                if(this.openId_NOTIN == null){
                    this.openId_NOTIN = new ArrayList<String>();
                }
                this.openId_NOTIN.add( openIdNotIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery openIdIsNull() {
            this.isNulls.add("openId");
            return this;
        }

        @Override
        public VsNodeUserQuery openIdIsNotNull() {
            this.isNotNulls.add("openId");
            return this;
        }



        @Override
        public VsNodeUserQuery unionId(String unionId) {
            if(!IdUtils.isEmpty(unionId)){
                this.unionId = unionId;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery unionIdNot(String unionIdNot) {
            if(!IdUtils.isEmpty(unionIdNot)){
                this.unionId_NE = unionIdNot;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery unionIdLike(String unionIdLike) {
            if(!IdUtils.isEmpty(unionIdLike)){
                this.unionId_LIKE = unionIdLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery unionIdNotLike(String unionIdNotLike) {
            if(!IdUtils.isEmpty(unionIdNotLike)){
                this.unionId_NOTLIKE = unionIdNotLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery unionIdIn(String unionIdIn) {
            if(!IdUtils.isEmpty(unionIdIn)){
                if(this.unionId_IN == null){
                    this.unionId_IN = new ArrayList<String>();
                }
                this.unionId_IN.add( unionIdIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery unionIdNotIn(String unionIdNotIn) {
            if(!IdUtils.isEmpty(unionIdNotIn)){
                if(this.unionId_NOTIN == null){
                    this.unionId_NOTIN = new ArrayList<String>();
                }
                this.unionId_NOTIN.add( unionIdNotIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery unionIdIsNull() {
            this.isNulls.add("unionId");
            return this;
        }

        @Override
        public VsNodeUserQuery unionIdIsNotNull() {
            this.isNotNulls.add("unionId");
            return this;
        }


        @Override
        public VsNodeUserQuery systemAdmin(String systemAdmin) {
            if(!IdUtils.isEmpty(systemAdmin)){
                this.systemAdmin = systemAdmin;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery systemAdminNot(String systemAdminNot) {
            if(!IdUtils.isEmpty(systemAdminNot)){
                this.systemAdmin_NE = systemAdminNot;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery systemAdminIn(String systemAdminIn) {
            if(!IdUtils.isEmpty(systemAdminIn)){
                if(this.systemAdmin_IN == null){
                    this.systemAdmin_IN = new ArrayList<String>();
                }
                this.systemAdmin_IN.add( systemAdminIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery systemAdminNotIn(String systemAdminNotIn) {
            if(!IdUtils.isEmpty(systemAdminNotIn)){
                if(this.systemAdmin_NOTIN == null){
                    this.systemAdmin_NOTIN = new ArrayList<String>();
                }
                this.systemAdmin_NOTIN.add( systemAdminNotIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery systemAdminIsNull() {
            this.isNulls.add("systemAdmin");
            return this;
        }

        @Override
        public VsNodeUserQuery systemAdminIsNotNull() {
            this.isNotNulls.add("systemAdmin");
            return this;
        }



        @Override
        public VsNodeUserQuery depId(String depId) {
            if(!IdUtils.isEmpty(depId)){
                this.depId = depId;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery depIdNot(String depIdNot) {
            if(!IdUtils.isEmpty(depIdNot)){
                this.depId_NE = depIdNot;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery depIdLike(String depIdLike) {
            if(!IdUtils.isEmpty(depIdLike)){
                this.depId_LIKE = depIdLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery depIdNotLike(String depIdNotLike) {
            if(!IdUtils.isEmpty(depIdNotLike)){
                this.depId_NOTLIKE = depIdNotLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery depIdIn(String depIdIn) {
            if(!IdUtils.isEmpty(depIdIn)){
                if(this.depId_IN == null){
                    this.depId_IN = new ArrayList<String>();
                }
                this.depId_IN.add( depIdIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery depIdNotIn(String depIdNotIn) {
            if(!IdUtils.isEmpty(depIdNotIn)){
                if(this.depId_NOTIN == null){
                    this.depId_NOTIN = new ArrayList<String>();
                }
                this.depId_NOTIN.add( depIdNotIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery depIdIsNull() {
            this.isNulls.add("depId");
            return this;
        }

        @Override
        public VsNodeUserQuery depIdIsNotNull() {
            this.isNotNulls.add("depId");
            return this;
        }



        @Override
        public VsNodeUserQuery organId(String organId) {
            if(!IdUtils.isEmpty(organId)){
                this.organId = organId;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery organIdNot(String organIdNot) {
            if(!IdUtils.isEmpty(organIdNot)){
                this.organId_NE = organIdNot;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery organIdLike(String organIdLike) {
            if(!IdUtils.isEmpty(organIdLike)){
                this.organId_LIKE = organIdLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery organIdNotLike(String organIdNotLike) {
            if(!IdUtils.isEmpty(organIdNotLike)){
                this.organId_NOTLIKE = organIdNotLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery organIdIn(String organIdIn) {
            if(!IdUtils.isEmpty(organIdIn)){
                if(this.organId_IN == null){
                    this.organId_IN = new ArrayList<String>();
                }
                this.organId_IN.add( organIdIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery organIdNotIn(String organIdNotIn) {
            if(!IdUtils.isEmpty(organIdNotIn)){
                if(this.organId_NOTIN == null){
                    this.organId_NOTIN = new ArrayList<String>();
                }
                this.organId_NOTIN.add( organIdNotIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery organIdIsNull() {
            this.isNulls.add("organId");
            return this;
        }

        @Override
        public VsNodeUserQuery organIdIsNotNull() {
            this.isNotNulls.add("organId");
            return this;
        }


        @Override
        public VsNodeUserQuery pageLimit(Integer pageLimit) {
            if(!IdUtils.isEmpty(pageLimit)){
                this.pageLimit = pageLimit;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery pageLimitNot(Integer pageLimitNot) {
            if(!IdUtils.isEmpty(pageLimitNot)){
                this.pageLimit_NE = pageLimitNot;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery pageLimitGreaterThan(Integer pageLimitGreaterThan){
            if(pageLimitGreaterThan != null){
                this.pageLimit_GT = pageLimitGreaterThan;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery pageLimitGreaterEqual(Integer pageLimitGreaterEqual){
            if(pageLimitGreaterEqual != null){
                this.pageLimit_GE = pageLimitGreaterEqual;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery pageLimitLessThan(Integer pageLimitLessThan){
            if(pageLimitLessThan != null){
                this.pageLimit_LT = pageLimitLessThan;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery pageLimitLessEqual(Integer pageLimitLessEqual){
            if(pageLimitLessEqual != null){
                this.pageLimit_LE = pageLimitLessEqual;
            }
            return this;
        }


        @Override
        public VsNodeUserQuery remark(String remark) {
            if(!IdUtils.isEmpty(remark)){
                this.remark = remark;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery remarkNot(String remarkNot) {
            if(!IdUtils.isEmpty(remarkNot)){
                this.remark_NE = remarkNot;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery remarkLike(String remarkLike) {
            if(!IdUtils.isEmpty(remarkLike)){
                this.remark_LIKE = remarkLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery remarkNotLike(String remarkNotLike) {
            if(!IdUtils.isEmpty(remarkNotLike)){
                this.remark_NOTLIKE = remarkNotLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery remarkIn(String remarkIn) {
            if(!IdUtils.isEmpty(remarkIn)){
                if(this.remark_IN == null){
                    this.remark_IN = new ArrayList<String>();
                }
                this.remark_IN.add( remarkIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery remarkNotIn(String remarkNotIn) {
            if(!IdUtils.isEmpty(remarkNotIn)){
                if(this.remark_NOTIN == null){
                    this.remark_NOTIN = new ArrayList<String>();
                }
                this.remark_NOTIN.add( remarkNotIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery remarkIsNull() {
            this.isNulls.add("remark");
            return this;
        }

        @Override
        public VsNodeUserQuery remarkIsNotNull() {
            this.isNotNulls.add("remark");
            return this;
        }



        @Override
        public VsNodeUserQuery deleteFlag(String deleteFlag) {
            if(!IdUtils.isEmpty(deleteFlag)){
                this.deleteFlag = deleteFlag;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery deleteFlagNot(String deleteFlagNot) {
            if(!IdUtils.isEmpty(deleteFlagNot)){
                this.deleteFlag_NE = deleteFlagNot;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery deleteFlagLike(String deleteFlagLike) {
            if(!IdUtils.isEmpty(deleteFlagLike)){
                this.deleteFlag_LIKE = deleteFlagLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery deleteFlagNotLike(String deleteFlagNotLike) {
            if(!IdUtils.isEmpty(deleteFlagNotLike)){
                this.deleteFlag_NOTLIKE = deleteFlagNotLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery deleteFlagIn(String deleteFlagIn) {
            if(!IdUtils.isEmpty(deleteFlagIn)){
                if(this.deleteFlag_IN == null){
                    this.deleteFlag_IN = new ArrayList<String>();
                }
                this.deleteFlag_IN.add( deleteFlagIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery deleteFlagNotIn(String deleteFlagNotIn) {
            if(!IdUtils.isEmpty(deleteFlagNotIn)){
                if(this.deleteFlag_NOTIN == null){
                    this.deleteFlag_NOTIN = new ArrayList<String>();
                }
                this.deleteFlag_NOTIN.add( deleteFlagNotIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery deleteFlagIsNull() {
            this.isNulls.add("deleteFlag");
            return this;
        }

        @Override
        public VsNodeUserQuery deleteFlagIsNotNull() {
            this.isNotNulls.add("deleteFlag");
            return this;
        }



        @Override
        public VsNodeUserQuery createUserId(String createUserId) {
            if(!IdUtils.isEmpty(createUserId)){
                this.createUserId = createUserId;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery createUserIdNot(String createUserIdNot) {
            if(!IdUtils.isEmpty(createUserIdNot)){
                this.createUserId_NE = createUserIdNot;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery createUserIdLike(String createUserIdLike) {
            if(!IdUtils.isEmpty(createUserIdLike)){
                this.createUserId_LIKE = createUserIdLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery createUserIdNotLike(String createUserIdNotLike) {
            if(!IdUtils.isEmpty(createUserIdNotLike)){
                this.createUserId_NOTLIKE = createUserIdNotLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery createUserIdIn(String createUserIdIn) {
            if(!IdUtils.isEmpty(createUserIdIn)){
                if(this.createUserId_IN == null){
                    this.createUserId_IN = new ArrayList<String>();
                }
                this.createUserId_IN.add( createUserIdIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery createUserIdNotIn(String createUserIdNotIn) {
            if(!IdUtils.isEmpty(createUserIdNotIn)){
                if(this.createUserId_NOTIN == null){
                    this.createUserId_NOTIN = new ArrayList<String>();
                }
                this.createUserId_NOTIN.add( createUserIdNotIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery createUserIdIsNull() {
            this.isNulls.add("createUserId");
            return this;
        }

        @Override
        public VsNodeUserQuery createUserIdIsNotNull() {
            this.isNotNulls.add("createUserId");
            return this;
        }



        @Override
        public VsNodeUserQuery createUserName(String createUserName) {
            if(!IdUtils.isEmpty(createUserName)){
                this.createUserName = createUserName;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery createUserNameNot(String createUserNameNot) {
            if(!IdUtils.isEmpty(createUserNameNot)){
                this.createUserName_NE = createUserNameNot;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery createUserNameLike(String createUserNameLike) {
            if(!IdUtils.isEmpty(createUserNameLike)){
                this.createUserName_LIKE = createUserNameLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery createUserNameNotLike(String createUserNameNotLike) {
            if(!IdUtils.isEmpty(createUserNameNotLike)){
                this.createUserName_NOTLIKE = createUserNameNotLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery createUserNameIn(String createUserNameIn) {
            if(!IdUtils.isEmpty(createUserNameIn)){
                if(this.createUserName_IN == null){
                    this.createUserName_IN = new ArrayList<String>();
                }
                this.createUserName_IN.add( createUserNameIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery createUserNameNotIn(String createUserNameNotIn) {
            if(!IdUtils.isEmpty(createUserNameNotIn)){
                if(this.createUserName_NOTIN == null){
                    this.createUserName_NOTIN = new ArrayList<String>();
                }
                this.createUserName_NOTIN.add( createUserNameNotIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery createUserNameIsNull() {
            this.isNulls.add("createUserName");
            return this;
        }

        @Override
        public VsNodeUserQuery createUserNameIsNotNull() {
            this.isNotNulls.add("createUserName");
            return this;
        }


        @Override
        public VsNodeUserQuery createTime(Timestamp createTime) {
            if(!IdUtils.isEmpty(createTime)){
                this.createTime = createTime;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery createTimeNot(Timestamp createTimeNot) {
            if(!IdUtils.isEmpty(createTimeNot)){
                this.createTime_NE = createTimeNot;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery createTimeGreaterThan(Timestamp createTimeGreaterThan){
            if(createTimeGreaterThan != null){
                this.createTime_GT = createTimeGreaterThan;
            }
            return this;
        }


        @Override
        public VsNodeUserQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual){
            if(createTimeGreaterEqual != null){
                this.createTime_GE = createTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery createTimeLessThan(Timestamp createTimeLessThan){
            if(createTimeLessThan != null){
                this.createTime_LT = createTimeLessThan;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery createTimeLessEqual(Timestamp createTimeLessEqual){
            if(createTimeLessEqual != null){
                this.createTime_LE = createTimeLessEqual;
            }
            return this;
        }


        @Override
        public VsNodeUserQuery updateUserId(String updateUserId) {
            if(!IdUtils.isEmpty(updateUserId)){
                this.updateUserId = updateUserId;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery updateUserIdNot(String updateUserIdNot) {
            if(!IdUtils.isEmpty(updateUserIdNot)){
                this.updateUserId_NE = updateUserIdNot;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery updateUserIdLike(String updateUserIdLike) {
            if(!IdUtils.isEmpty(updateUserIdLike)){
                this.updateUserId_LIKE = updateUserIdLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery updateUserIdNotLike(String updateUserIdNotLike) {
            if(!IdUtils.isEmpty(updateUserIdNotLike)){
                this.updateUserId_NOTLIKE = updateUserIdNotLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery updateUserIdIn(String updateUserIdIn) {
            if(!IdUtils.isEmpty(updateUserIdIn)){
                if(this.updateUserId_IN == null){
                    this.updateUserId_IN = new ArrayList<String>();
                }
                this.updateUserId_IN.add( updateUserIdIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery updateUserIdNotIn(String updateUserIdNotIn) {
            if(!IdUtils.isEmpty(updateUserIdNotIn)){
                if(this.updateUserId_NOTIN == null){
                    this.updateUserId_NOTIN = new ArrayList<String>();
                }
                this.updateUserId_NOTIN.add( updateUserIdNotIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery updateUserIdIsNull() {
            this.isNulls.add("updateUserId");
            return this;
        }

        @Override
        public VsNodeUserQuery updateUserIdIsNotNull() {
            this.isNotNulls.add("updateUserId");
            return this;
        }



        @Override
        public VsNodeUserQuery updateUserName(String updateUserName) {
            if(!IdUtils.isEmpty(updateUserName)){
                this.updateUserName = updateUserName;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery updateUserNameNot(String updateUserNameNot) {
            if(!IdUtils.isEmpty(updateUserNameNot)){
                this.updateUserName_NE = updateUserNameNot;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery updateUserNameLike(String updateUserNameLike) {
            if(!IdUtils.isEmpty(updateUserNameLike)){
                this.updateUserName_LIKE = updateUserNameLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery updateUserNameNotLike(String updateUserNameNotLike) {
            if(!IdUtils.isEmpty(updateUserNameNotLike)){
                this.updateUserName_NOTLIKE = updateUserNameNotLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery updateUserNameIn(String updateUserNameIn) {
            if(!IdUtils.isEmpty(updateUserNameIn)){
                if(this.updateUserName_IN == null){
                    this.updateUserName_IN = new ArrayList<String>();
                }
                this.updateUserName_IN.add( updateUserNameIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery updateUserNameNotIn(String updateUserNameNotIn) {
            if(!IdUtils.isEmpty(updateUserNameNotIn)){
                if(this.updateUserName_NOTIN == null){
                    this.updateUserName_NOTIN = new ArrayList<String>();
                }
                this.updateUserName_NOTIN.add( updateUserNameNotIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery updateUserNameIsNull() {
            this.isNulls.add("updateUserName");
            return this;
        }

        @Override
        public VsNodeUserQuery updateUserNameIsNotNull() {
            this.isNotNulls.add("updateUserName");
            return this;
        }


        @Override
        public VsNodeUserQuery updateTime(Timestamp updateTime) {
            if(!IdUtils.isEmpty(updateTime)){
                this.updateTime = updateTime;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery updateTimeNot(Timestamp updateTimeNot) {
            if(!IdUtils.isEmpty(updateTimeNot)){
                this.updateTime_NE = updateTimeNot;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan){
            if(updateTimeGreaterThan != null){
                this.updateTime_GT = updateTimeGreaterThan;
            }
            return this;
        }


        @Override
        public VsNodeUserQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual){
            if(updateTimeGreaterEqual != null){
                this.updateTime_GE = updateTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery updateTimeLessThan(Timestamp updateTimeLessThan){
            if(updateTimeLessThan != null){
                this.updateTime_LT = updateTimeLessThan;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery updateTimeLessEqual(Timestamp updateTimeLessEqual){
            if(updateTimeLessEqual != null){
                this.updateTime_LE = updateTimeLessEqual;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery versionNo(Integer versionNo) {
            if(!IdUtils.isEmpty(versionNo)){
                this.versionNo = versionNo;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery versionNoNot(Integer versionNoNot) {
            if(!IdUtils.isEmpty(versionNoNot)){
                this.versionNo_NE = versionNoNot;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery versionNoGreaterThan(Integer versionNoGreaterThan){
            if(versionNoGreaterThan != null){
                this.versionNo_GT = versionNoGreaterThan;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery versionNoGreaterEqual(Integer versionNoGreaterEqual){
            if(versionNoGreaterEqual != null){
                this.versionNo_GE = versionNoGreaterEqual;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery versionNoLessThan(Integer versionNoLessThan){
            if(versionNoLessThan != null){
                this.versionNo_LT = versionNoLessThan;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery versionNoLessEqual(Integer versionNoLessEqual){
            if(versionNoLessEqual != null){
                this.versionNo_LE = versionNoLessEqual;
            }
            return this;
        }


        @Override
        public VsNodeUserQuery tenantId(String tenantId) {
            if(!IdUtils.isEmpty(tenantId)){
                this.tenantId = tenantId;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery tenantIdNot(String tenantIdNot) {
            if(!IdUtils.isEmpty(tenantIdNot)){
                this.tenantId_NE = tenantIdNot;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery tenantIdLike(String tenantIdLike) {
            if(!IdUtils.isEmpty(tenantIdLike)){
                this.tenantId_LIKE = tenantIdLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery tenantIdNotLike(String tenantIdNotLike) {
            if(!IdUtils.isEmpty(tenantIdNotLike)){
                this.tenantId_NOTLIKE = tenantIdNotLike;
            }
            return this;
        }

        @Override
        public VsNodeUserQuery tenantIdIn(String tenantIdIn) {
            if(!IdUtils.isEmpty(tenantIdIn)){
                if(this.tenantId_IN == null){
                    this.tenantId_IN = new ArrayList<String>();
                }
                this.tenantId_IN.add( tenantIdIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery tenantIdNotIn(String tenantIdNotIn) {
            if(!IdUtils.isEmpty(tenantIdNotIn)){
                if(this.tenantId_NOTIN == null){
                    this.tenantId_NOTIN = new ArrayList<String>();
                }
                this.tenantId_NOTIN.add( tenantIdNotIn );
            }
            return this;
        }

        @Override
        public VsNodeUserQuery tenantIdIsNull() {
            this.isNulls.add("tenantId");
            return this;
        }

        @Override
        public VsNodeUserQuery tenantIdIsNotNull() {
            this.isNotNulls.add("tenantId");
            return this;
        }



	
}