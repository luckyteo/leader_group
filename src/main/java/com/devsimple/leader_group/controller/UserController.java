package com.devsimple.leader_group.controller;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsimple.leader_group.entity.User;
import com.devsimple.leader_group.service.UserDAOService;

@RestController
public class UserController {

	@Autowired
	private UserDAOService dao;

	@GetMapping(path = "/user")
	public String hello() {
		return "Hello";
	}

	@GetMapping(path = "/user/{id}")
	public User getUser(String id) {
		User user = dao.findUserById(id);
		if (user == null) {
			throw new EntityNotFoundException("Entity " + User.class.getName()
					+ " with id " + id + " not found");
		}
		return user;
	}
}
