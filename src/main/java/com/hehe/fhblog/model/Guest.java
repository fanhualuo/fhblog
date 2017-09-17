package com.hehe.fhblog.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 访客
 * Date: 2017/9/5
 * Time: 下午3:55
 * Author: xieqinghe .
 */
@Data
public class Guest implements Serializable {
    private static final long serialVersionUID = -4011672288362812631L;
    private Integer id;
    private String email;//通讯邮箱
    private String nickname;//昵称
    private String content;//留言内容
    private String accessIp;//访问IP
}
