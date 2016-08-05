package AbstractFactoryPattern.demo;

import AbstractFactoryPattern.color.Blue;
import AbstractFactoryPattern.color.Color;
import AbstractFactoryPattern.color.Green;
import AbstractFactoryPattern.color.Red;
import AbstractFactoryPattern.factory.AbstractFactory;
import AbstractFactoryPattern.factory.ColorFactory;
import AbstractFactoryPattern.factory.FactoryProducer;
import AbstractFactoryPattern.factory.ShapeFactory;
import AbstractFactoryPattern.shape.Circle;
import AbstractFactoryPattern.shape.Rectangle;
import AbstractFactoryPattern.shape.Shape;
import AbstractFactoryPattern.shape.Square;

/**
 * Created by ahmetatalay on 01/08/16.
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(ShapeFactory.class);
        Shape shape = shapeFactory.getShape(Circle.class);
        shape.draw();

        shape = shapeFactory.getShape(Rectangle.class);
        shape.draw();

        shape = shapeFactory.getShape(Square.class);
        shape.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory(ColorFactory.class);
        Color color  = colorFactory.getColor(Red.class);
        color.fill();

        color = colorFactory.getColor(Green.class);
        color.fill();

        color = colorFactory.getColor(Blue.class);
        color.fill();
    }
}
