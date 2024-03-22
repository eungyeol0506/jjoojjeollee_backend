package com.example.jjoojjeollee.service;

import com.example.jjoojjeollee.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginService {
    @Autowired
    UserRepository userRepository;

    Boolean isValidUser(String id, String password){
        String validPassword;
        validPassword = userRepository.selectUser(id);

        if(password.equals(validPassword)) {
            return true;
        }
        return false;
    }
}
