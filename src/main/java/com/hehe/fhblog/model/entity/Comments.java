package com.hehe.fhblog.model.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 文章评论
 * Date: 2017/9/17
 * Time: 0:35
 * email: qinghe101@qq.com
 * @author xieqinghe
 */
@Data
public class Comments implements Serializable {
    private static final long serialVersionUID = 8132286464469754496L;
    private Long id;
    /**
     * article.id
     */
    private Long articleId;
    /**
     * user.id
     */
    private Long userId;
    /**
     * 评论所在位置
     */
    private Integer blockId;
    /**
     * 评论父id
     */
    private Long pid;
    /**
     * 内容
     */
    private String content;
    /**
     * 1作者，2注册访客，3游客
     */
    private Integer userType;
    /**
     * ip
     */
    private String ip;
    /**
     * 创建时间
     */
    private Date createdAt;
}
