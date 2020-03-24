package com.devsimple.leader_group.service;

import com.devsimple.leader_group.entity.User;
import com.devsimple.leader_group.mapper.DTOModel.UserDto;

import java.util.List;

public interface UserService {

    User save(UserDto user);

    List<User> findAll();

    void delete(String id);

    User findOne(String username);

    User findById(String id);

    UserDto update(UserDto userDto);
}
