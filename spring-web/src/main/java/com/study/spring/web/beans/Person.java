package com.study.spring.web.beans;

public class Person {
    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public void hello() {
        System.out.println("My name is " + username);
        
    }
}
