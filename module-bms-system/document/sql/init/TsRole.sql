



    insert into ts_permit(
    id,
    permit_name,
    permit_code,
    remark,
    delete_flag
    ) values (
    '07a6873c197241a092ea39115ae4f233',
    '导入角色',
    'system.role:importExcel',
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
    '68230d75af3042d288ea2442be180647',
    '修改角色',
    'system.role:update',
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
    '7ffac469f26b420abc36e183bd482ddf',
    '导出角色',
    'system.role:exportExcel',
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
    '8066ae188336444396f6436ff7a736d3',
    '新增角色',
    'system.role:add',
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
    'bd301aa4412741db93f5272d96c445a7',
    '查看角色',
    'system.role:detail',
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
    'f9e9409ce21041bc981ff0f592a9c105',
    '删除角色',
    'system.role:delete',
    null,
    '0'
    ) ;



    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'a8a8503f0cfa47e6927ae779c3130943','07a6873c197241a092ea39115ae4f233') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'a8a8503f0cfa47e6927ae779c3130943','68230d75af3042d288ea2442be180647') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'a8a8503f0cfa47e6927ae779c3130943','7ffac469f26b420abc36e183bd482ddf') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'a8a8503f0cfa47e6927ae779c3130943','8066ae188336444396f6436ff7a736d3') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'a8a8503f0cfa47e6927ae779c3130943','bd301aa4412741db93f5272d96c445a7') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'a8a8503f0cfa47e6927ae779c3130943','f9e9409ce21041bc981ff0f592a9c105') ;
