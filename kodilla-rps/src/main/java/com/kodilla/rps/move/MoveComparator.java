package com.kodilla.rps.move;

import java.util.HashMap;
import java.util.Map;

import static com.kodilla.rps.move.Move.PAPER;
import static com.kodilla.rps.move.Move.ROCK;
import static com.kodilla.rps.move.Move.SCISSORS;
import static com.kodilla.rps.move.Winner.COMPUTER;
import static com.kodilla.rps.move.Winner.HUMAN;
import static com.kodilla.rps.move.Winner.TIE;

public class MoveComparator {
    private Map<MovePair, Winner> gameMatrix;

    public MoveComparator() {
        this.gameMatrix = new HashMap<>();

        this.gameMatrix.put(new MovePair(ROCK, PAPER), COMPUTER);
        this.gameMatrix.put(new MovePair(ROCK, SCISSORS), HUMAN);

        this.gameMatrix.put(new MovePair(PAPER, ROCK), HUMAN);
        this.gameMatrix.put(new MovePair(PAPER, SCISSORS), COMPUTER);

        this.gameMatrix.put(new MovePair(SCISSORS, ROCK), COMPUTER);
        this.gameMatrix.put(new MovePair(SCISSORS, PAPER), HUMAN);

        this.gameMatrix.put(new MovePair(ROCK, ROCK), TIE);
        this.gameMatrix.put(new MovePair(PAPER, PAPER), TIE);
        this.gameMatrix.put(new MovePair(SCISSORS, SCISSORS), TIE);
    }

    public Winner compareMoves(Move human, Move computer) {
        return this.gameMatrix.get(new MovePair(human, computer));
    }
}

class MovePair {
    private Move humanMove;
    private Move computerMove;

    public MovePair(Move humanMove, Move computerMove) {
        this.humanMove = humanMove;
        this.computerMove = computerMove;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MovePair)) return false;

        MovePair movePair = (MovePair) o;

        if (humanMove != movePair.humanMove) return false;
        return computerMove == movePair.computerMove;
    }

    @Override
    public int hashCode() {
        int result = humanMove.hashCode();
        result = 31 * result + computerMove.hashCode();
        return result;
    }
}
