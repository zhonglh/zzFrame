



    insert into ts_permit(
    id,
    permit_name,
    permit_code,
    remark,
    delete_flag
    ) values (
    '573e1dd87a934dd4af704caa39a4bb24',
    '导出部门',
    'system.dep:exportExcel',
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
    '9c829d25ca204e49aa7ec388bb3a3072',
    '新增部门',
    'system.dep:add',
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
    'e53c85de3a6e4f27b0ba8c2f1213958e',
    '删除部门',
    'system.dep:delete',
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
    'e5a8f8dd5c554e0490f6e333008cc2cd',
    '查看部门',
    'system.dep:detail',
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
    'ebbf80cf906d4658b3aa4cd4a7ba8021',
    '修改部门',
    'system.dep:update',
    null,
    '0'
    ) ;



    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'120b49d0ec7b4330ac71026aa514b27d','573e1dd87a934dd4af704caa39a4bb24') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'120b49d0ec7b4330ac71026aa514b27d','9c829d25ca204e49aa7ec388bb3a3072') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'120b49d0ec7b4330ac71026aa514b27d','e53c85de3a6e4f27b0ba8c2f1213958e') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'120b49d0ec7b4330ac71026aa514b27d','e5a8f8dd5c554e0490f6e333008cc2cd') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'120b49d0ec7b4330ac71026aa514b27d','ebbf80cf906d4658b3aa4cd4a7ba8021') ;
