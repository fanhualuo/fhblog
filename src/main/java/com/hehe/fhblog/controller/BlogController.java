package com.hehe.fhblog.controller;

import com.hehe.common.model.Paging;
import com.hehe.common.model.Response;
import com.hehe.common.util.RespHelper;
import com.hehe.fhblog.model.entity.Article;
import com.hehe.fhblog.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Date: 2017/9/17
 * Time: 0:10
 * email: qinghe101@qq.com
 * @author hehe
 */
@RestController
@RequestMapping("/api/blog")
@Slf4j
public class BlogController {

    @Autowired
    private ArticleService articleService;


    /**
     * @desc   按照查询条件分页显示(默认每页20)
     * @param
     * @return
     */
    @GetMapping("")
    public Paging<Article> pagingArticle(@RequestParam(value = "pageNo") Integer pageNo,
                                  @RequestParam(value = "pageSize") Integer pageSize,
                                  Map<String, Object> criteria){

        Paging<Article> paging=RespHelper.or500(articleService.pagingArticle(pageNo, pageSize, criteria));
        return paging;
    }


    /**
     * @desc  按照id查找文章
     * @param
     * @return
     */
    @RequestMapping()
    public Article findById(@RequestParam(value = "id") Long id){
        return RespHelper.or500(articleService.findById(id));
    }

    /**
     * @desc  添加
     * @param
     * @return
     */
    public Boolean addArticle(Article article, Long userId){
        return RespHelper.or500(articleService.addArticle(article, userId));
    }

    /**
     * @desc  按照主键修改
     * @param article
     * @return
     */
    public Boolean updateArticle(Article article,Long userId){
        return RespHelper.or500(articleService.updateArticle(article, userId));
    }

    /**
     * @desc  删除
     * @param
     * @return
     */
    Boolean deleteById(Long id){
        return null;
    }
}
