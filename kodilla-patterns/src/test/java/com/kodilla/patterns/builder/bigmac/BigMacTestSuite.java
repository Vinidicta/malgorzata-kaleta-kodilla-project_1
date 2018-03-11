package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigMacBuilder() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .withChiliPepper()
                .withDoubleBurger()
                .withPickle()
                .withBBQSauce()
                .withRollWithoutSesame()
                .withCheese()
                .build();

        System.out.println(bigMac);
        //When
        int howManyIngredients = bigMac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);
    }
}
