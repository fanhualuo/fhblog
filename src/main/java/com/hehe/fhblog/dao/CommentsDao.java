package com.hehe.fhblog.dao;

import com.hehe.common.mysql.dao.MyBatisDao;
import com.hehe.fhblog.model.entity.Comments;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Date: 2017/9/17
 * Time: 1:33
 * email: qinghe101@qq.com
 * Author: hehe
 */
@Repository
public class CommentsDao extends MyBatisDao<Comments>{
    /**
     *   按照 article.id删除评论
     * @param
     * @return
     */
    public void deleteByArticleId(Long articleId){
        getSqlSession().update(sqlId("deleteByArticleId"),articleId);
    }
}
