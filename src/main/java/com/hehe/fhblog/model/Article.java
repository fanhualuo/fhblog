package com.hehe.fhblog.model;

import lombok.Data;

import java.util.Date;

/**
 * 文章实体信息
 * Date: 2017/9/4
 * Time: 上午11:20
 * Author: xieqinghe .
 */
@Data
public class Article {
    private Long id;
    private Long userId;
    private String title;//标题
    private String description;//描述,概要
    private String content;//内容
    private String coverImg;//封面
    private Integer categoryIds;//类别id
    private String tagIds;//标签id,多个用"|"隔开
    private Integer status;//文章状态：0草稿，1博文，
    private Integer isTop;//置顶1，加精2，正常0
    private int hits;//点击数
    private Boolean isDel;//是否删除
    private Long createdBy;    //创建人
    private Long updatedBy;    //修改人
    private Date createdAt;    //创建时间
    private Date updatedAt;    //更新时间
}
