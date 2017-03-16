package com.leegebe.mybatis.service;

import com.leegebe.mybatis.mapper.UserMapper;
import com.leegebe.mybatis.model.User;
import com.leegebe.mybatis.util.SqlSessionFactoryManager;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

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
        SqlSessionFactory factory = SqlSessionFactoryManager.getFactory();
        SqlSession sqlSession = factory.openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.insertUser(user);
        sqlSession.commit();
        return user;
    }

    /**
     * 根据UserId查询一个对象
     * @param userId
     * @return
     */
    public User selectUser(String userId){
        SqlSessionFactory factory = SqlSessionFactoryManager.getFactory();
        SqlSession sqlSession = factory.openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
        return userMapper.selectUser(userId);
    }


}
