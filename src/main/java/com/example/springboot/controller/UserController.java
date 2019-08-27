package com.example.springboot.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.bean.User;
import com.example.springboot.service.UserService;
@RestController
public class UserController {
	@Autowired
	private UserService service;

	@RequestMapping("/list")//url注解
	public List<User> findall() {
		List<User> list = service.list(null);
		System.out.println(list);
		return list ;
	};

}
