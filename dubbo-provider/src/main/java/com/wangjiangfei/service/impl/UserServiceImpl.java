package com.wangjiangfei.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wangjiangfei.dao.UserDao;
import com.wangjiangfei.pojo.User;
import com.wangjiangfei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

// 使用dubbo的@Service注解
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getInfoList() {
		return userDao.getUserList();
	}
    
}
