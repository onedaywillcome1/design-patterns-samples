package FactoryPattern.shape;

/**
 * Created by ahmetatalay on 01/08/16.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle:draw() method");
    }
}
