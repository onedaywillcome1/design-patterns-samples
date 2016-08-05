package Inheritance;

/**
 * Created by ahmetatalay on 04/08/16.
 */
public class ClassC extends ClassB {
    public int i = 7;

    public ClassC(String str){
        super("C");
        System.out.println("Constructor"+str);
    }

    String s = "Class C str";

    {
        System.out.println(super.s);
    }

    @Override
    public void doSomething(){
        System.out.println("ClassC doSomething");
    }

    {
        System.out.println(333);
    }

    public static int j=30;

}
