package com.devsimple.leader_group.service;

import com.devsimple.leader_group.entity.User;
import com.devsimple.leader_group.exception.RunException;
import com.devsimple.leader_group.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserService {

    @Autowired
    private UserRepository repo;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return repo.findAll();
    }

    @PostMapping(path = "/user_insert")
    public User insert(@RequestBody User user) {
        return repo.saveAndFlush(user);
    }

    @DeleteMapping("/user_delete")
    public ResponseEntity<String> deleteById(@RequestBody User user) {
        repo.deleteById(user.getId());
        boolean isDeleted = repo.existsById(user.getId());
        return new ResponseEntity("Delete User " + isDeleted,
                HttpStatus.OK);
    }

    @DeleteMapping("/user_edit")
    public ResponseEntity<User> edit(@RequestBody User user) {
        try {
            User src = repo.save(user);
            return new ResponseEntity<User>(src,
                    HttpStatus.OK);
        } catch (Exception ex) {
            throw new RunException("Edit user FAILED");
        }

    }
}
