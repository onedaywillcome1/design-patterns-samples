package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.color.Color;
import AbstractFactoryPattern.shape.Shape;

/**
 * Created by ahmetatalay on 01/08/16.
 */
public abstract class AbstractFactory  {
    public abstract Color getColor(Object color);
    public abstract Shape getShape(Object shape);
}
