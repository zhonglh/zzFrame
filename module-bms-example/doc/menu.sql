insert into ts_menu(
id,
menu_name,
menu_code,
pid,
menu_sort,
menu_url,
menu_msg,
menu_icon,
menu_redirect,

shortcut,
level,
leaf,
remark,
delete_flag,
create_user_id,
create_user_name,
create_time,
update_user_id,
update_user_name,
update_time,
version_no )
values (
'2a051ec653d3474aae1629f423ca2e66' ,
'基金',
'example' ,
'' ,
0 ,
null,
'基金',
null,
null,

'0',
'1',
'0',
null,
'0',
'1' ,
'1' ,
SYSDATE() ,
'1' ,
'1' ,
SYSDATE() ,
1) ;


insert into ts_menu(
id,
menu_name,
menu_code,
pid,
menu_sort,
menu_url,
menu_msg,
menu_icon,
menu_redirect,

shortcut,
level,
leaf,
remark,
delete_flag,
create_user_id,
create_user_name,
create_time,
update_user_id,
update_user_name,
update_time,
version_no )
values (
'0306bc0c005b4fe18c2d9d70ffe91ad8' ,
'银行信息',
'TbBank' ,
'2a051ec653d3474aae1629f423ca2e66' ,
1 ,
'/example/bank/toList' ,
'银行信息',
null,
null,

'0',
'2',
'1',
null,
'0',
'1' ,
'1' ,
SYSDATE() ,
'1' ,
'1' ,
SYSDATE() ,
1) ;


insert into ts_menu(
id,
menu_name,
menu_code,
pid,
menu_sort,
menu_url,
menu_msg,
menu_icon,
menu_redirect,

shortcut,
level,
leaf,
remark,
delete_flag,
create_user_id,
create_user_name,
create_time,
update_user_id,
update_user_name,
update_time,
version_no )
values (
'dbbd9d87bc6e4eb1aa67cb3c19fe44f8' ,
'基金',
'TbFund' ,
'2a051ec653d3474aae1629f423ca2e66' ,
2 ,
'/example/fund/toList' ,
'基金',
null,
null,

'0',
'2',
'1',
null,
'0',
'1' ,
'1' ,
SYSDATE() ,
'1' ,
'1' ,
SYSDATE() ,
1) ;


insert into ts_menu(
id,
menu_name,
menu_code,
pid,
menu_sort,
menu_url,
menu_msg,
menu_icon,
menu_redirect,

shortcut,
level,
leaf,
remark,
delete_flag,
create_user_id,
create_user_name,
create_time,
update_user_id,
update_user_name,
update_time,
version_no )
values (
'9d939241373043258a380aca21c6de0f' ,
'投资人',
'TbInvestor' ,
'2a051ec653d3474aae1629f423ca2e66' ,
3 ,
'/example/investor/toList' ,
'投资人',
null,
null,

'0',
'2',
'1',
null,
'0',
'1' ,
'1' ,
SYSDATE() ,
'1' ,
'1' ,
SYSDATE() ,
1) ;


insert into ts_menu(
id,
menu_name,
menu_code,
pid,
menu_sort,
menu_url,
menu_msg,
menu_icon,
menu_redirect,

shortcut,
level,
leaf,
remark,
delete_flag,
create_user_id,
create_user_name,
create_time,
update_user_id,
update_user_name,
update_time,
version_no )
values (
'd20fd7800ac74cbcadee87a10eae0215' ,
'投资协议',
'TbInvestorAgreement' ,
'2a051ec653d3474aae1629f423ca2e66' ,
4 ,
'/example/investoragreement/toList' ,
'投资协议',
null,
null,

'0',
'2',
'1',
null,
'0',
'1' ,
'1' ,
SYSDATE() ,
'1' ,
'1' ,
SYSDATE() ,
1) ;


insert into ts_menu(
id,
menu_name,
menu_code,
pid,
menu_sort,
menu_url,
menu_msg,
menu_icon,
menu_redirect,

shortcut,
level,
leaf,
remark,
delete_flag,
create_user_id,
create_user_name,
create_time,
update_user_id,
update_user_name,
update_time,
version_no )
values (
'9841bb939f314e9e99e2015d4d091ea9' ,
'出资明细',
'TbOutMoney' ,
'2a051ec653d3474aae1629f423ca2e66' ,
5 ,
'/example/outmoney/toList' ,
'出资明细',
null,
null,

'0',
'2',
'1',
null,
'0',
'1' ,
'1' ,
SYSDATE() ,
'1' ,
'1' ,
SYSDATE() ,
1) ;



















    insert into ts_permit(
    id,
    permit_name,
    permit_code,
    remark,
    delete_flag
    ) values (
    '290f8c0b82e94f1f89a7d76e8ebce0dd',
    '新增出资明细',
    'example.outmoney:add',
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
    '9233de2ac9df4518b82a72c1a8126cf0',
    '导入出资明细',
    'example.outmoney:importExcel',
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
    'b16aaac5894246e685ab743b97d02b2f',
    '修改出资明细',
    'example.outmoney:update',
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
    'd524f6e1a58b4a92930920b2016632c6',
    '查看出资明细',
    'example.outmoney:detail',
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
    'ec64ca7335894a16b16f0a0377be5397',
    '删除出资明细',
    'example.outmoney:delete',
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
    'efc0f6893d134e7b8e6525034628e7e9',
    '导出出资明细',
    'example.outmoney:exportExcel',
    null,
    '0'
    ) ;



    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'9841bb939f314e9e99e2015d4d091ea9','290f8c0b82e94f1f89a7d76e8ebce0dd') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'9841bb939f314e9e99e2015d4d091ea9','9233de2ac9df4518b82a72c1a8126cf0') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'9841bb939f314e9e99e2015d4d091ea9','b16aaac5894246e685ab743b97d02b2f') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'9841bb939f314e9e99e2015d4d091ea9','d524f6e1a58b4a92930920b2016632c6') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'9841bb939f314e9e99e2015d4d091ea9','ec64ca7335894a16b16f0a0377be5397') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'9841bb939f314e9e99e2015d4d091ea9','efc0f6893d134e7b8e6525034628e7e9') ;






    insert into ts_permit(
    id,
    permit_name,
    permit_code,
    remark,
    delete_flag
    ) values (
    '17bcef8dabab41c7a3306b4b647827aa',
    '查看投资人',
    'example.investor:detail',
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
    '29d91fb1331f47b186a027a6ddd525bd',
    '删除投资人',
    'example.investor:delete',
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
    '45de6a36e0d64dfa879f01f011ed5a6e',
    '导入投资人',
    'example.investor:importExcel',
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
    '64c62f16c4764782b686134f72def76c',
    '新增投资人',
    'example.investor:add',
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
    'cb977e649462428c9a8a9c8941ca63bd',
    '修改投资人',
    'example.investor:update',
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
    'e16b95e81e584812a8937b741af6f773',
    '导出投资人',
    'example.investor:exportExcel',
    null,
    '0'
    ) ;



    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'9d939241373043258a380aca21c6de0f','17bcef8dabab41c7a3306b4b647827aa') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'9d939241373043258a380aca21c6de0f','29d91fb1331f47b186a027a6ddd525bd') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'9d939241373043258a380aca21c6de0f','45de6a36e0d64dfa879f01f011ed5a6e') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'9d939241373043258a380aca21c6de0f','64c62f16c4764782b686134f72def76c') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'9d939241373043258a380aca21c6de0f','cb977e649462428c9a8a9c8941ca63bd') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'9d939241373043258a380aca21c6de0f','e16b95e81e584812a8937b741af6f773') ;






    insert into ts_permit(
    id,
    permit_name,
    permit_code,
    remark,
    delete_flag
    ) values (
    '36e6349dabed403d8d303447c69d90b6',
    '导入银行信息',
    'example.bank:importExcel',
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
    '3f2f22bce5ab4be18803f3407943ea1f',
    '新增银行信息',
    'example.bank:add',
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
    '4c3ea49c369243d49f19cdd033f0066c',
    '修改银行信息',
    'example.bank:update',
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
    '674248bbdce3419f82b9953e20a3054f',
    '查看银行信息',
    'example.bank:detail',
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
    '8c99fc09148b49a29cd7cec135c19b51',
    '导出银行信息',
    'example.bank:exportExcel',
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
    'b91246f5420f457dad635099e2cabf78',
    '删除银行信息',
    'example.bank:delete',
    null,
    '0'
    ) ;



    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'0306bc0c005b4fe18c2d9d70ffe91ad8','36e6349dabed403d8d303447c69d90b6') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'0306bc0c005b4fe18c2d9d70ffe91ad8','3f2f22bce5ab4be18803f3407943ea1f') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'0306bc0c005b4fe18c2d9d70ffe91ad8','4c3ea49c369243d49f19cdd033f0066c') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'0306bc0c005b4fe18c2d9d70ffe91ad8','674248bbdce3419f82b9953e20a3054f') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'0306bc0c005b4fe18c2d9d70ffe91ad8','8c99fc09148b49a29cd7cec135c19b51') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'0306bc0c005b4fe18c2d9d70ffe91ad8','b91246f5420f457dad635099e2cabf78') ;






    insert into ts_permit(
    id,
    permit_name,
    permit_code,
    remark,
    delete_flag
    ) values (
    '08a7c689b6ed4630bcb36de1f1abec64',
    '新增投资协议',
    'example.investoragreement:add',
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
    '60ff83157c304e869ca51028987e3b16',
    '删除投资协议',
    'example.investoragreement:delete',
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
    '888954d2cf614806b82d149a8877ffda',
    '修改投资协议',
    'example.investoragreement:update',
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
    '9ca7619fbfbc45b4b6852809a5452736',
    '查看投资协议',
    'example.investoragreement:detail',
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
    '9d9e19f321ee495fa8c7f522b6b5d07a',
    '导入投资协议',
    'example.investoragreement:importExcel',
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
    'ac1cb842337b46b4807683df9bddfc11',
    '导出投资协议',
    'example.investoragreement:exportExcel',
    null,
    '0'
    ) ;



    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'d20fd7800ac74cbcadee87a10eae0215','08a7c689b6ed4630bcb36de1f1abec64') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'d20fd7800ac74cbcadee87a10eae0215','60ff83157c304e869ca51028987e3b16') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'d20fd7800ac74cbcadee87a10eae0215','888954d2cf614806b82d149a8877ffda') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'d20fd7800ac74cbcadee87a10eae0215','9ca7619fbfbc45b4b6852809a5452736') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'d20fd7800ac74cbcadee87a10eae0215','9d9e19f321ee495fa8c7f522b6b5d07a') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'d20fd7800ac74cbcadee87a10eae0215','ac1cb842337b46b4807683df9bddfc11') ;






    insert into ts_permit(
    id,
    permit_name,
    permit_code,
    remark,
    delete_flag
    ) values (
    '0680e1d5250643b1a3b7c63f478c2cbb',
    '导入基金',
    'example.fund:importExcel',
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
    '6c8aca3d9c4c4272865e552e4f93df05',
    '删除基金',
    'example.fund:delete',
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
    '779473bc5ffe4893a19b884b1b947e9c',
    '新增基金',
    'example.fund:add',
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
    '8541d04f72444d3dbf58145fc2d78fa3',
    '修改基金',
    'example.fund:update',
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
    'a9c6fe7f2e8b4a0a900ba9cc3e17f1fa',
    '查看基金',
    'example.fund:detail',
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
    'd41690bf76a944fc989fa2e12312a64b',
    '导出基金',
    'example.fund:exportExcel',
    null,
    '0'
    ) ;



    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'dbbd9d87bc6e4eb1aa67cb3c19fe44f8','0680e1d5250643b1a3b7c63f478c2cbb') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'dbbd9d87bc6e4eb1aa67cb3c19fe44f8','6c8aca3d9c4c4272865e552e4f93df05') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'dbbd9d87bc6e4eb1aa67cb3c19fe44f8','779473bc5ffe4893a19b884b1b947e9c') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'dbbd9d87bc6e4eb1aa67cb3c19fe44f8','8541d04f72444d3dbf58145fc2d78fa3') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'dbbd9d87bc6e4eb1aa67cb3c19fe44f8','a9c6fe7f2e8b4a0a900ba9cc3e17f1fa') ;
    insert into ts_menu_permit(id ,menu_id , permit_id)
    values (REPLACE(uuid() , "-" , ""),'dbbd9d87bc6e4eb1aa67cb3c19fe44f8','d41690bf76a944fc989fa2e12312a64b') ;
