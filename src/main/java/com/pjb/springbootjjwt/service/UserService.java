package com.pjb.springbootjjwt.service;

import com.pjb.springbootjjwt.entity.User;
import com.pjb.springbootjjwt.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jinbin
 * @date 2018-07-08 20:52
 */
@Service("UserService")
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User findByUsername(User user){
    	user.setId("1");
    	user.setUsername("zc");
    	user.setPassword("123");
//        return userMapper.findByUsername(user.getUsername());
    	return user;
    }
    public User findUserById(String userId) {
    	User user = new User();
    	user.setId("1");
    	user.setUsername("zc");
    	user.setPassword("123");
//        return userMapper.findUserById(userId);
    	return user;
    }

}
