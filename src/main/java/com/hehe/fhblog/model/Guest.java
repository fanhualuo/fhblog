package com.hehe.fhblog.model;

import lombok.Data;

/**
 * 访客
 * Date: 2017/9/5
 * Time: 下午3:55
 * Author: xieqinghe .
 */
@Data
public class Guest {
    private Integer id;
    private String email;//通讯邮箱
    private String nickname;//昵称
    private String personalWebsite;//个人网址
    private String a;
    private String accessIp;//访问IP
}
