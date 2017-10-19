package com.hehe.fhblog.dao;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.hehe.common.model.Paging;
import com.hehe.fhblog.model.entity.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;
import java.util.Map;

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
        article.setCategoryId(1);
        article.setCoverImg("/tmp/i.jpg");
        article.setContent("正文");
        article.setDesc("概要");
        article.setTagIds("1,2,55");
        article.setCreatedBy(1l);
        article.setCreatedAt(new Date());
        article.setStatus(1);
        article.setIsTop(0);
        assertTrue(articleDao.create(article));
    }

    @Test
    public void update() throws Exception {
        Article article =new Article();
        article.setId(100l);
        article.setUserId(10023l);
        article.setTitle("fds");
        article.setCategoryId(2);
        article.setCoverImg("/tmp/aaa.jpg");
        article.setContent("正333文");
        article.setDesc("概要22");
        article.setTagIds("1,2");
        article.setUpdatedBy(1111l);
        article.setCreatedAt(new Date());
        article.setStatus(0);
        article.setIsTop(2);
        assertTrue(articleDao.update(article));
    }

    @Test
    public void delete() throws Exception {

        assertTrue(articleDao.delete(102l));
    }

    @Test
    public void list() throws Exception {

        System.out.println("list:"+articleDao.list(new Article()).size());
    }

    @Test
    public void deleteTo() throws Exception {

        assertTrue(articleDao.deleteTo(101l));
    }

    @Test
    public void findById() throws Exception {
        System.out.println(articleDao.findById(100));
        System.out.println(articleDao.findById(1234242153));
    }

    @Test
    public void paging()throws Exception{

        Map<String,Object> map= Maps.newHashMap();

        Paging<Article> paging1=articleDao.paging(0,3,map);
        System.out.println("1: "+paging1.getData().size());


        map.put("userId",1003);
        Paging<Article> paging2=articleDao.paging(0,3,map);
        System.out.println("2: "+paging2.getData().size());

        map.put("userId",3124332);
        Paging<Article> paging3=articleDao.paging(0,3,map);
        System.out.println("3: "+paging3.getData().size());


    }

}