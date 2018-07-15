
package com.zz.bms.core.exceptions;

import com.zz.bms.core.enums.EnumErrorMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 自定义数据库异常类
 */
public class DbException extends BizException {

    private static final long serialVersionUID = -5875371379845226068L;


    private static final Logger logger = LoggerFactory.getLogger(DbException.class);



    /**
     * 数据库操作,insert返回0
     */
    public static final DbException DB_INSERT_RESULT_0 = new DbException(
            EnumErrorMsg.db_insert_error.toException()
    );

    /**
     * 数据库操作,update返回0
     */
    public static final DbException DB_UPDATE_RESULT_0 = new DbException(
            EnumErrorMsg.db_update_error.toException()
    );



    public static final DbException DB_DELETE_RESULT_0 = new DbException(
            EnumErrorMsg.db_delete_error.toException()
    );



    public static final DbException DB_SAVE_SAME = new DbException(
            EnumErrorMsg.db_same_error.toException()
    );



    public DbException() {
    }


    public DbException(BizException ex) {
        super(ex.getCode(), ex.getMsg());
    }

    public DbException(int code, String msgFormat, Object... args) {
        super(code, msgFormat, args);
    }

    public DbException(int code, String msg) {
        super(code, msg);
    }



}
