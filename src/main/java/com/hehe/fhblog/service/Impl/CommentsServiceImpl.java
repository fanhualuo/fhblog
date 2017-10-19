package com.hehe.fhblog.service.Impl;

import com.google.common.base.Throwables;
import com.hehe.common.model.Paging;
import com.hehe.common.model.Response;
import com.hehe.fhblog.model.entity.Comments;
import com.hehe.fhblog.service.CommentsService;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author xieqinghe .
 * @date 2017/10/18 下午6:16
 * @email xieqinghe@terminus.io
 */
public class CommentsServiceImpl implements CommentsService {
    @Override
    public Response<Paging<Comments>> findAllCategory(Integer pageNo, Integer pageSize, Long articleId) {
        return null;
    }

    @Override
    public Response<Boolean> addComments(Comments comments) {
        return null;
    }

    @Override
    public Response<Boolean> deleteById(Long id) {
        return null;
    }

}
