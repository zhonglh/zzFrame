



    insert into ts_permit(
    id,
    permit_name,
    permit_code,
    remark,
    delete_flag
    ) values (
    '1b7ae60618c34773960a868a2540f506',
    '新增用户',
    'systemuser:add',
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
    '80b4f6fb706749a0b87ca5c75b1f81c5',
    '修改用户',
    'systemuser:update',
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
    '8c10d780e5394a199f2dea912866d6d2',
    '查看用户',
    'systemuser:detail',
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
    '8e3da29f9a4e490ba0ff2e5f56add1d0',
    '删除用户',
    'systemuser:del',
    null,
    '0'
    ) ;



    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'39fffc6b758b47e0a3a7272ef6d2ad4d','1b7ae60618c34773960a868a2540f506') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'39fffc6b758b47e0a3a7272ef6d2ad4d','80b4f6fb706749a0b87ca5c75b1f81c5') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'39fffc6b758b47e0a3a7272ef6d2ad4d','8c10d780e5394a199f2dea912866d6d2') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'39fffc6b758b47e0a3a7272ef6d2ad4d','8e3da29f9a4e490ba0ff2e5f56add1d0') ;
