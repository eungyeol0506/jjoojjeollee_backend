package com.example.jjoojjeollee.DB.entity;

import lombok.Data;

import java.util.Date;
@Data
public class User {
    String id;
    String password;
    Date passwordChangeDt;
    Character accountWithdrawed;
    Character accountLocked;
    Date accountCreateDt;
    Date accountWithdrawDt;
    String userName;
    Date lastLoginDt;

    public User(){
        id = "TEST";
        password = "1234";
        accountWithdrawed = 'Y';
        accountLocked = 'Y';
        userName = "TESTER";
    }
    public String getPassword(){
        return password;
    }

}
