package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum() {
        forumUsers.add(new ForumUser(0001, "czesiek90", 'M', LocalDate.of(1990, 05, 02), 10));
        forumUsers.add(new ForumUser(0002, "aga22", 'F', LocalDate.of(1996, 03, 01), 15));
        forumUsers.add(new ForumUser(0003, "olenka", 'F', LocalDate.of(2001, 12, 06), 12));
        forumUsers.add(new ForumUser(0004, "vader", 'M', LocalDate.of(1992, 06, 25), 2));
        forumUsers.add(new ForumUser(0005, "edek", 'M', LocalDate.of(1993, 8, 14), 0));
        forumUsers.add(new ForumUser(0006, "palindrom", 'M', LocalDate.of(2002, 9, 06), 4));
    }

    public List<ForumUser> getList(){
        return  new ArrayList<>(forumUsers);
    }
}
