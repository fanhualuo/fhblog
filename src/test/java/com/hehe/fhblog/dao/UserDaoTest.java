package com.hehe.fhblog.dao;

import com.hehe.fhblog.model.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author xieqinghe .
 * @date 2018/1/16 下午5:18
 * @email xieqinghe@terminus.io
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    UserDao userDao;
    @Test
    public void create() {

        User user=new User();
        user.setPassword("123456");
        user.setEmail("qinghe101@qq.com");
        user.setPassword("15854026443");
        user.setUsername("hehe1");
        user.setType(1);

        userDao.create(user);

    }

}