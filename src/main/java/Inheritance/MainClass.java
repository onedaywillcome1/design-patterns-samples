package Inheritance;

/**
 * Created by ahmetatalay on 04/08/16.
 */
public class MainClass
{
    public static void main(String[] args)
    {
        System.out.println("----ClassA var1 = new ClassA()----");
        ClassA var1 = new ClassA("X");
        System.out.println(var1.i);     // Prints 3
        var1.doSomething();             //Prints Class A
        System.out.println(var1.s);
        System.out.println(var1.j);

        System.out.println();

        System.out.println("----ClassB var2 = new ClassB()----");
        ClassB var2 = new ClassB("Y");
        System.out.println(var2.i);     // Prints 5
        var2.doSomething();             //Prints Class B
        System.out.println(var2.s);
        System.out.println(var2.j);

        System.out.println();

        System.out.println("----ClassA var3 = new ClassB()----");
        ClassA var3 = new ClassB("Z");
        System.out.println(var3.i);     // Prints 3
        var3.doSomething();            // Prints Class B
        System.out.println(var3.s);
        System.out.println(var3.j);

        System.out.println();

        System.out.println("----ClassC var4 = new ClassC()----");
        ClassC var4 = new ClassC("XX");
        System.out.println(var4.i);     // Prints 7
        var4.doSomething();            // Prints Class C
        System.out.println(var4.s);
        System.out.println(ClassC.j);

        System.out.println();

        System.out.println("----ClassB var5 = new ClassC()----");
        ClassB var5 = new ClassC("YY");
        System.out.println(var5.i);     // Prints 5
        var5.doSomething();            // Prints Class C
        System.out.println(var5.s);
        System.out.println(ClassB.j);

        System.out.println();

        System.out.println("----ClassA var6 = new ClassC()----");
        ClassA var6 = new ClassC("ZZ");
        System.out.println(var6.i);     // Prints 3
        var6.doSomething();            // Prints Class C
        System.out.println(var6.s);
        System.out.println(ClassA.j);

    }
}