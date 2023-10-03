package com.baidu.service;

import com.baidu.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    /*查询所有的用户*/
    List<User> findUsers();
}
