package com.leegebe.mybatis.service;

import com.leegebe.mybatis.model.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 */
public class UserServiceTest {

    @Test
    public void testAdd(){
        User user = new User();
        user.setLoginName("test");
        user.setUserName("测试");
        user.setPassword("123456");
        user.setUserId("1230");
        user.setValidated(2);
        UserService userService = new UserService();
        userService.addUser(user);
    }

    @Test
    public void testGet(){
        UserService userService = new UserService();
        User user = userService.selectUser("1");
        Assert.assertNotNull(user);
    }

}