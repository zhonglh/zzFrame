



    insert into ts_permit(
    id,
    permit_name,
    permit_code,
    remark,
    delete_flag
    ) values (
    '0c33b27f8eef453680958b8057aa1dae',
    '删除角色',
    'systemrole:del',
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
    '33d1c37c7dfb4ac9a9192749fdbc21de',
    '新增角色',
    'systemrole:add',
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
    '92bbb9ae308343599ca26a2fb4d0f181',
    '查看角色',
    'systemrole:detail',
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
    'ad013ada7f4e4a2f976baa0726e1416a',
    '修改角色',
    'systemrole:update',
    null,
    '0'
    ) ;



    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'3d666fbe5f3543369f9edcf6fa6d730a','0c33b27f8eef453680958b8057aa1dae') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'3d666fbe5f3543369f9edcf6fa6d730a','33d1c37c7dfb4ac9a9192749fdbc21de') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'3d666fbe5f3543369f9edcf6fa6d730a','92bbb9ae308343599ca26a2fb4d0f181') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'3d666fbe5f3543369f9edcf6fa6d730a','ad013ada7f4e4a2f976baa0726e1416a') ;
