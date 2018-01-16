package com.kodilla.rps;

public class RpsProcessor {


    public void process() {
        new RpsIntroduction();
        Rps rps = new Rps();
        rps.startGame(new UsersMove(), new ComputerMove());
        rps.whoWins();
    }
}
