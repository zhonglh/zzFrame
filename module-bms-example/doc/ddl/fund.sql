

/*==============================================================*/
/* Table: tb_bank                                               */
/*==============================================================*/
create table tb_bank
(
   id                   char(32) not null comment 'ID',
   bank_name            varchar(200) not null comment '银行全称',
   bank_short_name      varchar(20) not null comment '银行简称',
   service_telephone    varchar(20) comment '服务电话',
   official_website     varchar(200) comment '官网',
   primary key (id)
);

alter table tb_bank comment '银行信息';

/*==============================================================*/
/* Table: tb_fund                                               */
/*==============================================================*/
create table tb_fund
(
   id                   char(32) not null comment 'ID',
   fund_name            varchar(50) not null comment '基金名称',
   fund_code            varchar(10) not null comment '基金代码',
   fund_type            varchar(2) not null comment '基金类型',
   fund_direction       varchar(2) not null comment '基金投向',
   start_money          decimal(14,2) not null comment '起购金额',
   manag_type           varchar(2) not null comment '管理类型',
   fund_scale           decimal(14,2) not null comment '基金规模',
   manager_user_id      char(32) not null comment '基金经理',
   start_date           date comment '成立日期',
   end_date             date comment '到期日期',
   investment_field     varchar(500) comment '投资领域',
   income_allocation    varchar(500) comment '收入分配',
   fund_files           char(32) comment '附件',
   remark               varchar(500) comment '备注',
   dep_id               char(32) comment '部门',
   organ_id             char(32) comment '机构',
   delete_flag          char(1) not null comment '删除标志',
   create_user_id       char(32) not null comment '创建人',
   create_user_name     varchar(50) not null comment '创建人名称',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   update_user_id       char(32) comment '修改人',
   update_user_name     varchar(50) comment '修改人名称',
   update_time          timestamp comment '修改时间',
   version_no           int not null comment '版本',
   tenant_id            char(32) not null comment '租户',
   primary key (id)
);

alter table tb_fund comment '基金';

/*==============================================================*/
/* Index: Index_1                                               */
/*==============================================================*/
create unique index Index_1 on tb_fund
(
   fund_name,
   tenant_id
);

/*==============================================================*/
/* Index: Index_2                                               */
/*==============================================================*/
create unique index Index_2 on tb_fund
(
   fund_code,
   tenant_id
);

/*==============================================================*/
/* Table: tb_fund_account                                       */
/*==============================================================*/
create table tb_fund_account
(
   id                   char(32) not null comment 'ID',
   fund_id              char(32) not null comment '基金信息',
   fund_account_type    varchar(2) not null comment '基金账户类型',
   account_name         varchar(100) not null comment '户名',
   bank_id              char(32) not null comment '开户行',
   account_no           varchar(50) not null comment '账号',
   start_date           date comment '开始日期',
   other_bank_id        char(32) comment '其他行',
   user_id              char(32) comment '账户处理人',
   primary key (id)
);

alter table tb_fund_account comment '基金账户';

/*==============================================================*/
/* Index: Index_1                                               */
/*==============================================================*/
create index Index_1 on tb_fund_account
(
   fund_id,
   fund_account_type
);

/*==============================================================*/
/* Table: tb_fund_record                                        */
/*==============================================================*/
create table tb_fund_record
(
   id                   char(32) not null comment 'ID',
   fund_id              char(32) not null comment '基金信息',
   record_date          date not null comment '备案日期',
   record_addr          varchar(200) not null comment '备案地点',
   bank_id              char(32) not null comment '开户行',
   card_type            varchar(2) comment '证件类型',
   record_user_id       varchar(32) comment '备案人',
   primary key (id)
);

alter table tb_fund_record comment '基金备案';

/*==============================================================*/
/* Index: Index_1                                               */
/*==============================================================*/
create unique index Index_1 on tb_fund_record
(
   fund_id
);

/*==============================================================*/
/* Table: tb_investor                                           */
/*==============================================================*/
create table tb_investor
(
   id                   char(32) not null comment 'ID',
   investor_name        varchar(50) not null comment '投资人名称',
   investor_code        varchar(10) not null comment '投资人代码',
   investor_type        varchar(2) not null comment '投资人类型',
   manage_user_id       char(32) not null comment '投资经理',
   card_type            varchar(2) comment '证件类型',
   card_no              varchar(100) comment '证件号码',
   investor_files       char(32) comment '附件',
   remark               varchar(500) comment '备注',
   delete_flag          char(1) not null comment '删除标志',
   create_user_id       char(32) not null comment '创建人',
   create_user_name     varchar(50) not null comment '创建人名称',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   update_user_id       char(32) comment '修改人',
   update_user_name     varchar(50) comment '修改人名称',
   update_time          timestamp comment '修改时间',
   version_no           int not null comment '版本',
   tenant_id            char(32) not null comment '租户',
   primary key (id)
);

alter table tb_investor comment '投资人';

/*==============================================================*/
/* Index: Index_1                                               */
/*==============================================================*/
create index Index_1 on tb_investor
(
   investor_code,
   tenant_id
);

/*==============================================================*/
/* Table: tb_investor_agreement                                 */
/*==============================================================*/
create table tb_investor_agreement
(
   id                   char(32) not null comment 'ID',
   agreement_name       varchar(50) not null comment '协议名称',
   agreement_code       varchar(10) not null comment '协议代码',
   fund_id              char(32) not null comment '认购基金',
   investor_id          char(32) not null comment '投资人',
   amount               decimal(14,2) not null comment '认购金额',
   actual_amount        decimal(14,2) comment '实际出资金额',
   sketch               varchar(500) comment '协议简述',
   sign_dep_id          char(32) comment '部门',
   sign_organ_id        char(32) comment '机构',
   sign_user_id         char(32) not null comment '签订人',
   sign_date            date not null comment '签订日期',
   agreement_files      char(32) comment '附件',
   remark               varchar(500) comment '备注',
   delete_flag          char(1) not null comment '删除标志',
   create_user_id       char(32) not null comment '创建人',
   create_user_name     varchar(50) not null comment '创建人名称',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   update_user_id       char(32) comment '修改人',
   update_user_name     varchar(50) comment '修改人名称',
   update_time          timestamp comment '修改时间',
   version_no           int not null comment '版本',
   tenant_id            char(32) not null comment '租户',
   primary key (id)
);

alter table tb_investor_agreement comment '投资协议';

/*==============================================================*/
/* Table: tb_out_money                                          */
/*==============================================================*/
create table tb_out_money
(
   id                   char(32) not null comment 'ID',
   investor_agreement_id char(32) not null comment '协议',
   fund_id              char(32) not null comment '基金',
   investor_id          char(32) not null comment '投资人',
   actual_amount        decimal(14,2) comment '实际出资金额',
   handle_dep_id        char(32) comment '部门',
   handle_organ_id      char(32) comment '机构',
   handle_user_id       char(32) not null comment '经办人',
   arrival_account_date date not null comment '到账日期',
   out_money_files      char(32) comment '附件',
   remark               varchar(500) comment '备注',
   delete_flag          char(1) not null comment '删除标志',
   create_user_id       char(32) not null comment '创建人',
   create_user_name     varchar(50) not null comment '创建人名称',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   update_user_id       char(32) comment '修改人',
   update_user_name     varchar(50) comment '修改人名称',
   update_time          timestamp comment '修改时间',
   version_no           int not null comment '版本',
   tenant_id            char(32) not null comment '租户',
   primary key (id)
);

alter table tb_out_money comment '出资明细';
