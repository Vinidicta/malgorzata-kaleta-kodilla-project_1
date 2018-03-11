package com.kodilla.patterns.builder.bigmac;

public class BigMacCompositor {
    public static void main(String[] args) {
        final BigMac bigMac = new BigMac.BigMacBuilder()
                .withStandardRoll()
                .withDoubleBurger()
                .withBBQSauce()
                .withCheese()
                .withBacon()
                .withLettuce()
                .withPickle()
                .build();
        System.out.println(bigMac);
    }
}
