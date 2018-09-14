



    insert into ts_permit(
    id,
    permit_name,
    permit_code,
    remark,
    delete_flag
    ) values (
    '76db9aae7b02455bad25f4afffac5648',
    '修改租户',
    'systemtenant:update',
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
    '793b8f2d4d67433689f3e26167c5fefe',
    '查看租户',
    'systemtenant:detail',
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
    'd843fe57969a4ec8b5d2e6bc9dfaca32',
    '删除租户',
    'systemtenant:del',
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
    'fbc35c4216404889a998effb5f4743bc',
    '新增租户',
    'systemtenant:add',
    null,
    '0'
    ) ;



    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'7c2a2085887d4cff9a0e9936fb335a8f','76db9aae7b02455bad25f4afffac5648') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'7c2a2085887d4cff9a0e9936fb335a8f','793b8f2d4d67433689f3e26167c5fefe') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'7c2a2085887d4cff9a0e9936fb335a8f','d843fe57969a4ec8b5d2e6bc9dfaca32') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'7c2a2085887d4cff9a0e9936fb335a8f','fbc35c4216404889a998effb5f4743bc') ;
