package com.hehe.fhblog.dao;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.hehe.common.model.Paging;
import com.hehe.fhblog.model.entity.Article;
import com.hehe.fhblog.model.entity.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Date: 2017/9/17
 * Time: 2:27
 * email: qinghe101@qq.com
 * Author: hehe
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryDaoTest {
    @Autowired
    CategoryDao categoryDao;
    @Test
    public void create() throws Exception {
        Category category=new Category();
        category.setDesc("文章分类描述");
        category.setName("分类名称");
        category.setWeight(100);
        category.setType(1);
        assertTrue(categoryDao.create(category));

    }

    @Test
    public void delete() throws Exception {
        assertTrue(categoryDao.delete(103l));
    }

    @Test
    public void deleteTo() throws Exception {
        assertTrue(categoryDao.deleteTo(105l));
    }

    @Test
    public void update() throws Exception {
        Category category=new Category();
        category.setId(100);
        category.setDesc("aaa");
        category.setName("分类名称dd");
        category.setWeight(1000);
        category.setType(2);
        assertTrue(categoryDao.update(category));
    }

    @Test
    public void list() throws Exception {
        List<Category> list=categoryDao.listAll();
        for (Category category:list){
            System.out.println(category);
        }
    }

    @Test
    public void findById() throws Exception {
        System.out.println(categoryDao.findById(100));
        System.out.println(categoryDao.findById(1234242153));
    }

    @Test
    public void paging()throws Exception{

        Paging<Category> list=categoryDao.paging(1,2);
        for (Category category:list.getData()){
            System.out.println(category);
        }
        System.out.println("----------");

        Map<String,Object> map=Maps.newHashMap();
        map.put("type",1);
        list=categoryDao.paging(0,2,map);
        for (Category category:list.getData()){
            System.out.println(category);
        }
        System.out.println("------------");

        map.put("name","分类名称9");
        list=categoryDao.paging(0,2,map);
        for (Category category:list.getData()){
            System.out.println(category);
        }

        System.out.println("--------------");
        map.put("type",2);
        list=categoryDao.paging(0,2,map);
        for (Category category:list.getData()){
            System.out.println(category);
        }


    }

}