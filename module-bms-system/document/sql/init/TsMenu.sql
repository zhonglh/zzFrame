



    insert into ts_permit(
    id,
    permit_name,
    permit_code,
    remark,
    delete_flag
    ) values (
    'bd80405188fc44e588f64b02c30a1962',
    '修改菜单',
    'system.menu:update',
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
    'f1c3d7d053c94397b54ceda699435531',
    '查看菜单',
    'system.menu:detail',
    null,
    '0'
    ) ;



    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'f1f60743eb834ad3b651ef3ab0e464a0','bd80405188fc44e588f64b02c30a1962') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'f1f60743eb834ad3b651ef3ab0e464a0','f1c3d7d053c94397b54ceda699435531') ;
