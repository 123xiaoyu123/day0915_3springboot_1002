package com.baidu.mapper;

import com.baidu.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    /*查询所有的用户*/
    List<User> findUsers();
}
