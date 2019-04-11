



    insert into ts_permit(
    id,
    permit_name,
    permit_code,
    remark,
    delete_flag
    ) values (
    'cb3d22ab5d044d99adb99752b0023bf1',
    '查看文件',
    'system.file:detail',
    null,
    '0'
    ) ;



    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'d0eb86f7a98e40f0ac42ab04c2589615','cb3d22ab5d044d99adb99752b0023bf1') ;
