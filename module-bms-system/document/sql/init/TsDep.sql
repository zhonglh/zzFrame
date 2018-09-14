



    insert into ts_permit(
    id,
    permit_name,
    permit_code,
    remark,
    delete_flag
    ) values (
    '08fd6e8a5a064d2e85d2abd8aa3868d3',
    '查看部门',
    'systemdep:detail',
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
    '7b21c600303547a68b438ffab6085208',
    '新增部门',
    'systemdep:add',
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
    'b153f5ff55584db4af0b28627f23912b',
    '修改部门',
    'systemdep:update',
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
    'ee4b2c5bc2564727b6579954398ece7e',
    '删除部门',
    'systemdep:del',
    null,
    '0'
    ) ;



    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'d5d474acaa464349bc1ab4155b1f0dc3','08fd6e8a5a064d2e85d2abd8aa3868d3') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'d5d474acaa464349bc1ab4155b1f0dc3','7b21c600303547a68b438ffab6085208') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'d5d474acaa464349bc1ab4155b1f0dc3','b153f5ff55584db4af0b28627f23912b') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'d5d474acaa464349bc1ab4155b1f0dc3','ee4b2c5bc2564727b6579954398ece7e') ;
