package com.devsimple.leader_group;

import com.devsimple.leader_group.repositories.RepoAdmin;
import com.devsimple.leader_group.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeaderGroupApplication implements CommandLineRunner {

    @Autowired
    private UserRepository repo;
    @Autowired
    private RepoAdmin repoAdmin;

    public static void main(String[] args) {
        SpringApplication.run(LeaderGroupApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        User user = new User();
//        user.setId(1L);
//        user.setUsername("taint");
//        user.setPassword("pass");
//        user.setFullname("Tai The");
//
//        Admin admin = new Admin();
//        admin.setUser(user);
//        admin.setPhone("0987098709");
//        admin.setAddress("LA");


    }



}
