package com.hehe.fhblog.dao;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.hehe.common.model.Paging;
import com.hehe.fhblog.model.entity.Comments;
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
 * Time: 2:35
 * email: qinghe101@qq.com
 * Author: hehe
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentsDaoTest {
    @Autowired
    CommentsDao commentsDao;
    @Test
    public void create() throws Exception {
        Comments comments=new Comments();
        comments.setArticleId(1l);
        comments.setUserId(1l);
        comments.setBlockId(1);
        comments.setContent("新加评论");
        comments.setPid(1l);
        comments.setUserType(1);
        comments.setIp("192.168.0.1");
        assertTrue(commentsDao.create(comments));

    }

    @Test
    public void delete() throws Exception {

        assertTrue(commentsDao.delete(2l));
    }

    @Test
    public void deleteTo() throws Exception {

        assertTrue(commentsDao.deleteTo(4l));
    }

    @Test
    public void deleteTos() throws Exception {
        List<Long> ids= Lists.newArrayList(5l,7l);
        assertTrue(commentsDao.deleteTos(ids)==2);
    }


    @Test
    public void findById() throws Exception {
        System.out.println(commentsDao.findById(1));
        System.out.println(commentsDao.findById(1234242153));
    }

    @Test
    public void paging()throws Exception{

        Map<String,Object> map= Maps.newHashMap();
        map.put("pid",100);
        map.put("articleId",100);
        map.put("blockId",100);
        map.put("userId",100);
        map.put("userType",1);
        Paging<Comments> paging1=commentsDao.paging(0,3,map);
        System.out.println(": "+paging1.getData().toString());
    }

}