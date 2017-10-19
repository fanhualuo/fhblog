package com.hehe.fhblog.service.manager;

import com.hehe.fhblog.dao.ArticleDao;
import com.hehe.fhblog.dao.CommentsDao;
import com.hehe.fhblog.model.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *  事物处理
 * @author xieqinghe .
 * @date 2017/10/19 上午11:09
 * @email xieqinghe@terminus.io
 */
@Component
public class ServiceManager {


    @Autowired
    private ArticleDao articleDao;

    @Autowired
    private CommentsDao commentsDao;

    /**
     *   删除文章（同时删除评论）
     * @param
     * @return
     */
    public void deleteArticleAndComments(Long id){
        Boolean result=articleDao.delete(id);
        if (result){
            commentsDao.deleteByArticleId(id);
        }
    }


}
