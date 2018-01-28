package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //given
        User agata = new Millenials("Agata");
        User natalia = new YGeneration("Natalia");
        User robert = new ZGeneration("Robert");
        //when
        String agataPrefer = agata.sharePost();
        System.out.println("Agata prefers " + agataPrefer);
        String nataliaPrefer = natalia.sharePost();
        System.out.println("Natalia prefers " + nataliaPrefer);
        String robertPrefer = robert.sharePost();
        System.out.println("Robert prefers " + robertPrefer);

        //then
        assertEquals("Facebook", agataPrefer);
        assertEquals("Twitter", nataliaPrefer);
        assertEquals("Snapchat", robertPrefer);

    }

    @Test
    public void testIndividualSharingStrategy() {
        //given
        User agata = new Millenials("Agata");
        //when
        String agataShouldPrefer = agata.sharePost();
        System.out.println("Agata should prefer " + agataShouldPrefer);
        agata.setPublisher(new TwitterPublisher());
        agataShouldPrefer = agata.sharePost();
        System.out.println("...but now she prefers " + agataShouldPrefer);
        //then
        assertEquals("Twitter", agataShouldPrefer);
    }
}
