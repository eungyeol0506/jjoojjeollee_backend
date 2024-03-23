package com.example.jjoojjeollee.repository;

import com.example.jjoojjeollee.DB.DAO.UserDAO;
import com.example.jjoojjeollee.DB.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRepository {

    @Autowired
    private UserDAO userDao;
    public String selectUserTest(String id){

        return "1234";
    }
    public User selectUser(String id){
        User myUser = userDao.selectUser(id);
        return myUser;
    }
    public String selectUserpassword(String id){
        User myUser = userDao.selectUser(id);
        return myUser.getPassword();
    }
}
