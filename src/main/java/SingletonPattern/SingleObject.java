package SingletonPattern;

/**
 * Created by ahmetatalay on 01/08/16.
 */
public class SingleObject {

    private static SingleObject instance = null;

    private SingleObject(){}

    public static SingleObject getInstance(){
        if (instance ==null){
            instance = new SingleObject();
        }
        return instance;
    }

    public  void showMessage(){
        System.out.println("Single Object class");
    }
}
