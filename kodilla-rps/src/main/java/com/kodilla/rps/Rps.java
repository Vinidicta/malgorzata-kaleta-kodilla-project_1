package com.kodilla.rps;

import java.util.Scanner;

public class Rps {

    private Scanner input;
    private int userWins;
    private int pcWins;
    private int rounds;
    private int pc;
    public int round;

    public Rps() {
        input = new Scanner(System.in);
        System.out.println("Please put how much rounds would you like to play. To accept press enter");
        rounds = input.nextInt();
    }

    public void startGame(Move user, Move computer) {
        GameMessages gameMessages = new GameMessages();

        int i = 0;
        while (i < rounds) {

            System.out.println("Rock, Paper or Scissors?");
            round = user.move();
            pc = computer.move();

            if (round == pc) {
                System.out.println("Computer has chosen: " + gameMessages.getMoveIdentification(pc));
                System.out.println("Tie!");
            }
            if (round == 1 && pc == 3 || round == 2 && pc == 1 || round == 3 && pc == 2) {
                System.out.println("Computer has chosen: " + gameMessages.getMoveIdentification(pc));
                System.out.println(gameMessages.getMessage(round, pc));
                System.out.println("You win!");
                userWins++;
            }
            if (round == 1 && pc == 2 || round == 2 && pc == 3 || round == 3 && pc == 1) {
                System.out.println("Computer has chosen: " + gameMessages.getMoveIdentification(pc));
                System.out.println(gameMessages.getMessage(round, pc));
                System.out.println("Computer wins!");
                pcWins++;
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
