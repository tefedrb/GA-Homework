package com.example.musicapp.model;

import org.springframework.data.mongodb.core.index.Indexed;

public class User {
    @Indexed(unique = true)
    private String email;
    private String password;
    private String address;
    private String mobile;


    public User(){}

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getMobile(){
        return mobile;
    }

    public void setMobile(String mobile){
        this.mobile = mobile;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

}
