



    insert into ts_permit(
    id,
    permit_name,
    permit_code,
    remark,
    delete_flag
    ) values (
    'b5bd219fed4d4b33ae8bc026ffbe8edb',
    '删除登陆日志',
    'system.loginlog:delete',
    null,
    '0'
    ) ;


    insert into ts_permit(
    id,
    permit_name,
    permit_code,
    remark,
    delete_flag
    ) values (
    'b7366e41457f434a946ca530838a57ee',
    '查看登陆日志',
    'system.loginlog:detail',
    null,
    '0'
    ) ;



    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'9c0d127c5d2d40e094a1a0fcd784d9e0','b5bd219fed4d4b33ae8bc026ffbe8edb') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'9c0d127c5d2d40e094a1a0fcd784d9e0','b7366e41457f434a946ca530838a57ee') ;
