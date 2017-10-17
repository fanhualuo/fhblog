package com.hehe.fhblog.dao;

import com.hehe.fhblog.model.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Date: 2017/9/17
 * Time: 2:19
 * email: qinghe101@qq.com
 * Author: hehe
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleDaoTest {

    @Autowired
    ArticleDao articleDao;
    @Test
    public void create() throws Exception {
        Article article =new Article();
        article.setUserId(100l);
        article.setTitle("今天天气很好");

        assertTrue(articleDao.create(article));

    }

    @Test
    public void delete() throws Exception {

        assertTrue(articleDao.delete(101l));
    }

    @Test
    public void findById() throws Exception {
    }

}