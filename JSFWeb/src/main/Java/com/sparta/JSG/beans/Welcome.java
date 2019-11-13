package com.sparta.JSG.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Welcome {

    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


    public String nextScreen(){
        if (path.equals("1")){
            return "Register";
        } else {
            return "logIn";
        }
    }
    public String nextRegisterScreen(){
        if (path.equals("1")){
            return "Register";
        } else {
            return "logIn";
        }
    }
}