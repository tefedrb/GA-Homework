package com.example.musicapp.controller;

import com.example.musicapp.model.User;
import com.example.musicapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/list")
    public List<User> listUsers(){
        return userService.listUsers();
    }

    @PostMapping("/signup")
    public User createUser(@RequestBody User newUser){
        return userService.createUser(newUser);
    }

    @PutMapping("/user/update/{email}/{newEmail}")
    public User updateUserByEmail(@PathVariable String email, @PathVariable String newEmail){
        return userService.updateUserEmail(email, newEmail);
    }

    @GetMapping("/user/{email}")
    public User getUserByEmail(@PathVariable String email){
        return userService.findUserByEmail(email);
    }

    @DeleteMapping("/user/delete/{userId}")
    public HttpStatus deleteByUserId(@PathVariable String userId){
        return userService.deleteUserById(userId);
    }
}
