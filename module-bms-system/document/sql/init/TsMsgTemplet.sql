



    insert into ts_permit(
    id,
    permit_name,
    permit_code,
    remark,
    delete_flag
    ) values (
    '033fc069564f4a7796ab161b5bed8709',
    '新增消息模板',
    'systemmsgtemplet:add',
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
    '94f321abbb164ac0ae1a8bb86ab14f8c',
    '删除消息模板',
    'systemmsgtemplet:del',
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
    'ab4ebd0f86fc4889be77c9ef26e0ccda',
    '修改消息模板',
    'systemmsgtemplet:update',
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
    'd676b17e062d4803a0a6b4f7abb73768',
    '查看消息模板',
    'systemmsgtemplet:detail',
    null,
    '0'
    ) ;



    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'c451198927ef4c9ead15de6ca7ba9fbf','033fc069564f4a7796ab161b5bed8709') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'c451198927ef4c9ead15de6ca7ba9fbf','94f321abbb164ac0ae1a8bb86ab14f8c') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'c451198927ef4c9ead15de6ca7ba9fbf','ab4ebd0f86fc4889be77c9ef26e0ccda') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'c451198927ef4c9ead15de6ca7ba9fbf','d676b17e062d4803a0a6b4f7abb73768') ;
