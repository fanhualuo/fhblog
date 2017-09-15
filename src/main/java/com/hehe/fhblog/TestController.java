package com.hehe.fhblog;

import com.hehe.fhblog.dao.UserTestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Date: 2017/9/1
 * Time: 下午12:05
 * Author: xieqinghe .
 */
@Controller
public class TestController {

    @Value("${mybatis.type-aliases-package}")
    private String name;

    @Autowired
    private UserTestDao userTestDao;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String test1(){

        System.out.println("dao:"+userTestDao);
        return "欢迎访问主页面！"+name+"  "+userTestDao;
    }
}
