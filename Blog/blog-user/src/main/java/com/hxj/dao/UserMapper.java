package com.hxj.dao;

import com.hxj.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hxj
 * @Date: 2021/06/07/21:08
 * @Description:
 */
@Repository
public interface UserMapper {

    public User login(String username,String password);

    public User phoneLogin(String phone);

    public User register(User user);
}
