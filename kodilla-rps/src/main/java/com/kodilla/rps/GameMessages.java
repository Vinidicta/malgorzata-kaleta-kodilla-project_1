package com.kodilla.rps;

public class GameMessages {

    private String[] moveIdentification;
    private String[][] messages;

    public GameMessages() {
        moveIdentification = new String[4];
        moveIdentification[0] = "empty";
        moveIdentification[1] = "Rock";
        moveIdentification[2] = "Paper";
        moveIdentification[3] = "Scissors";

        messages = new String[4][4];
        messages[0][0] = "empty";
        messages[0][1] = "empty";
        messages[0][2] = "empty";
        messages[0][3] = "empty";
        messages[1][0] = "empty";
        messages[1][1] = "Tie!";
        messages[1][2] = "Paper beats Rock!";
        messages[1][3] = "Rock beats Scissors!";
        messages[2][0] = "empty";
        messages[2][1] = "Paper beats Rock!";
        messages[2][2] = "Tie!";
        messages[2][3] = "Scissors beats Paper!";
        messages[3][0] = "empty";
        messages[3][1] = "Rock beats Scissors!";
        messages[3][2] = "Scissors beats Paper!";
        messages[3][3] = "Tie!";
    }

    public String getMoveIdentification(int i) {
        return moveIdentification[i];
    }

    public String getMessage(int i, int n) {
        return messages[i][n];
    }
}
