package CompositePattern.AnotherCompositeSample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahmetatalay on 03/08/16.
 */
public class DrawingComposite implements Shape {

    private List<Shape> shapeList = new ArrayList<Shape>();
    @Override
    public void draw(String fillColor) {
        for (Shape sh : shapeList){
            sh.draw(fillColor);
        }
    }

    public void addShape(Shape s){
        this.shapeList.add(s);
    }

    public void removeShape(Shape s){
        this.shapeList.remove(s);
    }

    public void clearShapes(){
        System.out.println("Clearing all the shapes from drawing");
        this.shapeList.clear();
    }

}
