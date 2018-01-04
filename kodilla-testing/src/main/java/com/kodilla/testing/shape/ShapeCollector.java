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

    public String showFigures(){
            String result = "";
            for (Shape shape : shapes) {
                result += shape + "\n";
            }

            return result;
    }

    public int showCollectionsize(){
        return shapes.size();
    }
}
