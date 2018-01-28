package com.kodilla.rps.rounds;

import com.kodilla.rps.move.ComputerMove;
import com.kodilla.rps.move.UsersMove;
import com.kodilla.rps.rounds.Rps;

import java.util.Scanner;

public class NextRoundOrLeaveGame {
    private final Scanner input = new Scanner(System.in);

    public String endGameOrAnotherOne() {
        return input.nextLine();
    }

    public void nextGameOrQuit() {
        System.out.println("Press n if you want to play another game or x if you want to quit");
        String message = endGameOrAnotherOne();
        if (message.equals("n")) {
            while (message.equals("n")) {
                final Rps rps = new Rps();
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
