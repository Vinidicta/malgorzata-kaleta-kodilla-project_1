package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void log() {
        System.out.println("Test for Logger class begins.");
        Logger.getInstance().log("New message");
    }

    @AfterClass
    public static void testEnd() {
        System.out.println("Test for Logger class ends.");
    }

    @Test
    public void testGetLastLog() {
        //given
        //when
        String result = Logger.getInstance().getLastLog();
        //then
        Assert.assertEquals("New message", result);
    }

}
