package com.zz.bms.core.db.base.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.enums.SqlMethod;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.TableInfo;
import com.baomidou.mybatisplus.core.toolkit.*;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.additional.update.impl.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.additional.update.impl.UpdateChainWrapper;
import com.baomidou.mybatisplus.extension.toolkit.SqlHelper;
import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.BaseService;
import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.util.base.java.GenericsHelper;
import org.apache.ibatis.binding.MapperMethod;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Administrator
 */
public abstract class BaseServiceImpl<T extends BaseEntity<PK> ,  PK extends Serializable>  implements BaseService<T , PK> {



    public Logger logger = Logger.getLogger(this.getClass());


    /**
     * 获取读写用到的DAO实体
     * @return BaseDAO
     */
    public abstract BaseDAO getDAO();

    public BaseServiceImpl() {
    }

    protected static boolean retBool(Integer result) {
        return SqlHelper.retBool(result);
    }

    protected Class<T> currentModelClass() {
        return GenericsHelper.getSuperClassGenricType(this.getClass(), 0);
    }

    protected SqlSession sqlSessionBatch() {
        return SqlHelper.sqlSessionBatch(this.currentModelClass());
    }

    protected String sqlStatement(SqlMethod sqlMethod) {
        return SqlHelper.table(this.currentModelClass()).getSqlStatement(sqlMethod.getMethod());
    }







    @Override
    public void saveAfter(T t){

    }


    @Override
    public boolean save(T entity) {
        boolean result =  retBool(this.getDAO().insert(entity));
        saveAfter(entity);
        return result;
    }

    /**
     * 批量插入
     *
     * @param entityList
     * @param batchSize
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveBatch(Collection<T> entityList, int batchSize) {
        String sqlStatement = sqlStatement(SqlMethod.INSERT_ONE);
        try (SqlSession batchSqlSession = sqlSessionBatch()) {
            int i = 0;
            for (T anEntityList : entityList) {
                batchSqlSession.insert(sqlStatement, anEntityList);
                saveAfter(anEntityList);
                if (i >= 1 && i % batchSize == 0) {
                    batchSqlSession.flushStatements();
                }
                i++;
            }
            batchSqlSession.flushStatements();
        }
        return true;
    }

    /**
     * <p>
     * TableId 注解存在更新记录，否插入一条记录
     * </p>
     *
     * @param entity 实体对象
     * @return boolean
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveOrUpdate(T entity) {
        if (null != entity) {
            Class<?> cls = entity.getClass();
            TableInfo tableInfo = TableInfoHelper.getTableInfo(cls);
            Assert.notNull(tableInfo, "error: can not execute. because can not find cache of TableInfo for entity!");
            String keyProperty = tableInfo.getKeyProperty();
            Assert.notEmpty(keyProperty, "error: can not execute. because can not find column for id from entity!");
            Object idVal = ReflectionKit.getMethodValue(cls, entity, tableInfo.getKeyProperty());
            return StringUtils.checkValNull(idVal) || Objects.isNull(getById((Serializable) idVal)) ? save(entity) : updateById(entity);
        }
        return false;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveOrUpdateBatch(Collection<T> entityList, int batchSize) {
        Assert.notEmpty(entityList, "error: entityList must not be empty");
        Class<?> cls = currentModelClass();
        TableInfo tableInfo = TableInfoHelper.getTableInfo(cls);
        Assert.notNull(tableInfo, "error: can not execute. because can not find cache of TableInfo for entity!");
        String keyProperty = tableInfo.getKeyProperty();
        Assert.notEmpty(keyProperty, "error: can not execute. because can not find column for id from entity!");
        try (SqlSession batchSqlSession = sqlSessionBatch()) {
            int i = 0;
            for (T entity : entityList) {
                Object idVal = ReflectionKit.getMethodValue(cls, entity, keyProperty);
                if (StringUtils.checkValNull(idVal) || Objects.isNull(getById((Serializable) idVal))) {
                    batchSqlSession.insert(sqlStatement(SqlMethod.INSERT_ONE), entity);
                    saveAfter(entity);
                } else {
                    MapperMethod.ParamMap<T> param = new MapperMethod.ParamMap<>();
                    param.put(Constants.ENTITY, entity);
                    batchSqlSession.update(sqlStatement(SqlMethod.UPDATE_BY_ID), param);
                    updateAfter(entity);
                }


                if (i >= 1 && i % batchSize == 0) {
                    batchSqlSession.flushStatements();
                }
                i++;
            }
            batchSqlSession.flushStatements();
        }
        return true;
    }



    @Override
    public boolean removeById(Serializable id) {
        boolean result = SqlHelper.delBool(getDAO().deleteById(id));
        return result;
    }

    @Override
    public boolean removeByMap(Map<String, Object> columnMap) {
        Assert.notEmpty(columnMap, "error: columnMap must not be empty");
        return SqlHelper.delBool(getDAO().deleteByMap(columnMap));
    }

    @Override
    public boolean remove(Wrapper<T> wrapper) {
        return SqlHelper.delBool(getDAO().delete(wrapper));
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return SqlHelper.delBool(getDAO().deleteBatchIds(idList));
    }


    @Override
    public void updateAfter(T t){

    }


    @Override
    public boolean updateById(T entity) {
        boolean result =  retBool(getDAO().updateById(entity));
        this.updateAfter(entity);
        return result;
    }

    @Override
    public boolean update(T entity, Wrapper<T> updateWrapper) {
        return retBool(getDAO().update(entity, updateWrapper));
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateBatchById(Collection<T> entityList, int batchSize) {
        Assert.notEmpty(entityList, "error: entityList must not be empty");
        String sqlStatement = sqlStatement(SqlMethod.UPDATE_BY_ID);
        try (SqlSession batchSqlSession = sqlSessionBatch()) {
            int i = 0;
            for (T anEntityList : entityList) {
                MapperMethod.ParamMap<T> param = new MapperMethod.ParamMap<>();
                param.put(Constants.ENTITY, anEntityList);
                batchSqlSession.update(sqlStatement, param);
                this.updateAfter(anEntityList);
                if (i >= 1 && i % batchSize == 0) {
                    batchSqlSession.flushStatements();
                }
                i++;
            }
            batchSqlSession.flushStatements();
        }
        return true;
    }

    @Override
    public T getById(Serializable id) {
        T result =  (T)getDAO().selectById(id);
        return processResult(result);
    }



    @Override
    public T getById(PK id , boolean lazy){
        if(!lazy){
            return getById(id);
        }else {
            return (T)getDAO().selectById(id);
        }
    }




    @Override
    public Collection<T> listByIds(Collection<? extends Serializable> idList) {
        return listByIds(idList , false);
    }

    @Override
    public List<T> listByIds(Collection<? extends Serializable> idList , boolean lazy) {
        List<T> list =  getDAO().selectBatchIds(idList);
        if(list == null || list.isEmpty()) {
            return list;
        }
        if(!lazy) {
            for (T t : list) {
                specialHandler(processResult(t));
            }
        }else{
            for (T t : list) {
                specialHandler((t));
            }
        }
        return list;
    }



    @Override
    public List<T> listByFkIds(String fkColumnName,Collection<? extends Serializable> fkIdList , boolean lazy){
        List<T> list =  null;
        QueryWrapper<T> qw = new QueryWrapper<T>();
        qw.in(fkColumnName , fkIdList);
        list = getDAO().selectList(qw);
        if(list == null || list.isEmpty()) {
            return list;
        }
        if(!lazy) {
            for (T t : list) {
                specialHandler(processResult(t));
            }
        }else {
            for (T t : list) {
                specialHandler((t));
            }
        }
        return list;

    }


    @Override
    public List<T> listByMap(Map<String, Object> columnMap) {
        List<T> list =   getDAO().selectByMap(columnMap);
        if(list == null || list.isEmpty()) {
            return list;
        }
        for(T t : list){
            specialHandler(processResult(t));
        }
        return list;
    }

    @Override
    public T getOne(Wrapper<T> queryWrapper, boolean throwEx) {
        T result = null;
        if (throwEx) {
            result =  (T)getDAO().selectOne(queryWrapper);
        }else {
            result = SqlHelper.getObject((List<T>) getDAO().selectList(queryWrapper));
        }

        if(result != null){
            return processResult(result);
        }else {
            return null;
        }
    }

    @Override
    public Map<String, Object> getMap(Wrapper<T> queryWrapper) {
        return SqlHelper.getObject((List<Map<String, Object>>)getDAO().selectMaps(queryWrapper));
    }

    @Override
    public int count(Wrapper<T> queryWrapper) {
        return SqlHelper.retCount(getDAO().selectCount(queryWrapper));
    }

    @Override
    public List<T> list(Wrapper<T> queryWrapper) {
        List<T> list =  getDAO().selectList(queryWrapper);

        if(list == null || list.isEmpty()) {
            return list;
        }
        for(T t : list){
            specialHandler(processResult(t));
        }
        return list;
    }

    @Override
    public IPage<T> page(IPage<T> page, Wrapper<T> queryWrapper) {
        IPage<T> iPage =  getDAO().selectPage(page, queryWrapper);
        if(iPage.getRecords() != null && !iPage.getRecords().isEmpty()){
            for(T t : iPage.getRecords()){
                specialHandler(processResult(t));
            }
        }
        return iPage;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<T> queryWrapper) {
        return getDAO().selectMaps(queryWrapper);
    }

    @Override
    public <V> List<V> listObjs(Wrapper<T> queryWrapper, Function<? super Object, V> mapper) {
        return (List<V>)getDAO().selectObjs(queryWrapper).stream().filter(Objects::nonNull).map(mapper).collect(Collectors.toList());
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<T> page, Wrapper<T> queryWrapper) {
        return getDAO().selectMapsPage(page, queryWrapper);
    }



    @Override
    public T selectCheck(T t){
        return (T)this.getDAO().selectCheck(t);
    }

    @Override
    public T processResult(T t){
        return t;
    }

    @Override
    public void specialHandler(T t){

    }

    @Override
    public void deleteByIdAfter(T t){

    }


    @Override
    public void deletesByIdsAfter(Collection<T> ts){

    }

    @Override
    public boolean deleteById(T t) {
        boolean b =  removeById(t.getId());
        deleteByIdAfter(t);
        return b;
    }

    @Override
    public boolean deletesByIds(Collection<T> ts) {
        List<PK> ids = new ArrayList<PK>();
        for(T t : ts){
            ids.add(t.getId());
        }
        boolean b =  removeByIds(ids);
        deletesByIdsAfter(ts);
        return b;
    }



    @Override
    public boolean saveBatch(Collection<T> entityList) {
        return saveBatch(entityList, 1000);
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<T> entityList) {
        return saveOrUpdateBatch(entityList, 1000);
    }



    @Override
    public boolean update(Wrapper<T> updateWrapper) {
        return update(null, updateWrapper);
    }

    @Override
    public boolean updateBatchById(Collection<T> entityList) {
        return updateBatchById(entityList, 1000);
    }


    @Override
    public T getOne(Wrapper<T> queryWrapper) {
        return getOne(queryWrapper, false);
    }


    @Override
    public <V> V getObj(Wrapper<T> queryWrapper, Function<? super Object, V> mapper) {
        return SqlHelper.getObject(listObjs(queryWrapper, mapper));
    }


    @Override
    public int count() {
        return count(Wrappers.emptyWrapper());
    }


    @Override
    public List<T> list() {
        return list(Wrappers.emptyWrapper());
    }


    @Override
    public IPage<T> page(IPage<T> page) {
        return page(page, Wrappers.emptyWrapper());
    }


    @Override
    public List<Map<String, Object>> listMaps() {
        return listMaps(Wrappers.emptyWrapper());
    }

    @Override
    public List<Object> listObjs() {
        return listObjs(Function.identity());
    }

    @Override
    public <V> List<V> listObjs(Function<? super Object, V> mapper) {
        return listObjs(Wrappers.emptyWrapper(), mapper);
    }

    @Override
    public List<Object> listObjs(Wrapper<T> queryWrapper) {
        return listObjs(Function.identity());
    }



    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<T> page) {
        return pageMaps(page, Wrappers.emptyWrapper());
    }

    @Override
    public BaseMapper<T> getBaseMapper() {
        return null;
    }



    /**
     * 链式查询 普通
     *
     * @return QueryWrapper 的包装类
     */
    @Override
    public QueryChainWrapper<T> query() {
        return new QueryChainWrapper<>(getDAO());
    }

    /**
     * 链式查询 lambda 式
     *
     * @return LambdaQueryWrapper 的包装类
     */
    @Override
    public LambdaQueryChainWrapper<T> lambdaQuery() {
        return new LambdaQueryChainWrapper<>(getDAO());
    }

    /**
     * 链式更改 普通
     *
     * @return UpdateWrapper 的包装类
     */
    @Override
    public UpdateChainWrapper<T> update() {
        return new UpdateChainWrapper<>(getDAO());
    }

    /**
     * 链式更改 lambda 式
     *
     * @return LambdaUpdateWrapper 的包装类
     */
    @Override
    public LambdaUpdateChainWrapper<T> lambdaUpdate() {
        return new LambdaUpdateChainWrapper<>(getDAO());
    }
}
