



    insert into ts_permit(
    id,
    permit_name,
    permit_code,
    remark,
    delete_flag
    ) values (
    '1d8201fea0c74b0589675e8b679f426e',
    '查看系统通知',
    'system.notification:detail',
    null,
    '0'
    ) ;



    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'c4b336ce78e84b45a1b29279c9715143','1d8201fea0c74b0589675e8b679f426e') ;
