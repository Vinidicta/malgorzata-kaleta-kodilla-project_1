package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuit {

    public static int testCounter = 0;

    @Before
    public void before(){
        testCounter++;
        System.out.println("Test suit number: " + testCounter + ": begin");
    }

    @BeforeClass
    public static void beforeStatisticsCalculator(){
        System.out.println("Tests for class Statistics Calculator: begin");
    }

    @After
    public void after(){
        System.out.println("Test suit: end");
    }

    @AfterClass
    public static void afterStatisticsCalculator(){
        System.out.println("Tests for class Statistics Calculator: end");
    }

    //This is test method for case when number of posts equals zero
    @Test(expected = ArithmeticException.class)
    public void testStatisticsCalculatorWithNonePosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList<>();
        usersNames.add("Agata");
        usersNames.add("Marta");
        usersNames.add("Adam");

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(20);

        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        statisticsCalculator.showStatistics();
        //Then
        Assert.assertEquals(new ArithmeticException("Error"), statisticsCalculator.getAveragePostsPerUser());

    }


    //This is test method for case when number of comments equals zero
    @Test(expected = ArithmeticException.class)
    public void testStatisticsCalculatorWithNoneComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList<>();
        usersNames.add("Ola");
        usersNames.add("Joanna");

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(0);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        statisticsCalculator.showStatistics();

        Assert.assertEquals(new ArithmeticException("Error"), statisticsCalculator.getAverageCommentsPerUser());
    }

    //This is test method for case when number of posts equals 1000 and numbers of posts is less than comments
    @Test
    public void testStatisticsCalculatorForLessPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList<>();
        usersNames.add("Magda");
        usersNames.add("Rafał");
        usersNames.add("Sławek");

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2500);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        statisticsCalculator.showStatistics();

        Assert.assertEquals(2, statisticsCalculator.getAverageCommentsPerPost(), 0.5);
    }

    //This is test method for case when number of posts is higher than comments
    @Test
    public void testStatisticsCalculatorMorePosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList<>();
        usersNames.add("Magda");
        usersNames.add("Rafał");
        usersNames.add("Sławek");

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(2000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        statisticsCalculator.showStatistics();

        Assert.assertEquals(0, statisticsCalculator.getAverageCommentsPerPost(), 0);
    }

    //This is test method for case when list of forum users is empty, no comments and posts
    @Test(expected = ArithmeticException.class)
    public void testStatisticsCalculatorWithEmptyListOfUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        statisticsCalculator.showStatistics();

        Assert.assertEquals(new ArithmeticException("Error"), statisticsCalculator.getUsersNumber());

    }
    //This is test method for case when list of forum users is contains 100 user's names
    @Test
    public void testStatisticsCalculatorManyUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        String[] names = {"Ola", "Magda", "Daria", "Kamil", "Karol", "Agata", "Tomek"};
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add(names[new Random().nextInt(names.length)]);
        }

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(150);
        when(statisticsMock.commentsCount()).thenReturn(200);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        statisticsCalculator.showStatistics();

        Assert.assertEquals(100, statisticsCalculator.getUsersNumber());
    }
}
