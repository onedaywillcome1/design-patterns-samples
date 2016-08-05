package DecoratorPattern;

/**
 * Created by ahmetatalay on 03/08/16.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape:Rectangle::draw()");
    }
}
