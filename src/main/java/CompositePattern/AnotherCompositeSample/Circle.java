package CompositePattern.AnotherCompositeSample;

/**
 * Created by ahmetatalay on 03/08/16.
 */
public class Circle implements Shape{
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Circle with Color "+ fillColor);
    }
}
