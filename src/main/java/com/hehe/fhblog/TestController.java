package com.hehe.fhblog;

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

    @Value("${name}")
    private String name;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String test1(){

        return "欢迎访问主页面！"+name;
    }
}
