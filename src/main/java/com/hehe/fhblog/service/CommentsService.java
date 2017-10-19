package com.hehe.fhblog.service;

import com.hehe.common.model.Paging;
import com.hehe.common.model.Response;
import com.hehe.fhblog.model.entity.Comments;

import java.util.List;

/**
 * Date: 2017/9/17
 * Time: 2:51
 * email: qinghe101@qq.com
 * @author hehe
 */
public interface CommentsService {
    /**
     *  分页查找文章评论(主评论)
     * @param pageNo
     * @param pageSize
     * @param articleId
     * @return Response<List<Category>>
     */
    Response<Paging<Comments>> findAllCategory(Integer pageNo, Integer pageSize,Long articleId);

//    /**
//     *  分页查找文章评论(子评论)
//     * @param pageNo
//     * @param pageSize
//     * @param articleId
//     * @param
//     * @return Response<List<Category>>
//     */
//    Response<Paging<Comments>> findAllCategory(Integer pageNo, Integer pageSize,Long articleId);

    /**
     *  添加
     * @param comments
     * @return
     */
    Response<Boolean> addComments(Comments comments);

    /**
     *  删除评论，其子评论一块删除。
     * @param id
     * @return Response<Boolean>
     */
    Response<Boolean> deleteById(Long id);
}
