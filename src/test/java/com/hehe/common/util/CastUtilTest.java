package com.hehe.common.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 2017/8/12
 * Time: 23:30
 * email: qinghe101@qq.com
 * Author: hehe
 */
public class CastUtilTest {



    @Test
    public void castString() throws Exception {
    }

    @Test
    public void castInt() throws Exception {
        System.out.println( CastUtil.castInt("aaa"));
        System.out.println( CastUtil.castInt("aaa",99));
        System.out.println( CastUtil.castInt("111"));
    }


    @Test
    public void castDouble() throws Exception {
        System.out.println( CastUtil.castDouble("aaa"));
        System.out.println( CastUtil.castDouble("aaa",99.11));
        System.out.println( CastUtil.castDouble("111"));
    }



    @Test
    public void castLong() throws Exception {
        System.out.println( CastUtil.castLong("aaa"));
        System.out.println( CastUtil.castLong("aaa",99l));
        System.out.println( CastUtil.castLong("111"));
    }



}