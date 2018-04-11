package com.kodilla.rps.rounds;

import com.kodilla.rps.move.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rps {
    private final MoveComparator moveComparator = new MoveComparator();
    private Scanner input;
    private int userWins;
    private int pcWins;
    private int rounds;

    public Rps() {
        do {
            input = new Scanner(System.in);
            rounds = getRounds();
        } while (rounds < 0);
    }

    private int getRounds() {
        try {
            System.out.println("Please put how much rounds would you like to play. To accept press enter");
            return Integer.valueOf(input.nextLine());
        } catch (RuntimeException e) {
            System.out.println("Wrong type of data");
            return -1;
        }
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
        } else if (userWins == pcWins) {
            System.out.println("\nThis game was very equal. Tie!");
        } else {
            System.out.println("\nOh no! Computer has more luck this time...");
        }
    }
}
