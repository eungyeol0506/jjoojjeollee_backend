package com.example.jjoojjeollee.DB.entity;

import java.util.Date;

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

}
