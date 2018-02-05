package com.kodilla.rps;

import com.kodilla.rps.processor.RpsProcessor;

public class Application {

    public static void main(String[] args) {
        RpsProcessor rpsProcessor = new RpsProcessor();
        rpsProcessor.intro();

        try {
            rpsProcessor.process();
        } catch (NullPointerException exception) {
            System.out.println("You tried to put wrong button " + exception + "\nTry play again!\n");
        } finally {
            rpsProcessor.process();
        }
    }
}
