package com.kodilla.rps.move;

import java.util.Scanner;

public class UsersMove {

    private final Scanner input = new Scanner(System.in);

    public Move move() {

        System.out.print("Rock, paper, or scissors? ");
        int userMove = input.nextInt();
        do {
            switch (userMove) {
                case 1:
                    return Move.ROCK;
                case 2:
                    return Move.PAPER;
                case 3:
                    return Move.SCISSORS;
            }
        } while (userMove > 3 && userMove < 1);
        return null;
    }
}
