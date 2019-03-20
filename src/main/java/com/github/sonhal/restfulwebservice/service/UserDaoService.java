package com.github.sonhal.restfulwebservice.service;


import com.github.sonhal.restfulwebservice.model.User;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserDaoService {

    private List<User> users = List.of(
            new User(1, "Sondre", new Date()),
            new User(2, "Mike", new Date()));

    private int userCount = 2;


    public List<User> findAll() {
        return users;
    }

    public User save(User user){
        if(user.getId() == null){
            user = new User(++userCount, user.getName(), user.getBirthDate());
        }
        users.add(user);
        return user;
    }

    public User findOne(int id){
        return users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
    }
}
