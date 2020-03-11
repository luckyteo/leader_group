package com.devsimple.leader_group;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.devsimple.leader_group.entity.User;
import com.devsimple.leader_group.service.UserDAOService;
import com.devsimple.leader_group.util.SequenceGenerator;

@Component
public class UserDaoServicecommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory
			.getLogger(UserDaoServicecommandLineRunner.class);
	@Autowired
	private UserDAOService userDaoService;

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		SequenceGenerator squ = new SequenceGenerator();
		String id = "" + squ.nextId();
		user.setId(id);
		user.setFullname("Tai");
		user.setEmail("taint@gmail.com");
		user.setLang("vi");
		user.setUsername("taint");
		user.setPassword("123456");
		user.setStatus(1);

		userDaoService.insert(user);
		log.info(user.toString());
	}

}
