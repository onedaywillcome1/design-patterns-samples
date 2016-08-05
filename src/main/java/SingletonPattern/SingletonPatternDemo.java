package SingletonPattern;

/**
 * Created by ahmetatalay on 01/08/16.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }
}
