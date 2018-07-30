package com.zw.mongo;

import com.zw.enums.QueryField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by zha on 2017/8/4.
 */
public abstract class MongodbBaseDao<T> {

    @Autowired
    @Qualifier("mongoTemplate")
    protected MongoTemplate mongoTemplate;

    /**
     * 保存一个对象到mongodb
     * @param bean
     * @return
     */
    public T save(T bean) {
        mongoTemplate.save(bean,this.getCollection());
        return bean;
    }

    /**
     * 根据id删除对象
     * @param t
     */
    public void deleteById(T t) {
        mongoTemplate.remove(t, this.getCollection());
    }

    /**
     * 根据对象的属性删除
     * @param t
     */
    public void deleteByCondition(T t) {
        Query query = buildBaseQuery(t);
        mongoTemplate.remove(query, getEntityClass(), this.getCollection());
    }

    /**
     * 通过条件查询更新数据
     * @param query
     * @param update
     */
    public void update(Query query, Update update) {
        mongoTemplate.updateMulti(query, update, this.getEntityClass(), this.getCollection());
    }

    /**
     * 根据主键进行更新
     * @param keyName
     * @param keyValue
     * @param t (主键为空)
     */
    public void updateByPrimaryKey(String keyName,String keyValue, T t) {
        Query query = new Query();
        query.addCriteria(Criteria.where(keyName).is(keyValue));
        Update update = buildBaseUpdate(t);
        update(query, update);
    }

    /**
     * 通过条件查询实体(集合)
     * @param query
     * @return
     */
    public List<T> find(Query query) {
        return mongoTemplate.find(query, this.getEntityClass(),this.getCollection());
    }

    /**
     * 根据条件查询
     * @param t
     * @return
     */
    public List<T> findByCondition(T t) {
        Query query = buildBaseQuery(t);
        return mongoTemplate.find(query, this.getEntityClass(), this.getCollection());
    }

    /**
     * 通过一定的条件查询一个实体
     * @param query
     * @return
     */
    public T findOne(Query query) {
        return mongoTemplate.findOne(query, this.getEntityClass(),this.getCollection());
    }

    /**
     * 通过主键获取记录
     * @param id
     * @return
     */
    public T getByPrimaryKey(String id) {
        return mongoTemplate.findById(id, this.getEntityClass(),this.getCollection());
    }

    /**
     * 根据条件分页查询
     * @param t
     * @param pageIndex
     * @param pageSize
     * @param orders
     * @return
     */
    public List<T> findPageByCondition(T t,Integer pageIndex,Integer pageSize,List<Sort.Order> orders) {
        Query query = buildBaseQuery(t);
        Sort sort = null;
        if (orders != null && orders.size() > 0) {
            sort = new Sort(orders);
        }
        if (sort != null) {
            query = query.with(sort);
        }
        query.skip((pageIndex - 1) * pageSize);
        query.limit(pageSize);
        return mongoTemplate.find(query, this.getEntityClass(), this.getCollection());
    }

    /**
     * 根据条件查询总数
     * @param t
     * @return
     */
    public long countByCondition(T t) {
        Query query = buildBaseQuery(t);
        return mongoTemplate.count(query, this.getEntityClass(), this.getCollection());
    }






    /**
     * 根据vo构建查询条件Query
     * @param t
     * @return
     */
    private Query buildBaseQuery(T t) {
        Query query = new Query();

        Field[] fields = t.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Object value = field.get(t);
                if (value != null) {
                    QueryField queryField = field.getAnnotation(QueryField.class);
                    if (queryField != null) {
                        query.addCriteria(queryField.type().buildCriteria(queryField, field, value));
                    }
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return query;
    }

    /**
     * 根据vo构建Update
     * @param t
     * @return
     */
    private Update buildBaseUpdate(T t) {
        Update update = new Update();

        Field[] fields = t.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Object value = field.get(t);
                if (value != null) {
                    update.set(field.getName(), value);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return update;
    }

    /**
     * 获得mongoTemplate
     * @return
     */
    public MongoTemplate getMongoTemplate() {
        return mongoTemplate;
    }


    /**
     * 获取需要操作的实体类class
     * @return
     */
    @SuppressWarnings("unchecked")
    protected Class<T> getEntityClass() {
        return ((Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
    }

    /**
     * 获取保存的Collection
     * 指定保存的集合
     * @return
     */
    protected abstract String getCollection();

}
