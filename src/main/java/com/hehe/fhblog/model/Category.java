package com.hehe.fhblog.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 分类
 * Date: 2017/9/4
 * Time: 下午12:02
 * Author: xieqinghe .
 */
@Data
public class Category implements Serializable {

    private static final long serialVersionUID = 8888785780880511046L;
    private Integer id;
    private String name;//名称
    private String desc;//说明
    private Integer weight;//权重（从大到小）
    private Integer status;//状态
}
