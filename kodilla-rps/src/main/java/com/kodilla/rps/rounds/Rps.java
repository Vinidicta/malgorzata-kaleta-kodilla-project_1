package com.kodilla.rps.rounds;

import com.kodilla.rps.move.*;
import java.util.Scanner;

public class Rps {
    private final MoveComparator moveComparator = new MoveComparator();
    private final Scanner input;
    private int userWins;
    private int pcWins;
    private int rounds;


    public Rps() {
        input = new Scanner(System.in);
        System.out.println("Please put how much rounds would you like to play. To accept press enter");
        rounds = input.nextInt();
    }

    public void startGame() {

        final UsersMove user = new UsersMove();
        final ComputerMove computer = new ComputerMove();

        int i = 0;
        while (i < rounds) {

            final Move userMove = getUserMove(user);
            final Move pcMove = getComputerMove(computer);
            final Winner winner = moveComparator.compareMoves(userMove, pcMove);

            switch (winner) {
                case TIE:
                    System.out.println("Tie");
                    break;
                case HUMAN:
                    System.out.println(userMove + " beats " + pcMove);
                    userWins++;
                    break;
                case COMPUTER:
                    System.out.println(pcMove + " beats " + userMove);
                    pcWins++;
                    break;
            }
            System.out.println(userWins + " : " + pcWins + "\n");
            i++;
        }

        System.out.println("Results of the game: " + userWins + " : " + pcWins);
        displayResults();
    }

    private Move getComputerMove(ComputerMove computer) {
        final Move move = computer.move();
        System.out.println("Computer played " + move);
        return move;
    }

    private Move getUserMove(UsersMove user) {
        Move userMove;
        do {
            userMove = user.move();
        } while (userMove == null);
        System.out.println("You played " + userMove);
        return userMove;
    }

    private void displayResults() {
        if (userWins > pcWins) {
            System.out.println("\nCongratulations! You win!");
        }
        else if (userWins == pcWins) {
            System.out.println("\nThis game was very equal. Tie!");
        }
        else {
            System.out.println("\nOh no! Computer has more luck this time...");
        }
    }
}