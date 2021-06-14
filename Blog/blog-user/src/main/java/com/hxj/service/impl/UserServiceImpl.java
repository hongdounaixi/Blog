package com.hxj.service.impl;

import com.hxj.dao.UserMapper;
import com.hxj.entity.User;
import com.hxj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hxj
 * @Date: 2021/06/13/13:02
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        return userMapper.login(username,password);
    }

    @Override
    public User phoneLogin(String phone) {
        return userMapper.phoneLogin(phone);
    }
}
