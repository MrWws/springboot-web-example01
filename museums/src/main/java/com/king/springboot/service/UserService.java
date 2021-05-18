package com.king.springboot.service;

import com.king.springboot.dao.UserMapper;
import com.king.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: jjk
 * @time: 2021-04-14-23:20
 * @description:
 * @function:
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User Sel(User userName){
        return userMapper.Sel(userName);
    }
    public User login(String userName, String passWord) {
        return userMapper.login(userName,passWord);
    }

    public int register(User user) {
        return userMapper.register(user);
    }

}
