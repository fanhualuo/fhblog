package com.hehe.fhblog.dao;

import com.hehe.fhblog.model.entity.Comments;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
        comments.setArticleId(100l);
        comments.setUserId(100l);
        comments.setBlockId(1);
        comments.setContent("新加评论");
        comments.setPid(1l);
        comments.setUserType(1);
        assertTrue(commentsDao.create(comments));
    }

}