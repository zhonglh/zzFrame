delete from ts_tenant ;
insert into ts_tenant(
  id,
  tenant_name,
  tenant_code,
  delete_flag,
  create_user_id,
  create_user_name,
  create_time,
  update_user_id,
  update_user_name,
  update_time,
  version_no
) values(
  '11111111111111111111111111111111',
  'zz工作室',
  'zz',
  '0',
  '11111111111111111111111111111111',
  '管理员',
  sysdate(),
  '11111111111111111111111111111111',
  '管理员',
  sysdate(),
  1
);

delete from ts_organ ;
insert into ts_organ(
  id,
  organ_name,
  organ_code,
  organ_status,
  delete_flag,
  create_user_id,
  create_user_name,
  create_time,
  update_user_id,
  update_user_name,
  update_time,
  version_no,
  tenant_id
) values(
  '11111111111111111111111111111111',
  '默认机构',
  'default',
  '1',
  '0',
  '11111111111111111111111111111111',
  '管理员',
  sysdate(),
  '11111111111111111111111111111111',
  '管理员',
  sysdate(),
  1,
  11111111111111111111111111111111
);



delete from ts_user where system_admin = '1';
insert into ts_user(

  id,
  user_name,
  login_name,
  login_password,
  salt,
  system_admin,

  user_status,
  phone,
  email,
  organ_id,
  page_limit,


  delete_flag,
  create_user_id,
  create_user_name,
  create_time,
  update_user_id,
  update_user_name,
  update_time,
  version_no,
  tenant_id
) values(

  '11111111111111111111111111111111',
  '管理员',
  'admin',
  'b3392fe903b9eeea5bba45c47b574264eacdd19208fcd84a365251e9b67684cb',
  '1',
  '1',

  '1',
  '1111111111',
  '1111111111@qq.com',
  '11111111111111111111111111111111',
  20,





  '0',
  '11111111111111111111111111111111',
  '管理员',
  sysdate(),
  '11111111111111111111111111111111',
  '管理员',
  sysdate(),
  1,
  '11111111111111111111111111111111'

);





insert into ts_user(

  id,
  user_name,
  login_name,
  login_password,
  salt,
  system_admin,

  user_status,
  phone,
  email,
  organ_id,
  page_limit,


  delete_flag,
  create_user_id,
  create_user_name,
  create_time,
  update_user_id,
  update_user_name,
  update_time,
  version_no,
  tenant_id
) values(

  '00000000000000000000000000000000',
  '系统',
  'system',
  'b3392fe903b9eeea5bba45c47b574264eacdd19208fcd84a365251e9b67684cb',
  '1',
  '1',

  '1',
  '1311111111',
  '1311111111@qq.com',
  '11111111111111111111111111111111',
  50,





  '0',
  '11111111111111111111111111111111',
  '管理员',
  sysdate(),
  '11111111111111111111111111111111',
  '管理员',
  sysdate(),
  1,
  '11111111111111111111111111111111'

);
