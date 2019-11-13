package com.sparta.JSG.services;

import com.sparta.JSG.components.User;

public class LoginService {

    public String validateUser(User user) {
        if ((user.getUserName().equals("Joshua") & user.getPassword().equals("password"))){
            return "welcomePage";
        }else{
            return "logIn";
        }
    }
}
