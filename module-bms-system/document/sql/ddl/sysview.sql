/*==============================================================*/
/* View: vs_file_use                                            */
/*==============================================================*/
create  VIEW      vs_file_use
  as
select fu.*,
f.access_url,
f.content_type,
f.file_engine,
f.file_host,
f.file_path file_pull_name,
f.file_size,
f.use_frequency 
from ts_file_use fu , ts_file f
where fu.file_id = f.id;

/*==============================================================*/
/* View: vs_menu_permit                                         */
/*==============================================================*/
create  VIEW      vs_menu_permit
  as
select mp.*, permit_code , permit_name , menu.menu_name,menu.menu_code from ts_menu_permit mp , ts_permit permit , ts_menu menu
where mp.permit_id = permit.id and mp.menu_id = menu.id;

/*==============================================================*/
/* View: vs_notification                                        */
/*==============================================================*/
create  VIEW      vs_notification
  as
select n.* , nr.receive_user_id , nr.read_time , nr.is_read  ,
u1.user_name send_name , u2.user_name as receive_name 
from  ts_notification_receive nr  
join ts_notification n  on  nr.notify_id = n.id
join ts_user u1 on  n.create_user_id = u1.id
join ts_user u2 on  nr.receive_user_id = u2.id;

/*==============================================================*/
/* View: vs_user                                                */
/*==============================================================*/
create  VIEW      vs_user
  as
select user1.* ,
dep1.dep_name, organ1.organ_name , tenant1.tenant_name
from ts_user user1 left join ts_dep dep1 on user1.dep_id = dep1.id 
join ts_organ organ1 on user1.organ_id = organ1.id 
join ts_tenant tenant1 on user1.tenant_id = tenant1.id;

/*==============================================================*/
/* View: vs_user_menu                                           */
/*==============================================================*/
create  VIEW      vs_user_menu
  as
select
   menu1.id,
   menu1.pid,
   menu1.menu_name as title,
   menu1.menu_icon as icon,
   menu1.menu_msg as component,
   menu1.menu_sort as sortno,
   menu1.menu_url as path,
   menu1.shortcut as shortcut,
   menu1.menu_code as name,
   menu1.level,
   menu1.leaf,
   menu1.target,
   menu1.delete_flag,
   user1.user_name,
   user1.login_name,
   user1.id as user_id
from
   ts_user user1
   join ts_user_role ur1 on  user1.id = ur1.user_id
   join ts_role role1 on  ur1.role_id = role1.id and role1.role_status = '1'
   join ts_role_permit rp1 on  ur1.role_id = rp1.role_id
   join ts_menu_permit mp1 on  rp1.permit_id = mp1.permit_id
   join ts_menu menu1 on  mp1.menu_id = menu1.id and menu1.delete_flag = '0'
where
   menu1.hidden = '0'
union
select
   menu1.id,
   menu1.pid,
   menu1.menu_name as title,
   menu1.menu_icon as icon,
   menu1.menu_msg as component,
   menu1.menu_sort as sortno,
   menu1.menu_url as path,
   menu1.shortcut as shortcut,
   menu1.menu_code as name,
   menu1.level,
   menu1.leaf,
   menu1.target,
   menu1.delete_flag,
   user1.user_name,
   user1.login_name,
   user1.id as user_id
from
   ts_user user1,
   ts_menu menu1
where
   menu1.delete_flag = '0'
   and menu1.hidden = '0'
   and user1.system_admin = '1';

/*==============================================================*/
/* View: vs_user_permit                                         */
/*==============================================================*/
create  VIEW      vs_user_permit
  as

select permit1.id , permit1.permit_code , permit1.permit_name , USER1.USER_NAME , USER1.LOGIN_NAME, user1.id as user_id 
from ts_user user1 join  ts_user_role ur1 on user1.id = ur1.user_id
join ts_role role1 on UR1.ROLE_ID = role1.id and ROLE1.role_STATUS = '1'  
join ts_role_permit rp1 on ur1.role_id = RP1.ROLE_ID
join ts_permit permit1 on RP1.PERMIT_ID = permit1.id  and permit1.delete_flag = '0'
union 
select permit1.id , permit1.permit_code , permit1.permit_name , USER1.USER_NAME , USER1.LOGIN_NAME, user1.id as user_id 
from ts_user user1 , ts_permit permit1
where user1.system_admin = '1'  and permit1.delete_flag = '0';
