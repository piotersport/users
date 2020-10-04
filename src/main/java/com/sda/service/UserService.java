package com.sda.service;

import com.sda.domain.User;
import com.sda.dto.CreateUserDTO;
import com.sda.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User save(CreateUserDTO dto) {

        User user = User.builder()
                .name(dto.getName())
                .surname(dto.getSurname())
                .age(dto.getAge())
                .address(dto.getAddress())
                .build();

        repository.saveUser(user);
        return user;
    }

    public List<User> findAll() {
        return repository.findAllUsers();
    }

    public User findById (Long id) {
        return repository.getUserById(id);
    }



}
