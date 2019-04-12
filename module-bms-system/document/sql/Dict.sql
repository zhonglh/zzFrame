


    insert into ts_dict_type(id,pid,dict_type_code,dict_type_name,dict_type_showable,dict_addable,dict_update,dict_delete,orderby)
    values(
        '57ee5e4b98e944c4a833d706cdb2e966' , null , 'user_status' , '用户状态' , '0' , '0' , '0' , '0' , 0
    );

    -- setting user_status dicts
    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '57ee5e4b98e944c4a833d706cdb2e966' , '1' , '正常'  , 1 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '57ee5e4b98e944c4a833d706cdb2e966' , '0' , '禁用'  , 2 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );




    insert into ts_dict_type(id,pid,dict_type_code,dict_type_name,dict_type_showable,dict_addable,dict_update,dict_delete,orderby)
    values(
        '57ef20f444e2475d9bd20e08e14cad83' , null , 'operation_type' , '操作类型' , '0' , '0' , '0' , '0' , 1
    );

    -- setting operation_type dicts
    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '57ef20f444e2475d9bd20e08e14cad83' , '1' , '登陆'  , 1 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '57ef20f444e2475d9bd20e08e14cad83' , '2' , '退出'  , 2 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '57ef20f444e2475d9bd20e08e14cad83' , '3' , '强制退出'  , 3 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '57ef20f444e2475d9bd20e08e14cad83' , '4' , '踢出'  , 3 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );




    insert into ts_dict_type(id,pid,dict_type_code,dict_type_name,dict_type_showable,dict_addable,dict_update,dict_delete,orderby)
    values(
        '4c6cf2a718e4438988db53b78b38c6b2' , null , 'role_type' , '角色类型' , '0' , '0' , '0' , '0' , 2
    );

    -- setting role_type dicts
    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '4c6cf2a718e4438988db53b78b38c6b2' , '1' , '系统角色'  , 1 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '4c6cf2a718e4438988db53b78b38c6b2' , '2' , '用户角色'  , 2 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );




    insert into ts_dict_type(id,pid,dict_type_code,dict_type_name,dict_type_showable,dict_addable,dict_update,dict_delete,orderby)
    values(
        '86e45cac9ecc41c9a6e1b4f6eafbf794' , null , 'organ_type' , '机构类型' , '0' , '0' , '0' , '0' , 3
    );

    -- setting organ_type dicts



    insert into ts_dict_type(id,pid,dict_type_code,dict_type_name,dict_type_showable,dict_addable,dict_update,dict_delete,orderby)
    values(
        'd27c74acae194fb2b383eebc81a4611f' , null , 'yes_no' , '是否' , '0' , '0' , '0' , '0' , 4
    );

    -- setting yes_no dicts
    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , 'd27c74acae194fb2b383eebc81a4611f' , '0' , '否'  , 1 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , 'd27c74acae194fb2b383eebc81a4611f' , '1' , '是'  , 2 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );




    insert into ts_dict_type(id,pid,dict_type_code,dict_type_name,dict_type_showable,dict_addable,dict_update,dict_delete,orderby)
    values(
        'fc82b24e44dc472fbc5d1641aa48ee81' , null , 'dep_status' , '部门状态' , '0' , '0' , '0' , '0' , 6
    );

    -- setting dep_status dicts
    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , 'fc82b24e44dc472fbc5d1641aa48ee81' , '1' , '正常'  , 1 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , 'fc82b24e44dc472fbc5d1641aa48ee81' , '0' , '解散'  , 2 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );






    insert into ts_dict_type(id,pid,dict_type_code,dict_type_name,dict_type_showable,dict_addable,dict_update,dict_delete,orderby)
    values(
        '275ef03775af42d1a003539647ba3995' , null , 'msg_language' , '语言' , '0' , '0' , '0' , '0' , 8
    );

    -- setting msg_language dicts
    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '275ef03775af42d1a003539647ba3995' , '1' , '中文'  , 1 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '275ef03775af42d1a003539647ba3995' , '2' , 'English '  , 2 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );




    insert into ts_dict_type(id,pid,dict_type_code,dict_type_name,dict_type_showable,dict_addable,dict_update,dict_delete,orderby)
    values(
        '1807debb1f684db2a9d85429ae3bd8ca' , null , 'organ_status' , '机构状态' , '0' , '0' , '0' , '0' , 9
    );

    -- setting organ_status dicts
    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '1807debb1f684db2a9d85429ae3bd8ca' , '1' , '正常'  , 1 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '1807debb1f684db2a9d85429ae3bd8ca' , '0' , '解散'  , 2 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );




    insert into ts_dict_type(id,pid,dict_type_code,dict_type_name,dict_type_showable,dict_addable,dict_update,dict_delete,orderby)
    values(
        '820cb718ed1d404ab6d146dd13dc0f35' , null , 'file_engine' , '文件存储引擎' , '0' , '0' , '0' , '0' , 10
    );

    -- setting file_engine dicts
    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '820cb718ed1d404ab6d146dd13dc0f35' , '0' , '文件系统'  , 1 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '820cb718ed1d404ab6d146dd13dc0f35' , '1' , '七牛云'  , 2 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '820cb718ed1d404ab6d146dd13dc0f35' , '2' , '阿里云'  , 3 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '820cb718ed1d404ab6d146dd13dc0f35' , '3' , '腾讯云'  , 4 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '820cb718ed1d404ab6d146dd13dc0f35' , '4' , 'FastNFS'  , 5 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '820cb718ed1d404ab6d146dd13dc0f35' , '5' , 'MongoDB'  , 6 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );




    insert into ts_dict_type(id,pid,dict_type_code,dict_type_name,dict_type_showable,dict_addable,dict_update,dict_delete,orderby)
    values(
        '14ca5b5371e14e9b84d83c933c71bcae' , null , 'role_status' , '角色状态' , '0' , '0' , '0' , '0' , 11
    );

    -- setting role_status dicts
    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '14ca5b5371e14e9b84d83c933c71bcae' , '0' , '禁用'  , 1 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '14ca5b5371e14e9b84d83c933c71bcae' , '1' , '正常'  , 2 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );






    insert into ts_dict_type(id,pid,dict_type_code,dict_type_name,dict_type_showable,dict_addable,dict_update,dict_delete,orderby)
    values(
        '3a03d239d82c4871a6166c9f7508e219' , null , 'msg_templet_type' , '消息模板类型' , '0' , '0' , '0' , '0' , 13
    );

    -- setting msg_templet_type dicts
    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '3a03d239d82c4871a6166c9f7508e219' , '1' , '邮件'  , 1 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '3a03d239d82c4871a6166c9f7508e219' , '2' , '短信'  , 2 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '3a03d239d82c4871a6166c9f7508e219' , '3' , '微信'  , 3 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );



