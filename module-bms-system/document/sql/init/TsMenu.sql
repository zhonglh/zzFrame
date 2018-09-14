



    insert into ts_permit(
    id,
    permit_name,
    permit_code,
    remark,
    delete_flag
    ) values (
    '29e924c729b84784ab50df7dd4daa59e',
    '删除菜单',
    'systemmenu:del',
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
    '5a77e8c7a80e46cc839d5aea4162d9d5',
    '查看菜单',
    'systemmenu:detail',
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
    'e4bb46dc6483427b863f8d75b95c6242',
    '修改菜单',
    'systemmenu:update',
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
    'f2d0808303484f7eb0a968a6108d1b49',
    '新增菜单',
    'systemmenu:add',
    null,
    '0'
    ) ;



    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'08b97f4f429d45d990cf88d5e4142826','29e924c729b84784ab50df7dd4daa59e') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'08b97f4f429d45d990cf88d5e4142826','5a77e8c7a80e46cc839d5aea4162d9d5') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'08b97f4f429d45d990cf88d5e4142826','e4bb46dc6483427b863f8d75b95c6242') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'08b97f4f429d45d990cf88d5e4142826','f2d0808303484f7eb0a968a6108d1b49') ;
