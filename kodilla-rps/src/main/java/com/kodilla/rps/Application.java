package com.kodilla.rps;

import com.kodilla.rps.processor.RpsProcessor;

public class Application {

    public static void main(String[] args) {

        RpsProcessor rpsProcessor = new RpsProcessor();
        rpsProcessor.process();
    }
}
