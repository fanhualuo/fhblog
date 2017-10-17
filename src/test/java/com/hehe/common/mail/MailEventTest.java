package com.hehe.common.mail;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Date: 2017/9/2
 * Time: 15:12
 * email: qinghe101@qq.com
 * Author: hehe
 */
//// SpringJUnit支持，由此引入Spring-Test框架支持！
@RunWith(SpringJUnit4ClassRunner.class)

//加载springBoot容器，指定我们SpringBoot工程的Application启动类
@SpringBootTest()

//Web项目，Junit需要模拟ServletContext
@WebAppConfiguration
public class MailEventTest {

}