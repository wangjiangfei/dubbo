package com.wangjiangfei.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wangjiangfei.pojo.User;
import com.wangjiangfei.service.UserService;

@RestController
public class UserController {

    // 使用dubbo的@Reference注解
	@Reference
	private UserService userService;

    @RequestMapping(value = "/users")
    public List<User> getUserList() {
        return userService.getInfoList();
    }

}
