package com.wangjiangfei.dao;

import com.wangjiangfei.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    List<User> getUserList();
}
