package AbstractFactoryPattern.shape;

/**
 * Created by ahmetatalay on 01/08/16.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle:draw() method");
    }
}
