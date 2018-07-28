package com.zz.bms.core.db.base.service.impl;

import com.baomidou.mybatisplus.entity.TableInfo;
import com.baomidou.mybatisplus.enums.SqlMethod;
import com.baomidou.mybatisplus.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.mapper.SqlHelper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.toolkit.*;
import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.BaseService;
import com.zz.bms.core.db.entity.BaseEntity;
import org.apache.ibatis.binding.MapperMethod;
import org.apache.ibatis.session.SqlSession;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 */
public abstract class BaseServiceImpl<T extends BaseEntity<PK> ,  PK extends Serializable>  implements BaseService<T , PK> {

    /**
     * 获取查询用到的DAO实体
     * @return BaseDAO
     */
    public abstract BaseDAO getQueryDAO() ;

    /**
     * 获取读写用到的DAO实体
     * @return BaseDAO
     */
    public abstract BaseDAO getRwDAO();

    public BaseServiceImpl() {
    }

    protected static boolean retBool(Integer result) {
        return SqlHelper.retBool(result);
    }

    protected Class<T> currentModelClass() {
        return ReflectionKit.getSuperClassGenricType(this.getClass(), 1);
    }

    protected SqlSession sqlSessionBatch() {
        return SqlHelper.sqlSessionBatch(this.currentModelClass());
    }

    protected String sqlStatement(SqlMethod sqlMethod) {
        return SqlHelper.table(this.currentModelClass()).getSqlStatement(sqlMethod.getMethod());
    }

    @Override
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public boolean insert(T entity) {
        return retBool(this.getRwDAO().insert(entity));
    }


    @Override
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public boolean insertAllColumn(T entity) {
        return retBool(this.getRwDAO().insertAllColumn(entity));
    }

    @Override
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public boolean insertBatch(List<T> entityList) {
        return this.insertBatch(entityList, 30);
    }

    @Override
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public boolean insertBatch(List<T> entityList, int batchSize) {
        if (CollectionUtils.isEmpty(entityList)) {
            throw new IllegalArgumentException("Error: entityList must not be empty");
        } else {
            try {
                SqlSession batchSqlSession = this.sqlSessionBatch();
                Throwable var4 = null;

                try {
                    int size = entityList.size();
                    String sqlStatement = this.sqlStatement(SqlMethod.INSERT_ONE);

                    for(int i = 0; i < size; ++i) {
                        batchSqlSession.insert(sqlStatement, entityList.get(i));
                        if (i >= 1 && i % batchSize == 0) {
                            batchSqlSession.flushStatements();
                        }
                    }

                    batchSqlSession.flushStatements();
                } catch (Throwable var16) {
                    var4 = var16;
                    throw var16;
                } finally {
                    if (batchSqlSession != null) {
                        if (var4 != null) {
                            try {
                                batchSqlSession.close();
                            } catch (Throwable var15) {
                                var4.addSuppressed(var15);
                            }
                        } else {
                            batchSqlSession.close();
                        }
                    }

                }

                return true;
            } catch (Throwable var18) {
                throw new MybatisPlusException("Error: Cannot execute insertBatch Method. Cause", var18);
            }
        }
    }

    @Override
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public boolean insertOrUpdate(T entity) {
        if (null == entity) {
            return false;
        } else {
            Class<?> cls = entity.getClass();
            TableInfo tableInfo = TableInfoHelper.getTableInfo(cls);
            if (null != tableInfo && StringUtils.isNotEmpty(tableInfo.getKeyProperty())) {
                Object idVal = ReflectionKit.getMethodValue(cls, entity, tableInfo.getKeyProperty());
                if (StringUtils.checkValNull(idVal)) {
                    return this.insert(entity);
                } else {
                    return this.updateById(entity) || this.insert(entity);
                }
            } else {
                throw new MybatisPlusException("Error:  Can not execute. Could not find @TableId.");
            }
        }
    }

    @Override
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public boolean insertOrUpdateAllColumn(T entity) {
        if (null == entity) {
            return false;
        } else {
            Class<?> cls = entity.getClass();
            TableInfo tableInfo = TableInfoHelper.getTableInfo(cls);
            if (null != tableInfo && StringUtils.isNotEmpty(tableInfo.getKeyProperty())) {
                Object idVal = ReflectionKit.getMethodValue(cls, entity, tableInfo.getKeyProperty());
                if (StringUtils.checkValNull(idVal)) {
                    return this.insertAllColumn(entity);
                } else {
                    return this.updateAllColumnById(entity) || this.insertAllColumn(entity);
                }
            } else {
                throw new MybatisPlusException("Error:  Can not execute. Could not find @TableId.");
            }
        }
    }

    @Override
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public boolean insertOrUpdateBatch(List<T> entityList) {
        return this.insertOrUpdateBatch(entityList, 30);
    }

    @Override
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public boolean insertOrUpdateBatch(List<T> entityList, int batchSize) {
        return this.insertOrUpdateBatch(entityList, batchSize, true);
    }

    @Override
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public boolean insertOrUpdateAllColumnBatch(List<T> entityList) {
        return this.insertOrUpdateBatch(entityList, 30, false);
    }

    @Override
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public boolean insertOrUpdateAllColumnBatch(List<T> entityList, int batchSize) {
        return this.insertOrUpdateBatch(entityList, batchSize, false);
    }

    private boolean insertOrUpdateBatch(List<T> entityList, int batchSize, boolean selective) {
        if (CollectionUtils.isEmpty(entityList)) {
            throw new IllegalArgumentException("Error: entityList must not be empty");
        } else {
            try {
                SqlSession batchSqlSession = this.sqlSessionBatch();
                Throwable var5 = null;

                try {
                    int size = entityList.size();

                    for(int i = 0; i < size; ++i) {
                        if (selective) {
                            this.insertOrUpdate(entityList.get(i));
                        } else {
                            this.insertOrUpdateAllColumn(entityList.get(i));
                        }

                        if (i >= 1 && i % batchSize == 0) {
                            batchSqlSession.flushStatements();
                        }
                    }

                    batchSqlSession.flushStatements();
                    return true;
                } catch (Throwable var16) {
                    var5 = var16;
                    throw var16;
                } finally {
                    if (batchSqlSession != null) {
                        if (var5 != null) {
                            try {
                                batchSqlSession.close();
                            } catch (Throwable var15) {
                                var5.addSuppressed(var15);
                            }
                        } else {
                            batchSqlSession.close();
                        }
                    }

                }
            } catch (Throwable var18) {
                throw new MybatisPlusException("Error: Cannot execute insertOrUpdateBatch Method. Cause", var18);
            }
        }
    }

    @Override
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public boolean deleteById(Serializable id) {
        return SqlHelper.delBool(this.getRwDAO().deleteById(id));
    }



    @Override
    public boolean deleteById(T t){
        return deleteById(t.getId());
    }
    @Override
    public boolean deletesByIds(List<T> ts){
        List<PK> ids = new ArrayList<PK>();
        for(T t : ts){
            ids.add(t.getId());
        }
        return this.deleteBatchIds(ids);
    }


    @Override
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public boolean deleteByMap(Map<String, Object> columnMap) {
        if (MapUtils.isEmpty(columnMap)) {
            throw new MybatisPlusException("deleteByMap columnMap is empty.");
        } else {
            return SqlHelper.delBool(this.getRwDAO().deleteByMap(columnMap));
        }
    }

    @Override
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public boolean delete(Wrapper<T> wrapper) {
        return SqlHelper.delBool(this.getRwDAO().delete(wrapper));
    }

    @Override
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public boolean deleteBatchIds(Collection<? extends Serializable> idList) {
        return SqlHelper.delBool(this.getRwDAO().deleteBatchIds(idList));
    }

    @Override
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public boolean updateById(T entity) {
        return retBool(this.getRwDAO().updateById(entity));
    }

    @Override
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public boolean updateAllColumnById(T entity) {
        return retBool(this.getRwDAO().updateAllColumnById(entity));
    }

    @Override
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public boolean update(T entity, Wrapper<T> wrapper) {
        return retBool(this.getRwDAO().update(entity, wrapper));
    }

    @Override
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public boolean updateForSet(String setStr, Wrapper<T> wrapper) {
        return retBool(this.getRwDAO().updateForSet(setStr, wrapper));
    }

    @Override
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public boolean updateBatchById(List<T> entityList) {
        return this.updateBatchById(entityList, 30);
    }

    @Override
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public boolean updateBatchById(List<T> entityList, int batchSize) {
        return this.updateBatchById(entityList, batchSize, true);
    }

    @Override
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public boolean updateAllColumnBatchById(List<T> entityList) {
        return this.updateAllColumnBatchById(entityList, 30);
    }

    @Override
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public boolean updateAllColumnBatchById(List<T> entityList, int batchSize) {
        return this.updateBatchById(entityList, batchSize, false);
    }

    private boolean updateBatchById(List<T> entityList, int batchSize, boolean selective) {
        if (CollectionUtils.isEmpty(entityList)) {
            throw new IllegalArgumentException("Error: entityList must not be empty");
        } else {
            try {
                SqlSession batchSqlSession = this.sqlSessionBatch();
                Throwable var5 = null;

                try {
                    int size = entityList.size();
                    SqlMethod sqlMethod = selective ? SqlMethod.UPDATE_BY_ID : SqlMethod.UPDATE_ALL_COLUMN_BY_ID;
                    String sqlStatement = this.sqlStatement(sqlMethod);

                    for(int i = 0; i < size; ++i) {
                        MapperMethod.ParamMap<T> param = new MapperMethod.ParamMap();
                        param.put("et", entityList.get(i));
                        batchSqlSession.update(sqlStatement, param);
                        if (i >= 1 && i % batchSize == 0) {
                            batchSqlSession.flushStatements();
                        }
                    }

                    batchSqlSession.flushStatements();
                    return true;
                } catch (Throwable var19) {
                    var5 = var19;
                    throw var19;
                } finally {
                    if (batchSqlSession != null) {
                        if (var5 != null) {
                            try {
                                batchSqlSession.close();
                            } catch (Throwable var18) {
                                var5.addSuppressed(var18);
                            }
                        } else {
                            batchSqlSession.close();
                        }
                    }

                }
            } catch (Throwable var21) {
                throw new MybatisPlusException("Error: Cannot execute updateBatchById Method. Cause", var21);
            }
        }
    }




    @Override
    public T selectById(Serializable id) {

        T t =  (T)this.getQueryDAO().selectById(id);
        return processResult(t);
    }

    @Override
    public List<T> selectBatchIds(Collection<? extends Serializable> idList) {
        List<T> list =  this.getQueryDAO().selectBatchIds(idList);
        if(list != null && !list.isEmpty()){
            for(T t : list){
                processResult(t);
            }
        }
        return list;
    }

    @Override
    public List<T> selectByMap(Map<String, Object> columnMap) {
        List<T> list =  this.getQueryDAO().selectByMap(columnMap);
        if(list != null && !list.isEmpty()){
            for(T t : list){
                processResult(t);
            }
        }
        return list;
    }

    @Override
    public T selectOne(Wrapper<T> wrapper) {
        T t=  (T)SqlHelper.getObject(this.getQueryDAO().selectList(wrapper));
        return processResult(t);
    }




    @Override
    public T selectCheck(T t){
        return (T)this.getQueryDAO().selectCheck(t);
    }

    @Override
    public Map<String, Object> selectMap(Wrapper<T> wrapper) {
        Map<String, Object>  map = (Map)SqlHelper.getObject(this.getQueryDAO().selectMaps(wrapper));
        if(map != null && !map.isEmpty()){
            for(Object o : map.values()){
                processResult((T)o);
            }
        }
        return map;
    }

    @Override
    public Object selectObj(Wrapper<T> wrapper) {

        Object o =  SqlHelper.getObject(this.getQueryDAO().selectObjs(wrapper));
        if(o == null) {
            return null;
        }else {
            return processResult((T)o);
        }
    }

    @Override
    public int selectCount(Wrapper<T> wrapper) {
        return SqlHelper.retCount(this.getQueryDAO().selectCount(wrapper));
    }

    @Override
    public List<T> selectList(Wrapper<T> wrapper) {
        List<T> list =  this.getQueryDAO().selectList(wrapper);
        if(list != null && !list.isEmpty()){
            for(T t : list){
                processResult(t);
            }
        }
        return list;
    }

    @Override
    public Page<T> selectPage(Page<T> page) {

        Page<T> result =  this.selectPage(page, Condition.EMPTY);
        List<T> list = result.getRecords();
        if(list != null && !list.isEmpty()){
            for(T t : list){
                    processResult(t);
            }
        }
        return result;
    }

    @Override
    public List<Map<String, Object>> selectMaps(Wrapper<T> wrapper) {
        return this.getQueryDAO().selectMaps(wrapper);
    }

    @Override
    public List<Object> selectObjs(Wrapper<T> wrapper) {

        List<Object> list =this.getQueryDAO().selectObjs(wrapper);
        if(list != null && !list.isEmpty()){
            for(Object o : list){
                if(o != null) {
                    processResult((T) o);
                }
            }
        }
        return list;
    }

    @Override
    public Page<Map<String, Object>> selectMapsPage(Page page, Wrapper<T> wrapper) {
        wrapper = (Wrapper<T>)SqlHelper.fillWrapper(page, wrapper);
        page.setRecords(this.getQueryDAO().selectMapsPage(page, wrapper));
        return page;
    }

    @Override
    public Page<T> selectPage(Page<T> page, Wrapper<T> wrapper) {
        wrapper = (Wrapper<T>)SqlHelper.fillWrapper(page, wrapper);
        page.setRecords(this.getQueryDAO().selectPage(page, wrapper));
        List<T> list = page.getRecords();
        if(list != null && !list.isEmpty()){
            for(T t : list){
                processResult(t);
            }
        }
        return page;
    }


    @Override
    public T processResult(T t){
        return t;
    }

}
