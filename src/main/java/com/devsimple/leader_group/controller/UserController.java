package com.devsimple.leader_group.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsimple.leader_group.user.UserDaoService;

@RestController
public class UserController {

	@Autowired
	private UserDaoService dao;

	@GetMapping(path = "/user")
	public String hello() {
		return "Hello";
	}

}
