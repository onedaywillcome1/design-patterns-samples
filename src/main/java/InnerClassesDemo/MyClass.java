package InnerClassesDemo;

/**
 * Created by ahmetatalay on 09/08/16.
 */
class OuterDemo{
    private int num = 175;
    InnerDemo innerDemo = new InnerDemo();

    void showMyMethod(){
        innerDemo.my_Method();
    }

    void displayInner(){
        innerDemo.print();
    }

    void printGetNum(){
        System.out.println(innerDemo.getNum());
    }

    void printStaticMyMethod(){
        StaticInner.my_Method();
    }
    private class InnerDemo{
        void my_Method(){
            int my_Num= 23;
            class Method_Inner{
                public void print(){
                    System.out.println("This is method of inner: "+ my_Num);
                }
            }
            Method_Inner inner = new Method_Inner();
            inner.print();
        }

        int getNum(){
            System.out.println("Ths is the getNum() method of innerDemo");
            return num;
        }
        void print(){
            System.out.println("This is an inner class");
        }
    }

    private static class StaticInner{
        public static void my_Method(){
            System.out.println("This is static inner class");
        }
    }
}

abstract class AnonymousInner{
    public abstract void myMethod();
}

interface Message{
    String greet(String title);
}

public class MyClass {

    public static void main(String[] args) {
        OuterDemo outerDemo = new OuterDemo();
        outerDemo.displayInner();
        outerDemo.printGetNum();
        outerDemo.showMyMethod();
        outerDemo.printStaticMyMethod();

        AnonymousInner inner = new AnonymousInner() {
            @Override
            public void myMethod() {
                System.out.println("This is an example of anonymous inner class");
            }
        };

        inner.myMethod();

        MyClass myClass = new MyClass();
        myClass.displayMessage(new Message() {
            @Override
            public String greet(String title) {
                return "Hello "+title;
            }
        });
    }

    void displayMessage(Message message){
        System.out.println(message.greet("Ahmet") + " , This is an example of anonymous inner class as an argument");
    }

}

