



    insert into ts_permit(
    id,
    permit_name,
    permit_code,
    remark,
    delete_flag
    ) values (
    '2edcc50cd1f1477c80303c2a800d5bc4',
    '新增机构',
    'system.organ:add',
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
    '3dbde127c14049ba9ae08fdcade3e512',
    '导出机构',
    'system.organ:exportExcel',
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
    '4724b8f82333445e90a89ad22fc64df3',
    '删除机构',
    'system.organ:delete',
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
    '5ceded1f7f64453698905c1b4bfa7092',
    '查看机构',
    'system.organ:detail',
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
    '61ba9bf2e8b04bf992fa46fe56c7623a',
    '导入机构',
    'system.organ:importExcel',
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
    '770ca1853e7842b1ab0cda2f4e4eb003',
    '修改机构',
    'system.organ:update',
    null,
    '0'
    ) ;



    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'fb4f7e9431b84c7cbcdc3cf9bf499f2a','2edcc50cd1f1477c80303c2a800d5bc4') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'fb4f7e9431b84c7cbcdc3cf9bf499f2a','3dbde127c14049ba9ae08fdcade3e512') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'fb4f7e9431b84c7cbcdc3cf9bf499f2a','4724b8f82333445e90a89ad22fc64df3') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'fb4f7e9431b84c7cbcdc3cf9bf499f2a','5ceded1f7f64453698905c1b4bfa7092') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'fb4f7e9431b84c7cbcdc3cf9bf499f2a','61ba9bf2e8b04bf992fa46fe56c7623a') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'fb4f7e9431b84c7cbcdc3cf9bf499f2a','770ca1853e7842b1ab0cda2f4e4eb003') ;
