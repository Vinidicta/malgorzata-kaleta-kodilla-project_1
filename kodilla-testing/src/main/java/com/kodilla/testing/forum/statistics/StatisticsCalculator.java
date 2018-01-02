package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {

    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    Statistics statistics;

    public StatisticsCalculator(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();
        if(statistics.postsCount() !=0 && statistics.usersNames().size() !=0 && statistics.commentsCount() !=0) {
            averagePostsPerUser = statistics.postsCount() / statistics.usersNames().size();
        }
        else{
            throw new ArithmeticException("Error");
        }
        if(statistics.postsCount() !=0 && statistics.usersNames().size() !=0 && statistics.commentsCount() !=0) {
            averageCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
        }
        else{
            throw new ArithmeticException("Error");
        }
        if(statistics.postsCount() !=0 && statistics.usersNames().size() !=0 && statistics.commentsCount() !=0) {
            averageCommentsPerPost = statistics.commentsCount() / statistics.postsCount();
        }
        else{
            throw new ArithmeticException("Error");
        }

    }

    public void showStatistics() {
        System.out.println(usersNumber);
        System.out.println(postsNumber);
        System.out.println(commentsNumber);
        System.out.println(averagePostsPerUser);
        System.out.println(averageCommentsPerUser);
        System.out.println(averageCommentsPerPost);
    }

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
