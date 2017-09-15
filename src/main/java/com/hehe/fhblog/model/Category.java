package com.hehe.fhblog.model;

import lombok.Data;

/**
 * 分类
 * Date: 2017/9/4
 * Time: 下午12:02
 * Author: xieqinghe .
 */
@Data
public class Category {

    private Integer id;
    private String name;//名称
    private String description;//说明
    private Integer weight;//权重（从大到小）
    private boolean status;//状态
}
