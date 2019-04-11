



    insert into ts_permit(
    id,
    permit_name,
    permit_code,
    remark,
    delete_flag
    ) values (
    '077ecdf713104df08c07d1eb94c105e9',
    '导出消息模板',
    'system.msgtemplet:exportExcel',
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
    '4fb5dac677484b74b649c974612272b8',
    '查看消息模板',
    'system.msgtemplet:detail',
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
    '56d19a40c44b4e009caf016bf4ecd6f1',
    '新增消息模板',
    'system.msgtemplet:add',
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
    '9cc2f337d20f403fa6e1061811f7f0fe',
    '删除消息模板',
    'system.msgtemplet:delete',
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
    'ce98f10ab75446c08c71e241027ac787',
    '修改消息模板',
    'system.msgtemplet:update',
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
    'f9f49c21c1d14a7f90295d69619e9a7c',
    '导入消息模板',
    'system.msgtemplet:importExcel',
    null,
    '0'
    ) ;



    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'c916966357294b349d020c5943bc2ca7','077ecdf713104df08c07d1eb94c105e9') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'c916966357294b349d020c5943bc2ca7','4fb5dac677484b74b649c974612272b8') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'c916966357294b349d020c5943bc2ca7','56d19a40c44b4e009caf016bf4ecd6f1') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'c916966357294b349d020c5943bc2ca7','9cc2f337d20f403fa6e1061811f7f0fe') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'c916966357294b349d020c5943bc2ca7','ce98f10ab75446c08c71e241027ac787') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'c916966357294b349d020c5943bc2ca7','f9f49c21c1d14a7f90295d69619e9a7c') ;
