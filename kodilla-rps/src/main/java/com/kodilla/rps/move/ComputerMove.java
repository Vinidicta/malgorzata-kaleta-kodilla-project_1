package com.kodilla.rps.move;

import java.util.Random;

public class ComputerMove {
    private final Random random = new Random();

    public Move move() {
        int pcMove = random.nextInt(3);
        switch (pcMove) {
            case 0:
                return Move.ROCK;
            case 1:
                return Move.PAPER;
            case 2:
                return Move.SCISSORS;
            default:
                return null;
        }
    }
}
