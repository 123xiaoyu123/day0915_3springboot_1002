package com.baidu.service;

import com.baidu.mapper.UserMapper;
import com.baidu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUsers() {
        return userMapper.findUsers();
    }

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }
}
