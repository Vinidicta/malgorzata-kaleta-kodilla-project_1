package com.kodilla.rps.processor;

import com.kodilla.rps.move.ComputerMove;
import com.kodilla.rps.move.UsersMove;
import com.kodilla.rps.rounds.NextRoundOrLeaveGame;
import com.kodilla.rps.rounds.Rps;
import com.kodilla.rps.start.RpsIntroduction;

public class RpsProcessor {

    private final NextRoundOrLeaveGame nextRoundOrLeaveGame = new NextRoundOrLeaveGame();

    public void process() {
        new RpsIntroduction();
        final Rps rps = new Rps();
        rps.startGame(new UsersMove(), new ComputerMove());
        rps.whoWins();
        nextRoundOrLeaveGame.nextGameOrQuit();

    }
}
