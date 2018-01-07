package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //given
        World world = new World();
        //when
        BigDecimal peopleQuantity = world.getPeopleQuantity();
        //then
        BigDecimal expectedQuantity = new BigDecimal("365345346652");
        Assert.assertEquals(expectedQuantity, peopleQuantity);
    }

}
