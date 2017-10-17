package com.hehe.fhblog.model.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 文章实体信息
 * Date: 2017/9/4
 * Time: 上午11:20
 * @author xieqinghe .
 */
@Data
public class Article implements Serializable{
    private static final long serialVersionUID = 5063472222098739835L;
    private Long id;
    private Long userId;
    /**
     * 标题
     */
    private String title;
    /**
     * 描述,概要
     */
    private String desc;

    /**
     * 内容
     */
    private String content;
    /**
     * 封面
     */
    private String coverImg;
    /**
     * 类别id
     */
    private Integer categoryIds;
    /**
     * 标签id,多个用"|"隔开
     */
    private String tagIds;
    /**
     * 文章状态：0草稿，1博文，
     */
    private Integer status;
    /**
     * 置顶1，加精2，正常0
     */
    private Integer isTop;
    /**
     * 点击数
     */
    private int hits;
    /**
     * 创建人
     */
    private Long createdBy;
    /**
     * 修改人
     */
    private Long updatedBy;
    /**
     * 创建时间
     */
    private Date createdAt;
    /**
     * 修改时间
     */
    private Date updatedAt;
}
