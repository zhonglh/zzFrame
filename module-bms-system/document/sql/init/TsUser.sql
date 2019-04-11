



    insert into ts_permit(
    id,
    permit_name,
    permit_code,
    remark,
    delete_flag
    ) values (
    '0e4d56942b604559b7b7178c16188d18',
    '删除用户',
    'system.user:delete',
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
    '619b1f57d25f44488f7b05792e82013b',
    '新增用户',
    'system.user:add',
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
    '8c491cf086144bd1a74f948578c94bfc',
    '查看用户',
    'system.user:detail',
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
    'e10068da1bdd4c0fa7e06ec304f515ce',
    '导出用户',
    'system.user:exportExcel',
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
    'e22ba9ebec634821964244442f771d3b',
    '修改用户',
    'system.user:update',
    null,
    '0'
    ) ;



    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'02c92cebf29047058b24926c4a12717b','0e4d56942b604559b7b7178c16188d18') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'02c92cebf29047058b24926c4a12717b','619b1f57d25f44488f7b05792e82013b') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'02c92cebf29047058b24926c4a12717b','8c491cf086144bd1a74f948578c94bfc') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'02c92cebf29047058b24926c4a12717b','e10068da1bdd4c0fa7e06ec304f515ce') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'02c92cebf29047058b24926c4a12717b','e22ba9ebec634821964244442f771d3b') ;
