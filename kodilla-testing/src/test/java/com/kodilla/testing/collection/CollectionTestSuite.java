package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    public static int testCounter = 0;

    @Before
    public void before() {
        testCounter++;
        System.out.println("Test number " + testCounter + ": begin.");
    }

    @BeforeClass
    public static void beforeOddNumbersExterminator() {
        System.out.println("Tests for class OddNumbersExterminator: begin");
    }

    @After
    public void after() {
        System.out.println("Test Suit: end.");
    }

    @AfterClass
    public static void afterOddNumbersExterminator() {
        System.out.println("Tests for class OddNumbersExterminator: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> numbers = new ArrayList<>();
        oddNumbersExterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(0, numbers.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(5);
        numbers.add(7);
        numbers.add(8);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(4, result.size());
    }
}
