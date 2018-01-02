package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuit {
    public static  int testCollector = 0;
    @Before
    public void before(){
        testCollector++;
        System.out.println("Test Suit number " + testCollector + ": begin");
    }

    @BeforeClass
    public static void beforeShapeCollector(){
        System.out.println("Tests for class ShapeCollector: begin");
    }

    @After
    public void after(){
        System.out.println("Test Suit: end");
    }

    @AfterClass
    public static void afterShapeCollector(){
        System.out.println("Tests for class ShapeCollector: end");
    }

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(new Square(5));
        shapeCollector.addFigure(new Circle(6));
        //Then
        Assert.assertEquals(2, shapeCollector.showCollectionsize());
    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        final Square shape = new Square(4);
        shapeCollector.addFigure(shape);
        shapeCollector.removeFigure(shape);
        //Then
        Assert.assertEquals(0, shapeCollector.showCollectionsize());
    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(new Triangle(5,9));
        shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(1, shapeCollector.showCollectionsize());
    }

    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(new Triangle(5,9));
        shapeCollector.addFigure(new Square(5));
        shapeCollector.addFigure(new Circle(3));
        shapeCollector.showFigures();
        //Then
        Assert.assertEquals(3, shapeCollector.showCollectionsize());
    }

}
