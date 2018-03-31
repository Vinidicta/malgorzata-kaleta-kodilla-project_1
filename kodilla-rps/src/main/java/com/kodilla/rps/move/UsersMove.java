package com.kodilla.rps.move;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsersMove {

    private final Scanner input = new Scanner(System.in);

    public Move move() throws InputMismatchException {


        int userMove = getUserMove();
            do {
                switch (userMove) {
                    case 1:
                        return Move.ROCK;
                    case 2:
                        return Move.PAPER;
                    case 3:
                        return Move.SCISSORS;
                }
                userMove = getUserMove();
            } while (userMove > 3 && userMove < 1);

        return null;
    }
    private int getUserMove() {
        try {
            System.out.print("Rock, paper, or scissors? ");
            return Integer.valueOf(input.nextLine());
        } catch (RuntimeException exception) {
            return -1;
        }
    }
}
