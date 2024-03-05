package com.example.backend.controller;


import com.example.backend.entity.User;
import com.example.backend.service.UserService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users/{username}")
    public ResponseEntity<User> getUses(@PathVariable String username) {
        return ResponseEntity.status(200).body(userService.getUser(username));
    }

    @GetMapping("/users")
    public ResponseEntity<Collection<User>> getAllUsers() {
        return ResponseEntity.status(200).body(userService.getAllUsers());
    }


    @PostMapping("/users/create")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.status(200).body(userService.createUser(user));
    }

    @DeleteMapping("/users/delete/{username}")
    public ResponseEntity<User> deleteUser(@PathVariable String username) {
        return ResponseEntity.status(200).body(userService.deleteUser(username));
    }

}
