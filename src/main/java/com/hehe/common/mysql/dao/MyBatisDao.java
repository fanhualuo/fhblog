package com.hehe.common.mysql.dao;

import com.google.common.collect.Maps;
import com.hehe.common.model.Paging;
import com.hehe.common.util.Arguments;
import com.hehe.common.util.JsonMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;
import java.io.Serializable;
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
public class MyBatisDao<T> {

    @Autowired
    protected SqlSessionTemplate sqlSession;
    protected static final String CREATE = "create";
    protected static final String CREATES = "creates";
    protected static final String DELETE = "delete";
    protected static final String DELETES = "deletes";
    protected static final String UPDATE = "update";
    protected static final String FIND_BY_ID = "findById";
    protected static final String FIND_BY_IDS = "findByIds";
    protected static final String LIST = "list";
    protected static final String COUNT = "count";
    protected static final String PAGING = "paging";
    public final String nameSpace;

    public MyBatisDao() {
        if(this.getClass().getGenericSuperclass() instanceof ParameterizedType) {
            this.nameSpace = ((Class)((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]).getSimpleName();
        } else {
            this.nameSpace = ((Class)((ParameterizedType)this.getClass().getSuperclass().getGenericSuperclass()).getActualTypeArguments()[0]).getSimpleName();
        }

    }

    public Boolean create(T t) {
        return Boolean.valueOf(this.sqlSession.insert(this.sqlId("create"), t) == 1);
    }

    public Integer creates(List<T> ts) {
        return Integer.valueOf(this.sqlSession.insert(this.sqlId("creates"), ts));
    }

    public Integer creates(T t0, T t1, T... tn) {
        return Integer.valueOf(this.sqlSession.insert(this.sqlId("creates"), Arrays.asList(new Object[]{t0, t1, tn})));
    }

    public Boolean delete(Long id) {
        return Boolean.valueOf(this.sqlSession.delete(this.sqlId("delete"), id) == 1);
    }

    public Integer deletes(List<Long> ids) {
        return Integer.valueOf(this.sqlSession.delete(this.sqlId("deletes"), ids));
    }

    public Integer deletes(Long id0, Long id1, Long... idn) {
        return Integer.valueOf(this.sqlSession.delete(this.sqlId("deletes"), Arrays.asList(new Serializable[]{id0, id1, idn})));
    }

    public Boolean update(T t) {
        return Boolean.valueOf(this.sqlSession.update(this.sqlId("update"), t) == 1);
    }

    public T findById(Integer id) {
        return this.findById(Long.valueOf((long)id.intValue()));
    }

    public T findById(Long id) {
        return this.sqlSession.selectOne(this.sqlId("findById"), id);
    }



    public List<T> findByIds(Long id0, Long id1, Long... idn) {
        return this.sqlSession.selectList(this.sqlId("findByIds"), Arrays.asList(new Serializable[]{id0, id1, idn}));
    }

    public List<T> listAll() {
        return this.list((T)null);
    }

    public List<T> list(T t) {
        return this.sqlSession.selectList(this.sqlId("list"), t);
    }

    public List<T> list(Map<?, ?> criteria) {
        return this.sqlSession.selectList(this.sqlId("list"), criteria);
    }

    protected String sqlId(String id) {
        return this.nameSpace + "." + id;
    }

    protected SqlSessionTemplate getSqlSession() {
        return this.sqlSession;
    }
}
