package com.hxj.service;

import com.hxj.dao.UserMapper;
import com.hxj.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hxj
 * @Date: 2021/06/07/21:11
 * @Description:
 */
@Service
public class UserService implements UserMapper {

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

    @Override
    public User register(User user) {
        return userMapper.register(user);
    }
}
