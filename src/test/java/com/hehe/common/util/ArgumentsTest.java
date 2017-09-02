package com.hehe.common.util;

import com.google.common.base.Optional;
import lombok.Data;
import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * 测试类
 * Date: 2017/8/12
 * Time: 22:45
 * email: qinghe101@qq.com
 * Author: hehe
 */
public class ArgumentsTest {

    List<User> list1;
    List<User> list2=null;
    List<User> list3;
    User user1;
    User user2=null;
    User user3;

    public ArgumentsTest(){
        list1= com.google.common.collect.Lists.newArrayList();

        list3= com.google.common.collect.Lists.newArrayList();

        user1=new User();
        user1.setId(1);
        user1.setName("谢庆贺");
        user1.setPassword("密码");

        list3.add(user1);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println("------------------------");


    }


    @Test  //success
    public void isNullOrEmpty() throws Exception {


        System.out.println(Arguments.isNullOrEmpty(list1));
        System.out.println(Arguments.isNullOrEmpty(list2));
        System.out.println(Arguments.isNullOrEmpty(list3));
    }

    @Test //success
    public void isNull() throws Exception {

        System.out.println(Arguments.isNull(list1));
        System.out.println(Arguments.isNull(list2));
        System.out.println(Arguments.isNull(list3));
        System.out.println(Arguments.isNull(user1));
        System.out.println(Arguments.isNull(user2));
        System.out.println(Arguments.isNull(user3));
    }

    @Test //success
    public void notNull() throws Exception {
        System.out.println(Arguments.notNull(list1));
        System.out.println(Arguments.notNull(list2));
        System.out.println(Arguments.notNull(list3));
        System.out.println(Arguments.notNull(user1));
        System.out.println(Arguments.notNull(user2));
        System.out.println(Arguments.notNull(user3));
    }

    @Test//不能传入null  success
    public void isEmpty() throws Exception {
        System.out.println(Arguments.isEmpty(list1));
        System.out.println(Arguments.isEmpty(list2));
        System.out.println(Arguments.isEmpty(list3));
    }

    @Test  //success
    public void isEmpty1() throws Exception {
        System.out.println(Arguments.isEmpty("aaa"));
        String a="";
        String b=null;
        System.out.println(Arguments.isEmpty(a));
        System.out.println(Arguments.isEmpty(b));
    }

    @Test
    public void notEmpty() throws Exception {
        System.out.println(Arguments.notEmpty(list1));
        System.out.println(Arguments.notEmpty(list2));
        System.out.println(Arguments.notEmpty(list3));
    }

    @Test
    public void notEmpty1() throws Exception {
        System.out.println(Arguments.notEmpty("aaa"));
        String a="";
        String b=null;
        System.out.println(Arguments.notEmpty(a));
        System.out.println(Arguments.notEmpty(b));
    }

    @Test
    public void positive() throws Exception {
    }

    @Test
    public void isPositive() throws Exception {
    }

    @Test
    public void negative() throws Exception {
    }

    @Test
    public void isNegative() throws Exception {
    }

    @Test
    public void equalWith() throws Exception {
    }

    @Test
    public void not() throws Exception {
    }

    @Test
    public void isDecimal() throws Exception {
    }

    @Test
    public void isNumberic() throws Exception {
    }




}

@Data
class User{
    Integer id;
    String name;
    String password;

    public static User getuser(){

        User user=new User();
        return user;
    }
}