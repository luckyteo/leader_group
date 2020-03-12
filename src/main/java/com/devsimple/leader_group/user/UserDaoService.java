package com.devsimple.leader_group.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static int usersCount = 4;

    static {
        users.add(new User("123456", "taint", "123", "taint@gmail.com"));
        users.add(new User("123457", "taint2", "123", "taint2@gmail.com"));
        users.add(new User("123458", "taint3", "123", "taint3@gmail.com"));
        users.add(new User("123459", "taint4", "123", "taint4@gmail.com"));
    }

    ;

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if (user.getId() == null) {
            usersCount++;
            String id = user.getId() + usersCount;
            user.setId(id);
        }
        users.add(user);
        return user;
    }

    public User findOne(String id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public User deleteById(String id) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getId().equals(id)) {
            	iterator.remove();
                return user;
            }
        }
        return null;
    }
}
