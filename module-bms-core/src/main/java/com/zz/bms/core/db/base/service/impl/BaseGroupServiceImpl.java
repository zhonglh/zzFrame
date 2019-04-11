package com.zz.bms.core.db.base.service.impl;

import com.baomidou.mybatisplus.annotation.TableName;
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
import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.db.entity.TableReference;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.util.base.java.GenericsHelper;
import com.zz.bms.util.base.java.ReflectionSuper;
import com.zz.bms.util.configs.annotaions.GroupFieldAnnotation;
import com.zz.bms.util.spring.ReflectionUtil;
import org.apache.ibatis.binding.MapperMethod;
import org.apache.ibatis.javassist.tools.reflect.Reflection;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ReflectionUtils;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Administrator
 */
public abstract class BaseGroupServiceImpl<T extends BaseEntity<PK> ,  PK extends Serializable>  implements BaseService<T , PK> {



    public Logger logger = Logger.getLogger(this.getClass());



    public BaseGroupServiceImpl() {
    }



    /**
     * 获取用到的DAO实体
     * @return BaseDAO
     */
    public abstract BaseService[] getServices() ;


    protected List<T> changeList(Collection list) {
        if (list != null && !list.isEmpty()) {
            try {
                List<T> result = new ArrayList<T>();
                for (Object obj : list) {
                    T t = currentModelClass().newInstance();
                    BeanUtils.copyProperties(obj, t);
                    result.add(t);
                }
                return result;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            return new ArrayList(list);
        }
    }



    protected static boolean retBool(Integer result) {
        return SqlHelper.retBool(result);
    }

    protected Class<T> currentModelClass() {
        return GenericsHelper.getSuperClassGenricType(this.getClass(), 0);
    }

    protected SqlSession sqlSessionBatch() {
        return SqlHelper.sqlSessionBatch(this.currentModelClass().getSuperclass());
    }

    protected String sqlStatement(SqlMethod sqlMethod) {
        return SqlHelper.table(this.currentModelClass().getSuperclass()).getSqlStatement(sqlMethod.getMethod());
    }

    public boolean isGroup(){
        return isGroup(GenericsHelper.getSuperClassGenricType(this.getClass(), 0));
    }


    /**
     * 是否组合表 , 主表+(子表，附表)
     * @param clz
     * @return
     */
    public boolean isGroup(Class clz){

        if(clz.isAnnotationPresent(TableName.class)){
            return false;
        }else {
            return true;
        }
    }


    /**
     * 主表+子表+附表  都要检查是否已经存在
     * @param t
     */
    @Override
    public void isExist(T t) {

        if(t == null) {
            return ;
        }
        this.getServices()[0].isExist(t);


        //组合表情况
        if(isGroup()) {
            long startTime = System.currentTimeMillis();
            Field[] fs = ReflectionSuper.getFields(t);
            long endTime = System.currentTimeMillis();
            System.out.println("getfields times by :"+(endTime - startTime));
            int index = 1;
            for (Field f : fs){
                f.setAccessible(true);
                Object val = ReflectionUtils.getField(f,t);
                if(val != null) {
                    if (val instanceof Collection || val.getClass().isArray()){

                        Collection cs = null;
                        if(val.getClass().isArray()){
                            cs = Arrays.asList(val);
                        }else {
                            cs =  (Collection)val;
                        }

                        for(Object obj : cs) {
                            this.getServices()[index].isExist((BaseEntity<PK>) obj);
                        }
                    }else {
                            this.getServices()[index].isExist((BaseEntity<PK>)val);
                    }
                }
                index++ ;
            }
        }
    }



    @Override
    public void saveAfter(T t){
    }

    @Override
    public boolean save(T entity) {


        if(entity == null) {
            return false;
        }
        boolean result = this.getServices()[0].save(entity);


        if(isGroup()) {
            Field[] fs = ReflectionSuper.getFields(entity);
            int index = 1;
            for (Field f : fs){
                f.setAccessible(true);
                Object val = ReflectionUtils.getField(f,entity);
                if(val != null) {
                    if (val instanceof Collection || val.getClass().isArray()){

                        Collection cs = null;
                        if(val.getClass().isArray()){
                            cs = Arrays.asList(val);
                        }else {
                            cs =  (Collection)val;
                        }

                        this.getServices()[index].saveBatch(cs , Integer.MAX_VALUE);
                    }else {
                        this.getServices()[index].save((BaseEntity<PK>)val);
                    }
                }
                index ++;
            }
        }


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
        if(entityList == null || entityList.isEmpty()){
            return false;
        }

        if(!isGroup()){
            return this.getServices()[0].saveBatch(entityList,batchSize);
        }else {

            for (T entity : entityList) {
                this.save(entity);
            }
            return true;
        }
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
        if(entityList == null || entityList.isEmpty()){
            return false;
        }

        if(!isGroup()){
            return this.getServices()[0].saveOrUpdateBatch(entityList,batchSize);
        }else {
            for (T t : entityList) {
                saveOrUpdate(t);
            }

            return true;
        }
    }

    @Override
    public boolean removeById(Serializable id) {
        T entity = this.getById(id);

        boolean result = this.getServices()[0].deleteById(entity);

        if(isGroup()) {
            Field[] fs = ReflectionSuper.getFields(entity);
            int index = 1;
            for (Field f : fs){
                f.setAccessible(true);
                Object val = ReflectionUtils.getField(f,entity);
                if(val != null) {
                    if (val instanceof Collection || val.getClass().isArray()){

                        Collection cs = null;
                        if(val.getClass().isArray()){
                            cs = Arrays.asList(val);
                        }else {
                            cs =  (Collection)val;
                        }
                        for(Object obj : cs) {
                            this.getServices()[index].deleteById ((BaseEntity<PK>) obj);
                        }
                    }else {
                        this.getServices()[index].deleteById((BaseEntity<PK>)val);
                    }
                }
                index ++ ;
            }
        }

        return result;

    }

    @Override
    public boolean removeByMap(Map<String, Object> columnMap) {

        if(!isGroup()){
            return this.getServices()[0].removeByMap(columnMap);
        }else {
            throw EnumErrorMsg.code_error.toException();
        }
    }

    @Override
    public boolean remove(Wrapper<T> wrapper) {
        if(!isGroup()){
            return this.getServices()[0].remove(wrapper);
        }else {
            throw EnumErrorMsg.code_error.toException();
        }
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {

        if(!isGroup()){
            return this.getServices()[0].removeByIds(idList);
        }else {
            for (Serializable pk : idList) {
                removeById(pk);
            }
            return true;
        }
    }




    @Override
    public void updateAfter(T t){
    }

    /**
     * 先从库里查出对应的主表信息， 附表信息 ， 子表信息
     * 1.先修改主表信息
     * 2.增加或者修改附表信息和一对一的子表信息
     * 3.处理子表信息，比较出要增加的， 修改的和要删除的子表信息， 分别做增加 修改  和 删除子表信息
     * @param entity
     * @return
     */
    @Override
    public boolean updateById(T entity) {


        T oldEntity = this.getById(entity.getId());

        this.getServices()[0].updateById(entity);


        if(isGroup()) {
            Field[] fs = ReflectionSuper.getFields(entity);
            int index = 1;
            for (Field f : fs){
                f.setAccessible(true);
                Object val = ReflectionUtils.getField(f,entity);
                if(val != null) {
                    if (val instanceof Collection || val.getClass().isArray()){
                        //一对多的子表

                        Object oldVal = ReflectionUtils.getField(f,oldEntity);

                        Collection cs = null;
                        Collection oldCs = null;
                        if(val.getClass().isArray()){
                            cs = Arrays.asList(val);
                            if(oldVal != null) {
                                oldCs = Arrays.asList(oldVal);
                            }
                        }else {
                            cs =  (Collection)val;
                            if(oldVal != null ) {
                                oldCs = (Collection) oldVal;
                            }
                        }


                        Collection[] array = EntityUtil.computeAddUpdateDelete(cs , oldCs);
                        if(array != null){
                            if(array[0] != null && !array[0].isEmpty()) {
                                this.getServices()[index].saveBatch(array[0] , array[0].size());
                            }
                            if(array[1] != null && !array[1].isEmpty()) {
                                this.getServices()[index].updateBatchById(array[1] , array[1].size());
                            }
                            if(array[2] != null && !array[2].isEmpty()) {
                                this.getServices()[index].deletesByIds(array[2]);
                            }
                        }

                    }else {
                        //一对一的子表或者附表
                        BaseEntity be = (BaseEntity<PK>)val;
                        if(be.getId() == null || EntityUtil.isEmpty(be.getId())){
                            this.getServices()[index].save(be);
                        }else {
                            this.getServices()[index].updateById(be);
                        }
                    }
                }
                index ++ ;
            }
        }

        return true;
    }

    @Override
    public boolean update(T entity, Wrapper<T> updateWrapper) {

        if(!isGroup()){
            return this.getServices()[0].update(entity , updateWrapper);
        }else {
            throw EnumErrorMsg.code_error.toException();
        }
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateBatchById(Collection<T> entityList, int batchSize) {
        if(entityList == null || entityList.isEmpty()){
            return false;
        }

        if(!isGroup()){
            return this.getServices()[0].updateBatchById(entityList , batchSize);
        }else {
            for (T entity : entityList) {
                updateById(entity);
            }
            return true;
        }
    }

    @Override
    public T getById(Serializable id) {
        return getById((PK)id , false);
    }



    @Override
    public T getById(PK id , boolean lazy){
        Object entity = this.getServices()[0].getById(id , lazy);
        if(entity == null){
            return null;
        }

        if(isGroup()) {
            try {
                T t = currentModelClass().newInstance();
                BeanUtils.copyProperties(entity , t);

                TableName tableNameAnno = entity.getClass().getAnnotation(TableName.class);
                if(tableNameAnno == null){
                    throw EnumErrorMsg.code_error.toException();
                }
                String parentTableName = tableNameAnno.value();




                Field[] fs = ReflectionSuper.getFields(t);
                int index = 1;
                for (Field f : fs){

                    GroupFieldAnnotation gfa = f.getAnnotation(GroupFieldAnnotation.class);
                    if(gfa == null || StringUtils.isEmpty(gfa.childTableColumnName())){
                        throw EnumErrorMsg.code_error.toException();
                    }

                    if (f.getType().isArray() || Collection.class.isAssignableFrom(f.getType()) ){
                        //一对多的子表

                        Class realClass = null;
                        if(f.getType().isArray()){
                            realClass = f.getType().getClass().getComponentType();
                        }else {
                            realClass = GenericsHelper.getFieldGenericType(f);
                        }

                        TableName childTableAnno = (TableName)realClass.getAnnotation(TableName.class);
                        if(childTableAnno == null){
                            throw EnumErrorMsg.code_error.toException();
                        }
                        String childTableName = childTableAnno.value();
                        String childTableColumnName = gfa.childTableColumnName();

                        QueryWrapper qw = new QueryWrapper();
                        qw.setEntity(realClass.newInstance());
                        qw.eq(childTableColumnName , id);
                        List list = this.getServices()[index].list(qw);

                        f.setAccessible(true);
                        if(f.getType().isArray()) {
                            f.set(t, list.toArray());
                        }else {
                            f.set(t, list);
                        }


                    }else {
                        //一对一的子表或者附表
                        TableName childTableAnno = f.getType().getAnnotation(TableName.class);
                        if(childTableAnno == null){
                            throw EnumErrorMsg.code_error.toException();
                        }
                        String childTableName = childTableAnno.value();
                        String childTableColumnName = gfa.childTableColumnName();

                        QueryWrapper qw = new QueryWrapper();
                        qw.setEntity(f.getType().newInstance());
                        qw.eq(childTableColumnName , id);
                        List list = this.getServices()[index].list(qw);
                        if(list != null && !list.isEmpty()){
                            f.setAccessible(true);
                            f.set(t , list.get(0));
                        }
                    }

                    index ++ ;
                }

                return t;

            }catch(Exception e){
                throw new RuntimeException(e);
            }

        }else {
            return (T)entity;
        }


    }




    @Override
    public Collection<T> listByIds(Collection<? extends Serializable> idList) {

        if(!isGroup()){
            return this.getServices()[0].listByIds(idList);
        }else {
            return listByIds(idList, false);
        }
    }

    @Override
    public List<T> listByIds(Collection<? extends Serializable> idList , boolean lazy) {


        if(idList == null || idList.isEmpty()){
            return null;
        }

        if(!isGroup()){
            return this.getServices()[0].listByIds(idList , lazy);
        }else {
            List<T> list = new ArrayList<T>();
            for (Serializable id : idList) {
                T t = getById(id);
                list.add(t);
            }
            return list;
        }
    }



    @Override
    public List<T> listByFkIds(String fkColumnName,Collection<? extends Serializable> fkIdList , boolean lazy){

        if(fkIdList == null || fkIdList.isEmpty() || StringUtils.isEmpty(fkColumnName)){
            return null;
        }

        if(!isGroup()){
            return this.getServices()[0].listByFkIds(fkColumnName , fkIdList , lazy);
        }else {

            List list = this.getServices()[0].listByFkIds(fkColumnName , fkIdList , lazy);

            return changeList(list);

        }

    }


    @Override
    public List<T> listByMap(Map<String, Object> columnMap) {

        if(columnMap == null || columnMap.isEmpty() ){
            return null;
        }

        if(!isGroup()){
            return (List<T> )this.getServices()[0].listByMap(columnMap);
        }else {

            Collection list = this.getServices()[0].listByMap(columnMap);

            return changeList(list);

        }
    }


    @Override
    public T getOne(Wrapper<T> queryWrapper, boolean throwEx) {


        if(!isGroup()){
            return (T)this.getServices()[0].getOne(queryWrapper , throwEx);
        }else {

            T t = (T)this.getServices()[0].getOne(queryWrapper , throwEx);
            return this.getById(t.getId());
        }


    }

    @Override
    public Map<String, Object> getMap(Wrapper<T> queryWrapper) {
        if(!isGroup()){
            return this.getServices()[0].getMap(queryWrapper);
        }else {
            Map<String , Object> map = this.getServices()[0].getMap(queryWrapper);
            return map;
        }
    }

    @Override
    public int count(Wrapper<T> queryWrapper) {
        return this.getServices()[0].count(queryWrapper);
    }

    @Override
    public List<T> list(Wrapper<T> queryWrapper) {

        if(!isGroup()){
            return (List<T>)this.getServices()[0].list(queryWrapper );
        }else {
            List list = this.getServices()[0].list(queryWrapper );
            return changeList(list);
        }

    }

    @Override
    public IPage<T> page(IPage<T> page, Wrapper<T> queryWrapper) {

        if(!isGroup()){
            return (IPage<T>)this.getServices()[0].page(page,queryWrapper );
        }else {

            IPage pages = (IPage)this.getServices()[0].page(page,queryWrapper );

            List list = pages.getRecords();
            pages.setRecords( changeList(list) );

            return pages;
        }

    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<T> queryWrapper) {

        if(!isGroup()){
            return this.getServices()[0].listMaps(queryWrapper );
        }else {
            return this.getServices()[0].list(queryWrapper );
        }
    }

    @Override
    public <V> List<V> listObjs(Wrapper<T> queryWrapper, Function<? super Object, V> mapper) {
        throw EnumErrorMsg.code_error.toException();
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<T> page, Wrapper<T> queryWrapper) {

        if(!isGroup()){
            return this.getServices()[0].pageMaps(page,queryWrapper );
        }else {
            return this.getServices()[0].pageMaps(page,queryWrapper );
        }
    }



    @Override
    public T selectCheck(T t){

        if(!isGroup()){
            return (T)this.getServices()[0].selectCheck( t );
        }else {
            throw EnumErrorMsg.code_error.toException();
        }
    }

    @Override
    public T processResult(T t){
        return t;
    }



    @Override
    public List<T> processResult(List<T> ts) {
        return ts;
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
        return removeById(t.getId());
    }

    @Override
    public boolean deletesByIds(Collection<T> ts) {
        List<PK> ids = new ArrayList<PK>();
        for(T t : ts){
            ids.add(t.getId());
        }
        return removeByIds(ids);
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
        if(!isGroup()){
            return this.getServices()[0].query( );
        }else {
            throw EnumErrorMsg.code_error.toException();
        }
    }

    /**
     * 链式查询 lambda 式
     *
     * @return LambdaQueryWrapper 的包装类
     */
    @Override
    public LambdaQueryChainWrapper<T> lambdaQuery() {

        if(!isGroup()){
            return this.getServices()[0].lambdaQuery( );
        }else {
            throw EnumErrorMsg.code_error.toException();
        }
    }

    /**
     * 链式更改 普通
     *
     * @return UpdateWrapper 的包装类
     */
    @Override
    public UpdateChainWrapper<T> update() {



        if(!isGroup()){
            return this.getServices()[0].update( );
        }else {
            throw EnumErrorMsg.code_error.toException();
        }
    }

    /**
     * 链式更改 lambda 式
     *
     * @return LambdaUpdateWrapper 的包装类
     */
    @Override
    public LambdaUpdateChainWrapper<T> lambdaUpdate() {


        if(!isGroup()){
            return this.getServices()[0].lambdaUpdate( );
        }else {
            throw EnumErrorMsg.code_error.toException();
        }

    }
}
