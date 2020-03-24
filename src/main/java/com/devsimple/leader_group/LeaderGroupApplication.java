package com.devsimple.leader_group;

import com.devsimple.leader_group.entity.Admin;
import com.devsimple.leader_group.entity.Developer;
import com.devsimple.leader_group.entity.User;
import com.devsimple.leader_group.repositories.DevRepository;
import com.devsimple.leader_group.repositories.RepoAdmin;
import com.devsimple.leader_group.repositories.UserRepository;
import com.devsimple.leader_group.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class LeaderGroupApplication implements CommandLineRunner {

    @Autowired
    private UserRepository repoUser;
    @Autowired
    private RepoAdmin repoAdmin;

    @Autowired
    private BCryptPasswordEncoder bcryptEncoder;

    @Autowired
    private DevRepository repoDev;

    public static void main(String[] args) {
        SpringApplication.run(LeaderGroupApplication.class, args);
    }

    @Override
    public void run(String... args) {

        //Admin
        User user = new User();
        user.setLogin("taint");
        user.setPassword(bcryptEncoder.encode("pass"));
        user.setFullname("Tai The");

//        repoUser.save(user);

        Admin admin = new Admin();
        admin.setUser(user);
        admin.setPhone("0987098709");
        admin.setAddress("LA");

        repoAdmin.save(admin);

        //dev
        User userDev = new User();
        userDev.setLogin("taintDev");
        userDev.setPassword(bcryptEncoder.encode("pass"));
        userDev.setFullname("Tai The DEV");
        Developer dev = new Developer();
        dev.setUser(userDev);
        dev.setCanLogin(true);
        dev.setCmndId("123456789");
        repoDev.save(dev);


    }



}
