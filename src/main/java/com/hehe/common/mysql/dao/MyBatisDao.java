package com.hehe.common.mysql.dao;

import com.google.common.collect.Maps;
import com.hehe.common.model.Paging;
import com.hehe.common.util.Arguments;
import com.hehe.common.util.JsonMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;
import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * mybatis工具类
 * Date: 2017/8/12
 * Time: 20:28
 * email: qinghe101@qq.com
 * Author: hehe
 */
public abstract class MyBatisDao<T>{
//    @Autowired
//    protected SqlSessionTemplate sqlSession;
//    protected static final String CREATE = "create";
//    protected static final String CREATES = "creates";
//    protected static final String DELETE = "delete";
//    protected static final String DELETES = "deletes";
//    protected static final String UPDATE = "update";
//    protected static final String FIND_BY_ID = "findById";
//    protected static final String FIND_BY_IDS = "findByIds";
//    protected static final String LIST = "list";
//    protected static final String COUNT = "count";
//    protected static final String PAGING = "paging";
//    public final String nameSpace;
//
//    public MyBatisDao() {
//        if (this.getClass().getGenericSuperclass() instanceof ParameterizedType) {
//            this.nameSpace = ((Class)((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]).getSimpleName();
//        } else {
//            this.nameSpace = ((Class)((ParameterizedType)this.getClass().getSuperclass().getGenericSuperclass()).getActualTypeArguments()[0]).getSimpleName();
//        }
//    }
//
//    public Boolean create(T t) {
//        return this.sqlSession.insert(this.sqlId("create"), t) == 1;
//    }
//
//    public Integer creates(List<T> ts) {
//        return this.sqlSession.insert(this.sqlId("creates"), ts);
//    }
//
//    public Integer creates(T t0, T t1, T... tn) {
//        return this.sqlSession.insert(this.sqlId("creates"), Arrays.asList(t0, t1, tn));
//    }
//
//    public Boolean delete(Long id) {
//        return this.sqlSession.delete(this.sqlId("delete"), id) == 1;
//    }
//
//    public Integer deletes(List<Long> ids) {
//        return this.sqlSession.delete(this.sqlId("deletes"), ids);
//    }
//
//    public Integer deletes(Long id0, Long id1, Long... idn) {
//        return this.sqlSession.delete(this.sqlId("deletes"), Arrays.asList(id0, id1, idn));
//    }
//
//    public Boolean update(T t) {
//        return this.sqlSession.update(this.sqlId("update"), t) == 1;
//    }
//
//    public T findById(Integer id) {
//        return this.findById((long)id.intValue());
//    }
//
//    public T findById(Long id) {
//        return this.sqlSession.selectOne(this.sqlId("findById"), id);
//    }
//
//    public List<T> findByIds(List<Long> ids) {
//        return Arguments.isEmpty(ids) ? Collections.emptyList() : this.sqlSession.selectList(this.sqlId("findByIds"), ids);
//    }
//
//    public List<T> findByIds(Long id0, Long id1, Long... idn) {
//        return this.sqlSession.selectList(this.sqlId("findByIds"), Arrays.asList(id0, id1, idn));
//    }
//
//    public List<T> listAll() {
//        return this.sqlSession.selectList(this.sqlId("list"),null);
//    }
//
//    public List<T> list(T t) {
//        return this.sqlSession.selectList(this.sqlId("list"), t);
//    }
//
//    public List<T> list(Map<?, ?> criteria) {
//        return this.sqlSession.selectList(this.sqlId("list"), criteria);
//    }
//
//    public Paging<T> paging(Integer offset, Integer limit) {
//        return this.paging(offset, limit, (Map)(new HashMap()));
//    }
//
//    public Paging<T> paging(Integer offset, Integer limit, T criteria) {
//        Map<String, Object> params = Maps.newHashMap();
//        if (criteria != null) {
//            Map<String, Object> objMap = (Map) JsonMapper.nonDefaultMapper().getMapper().convertValue(criteria, Map.class);
//            params.putAll(objMap);
//        }
//
//        Long total = (Long)this.sqlSession.selectOne(this.sqlId("count"), criteria);
//        if (total.longValue() <= 0L) {
//            return new Paging(0L, Collections.emptyList());
//        } else {
//            params.put("offset", offset);
//            params.put("limit", limit);
//            List<T> datas = this.sqlSession.selectList(this.sqlId("paging"), params);
//            return new Paging(total, datas);
//        }
//    }
//
//    public Paging<T> paging(Integer offset, Integer limit, Map<String, Object> criteria) {
//        if (criteria == null) {
//            criteria = Maps.newHashMap();
//        }
//
//        Long total = (Long)this.sqlSession.selectOne(this.sqlId("count"), criteria);
//        if (total.longValue() <= 0L) {
//            return new Paging(0L, Collections.emptyList());
//        } else {
//            ((Map)criteria).put("offset", offset);
//            ((Map)criteria).put("limit", limit);
//            List<T> datas = this.sqlSession.selectList(this.sqlId("paging"), criteria);
//            return new Paging(total, datas);
//        }
//    }
//
//    public Paging<T> paging(Map<String, Object> criteria) {
//        if (criteria == null) {
//            criteria = Maps.newHashMap();
//        }
//
//        Long total = (Long)this.sqlSession.selectOne(this.sqlId("count"), criteria);
//        if (total.longValue() <= 0L) {
//            return new Paging(0L, Collections.emptyList());
//        } else {
//            List<T> datas = this.sqlSession.selectList(this.sqlId("paging"), criteria);
//            return new Paging(total, datas);
//        }
//    }
//
//    protected String sqlId(String id) {
//        return this.nameSpace + "." + id;
//    }
//
//    protected SqlSessionTemplate getSqlSession() {
//        return this.sqlSession;
//    }
}
