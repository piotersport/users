package com.sda.repository;

import com.sda.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> userList = new ArrayList<>();

    public User saveUser(User user) {
        userList.add(user);
        return user;
    }

    public List<User> findAllUsers() {
        return userList;
    }

    public User getUserById(Long id) {
        return userList.stream()
                .filter(p -> p.getId().equals(id))
                .findAny()
                .orElseGet(null);
    }

    public User getUserByName(String name) {
        return userList.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .findAny()
                .orElseThrow(null);
    }


}
