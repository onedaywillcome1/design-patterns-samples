package CollectionsDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahmetatalay on 09/08/16.
 */
public class GenericsDemo {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>(10);
        Box<String> stringBox = new Box<String>("Hello World");

        System.out.println("Integer Value of Box: "+ integerBox.getT());
        System.out.println("String Value of Box: "+ stringBox.getT());
        Box.add(integerBox.getT());
        Box.add(stringBox.getT());
        System.out.println(Box.boxList);
    }

    public static class Box<T>{
        private T t;
        private static ArrayList boxList = new ArrayList();

        public Box(T t){
            this.t = t;
        }

        public static  <T> void add(T t){
            boxList.add(t);
        }

        public List<T> getBoxList() {
            return boxList;
        }

        public T getT(){
            return t;
        }
    }
}
