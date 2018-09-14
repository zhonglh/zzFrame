



    insert into ts_permit(
    id,
    permit_name,
    permit_code,
    remark,
    delete_flag
    ) values (
    'd4657980a25d414b8e65ec11b40a04ab',
    '删除操作日志',
    'systemoperationlog:del',
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
    'fe322adc7a0146ac8aec613fa6ffb87f',
    '查看操作日志',
    'systemoperationlog:detail',
    null,
    '0'
    ) ;



    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'1183dd1575374da3b813d85686575d7a','d4657980a25d414b8e65ec11b40a04ab') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'1183dd1575374da3b813d85686575d7a','fe322adc7a0146ac8aec613fa6ffb87f') ;
