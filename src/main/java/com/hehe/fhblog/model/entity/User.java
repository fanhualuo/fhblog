package com.hehe.fhblog.model.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 * Date: 2017/9/4
 * Time: 上午11:48
 * Author: xieqinghe .
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -6216572807605091968L;
    private Long id;
    private String name;     //用户名唯一
    private String phone;      // 手机
    private String email;       // 邮箱
    private String password;      // 32位加密密码
    private Integer type;       // 类型(1,管理员，用户)
    private Integer status;     // 状态(启用1，删除0，停用2，冻结3)

    //个人信息，不必要
    private Integer sex;//性别
    private Integer age;//姓名
    private String desc;//个人简介
    private String hobby;//爱好，
    private String headImg;//头像

    private Long createdBy;    //创建人
    private Long updatedBy;    //修改人
    private Date createdAt;     // 创建时间
    private Date updatedAt;     // 更新时间


}