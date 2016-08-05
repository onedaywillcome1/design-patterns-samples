package Inheritance;

/**
 * Created by ahmetatalay on 04/08/16.
 */
public class ClassB extends ClassA{
    public int i = 5;
    public ClassB(String str){
        super("B");
        System.out.println("Constructor"+str);
    }

    String s = "Class B str";

    {
        System.out.println(super.s);
    }

    @Override
    public void doSomething(){
        System.out.println("ClassB doSomething");
    }

    {
        System.out.println(222);
    }

    public static int j=20;

}