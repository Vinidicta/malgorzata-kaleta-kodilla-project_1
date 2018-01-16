package com.kodilla.rps;

import java.util.Scanner;

public class UsersMove implements Move {

    Scanner input = new Scanner(System.in);

    @Override
    public int move() {
        return input.nextInt();
    }
}
