
    insert into ts_dict_type(id,pid,dict_type_code,dict_type_name,dict_type_showable,dict_addable,dict_update,dict_delete,orderby)
    values(
        '96254a3f64924539903929467fd5b575' , null , 'fund_type' , '基金类型' , '0' , '0' , '0' , '0' , 2
    );

    -- setting fund_type dicts
    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '96254a3f64924539903929467fd5b575' , '' , ''  , 1 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '96254a3f64924539903929467fd5b575' , '' , ''  , 2 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '96254a3f64924539903929467fd5b575' , '' , ''  , 3 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );




    insert into ts_dict_type(id,pid,dict_type_code,dict_type_name,dict_type_showable,dict_addable,dict_update,dict_delete,orderby)
    values(
        'f8461b868ed843369e2e4b82dcc85fe7' , null , 'fund_direction' , '基金投向' , '0' , '0' , '0' , '0' , 3
    );

    -- setting fund_direction dicts
    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , 'f8461b868ed843369e2e4b82dcc85fe7' , '' , ''  , 1 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , 'f8461b868ed843369e2e4b82dcc85fe7' , '' , ''  , 2 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , 'f8461b868ed843369e2e4b82dcc85fe7' , '' , ''  , 3 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );




    insert into ts_dict_type(id,pid,dict_type_code,dict_type_name,dict_type_showable,dict_addable,dict_update,dict_delete,orderby)
    values(
        '2c0dc18165af48f79aeec169d3aedd40' , null , 'investor_type' , '投资人类型' , '0' , '0' , '0' , '0' , 4
    );

    -- setting investor_type dicts
    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '2c0dc18165af48f79aeec169d3aedd40' , '' , ''  , 1 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '2c0dc18165af48f79aeec169d3aedd40' , '' , ''  , 2 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , '2c0dc18165af48f79aeec169d3aedd40' , '' , ''  , 3 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );





    insert into ts_dict_type(id,pid,dict_type_code,dict_type_name,dict_type_showable,dict_addable,dict_update,dict_delete,orderby)
    values(
        'a2ee0a4a446148758b056ba7a0282ca9' , null , 'card_type' , '证件类型' , '0' , '0' , '0' , '0' , 19
    );

    -- setting card_type dicts
    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , 'a2ee0a4a446148758b056ba7a0282ca9' , '' , ''  , 1 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , 'a2ee0a4a446148758b056ba7a0282ca9' , '' , ''  , 2 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , 'a2ee0a4a446148758b056ba7a0282ca9' , '' , ''  , 3 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );





    insert into ts_dict_type(id,pid,dict_type_code,dict_type_name,dict_type_showable,dict_addable,dict_update,dict_delete,orderby)
    values(
        'bc34b6d7329d4662aae29645f7419da2' , null , 'fund_account_type' , '基金账户类型' , '0' , '0' , '0' , '0' , 22
    );

    -- setting fund_account_type dicts
    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , 'bc34b6d7329d4662aae29645f7419da2' , '' , ''  , 1 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , 'bc34b6d7329d4662aae29645f7419da2' , '' , ''  , 2 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , 'bc34b6d7329d4662aae29645f7419da2' , '' , ''  , 3 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );







    insert into ts_dict_type(id,pid,dict_type_code,dict_type_name,dict_type_showable,dict_addable,dict_update,dict_delete,orderby)
    values(
        'd669ff0736824e668250a217d6f1d411' , null , 'manag_type' , '管理类型' , '0' , '0' , '0' , '0' , 26
    );

    -- setting manag_type dicts
    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , 'd669ff0736824e668250a217d6f1d411' , '' , ''  , 1 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , 'd669ff0736824e668250a217d6f1d411' , '' , ''  , 2 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

    insert into ts_dict(id,dict_type_id,dict_val,dict_name,orderby,create_user_id,create_user_name,create_time,version_no,delete_flag, tenant_id)
    values(
        REPLACE(uuid() , "-" , "") , 'd669ff0736824e668250a217d6f1d411' , '' , ''  , 3 , '11111111111111111111111111111111' , '管理员' , SYSDATE() , 0 , '0' , '11111111111111111111111111111111'
    );

