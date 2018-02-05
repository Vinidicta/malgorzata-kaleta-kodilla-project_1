package com.kodilla.rps.start;

import java.util.Scanner;

public class RpsIntroduction {
    private final Scanner input;
    private final String name;

    public RpsIntroduction() {
        input = new Scanner(System.in);
        System.out.println("Hello! This is RPS Game (Rock, Paper, Scissors).");
        System.out.println("\nTo play this game you need only three buttons. To choose your move press appropriate " +
                "button: 1 - rock, 2 - paper, 3 - scissors and accept pressing enter.\nIf you press other button than:" +
                " 1, 2 or 3, game will be restarted.\nRemember the rules: rock beats " +
                "scissors, paper beats rock and scissors beats paper.");
        System.out.println("\nFirstly please, write your name. To accept press enter.");
        this.name = input.nextLine();
        System.out.println("Welcome " + name);
    }
}
