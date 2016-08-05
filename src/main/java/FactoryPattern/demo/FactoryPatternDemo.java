package FactoryPattern.demo;

import FactoryPattern.shape.Circle;
import FactoryPattern.shape.Rectangle;
import FactoryPattern.shape.Shape;
import FactoryPattern.shape.Square;
import FactoryPattern.factory.ShapeFactory;

/**
 * Created by ahmetatalay on 01/08/16.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape(Square.class);
        shape.draw();

        shape = shapeFactory.getShape(Rectangle.class);
        shape.draw();

        shape = shapeFactory.getShape(Circle.class);
        shape.draw();
    }
}
