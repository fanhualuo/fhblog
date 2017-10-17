package com.hehe.fhblog.model.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 分类
 * Date: 2017/9/4
 * Time: 下午12:02
 * @author xieqinghe .
 */
@Data
public class Category implements Serializable {

    private static final long serialVersionUID = 8888785780880511046L;
    private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 说明
     */
    private String desc;

    /**
     * 类型(1分类,2标签)
     */
    private Integer type;
    /**
     * 权重（从大到小）
     */
    private Integer weight;
    /**
     * 状态，0正常,1删除
     */
    private Integer status;
}
