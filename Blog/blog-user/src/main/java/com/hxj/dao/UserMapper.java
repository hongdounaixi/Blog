package com.hxj.dao;

import com.hxj.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hxj
 * @Date: 2021/06/07/21:08
 * @Description:
 */
@Mapper
@Component
public interface UserMapper {

    @Select("select * from user where username=#{username} and password=#{password}")
    public User login(String username,String password);

    @Select("select * from user where phone=#{phone}")
    public User phoneLogin(String phone);

//    @Insert("insert into user ()")
//    public User register(User user);
}
