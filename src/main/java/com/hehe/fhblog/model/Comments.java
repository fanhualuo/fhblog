package com.hehe.fhblog.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 文章评论
 * Date: 2017/9/17
 * Time: 0:35
 * email: qinghe101@qq.com
 * Author: hehe
 */
@Data
public class Comments implements Serializable {
    private static final long serialVersionUID = 8132286464469754496L;
    private Long id; //
    private Long articleId; //article.id
    private Long userId; //user.id
    private Integer blockId; //评论所在位置
    private Long pid; //评论父id
    private String content; //内容
    private Integer userType; //评论类别（1作者，2访客）
    private Date createdAt; //
}
