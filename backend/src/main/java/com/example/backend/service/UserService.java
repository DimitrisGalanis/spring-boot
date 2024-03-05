package com.example.backend.service;


import com.example.backend.entity.User;
import com.example.backend.repository.UserRepo;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserService {
    public final UserRepo userRepo;

    public UserService(UserRepo userRepo) {  this.userRepo = userRepo; }

    public List<User> getAllUsers() { return userRepo.findAll(); }

    public User getUser(String username) {
        return userRepo.findByUsername(username)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public User createUser(User user) {  return userRepo.save(user); }

    public User deleteUser(String username) {
        User u = userRepo.findByUsername(username).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
        userRepo.delete(u);
        return u;
    }

}
