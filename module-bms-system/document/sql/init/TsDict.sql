



    insert into ts_permit(
    id,
    permit_name,
    permit_code,
    remark,
    delete_flag
    ) values (
    '3938cbdb5d5b42efba632902127bf30c',
    '删除字典信息',
    'systemdict:del',
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
    '5f50896944f742b0bf000a22ecf10693',
    '查看字典信息',
    'systemdict:detail',
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
    '8b093dde78b7474d9e94d2d261c93b68',
    '修改字典信息',
    'systemdict:update',
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
    'af34e7fe9df546ecb73deba9415c69b3',
    '新增字典信息',
    'systemdict:add',
    null,
    '0'
    ) ;



    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'5f209ff018d6497090bc56b6a1363f5e','3938cbdb5d5b42efba632902127bf30c') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'5f209ff018d6497090bc56b6a1363f5e','5f50896944f742b0bf000a22ecf10693') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'5f209ff018d6497090bc56b6a1363f5e','8b093dde78b7474d9e94d2d261c93b68') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'5f209ff018d6497090bc56b6a1363f5e','af34e7fe9df546ecb73deba9415c69b3') ;
