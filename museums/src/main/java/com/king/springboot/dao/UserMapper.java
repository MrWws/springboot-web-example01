package com.king.springboot.dao;

import com.king.springboot.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @author: jjk
 * @time: 2021-04-14-23:17
 * @description:
 * @function:
 */
@Repository
public interface UserMapper {
    User Sel(User userName);
    User login(String userName,String passWord);
    int register(User user);

}
