package com.devsimple.leader_group;

import com.devsimple.leader_group.entity.Admin;
import com.devsimple.leader_group.entity.User;
import com.devsimple.leader_group.service.RepoAdmin;
import com.devsimple.leader_group.user.UserRepository;
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

        User user = new User(1L, "taint", "pwd", "taint@gmail.com", "luckyteo");


        Admin admin = new Admin(user, "123456789","LA");

        user.setAdmin(admin);
        repo.save(user);
    }


}
