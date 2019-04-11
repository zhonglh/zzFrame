



    insert into ts_permit(
    id,
    permit_name,
    permit_code,
    remark,
    delete_flag
    ) values (
    '449bda211fe0435087ca8efad45558ee',
    '查看字典信息',
    'system.dict:detail',
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
    '8e88c74c5ec94e7fb9be3961c7bdc267',
    '新增字典信息',
    'system.dict:add',
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
    'b2df7aef8f4142729c56ec220f17e2bb',
    '删除字典信息',
    'system.dict:delete',
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
    'd4162b4b5b5c4de79d6388c50b36e573',
    '修改字典信息',
    'system.dict:update',
    null,
    '0'
    ) ;



    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'3775e716b9104d4190315a8af9825350','449bda211fe0435087ca8efad45558ee') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'3775e716b9104d4190315a8af9825350','8e88c74c5ec94e7fb9be3961c7bdc267') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'3775e716b9104d4190315a8af9825350','b2df7aef8f4142729c56ec220f17e2bb') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'3775e716b9104d4190315a8af9825350','d4162b4b5b5c4de79d6388c50b36e573') ;
