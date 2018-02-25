package com.mmall.app;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mmall.dao.UserMapper;
import com.mmall.pojo.User;

@RestController
public class B2FController {
	@Resource
	private UserMapper userMapper;
	
    @RequestMapping(value="/test")
	public String testB2F() {
		return "index";
	}
    @GetMapping("user")
    public ResponseEntity<User> getUser(){
        return ResponseEntity.ok(userMapper.selectByPrimaryKey(1));
    }
}
