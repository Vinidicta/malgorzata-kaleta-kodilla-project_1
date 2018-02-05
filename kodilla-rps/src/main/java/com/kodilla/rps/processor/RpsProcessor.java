package com.kodilla.rps.processor;

import com.kodilla.rps.rounds.Rps;
import com.kodilla.rps.start.RpsIntroduction;

import java.util.Scanner;

public class RpsProcessor {
    private final Scanner input = new Scanner(System.in);

    public void intro() {
        new RpsIntroduction();
    }

    public void process() {
        do {
            final Rps rps = new Rps();
            rps.startGame();
            System.out.println("Press x if you want to quit or anything else to continue");
        } while (!input.nextLine().equals("x"));
    }
}
