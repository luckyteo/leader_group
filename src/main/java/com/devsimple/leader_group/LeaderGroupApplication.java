package com.devsimple.leader_group;

import com.devsimple.leader_group.entity.Admin;
import com.devsimple.leader_group.entity.User;
import com.devsimple.leader_group.repositories.RepoAdmin;
import com.devsimple.leader_group.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeaderGroupApplication implements CommandLineRunner {

    @Autowired
    private UserRepository repoUser;
    @Autowired
    private RepoAdmin repoAdmin;

    public static void main(String[] args) {
        SpringApplication.run(LeaderGroupApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        User user = User.builder()
                .id(1L)
                .username("taint")
                .password("pass")
                .fullname("Tai The")
                .build();

        //save
        repoUser.save(user);

        Admin admin = new Admin();
        admin.setPhone("098098098");
        admin.setAddress("LA - TPHCM");
        admin.setUser(user);

        repoAdmin.save(admin);


    }


}
