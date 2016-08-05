package CompositePattern.AnotherCompositeSample;

/**
 * Created by ahmetatalay on 03/08/16.
 */
public class Triangle implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with Color "+ fillColor);
    }
}
