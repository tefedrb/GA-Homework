package com.example.musicapp.service;

import com.example.musicapp.model.User;
import com.example.musicapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> listUsers(){
        return userRepository.findAll();
    }

    @Override
    public User createUser(User newUser){
        return userRepository.save(newUser);
    }

    @Override
    public User findUserByEmail(String email){
        return userRepository.findByEmail(email);
    }

    @Override
    public HttpStatus deleteUserById(String userId){
        userRepository.deleteById(userId);
        return HttpStatus.valueOf(200);
    }

    @Override
    public User updateUserEmail(String email, String newEmail){
        User updated = userRepository.findByEmail(email);
        updated.setEmail(newEmail);
        return userRepository.save(updated);
    }
}
