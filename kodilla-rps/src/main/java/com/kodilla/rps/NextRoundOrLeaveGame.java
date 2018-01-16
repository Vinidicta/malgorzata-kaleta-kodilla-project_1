package com.kodilla.rps;

import java.util.Scanner;

public class NextRoundOrLeaveGame {
    Scanner input = new Scanner(System.in);

    public String endGameOrAnotherOne() {

        return input.nextLine();
    }

    public void nextGameoOrQuit() {
        System.out.println("Press n if you want to play another game or x if you want to quit");
        String message = endGameOrAnotherOne();
        if (message.equals("n")) {
            while (message.equals("n")) {
                Rps rps = new Rps();
                rps.startGame(new UsersMove(), new ComputerMove());
                rps.whoWins();
                System.out.println("Press n if you want to play another game or x if you want to quit");
                message = input.nextLine();
                if (message.equals("x")) {
                    System.out.println("Game over!");
                    break;
                }
            }
        }
    }
}
