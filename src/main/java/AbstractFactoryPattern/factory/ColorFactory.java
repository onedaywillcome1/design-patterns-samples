package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.color.*;
import AbstractFactoryPattern.shape.*;

/**
 * Created by ahmetatalay on 01/08/16.
 */
public class ColorFactory extends AbstractFactory  {
    @Override
    public Color getColor(Object color) {
        if (color.equals(Red.class)){
            return new Red();
        }
        if (color.equals(Blue.class)){
            return new Blue();
        }
        if (color.equals(Green.class)){
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(Object shape) {
        return null;
    }

}
