package com.example.musicapp.service;

import com.example.musicapp.model.User;
import org.springframework.http.HttpStatus;

import java.util.List;

public interface UserService {
    public User createUser(User newUser);
    public User findUserByEmail(String email);
    public HttpStatus deleteUserById(String userId);
    public List<User> listUsers();
}
