package DecoratorPattern;

/**
 * Created by ahmetatalay on 03/08/16.
 */
public class ShapeDecorator implements Shape {

    private  Shape decoratedShape;
    private String color;

    @Override
    public void draw() {
        decoratedShape.draw();
        setBorder(color);
    }

    public ShapeDecorator(Shape decoratedShape,String color) {
        this.decoratedShape = decoratedShape;
        this.color = color;
    }

    public void setBorder(String color){
        System.out.println("Border is colored with : "+ color.toUpperCase());
    }

}
