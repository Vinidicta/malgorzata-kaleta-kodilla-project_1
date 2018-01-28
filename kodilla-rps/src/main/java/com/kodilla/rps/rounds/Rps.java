package com.kodilla.rps.rounds;

import com.kodilla.rps.move.ComputerMove;
import com.kodilla.rps.move.Move;
import com.kodilla.rps.move.UsersMove;

import java.util.Scanner;

public class Rps {

    private final Scanner input;
    private int userWins;
    private int pcWins;
    private int rounds;
    private Move pcMove;
    public Move userMove;

    public Rps() {
        input = new Scanner(System.in);
        System.out.println("Please put how much rounds would you like to play. To accept press enter");
        rounds = input.nextInt();
    }

    public void startGame(UsersMove user, ComputerMove computer) {

        int i = 0;
        while (i < rounds) {

            userMove = user.move();
            System.out.println("You played: " + userMove);
            pcMove = computer.move();
            System.out.println("Computer played " + pcMove);
            int compareMoves = userMove.compareMoves(pcMove);

            switch (compareMoves) {
                case 0:
                    System.out.println("Tie");
                    break;
                case 1:
                    System.out.println(userMove + " beats " + pcMove);
                    userWins++;
                    break;
                case 2:
                    System.out.println(pcMove + " beats " + userMove);
                    pcWins++;
                    break;
            }
            System.out.println(userWins + " : " + pcWins + "\n");
            i++;
        }
        System.out.println("Results of the game: " + userWins + " : " + pcWins);
    }

    public void whoWins() {
        if (userWins > pcWins) {
            System.out.println("\nCongratulations! You win!");
        }
        if (userWins == pcWins) {
            System.out.println("\nThis game was very equal. Tie!");
        }
        if (userWins < pcWins) {
            System.out.println("\nOh no! Computer has more luck this time...");
        }
    }
}
