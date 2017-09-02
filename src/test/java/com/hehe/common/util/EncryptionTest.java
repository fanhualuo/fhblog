package com.hehe.common.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 2017/8/12
 * Time: 23:45
 * email: qinghe101@qq.com
 * Author: hehe
 */
public class EncryptionTest {

    /**
     * 对密码进行加密
     * @return 加密后的密码
     */
    @Test
    public void encrypt() throws Exception {
        System.out.println(Encryption.encrypt("aaa'"));
    }


    /**
     * 密码匹配
     *
     * @return 匹配成功返回true, 反之false
     */
    @Test
    public void match() throws Exception {
        System.out.println(Encryption.encrypt("aaadd'"));

        System.out.println(Encryption.match("aaadd","32e6@3c44cabe74936bf76156"));

    }

}