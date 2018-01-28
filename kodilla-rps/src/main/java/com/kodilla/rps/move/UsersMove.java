package com.kodilla.rps.move;

import java.util.Scanner;

public class UsersMove {

    private final Scanner input = new Scanner(System.in);

    public Move move() {
        System.out.print("Rock, paper, or scissors? ");
        int userMove = input.nextInt();
        if (userMove == 1 || userMove == 2 || userMove == 3) {
            switch (userMove) {
                case 1:
                    return Move.ROCK;
                case 2:
                    return Move.PAPER;
                case 3:
                    return Move.SCISSORS;
            }
        }
        return move();
    }
}
