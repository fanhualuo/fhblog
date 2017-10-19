package com.hehe.fhblog.service;

import com.hehe.common.model.Response;
import com.hehe.fhblog.model.entity.Category;

import java.util.List;

/**
 * Date: 2017/9/17
 * Time: 2:51
 * email: qinghe101@qq.com
 * @author hehe
 */
public interface CategoryService {
    /**
     * 查找all分类
     * @param
     * @return Response<List<Category>>
     */
    Response<List<Category>> findAllCategory();

    /**
     * 查找all标签
     * @param
     * @return Response<List<Category>>
     */
    Response<List<Category>> findAllTag();

    /**
     * 按照id查找
     * @param  id
     * @return  Response<Category>
     */
    Response<Category> findById(Long id);


    /**
     *  添加
     * @param category
     * @return
     */
    Response<Boolean> addCategory(Category category);

    /**
     *  按照主键修改
     * @param category
     * @return Response<Boolean>
     */
    Response<Boolean> updateArticle(Category category);

    /**
     *  删除
     * @param id
     * @return Response<Boolean>
     */
    Response<Boolean> deleteById(Long id);
}
