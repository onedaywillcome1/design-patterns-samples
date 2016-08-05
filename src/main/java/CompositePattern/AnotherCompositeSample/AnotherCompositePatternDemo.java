package CompositePattern.AnotherCompositeSample;

/**
 * Created by ahmetatalay on 03/08/16.
 */
public class AnotherCompositePatternDemo {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape circle = new Circle();

        DrawingComposite drawingComposite = new DrawingComposite();
        drawingComposite.addShape(triangle);
        drawingComposite.addShape(triangle);
        drawingComposite.addShape(circle);
        drawingComposite.draw("Red");

        drawingComposite.clearShapes();

        drawingComposite.addShape(circle);
        drawingComposite.addShape(circle);
        drawingComposite.addShape(triangle);
        drawingComposite.draw("Green");
    }
}
