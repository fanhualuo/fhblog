package com.hehe.fhblog.service;

import com.hehe.common.model.Paging;
import com.hehe.common.model.Response;
import com.hehe.fhblog.model.entity.Article;

import java.util.Map;

/**
 * Date: 2017/9/17
 * Time: 2:50
 * email: qinghe101@qq.com
 * @author hehe
 */
public interface ArticleService {

    /**
     * @desc   按照查询条件分页显示
     *  按照userId查找
     * @param
     * @return
     */
    Response<Paging<Article>> pagingArticle(Integer pageNo, Integer pageSize, Map<String, Object> criteria);


    /**
     * @desc  按照id查找
     * @param
     * @return
     */
    Response<Article> findById(Long id);


    /**
     * @desc  添加
     * @param
     * @return
     */
    Response<Boolean> addArticle(Article article,Long userId);

    /**
     * @desc  按照主键修改
     * @param article
     * @return
     */
    Response<Boolean> updateArticle(Article article,Long userId);

    /**
     * @desc  删除
     * @param
     * @return
     */
    Response<Boolean> deleteById(Long id);

}
