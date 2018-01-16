package com.kodilla.rps;

import java.util.Scanner;

public class RpsIntroduction {
    private Scanner input;
    public String name;

    public RpsIntroduction() {
        input = new Scanner(System.in);
        System.out.println("Hello! This is RPS Game (Rock, Paper, Scissors).\n\nTo play this game you need only three buttons. To choose your move press appropriate button: 1 - rock, 2 - paper, 3 - scissors and accept pressing enter. If you press other button than: 1, 2 or 3, this round will not be counted to final results.\nRemember the rules: rock beats scissors, paper beats rock and scissors beats paper. Firstly please, write your name. To accept press enter");
        this.name = input.nextLine();
        System.out.println("Welcome " + name);
    }
}
