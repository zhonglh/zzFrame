



    insert into ts_permit(
    id,
    permit_name,
    permit_code,
    remark,
    delete_flag
    ) values (
    'f61954c68c794d07b7e975078e9f5c90',
    '修改企业',
    'system.tenant:update',
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
    'fbbce8d703854a899790a1f051b47e1c',
    '查看企业',
    'system.tenant:detail',
    null,
    '0'
    ) ;



    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'0981e6809d684b0fac078b6b6431a66b','f61954c68c794d07b7e975078e9f5c90') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'0981e6809d684b0fac078b6b6431a66b','fbbce8d703854a899790a1f051b47e1c') ;
