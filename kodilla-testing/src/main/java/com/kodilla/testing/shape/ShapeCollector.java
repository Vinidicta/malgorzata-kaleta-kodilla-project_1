package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape){

        shapes.add(shape);
    }

    public void removeFigure(Shape shape){
        shapes.remove(shape);
    }

    public void getFigure(int i){
        System.out.println(shapes.get(i));
    }

    public void showFigures(){

        for (Shape shape : shapes){
            System.out.println(shape);
        }
    }

    public int showCollectionsize(){
        return shapes.size();
    }
}
