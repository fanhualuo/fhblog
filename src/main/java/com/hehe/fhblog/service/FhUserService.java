package com.hehe.fhblog.service;

import com.hehe.common.model.Paging;
import com.hehe.common.model.Response;
import com.hehe.fhblog.model.enums.LoginType;
import com.hehe.fhblog.model.User;

import java.util.Map;

/**
 * Date: 2017/9/17
 * Time: 2:53
 * email: qinghe101@qq.com
 * Author: hehe
 */
public interface FhUserService {

    //读服务
    /**
     * 登陆controller
     * @desc
     * @param loginBy 手机, 邮箱或用户名
     * @param passwd  明文密码
     * @param type    登录类型
     * @return
     **/
    Response<User>  login(String loginBy, String passwd, LoginType type);

    /**
     * 通过 ID 查询用户
     *
     * @param id 用户 ID
     * @return 用户
     */
    Response<User> findById(long id);

    /**
     * 通过用户名查询用户
     *
     * @param name 用户名
     * @return 用户
     */
    Response<User> findByNickname(String name);

    /**
     * 分页查询用户
     * @param pageNo   页号
     * @param pageSize 分页大小
     * @param criteria 查询条件
     * @return 用户分页对象
     */
    Response<Paging<User>> pagingForAdmin(Integer pageNo, Integer pageSize, Map<String, Object> criteria);

    //读服务 end////////////////


    //写服务
    /**
     * 修改密码
     *
     * @param userId      用户id
     * @param oldPassword 旧密码
     * @param newPassword 新密码
     * @return 更新成功返回true, 反之false
     */
    Response<Boolean> changePassword(Long userId, String oldPassword,String newPassword);

    /**
     * 重置用户密码
     *
     * @param userId   用户 ID
     * @param password 新密码
     * @return 是否重置成功
     */
    Response<Boolean> resetPassword(long userId, String password);

    /**
     * 更改用户类型
     *
     * @param uid  用户id
     * @param type 用户类型
     * @return 操作是否成功
     */
    Response<Boolean> changeUserType(Long uid, Integer type);


    /**
     * 更新用户资料
     *
     * @param user 用户
     * @return 是否成功
     */
    Response<Boolean> updateUser(User user);


}
