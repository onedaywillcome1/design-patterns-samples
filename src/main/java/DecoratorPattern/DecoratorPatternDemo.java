package DecoratorPattern;

/**
 * Created by ahmetatalay on 03/08/16.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        String redColor = "red";
        String blueColor = "blue";
        String greenColor = "green";

        Shape circle = new Circle();
        Shape decoratedCircle = new ShapeDecorator(new Circle(),redColor);
        Shape decoratedRectangle = new ShapeDecorator(new Rectangle(),blueColor);

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle with "+ redColor.toUpperCase()+" border");
        decoratedCircle.draw();

        System.out.println("\nRectangle with "+blueColor.toUpperCase() +" border");
        decoratedRectangle.draw();

        decoratedCircle = new ShapeDecorator(new Circle(),greenColor);
        System.out.println("\nCircle with "+ greenColor.toUpperCase()+" border");
        decoratedCircle.draw();
    }
}
