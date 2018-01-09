package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        try {

            SecondChallenge secondChallenge = new SecondChallenge();
            String result = secondChallenge.probablyIWillThrowException(2.0, 1.5);

            System.out.println(result);

        } catch (Exception e) {
            System.out.println("Ooopss! Something went wrong." + e);

        } finally {
            System.out.println("Task has been completed.");

        }
    }
}
