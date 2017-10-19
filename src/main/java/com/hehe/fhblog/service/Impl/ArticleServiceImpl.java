package com.hehe.fhblog.service.Impl;

import com.google.common.base.Throwables;
import com.hehe.common.model.PageInfo;
import com.hehe.common.model.Paging;
import com.hehe.common.model.Response;
import com.hehe.common.util.Arguments;
import com.hehe.common.util.ServiceException;
import com.hehe.fhblog.dao.ArticleDao;
import com.hehe.fhblog.model.entity.Article;
import com.hehe.fhblog.service.ArticleService;
import com.hehe.fhblog.service.manager.ServiceManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.hehe.common.util.Params.filterNullOrEmpty;

/**
 * @author xieqinghe .
 * @date 2017/10/17 下午3:34
 * @email xieqinghe@terminus.io
 */

@Service
@Slf4j
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Autowired
    private ServiceManager serviceManager;

    //按照条件分页查找
    @Override
    public Response<Paging<Article>> pagingArticle(Integer pageNo, Integer pageSize, Map<String, Object> criteria) {

        Response<Paging<Article>> resp=new Response<>();
        try {
            PageInfo pageInfo=new PageInfo(pageNo,pageSize);

            //过滤Map中的NULL或""值
            Map<String,Object> params=filterNullOrEmpty(criteria);

            Paging<Article> paging=articleDao.paging(pageInfo.getOffset(),pageInfo.getLimit(),params);

            if (paging.isEmpty()) {
                resp.setResult(Paging.empty());
                return resp;
            }
            resp.setResult(new Paging<>(paging.getTotal(), paging.getData()));

        }catch (Exception e){
            log.error("find.article.list.fail, pageNo:({}),pageSize:({}),criteria:({})",
                    pageNo, pageSize,criteria, Throwables.getStackTraceAsString(e));
            //查询错误
            resp.setError("find.article.fail");
            return resp;
        }
        return resp;
    }

    @Override
    public Response<Article> findById(Long id) {
        Response<Article> resp=new Response<>();
        try {
            checkNotNull( id, "article.id.not.null");

            Article article=articleDao.findById(id);

            if(Arguments.isNull(article)){
                throw new ServiceException("find.article.is.null");
            }
            resp.setResult(article);

        }catch (NullPointerException e){
            log.error("find.article.fail, id:({})",
                    id, Throwables.getStackTraceAsString(e));
            resp.setError(e.getMessage());
            return resp;
        }
        catch (Exception e){
            log.error("find.article.fail, id:({})",
                    id, Throwables.getStackTraceAsString(e));
            resp.setError("find.article.fail");
            return resp;
        }
        return resp;
    }

    @Override
    public Response<Boolean> addArticle(Article article,Long userId) {
        Response<Boolean> resp=new Response<>();
        try {
            checkNotNull( article.getId(), "article.id.not.null");
            checkNotNull(article.getTitle(),"article.title.not.null");
            checkNotNull(userId,"article.userId.not.null");

            article.setCreatedBy(userId);
            //tag_ids拆分
            articleDao.create(article);
            resp.setResult(true);

        }catch (NullPointerException e){
            log.error("save.article.fail, article:({})",article, Throwables.getStackTraceAsString(e));
            resp.setError(e.getMessage());
            return resp;
        }
        catch (Exception e){
            log.error("save.article.fail, article:({})",article, Throwables.getStackTraceAsString(e));
            resp.setError("save.article.fail");
            return resp;
        }
        return resp;
    }

    @Override
    public Response<Boolean> updateArticle(Article article,Long userId) {
        Response<Boolean> resp=new Response<>();
        try {
            checkNotNull( article.getId(), "article.id.not.null");
            articleDao.update(article);
            resp.setResult(true);

        }catch (NullPointerException e){
            log.error("update.article.fail, article:({})",article, Throwables.getStackTraceAsString(e));
            resp.setError(e.getMessage());
            return resp;
        }
        catch (Exception e){
            log.error("update.article.fail, article:({})",article, Throwables.getStackTraceAsString(e));
            resp.setError("update.article.fail");
            return resp;
        }
        return resp;
    }

    @Override
    public Response<Boolean> deleteById(Long id) {
        Response<Boolean> resp=new Response<>();
        try {
            checkNotNull( id, "article.id.not.null");
            //删除文章,删除文章的评论
            serviceManager.deleteArticleAndComments(id);
            resp.setResult(true);
        }catch (NullPointerException e){
            log.error("update.article.fail, id:({})",id, Throwables.getStackTraceAsString(e));
            resp.setError(e.getMessage());
            return resp;
        }
        catch (Exception e){
            log.error("update.article.fail, id:({})",id, Throwables.getStackTraceAsString(e));
            resp.setError("update.article.fail");
            return resp;
        }
        return resp;
    }
}
