drop table if exists ts_dep;

drop table if exists ts_dict;

drop table if exists ts_dict_type;

drop table if exists ts_file;

drop table if exists ts_file_use;

drop table if exists ts_login_log;

drop table if exists ts_menu;

drop table if exists ts_menu_permit;

drop table if exists ts_msg_templet;

drop table if exists ts_my_shortcut;

drop table if exists ts_notification;

drop table if exists ts_notification_receive;

drop table if exists ts_organ;

drop table if exists ts_permit;

drop table if exists ts_role;

drop table if exists ts_role_permit;

drop table if exists ts_tenant;

drop table if exists ts_user;

drop table if exists ts_user_role;

/*==============================================================*/
/* Table: ts_dep                                                */
/*==============================================================*/
create table ts_dep
(
   id                   char(32) not null comment 'ID',
   dep_name             varchar(100) not null comment '部门名称',
   dep_code             varchar(20) not null comment '部门代码',
   dep_addr             varchar(200) comment '部门地址',
   pid                  char(32) comment '上级部门',
   dep_status           char(1) not null default '1' comment '部门状态
            0:解散  1: 正常   ',
   lead_user_id         char(32) comment '负责人',
   organ_id             char(32) not null comment '机构',
   remark               varchar(200) comment '备注',
   delete_flag          char(1) not null comment '删除标志',
   create_user_id       char(32) not null comment '创建人',
   create_user_name     varchar(50) not null comment '创建人名称',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   update_user_id       char(32) comment '修改人',
   update_user_name     varchar(50) comment '修改人名称',
   update_time          timestamp null default null  comment '修改时间',
   version_no           int not null comment '版本',
   tenant_id            char(32) not null comment '租户',
   primary key (id),
   UNIQUE key AK_Identifier_3 (dep_code, organ_id),
   UNIQUE key AK_Identifier_2 (dep_name, organ_id)
);

alter table ts_dep comment '部门';

/*==============================================================*/
/* Table: ts_dict                                               */
/*==============================================================*/
create table ts_dict
(
   id                   char(32) not null comment 'ID',
   dict_type_id         char(32) not null comment '字典类型',
   dict_val             varchar(2) not null comment '字典值',
   dict_name            varchar(50) not null comment '字典名',
   dict_i18n            varchar(100) comment '名称国际化',
   dict_reg             varchar(100) comment '字典限制正则',
   orderby              int not null default 0 comment '顺序',
   organ_id             char(32) not null comment '机构',
   create_user_id       char(32) not null comment '创建人',
   create_user_name     varchar(50) not null comment '创建人名称',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   update_user_id       char(32) comment '修改人',
   update_user_name     varchar(50) comment '修改人名称',
   update_time          timestamp null default null  comment '修改时间',
   version_no           int not null comment '版本',
   delete_flag          char(1) not null comment '删除标志',
   tenant_id            char(32) not null comment '租户',
   primary key (id),
   UNIQUE key AK_Identifier_2 (dict_type_id, dict_val, tenant_id)
);

alter table ts_dict comment '字典信息';

/*==============================================================*/
/* Table: ts_dict_type                                          */
/*==============================================================*/
create table ts_dict_type
(
   id                   char(32) not null comment 'ID',
   pid                  char(32) comment '上级类型',
   dict_type_code       varchar(60) not null comment '类型代码',
   dict_type_name       varchar(60) not null comment '类型名称',
   dict_type_showable   char(1) not null comment '类型是否显示
            yes_no',
   dict_addable         char(1) not null comment '字典是否可以增加
            yes_no',
   dict_update          char(1) not null comment '字典是否可以修改
            yes_no',
   dict_delete          char(1) not null comment '字典是否可以删除
            yes_no',
   orderby              int not null default 0 comment '顺序',
   primary key (id),
   UNIQUE key AK_Identifier_3 (dict_type_name),
   UNIQUE key AK_Identifier_2 (dict_type_code)
);

alter table ts_dict_type comment '字典类型';

/*==============================================================*/
/* Table: ts_file                                               */
/*==============================================================*/
create table ts_file
(
   id                   char(32) not null comment 'ID',
   access_url_prefix    varchar(50) comment '访问路径前缀',
   access_url           varchar(200) not null comment '访问路径
            不包括前缀',
   file_host            varchar(27) comment '文件所在主机',
   file_base_path       varchar(100),
   file_path            varchar(200) comment '文件路径',
   file_name            varchar(100) not null comment '文件名',
   file_size            bigint not null comment '文件大小',
   file_suffix          varchar(30) comment '文件后缀',
   file_engine          char(1) not null comment '文件引擎
            文件系统 七牛  阿里云  腾讯 FastNFS MongoDB',
   md5                  varchar(128) comment 'MD5码',
   content_type         varchar(256) comment '文件类型',
   use_frequency        int comment '使用次数',
   primary key (id)
);

alter table ts_file comment '文件';

/*==============================================================*/
/* Table: ts_file_use                                           */
/*==============================================================*/
create table ts_file_use
(
   id                   char(32) not null comment 'ID',
   file_id              char(32) not null comment '文件ID',
   show_name            varchar(256) not null comment '显示名称',
   business_type        varchar(256) comment '业务类型',
   business_id          char(32) comment '业务ID',
   business_file_type   varchar(100) not null comment '业务文件类型',
   business_temp_id     char(32) not null comment '业务临时ID',
   file_order           int not null comment '顺序',
   organ_id             char(32) not null comment '机构',
   remark               varchar(200) comment '备注',
   delete_flag          char(1) not null comment '删除标志',
   create_user_id       char(32) not null comment '创建人',
   create_user_name     varchar(50) not null comment '创建人名称',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   update_user_id       char(32) comment '修改人',
   update_user_name     varchar(50) comment '修改人名称',
   update_time          timestamp null default null  comment '修改时间',
   version_no           int not null comment '版本',
   tenant_id            char(32) not null comment '租户',
   primary key (id)
);

alter table ts_file_use comment '文件使用';

/*==============================================================*/
/* Table: ts_login_log                                          */
/*==============================================================*/
create table ts_login_log
(
   id                   char(32) not null comment 'ID',
   operation_type       varchar(2) not null comment '操作类型
            1: 登陆   2:退出  3:强制退出  4:踢出',
   operation_remark     varchar(100) comment '操作说明',
   dep_id               char(32) comment '部门',
   organ_id             char(32) not null comment '机构',
   operation_user_id    char(32) not null comment '操作人',
   operation_ip         varchar(30) comment '操作人IP',
   operation_user_name  varchar(50) not null comment '操作人名称',
   operation_time       timestamp not null default CURRENT_TIMESTAMP comment '操作时间',
   tenant_id            char(32) not null comment '租户',
   primary key (id)
);

alter table ts_login_log comment '登陆日志';

/*==============================================================*/
/* Table: ts_menu                                               */
/*==============================================================*/
create table ts_menu
(
   id                   char(32) not null comment 'ID',
   menu_name            varchar(30) not null comment '菜单名称',
   menu_code            varchar(50) not null comment '菜单编号',
   pid                  char(32) comment '上级菜单',
   menu_sort            int not null comment '菜单顺序',
   menu_url             varchar(200) comment '菜单地址',
   menu_msg             varchar(50) comment '菜单提示信息',
   menu_icon            varchar(20) comment '菜单图标',
   menu_redirect        varchar(50) comment '跳转目标',
   shortcut             char(1) not null comment '快捷菜单
            yes_no',
   level                int not null comment '层级',
   leaf                 char(1) not null comment '是否叶节点
            yes_no',
   hidden               char(1) not null default '0' comment ' 是否隐藏',
   target               varchar(20) comment '链接目标',
   remark               varchar(200) comment '备注',
   delete_flag          char(1) not null comment '删除标志',
   create_user_id       char(32) not null comment '创建人ID',
   create_user_name     varchar(50) not null comment '创建人名称',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   update_user_id       char(32) comment '修改人ID',
   update_user_name     varchar(50) comment '修改人名称',
   update_time          timestamp null default null  comment '修改时间',
   version_no           int not null comment '版本',
   primary key (id),
   UNIQUE key AK_Identifier_2 (menu_code)
);

alter table ts_menu comment '菜单

path                       menu_url
co';

/*==============================================================*/
/* Table: ts_menu_permit                                        */
/*==============================================================*/
create table ts_menu_permit
(
   id                   char(32) not null comment 'ID',
   menu_id              char(32) not null comment '菜单',
   permit_id            char(32) not null comment '许可',
   primary key (id),
   UNIQUE key AK_Identifier_2 (menu_id, permit_id)
);

alter table ts_menu_permit comment '菜单许可关联';

/*==============================================================*/
/* Table: ts_msg_templet                                        */
/*==============================================================*/
create table ts_msg_templet
(
   id                   char(32) not null comment 'ID',
   msg_templet_name     varchar(50) not null comment '消息模板名称',
   msg_templet_type     char(1) not null comment '消息模板类型
            比如: 邮件 短信 微信',
   msg_title            varchar(200) comment '消息标题',
   msg_content          varchar(5000) not null comment '消息内容',
   msg_language         char(1) comment '语言
            比如 1中文  2英文 ',
   templet_effective    char(1) not null comment '模板是否有效
            yes_no',
   dep_id               char(32) comment '部门',
   organ_id             char(32) not null comment '机构',
   create_user_id       char(32) not null comment '创建人',
   create_user_name     varchar(50) not null comment '创建人名称',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   update_user_id       char(32) comment '修改人',
   update_user_name     varchar(50) comment '修改人名称',
   update_time          timestamp null default null  comment '修改时间',
   version_no           int not null comment '版本',
   tenant_id            char(32) not null comment '租户',
   primary key (id),
   UNIQUE key AK_Identifier_2 (msg_templet_name, tenant_id)
);

alter table ts_msg_templet comment '消息模板';

/*==============================================================*/
/* Table: ts_my_shortcut                                        */
/*==============================================================*/
create table ts_my_shortcut
(
   id                   char(32) not null comment 'ID',
   menu_id              char(32) not null comment '菜单',
   user_id              char(32) not null comment '用户',
   orderby              int not null comment '顺序',
   primary key (id),
   UNIQUE key AK_Identifier_2 (menu_id, user_id)
);

alter table ts_my_shortcut comment '置顶快捷菜单';

/*==============================================================*/
/* Table: ts_notification                                       */
/*==============================================================*/
create table ts_notification
(
   id                   char(32) not null comment 'ID',
   notify_module        varchar(100) comment '模块',
   title                varchar(100) comment '通知标题',
   content              text not null comment '通知内容',
   notify_time          timestamp not null comment '通知时间',
   notify_files         char(32) comment '通知文件',
   create_user_id       char(32) not null comment '创建人',
   create_user_name     varchar(50) not null comment '创建人名称',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   update_user_id       char(32) comment '修改人',
   update_user_name     varchar(50) comment '修改人名称',
   update_time          timestamp null default null  comment '修改时间',
   version_no           int not null comment '版本',
   tenant_id            char(32) not null comment '租户',
   primary key (id)
);

alter table ts_notification comment '系统通知';

/*==============================================================*/
/* Table: ts_notification_receive                               */
/*==============================================================*/
create table ts_notification_receive
(
   id                   char(32) not null comment 'ID',
   notify_id            char(32) not null comment '通知',
   receive_user_id      char(32) not null comment '接收人',
   is_read              char(1) not null comment '已读
            yes_no',
   read_time            timestamp comment '读取时间',
   primary key (id)
);

alter table ts_notification_receive comment '通知接收人';

/*==============================================================*/
/* Table: ts_organ                                              */
/*==============================================================*/
create table ts_organ
(
   id                   char(32) not null comment 'ID',
   organ_name           varchar(100) not null comment '机构名称',
   organ_code           varchar(20) not null comment '机构代码',
   organ_type           char(1) comment '机构类型
            具体的参考业务要求',
   organ_addr           varchar(200) comment '机构地址',
   pid                  char(32) comment '上级机构',
   organ_status         char(1) not null comment '机构状态
            1:正常 0:解散',
   lead_user_id         char(32) comment '负责人',
   remark               varchar(200) comment '备注',
   delete_flag          char(1) not null comment '删除标志',
   create_user_id       char(32) not null comment '创建人',
   create_user_name     varchar(50) not null comment '创建人名称',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   update_user_id       char(32) comment '修改人',
   update_user_name     varchar(50) comment '修改人名称',
   update_time          timestamp null default null  comment '修改时间',
   version_no           int not null comment '版本',
   tenant_id            char(32) not null comment '租户',
   primary key (id),
   UNIQUE key AK_Identifier_3 (organ_code, tenant_id),
   UNIQUE key AK_Identifier_2 (organ_name, tenant_id)
);

alter table ts_organ comment '机构';

/*==============================================================*/
/* Table: ts_permit                                             */
/*==============================================================*/
create table ts_permit
(
   id                   char(32) not null comment 'ID',
   permit_name          varchar(20) not null comment '许可名称',
   permit_code          varchar(50) not null comment '许可编号',
   remark               varchar(200) comment '备注',
   delete_flag          char(1) not null comment '删除标志',
   primary key (id),
   UNIQUE key AK_Identifier_2 (permit_code)
);

alter table ts_permit comment '许可';

/*==============================================================*/
/* Table: ts_role                                               */
/*==============================================================*/
create table ts_role
(
   id                   char(32) not null comment 'ID',
   role_name            varchar(50) not null comment '角色名称',
   role_code            varchar(20) not null comment '角色编号',
   role_type            char(1) not null comment '角色类型',
   dep_id               char(32) comment '部门',
   organ_id             char(32) not null comment '机构',
   role_status          char(1) not null comment '角色状态
            0: 禁用   1:可用',
   remark               varchar(200) comment '备注',
   create_user_id       char(32) not null comment '创建人',
   create_user_name     varchar(50) not null comment '创建人名称',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   update_user_id       char(32) comment '修改人',
   update_user_name     varchar(50) comment '修改人名称',
   update_time          timestamp null default null  comment '修改时间',
   version_no           int not null comment '版本',
   tenant_id            char(32) not null comment '租户',
   primary key (id),
   UNIQUE key AK_Identifier_3 (role_code, tenant_id),
   UNIQUE key AK_Identifier_2 (role_name, tenant_id)
);

alter table ts_role comment '角色';

/*==============================================================*/
/* Table: ts_role_permit                                        */
/*==============================================================*/
create table ts_role_permit
(
   id                   char(32) not null comment 'ID',
   role_id              char(32) not null comment '角色',
   permit_id            char(32) not null comment '许可',
   primary key (id),
   UNIQUE key AK_Identifier_2 (role_id, permit_id)
);

alter table ts_role_permit comment '角色许可关联';

/*==============================================================*/
/* Table: ts_tenant                                             */
/*==============================================================*/
create table ts_tenant
(
   id                   char(32) not null comment 'ID',
   tenant_name          varchar(150) not null comment '企业名称',
   tenant_code          char(4) not null comment '企业编号',
   tenant_addr          varchar(200) comment '企业地址',
   link_tel             varchar(20) comment '联系电话',
   lead_user_name       varchar(50) comment '法人姓名',
   logo_file            char(32) comment 'LOGO',
   website              varchar(200) comment '官网',
   remark               varchar(2000) comment '说明',
   delete_flag          char(1) not null comment '删除标志',
   create_user_id       char(32) not null comment '创建人',
   create_user_name     varchar(50) not null comment '创建人名称',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   update_user_id       char(32) comment '修改人',
   update_user_name     varchar(50) comment '修改人名称',
   update_time          timestamp null default null  comment '修改时间',
   version_no           int not null comment '版本',
   primary key (id, tenant_name, tenant_code),
   UNIQUE key AK_Identifier_3 (tenant_code),
   UNIQUE key AK_Identifier_2 (tenant_name)
);

alter table ts_tenant comment '企业
也是企业的概念';

/*==============================================================*/
/* Table: ts_user                                               */
/*==============================================================*/
create table ts_user
(
   id                   char(32) not null comment 'ID',
   user_name            varchar(50) not null comment '用户姓名',
   login_name           varchar(20) not null comment '登录名',
   login_password       varchar(128) comment '登录密码',
   salt                 varchar(64) comment '加密盐',
   user_status          char(1) not null comment '用户状态',
   lead_user_id         char(32) comment '上级领导',
   phone                varchar(20) not null comment '电话',
   email                varchar(60) not null comment '邮箱',
   avatar_image         char(32) comment '头像',
   open_id              varchar(64) comment '微信ID',
   union_id             varchar(64) comment '微信唯一ID',
   system_admin         char(1) not null comment '系统管理人员
            yes_no',
   dep_id               char(32) comment '部门',
   organ_id             char(32) not null comment '机构',
   page_limit           int not null default 20 comment '每页记录数',
   remark               varchar(500) comment '备注',
   delete_flag          char(1) not null comment '删除标志',
   create_user_id       char(32) not null comment '创建人',
   create_user_name     varchar(50) not null comment '创建人名称',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   update_user_id       char(32) comment '修改人',
   update_user_name     varchar(50) comment '修改人名称',
   update_time          timestamp null default null  comment '修改时间',
   version_no           int not null comment '版本',
   tenant_id            char(32) not null comment '租户',
   primary key (id),
   UNIQUE key AK_Identifier_2 (login_name),
   UNIQUE key AK_Identifier_3 (email),
   UNIQUE key AK_Identifier_4 (phone)
);

alter table ts_user comment '用户';

/*==============================================================*/
/* Table: ts_user_role                                          */
/*==============================================================*/
create table ts_user_role
(
   id                   char(32) not null comment 'ID',
   user_id              char(32) not null comment '用户',
   role_id              char(32) not null comment '角色',
   primary key (id),
   UNIQUE key AK_Identifier_2 (user_id, role_id)
);

alter table ts_user_role comment '用户角色关联';
