package com.kodilla.rps;

import java.util.Random;

public class ComputerMove implements Move {

    private Random random = new Random();

    @Override
    public int move() {
        return random.nextInt(3) + 1;
    }
}
