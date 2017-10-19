package com.hehe.fhblog.service.Impl;

import com.google.common.base.Strings;
import com.google.common.base.Throwables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.hehe.common.model.Response;
import com.hehe.common.util.Arguments;
import com.hehe.common.util.ServiceException;
import com.hehe.fhblog.dao.CategoryDao;
import com.hehe.fhblog.model.entity.Category;
import com.hehe.fhblog.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author xieqinghe .
 * @date 2017/10/18 下午5:22
 * @email xieqinghe@terminus.io
 */
@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public Response<List<Category>> findAllCategory() {
        Response<List<Category>> resp=new Response<>();
        try {
            Map<String,Object> criteria= Maps.newHashMap();
            criteria.put("type",1);
            List<Category> categories=categoryDao.list(criteria);
            if (Arguments.isNull(categories)){
                resp.setResult(Lists.newArrayList());
                return resp;
            }
            resp.setResult(categories);
        }catch (Exception e){
            log.error("find.category.list.fail", Throwables.getStackTraceAsString(e));
            resp.setError("find.category.list.fail");
            return resp;
        }
        return resp;
    }

    @Override
    public Response<List<Category>> findAllTag() {
        Response<List<Category>> resp=new Response<>();
        try {
            Map<String,Object> criteria= Maps.newHashMap();
            criteria.put("type",2);
            List<Category> categories=categoryDao.list(criteria);
            if (Arguments.isNull(categories)){
                resp.setResult(Lists.newArrayList());
                return resp;
            }
            resp.setResult(categories);
        }catch (Exception e){
            log.error("find.category.tag.list.fail", Throwables.getStackTraceAsString(e));
            resp.setError("find.category.tag.list.fail");
            return resp;
        }
        return resp;
    }

    @Override
    public Response<Category> findById(Long id) {
        Response<Category> resp=new Response<>();
        try {
            checkNotNull( id, "category.id.not.null");
            Category category=categoryDao.findById(id);
            if (Arguments.isNull(category)){
                resp.setError("find.category.is.null");
                return resp;
            }
            resp.setResult(category);
        }catch (Exception e){
            log.error("find.category.is.fail", Throwables.getStackTraceAsString(e));
            resp.setError("find.category.is.fail");
            return resp;
        }
        return resp;
    }

    @Override
    public Response<Boolean> addCategory(Category category) {
        Response<Boolean> resp=new Response<>();
        try {
            checkNotNull( category.getId(), "category.id.not.null");
            if(Strings.isNullOrEmpty(category.getName())){
                throw new ServiceException("category.name.not.null");
            }
            if (category.getType()==null||Category.Type.from(category.getType())==null){
                throw new ServiceException("category.type.not.legal");
            }
            if (category.getWeight()==null){
                category.setWeight(1000);
            }

            categoryDao.create(category);
            resp.setResult(true);

        }catch (NullPointerException|ServiceException e){
            log.error("save.category.fail, category:({})",category, Throwables.getStackTraceAsString(e));
            resp.setError(e.getMessage());
            return resp;
        }
        catch (Exception e){
            log.error("save.category.fail, category:({})",category, Throwables.getStackTraceAsString(e));
            resp.setError("save.category.fail");
            return resp;
        }
        return resp;
    }

    @Override
    public Response<Boolean> updateArticle(Category category) {
        //修改名称和说明
        Response<Boolean> resp=new Response<>();
        try {
            Category category1=new Category();
            checkNotNull( category.getId(), "category.id.not.null");
            if(!Strings.isNullOrEmpty(category.getName())){
                category1.setName(category.getName());
            }
            if(!Strings.isNullOrEmpty(category.getDesc())){
                category1.setDesc(category.getDesc());
            }
            category1.setId(category.getId());
            categoryDao.update(category);
            resp.setResult(true);

        }catch (NullPointerException|ServiceException e){
            log.error("update.category.fail, category:({})",category, Throwables.getStackTraceAsString(e));
            resp.setError(e.getMessage());
            return resp;
        }
        catch (Exception e){
            log.error("update.category.fail, category:({})",category, Throwables.getStackTraceAsString(e));
            resp.setError("update.category.fail");
            return resp;
        }
        return resp;
    }

    @Override
    public Response<Boolean> deleteById(Long id) {
        Response<Boolean> resp=new Response<>();
        try {
            checkNotNull( id, "category.id.not.null");
            categoryDao.deleteTo(id);
            resp.setResult(true);
        }catch (NullPointerException e){
            log.error("update.category.fail, id:({})",id, Throwables.getStackTraceAsString(e));
            resp.setError(e.getMessage());
            return resp;
        }
        catch (Exception e){
            log.error("update.category.fail, id:({})",id, Throwables.getStackTraceAsString(e));
            resp.setError("update.category.fail");
            return resp;
        }
        return resp;
    }
}
