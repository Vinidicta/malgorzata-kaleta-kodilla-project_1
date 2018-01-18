package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {

    final String userName;

    public ForumUser() {
        userName = "John Smith";
    }

    public String getUserName() {
        return userName;
    }
}
