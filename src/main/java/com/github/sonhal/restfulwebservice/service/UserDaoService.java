package com.github.sonhal.restfulwebservice.service;


import com.github.sonhal.restfulwebservice.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Sondre", new Date()));
        users.add(new User(2, "Mike", new Date()));
    }


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

    public User deleteOne(int id){
        Iterator iterator = users.iterator();
        while (iterator.hasNext()){
            User user = (User)iterator.next();
            if(user.getId() == id){
                iterator.remove();
                return user;
            }
        }
        return null;
    }
}
