package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public final class ForumUser {
    private final Integer id;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int posts;

    public ForumUser(int idNumber, String userName, char sex, LocalDate birthDate, int postsNumber) {
        this.id = idNumber;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.posts = postsNumber;
    }

    public Integer getIdNumber() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsNumber() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idNumber=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postsNumber=" + posts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;

        ForumUser forumUser = (ForumUser) o;

        if (sex != forumUser.sex) return false;
        if (posts != forumUser.posts) return false;
        if (!id.equals(forumUser.id)) return false;
        if (!userName.equals(forumUser.userName)) return false;
        return birthDate.equals(forumUser.birthDate);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + userName.hashCode();
        result = 31 * result + (int) sex;
        result = 31 * result + birthDate.hashCode();
        result = 31 * result + posts;
        return result;
    }
}
