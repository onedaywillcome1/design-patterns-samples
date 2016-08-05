package FactoryPattern.factory;

import FactoryPattern.shape.Circle;
import FactoryPattern.shape.Rectangle;
import FactoryPattern.shape.Shape;
import FactoryPattern.shape.Square;

/**
 * Created by ahmetatalay on 01/08/16.
 */
public class ShapeFactory {
    public Shape getShape(Object shapeType){
        if (shapeType.equals(Circle.class)){
            return new Circle();
        }
        if (shapeType.equals(Rectangle.class)){
            return new Rectangle();
        }
        if (shapeType.equals(Square.class)){
            return new Square();
        }
        return null;
    }
}
