package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //given
        int [] numbers = new int [20];
        numbers [0] = 3;
        numbers [1] = 5;
        numbers [2] = 8;
        numbers [3] = 22;
        numbers [4] = 17;
        numbers [5] = 1;
        numbers [6] = 19;
        numbers [7] = 55;
        numbers [8] = 31;
        numbers [9] = 9;
        numbers [10] = 46;
        numbers [11] = 2;
        numbers [12] = 99;
        numbers [13] = 70;
        numbers [14] = 66;
        numbers [15] = 11;
        numbers [16] = 29;
        numbers [17] = 30;
        numbers [18] = 13;
        numbers [19] = 7;
        //when
        double average = ArrayOperations.getAverage(numbers);
        //then
        Assert.assertTrue(27.15 == average);
    }
}


