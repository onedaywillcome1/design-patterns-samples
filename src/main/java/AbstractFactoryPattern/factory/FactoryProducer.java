package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.color.Color;
import AbstractFactoryPattern.shape.Shape;

/**
 * Created by ahmetatalay on 01/08/16.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(Object factoryType){
        if (factoryType.equals(ShapeFactory.class)){
            return new ShapeFactory();
        }
        if (factoryType.equals(ColorFactory.class)){
            return new ColorFactory();
        }
        return null;
    }
}
