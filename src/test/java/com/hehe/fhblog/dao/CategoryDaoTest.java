package com.hehe.fhblog.dao;

import com.hehe.fhblog.model.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
        category.setStatus(0);
        category.setWeight(100);
        assertTrue(categoryDao.create(category));
    }

}