package Inheritance;

/**
 * Created by ahmetatalay on 04/08/16.
 */
public class ClassA {
    public int i = 3;
    String s = "Class A str";

    public ClassA(String str){
        System.out.println("Constructor"+str);
    }
    public void doSomething(){
        System.out.println("ClassA doSomething");
    }

    {
        System.out.println(111);
    }


    public static int j=10;

}

