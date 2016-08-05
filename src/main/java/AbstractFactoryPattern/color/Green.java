package AbstractFactoryPattern.color;

/**
 * Created by ahmetatalay on 01/08/16.
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green:fill() method");
    }

}
