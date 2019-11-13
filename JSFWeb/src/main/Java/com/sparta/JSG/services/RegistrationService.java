package com.sparta.JSG.services;

import com.sparta.JSG.components.User;

import javax.ejb.Stateless;
import javax.inject.Named;

@Named
//@Stateless dies once the job is done
public class RegistrationService {

    public String registerUser(User user) {
        return "";
    }
}
