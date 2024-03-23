package com.example.jjoojjeollee.service;

import com.example.jjoojjeollee.DB.entity.User;
import com.example.jjoojjeollee.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginService {
    @Autowired
    UserRepository userRepository;

    public Boolean isValidUser(String id, String password){
        String validPassword;

        validPassword = userRepository.selectUserpassword(id);
        if (password.equals(validPassword)) {
            return false;
        }
        return true;
    }

    public User readUserInfo(String id){
        return userRepository.selectUser(id);
    }
}
