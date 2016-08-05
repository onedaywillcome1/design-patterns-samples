package FacadePattern;

/**
 * Created by ahmetatalay on 03/08/16.
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.drawAllShapes();
    }
}
