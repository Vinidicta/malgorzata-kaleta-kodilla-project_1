package com.kodilla.rps.move;

import java.util.Random;

public class ComputerMove {
    private final Random random = new Random();

    public Move move() {
        int pcMove = random.nextInt(3) + 1;
        if (pcMove == 1 || pcMove == 2 || pcMove == 3) {
            switch (pcMove) {
                case 1:
                    return Move.ROCK;
                case 2:
                    return Move.PAPER;
                case 3:
                    return Move.SCISSORS;
            }
        }
        return move();
    }
}
