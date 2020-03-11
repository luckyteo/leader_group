package com.devsimple.leader_group.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.devsimple.leader_group.entity.User;

@Repository
@Transactional
@Component
public class UserDAOService {

	@PersistenceContext
	private EntityManager entityManager;

	public User insert(User user) {
		entityManager.persist(user);
		return user;
	}

	public User findUserById(String id) {
		return entityManager.find(User.class, id);
	}
}
