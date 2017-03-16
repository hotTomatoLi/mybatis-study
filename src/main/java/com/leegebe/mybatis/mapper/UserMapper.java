package com.leegebe.mybatis.mapper;

import com.leegebe.mybatis.model.User;

/**
 * User对象的数据接口
 */
public interface UserMapper {

    /**
     * 根据userId查询User对象
     * @param userId
     * @return
     */
    User selectUser(String userId);

    /**
     * 新增一个用户对象
     * @param user
     * @return
     */
    Integer insertUser(User user);

}
