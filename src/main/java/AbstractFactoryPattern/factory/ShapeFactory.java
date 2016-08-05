package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.color.*;
import AbstractFactoryPattern.shape.*;

/**
 * Created by ahmetatalay on 01/08/16.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(Object color) {
        return null;
    }

    @Override
    public Shape getShape(Object shape) {
        if (shape.equals(Circle.class)){
            return new Circle();
        }
        if (shape.equals(Rectangle.class)){
            return new Rectangle();
        }
        if (shape.equals(Square.class)){
            return new Square();
        }
        return null;
    }
}
