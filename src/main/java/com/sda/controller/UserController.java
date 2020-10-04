package com.sda.controller;

import com.sda.domain.Cars;
import com.sda.domain.User;
import com.sda.dto.CreateUserDTO;
import com.sda.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")

public class UserController {

    private UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<User> createUser (@RequestBody CreateUserDTO dto) {
        User u = service.save(dto);
        return new ResponseEntity<>(u, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> findAllUsers() {
        List<User> users = service.findAll();
        return ResponseEntity.ok(users);
    }

//    @GetMapping("/{userId}")
//    public ResponseEntity<User> findUserByIdd (@PathVariable Long userId) {
//
//            User u = service.findById(userId);
//            return ResponseEntity.ok(u);
//
//    }

    @GetMapping("/external/{userId}")
    public User findUserById (@PathVariable Long userId) {

        User u = service.findById(userId);
        return u;
    }










}
