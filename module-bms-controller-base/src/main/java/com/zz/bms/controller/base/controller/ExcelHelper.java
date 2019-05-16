package com.zz.bms.controller.base.controller;

import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.util.configs.AppConfig;
import com.zz.bms.util.poi.util.ExcelUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author admin
 */
public class ExcelHelper {


    public static Logger logger = Logger.getLogger(ExcelHelper.class);


    /**
     * 分析并且保存Excel的数据
     * @param list
     * @param sessionUserVO
     * @return
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    public static  <RwModel extends BaseEntity<PK>, QueryModel extends RwModel, PK extends Serializable>
    List<QueryModel>  doExcelData(List<QueryModel> list , ILoginUserEntity<PK> sessionUserVO , IExcelConttroller conntroller )
    {


        boolean isAllOK = true;
        int index = 0;

        try {

            //分析每一行的数据
            conntroller.analysis(list);


            Method setErrorMethod = ExcelUtil.setErrorMethod(conntroller.getRwEntityClass());
            Method getErrorMethod = ExcelUtil.getErrorMethod(conntroller.getRwEntityClass());



            if (AppConfig.NO_ERROR_SAVE_DB) {
                for (QueryModel m : list) {
                    if (getErrorMethod != null) {
                        String errorMsg = (String) getErrorMethod.invoke(m);
                        if (StringUtils.isNotEmpty(errorMsg)) {
                            isAllOK = false;
                        }
                    }

                }

                if (isAllOK) {

                    for (QueryModel m : list) {
                        try {
                            conntroller.customExcelInsert(m, sessionUserVO, index);
                            conntroller.insertInfo(m, sessionUserVO, false, false);
                            index++;
                        } catch (BizException e) {
                            isAllOK = false;
                            if (setErrorMethod != null) {
                                setErrorMethod.invoke(m, e.getMsg());
                            } else {
                                throw e;
                            }
                        } catch (RuntimeException e) {
                            isAllOK = false;
                            if (setErrorMethod != null) {
                                setErrorMethod.invoke(m, e.getMessage());
                            } else {
                                throw e;
                            }
                        } catch (Exception e) {
                            isAllOK = false;
                            logger.error(e.getMessage(), e);
                            if (setErrorMethod != null) {
                                setErrorMethod.invoke(m, "未知错误");
                            } else {
                                throw new RuntimeException(e);
                            }
                        }

                    }
                }


                if (isAllOK) {
                    List<RwModel> ims = new ArrayList<>();
                    for (QueryModel rm : list) {
                        ims.add(rm);
                    }

                    try {
                        conntroller.getBaseRwService().saveBatch(ims);
                    } catch (Exception e) {
                        throw new RuntimeException("数据错误，请重试！");
                    }
                }

            } else {
                for (QueryModel m : list) {
                    if (getErrorMethod != null) {
                        String errorMsg = (String) getErrorMethod.invoke(m);
                        if (StringUtils.isNotEmpty(errorMsg)) {
                            isAllOK = false;
                            continue;
                        }
                    }

                    try {
                        conntroller.customExcelInsert(m, sessionUserVO, index);
                        conntroller.insertInfo(m, sessionUserVO, true, false);
                        index++;
                    } catch (BizException e) {
                        isAllOK = false;
                        if (setErrorMethod != null) {
                            setErrorMethod.invoke(m, e.getMsg());
                        } else {
                            throw e;
                        }
                    } catch (RuntimeException e) {
                        isAllOK = false;
                        if (setErrorMethod != null) {
                            setErrorMethod.invoke(m, e.getMessage());
                        } else {
                            throw e;
                        }
                    } catch (Exception e) {
                        isAllOK = false;
                        logger.error(e.getMessage(), e);
                        if (setErrorMethod != null) {
                            setErrorMethod.invoke(m, "未知错误");
                        } else {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }catch(Exception e){
            throw new RuntimeException(e);
        }

        if(isAllOK){
            return null;
        }else {
            return list;
        }

    }
}
