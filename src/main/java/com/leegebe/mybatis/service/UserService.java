package com.leegebe.mybatis.service;

import com.leegebe.mybatis.mapper.UserMapper;
import com.leegebe.mybatis.model.User;

/**
 * User对象的Service
 */
public class UserService {

    UserMapper userMapper;

    /**
     * 新增User对象
     * @param user
     * @return
     */
    public User addUser(User user){


        return userMapper.insertUser(user);
    }


}
