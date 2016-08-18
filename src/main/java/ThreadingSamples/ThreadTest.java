package ThreadingSamples;

import java.util.concurrent.TimeUnit;

/**
 * Created by ahmetatalay on 18/08/16.
 */
public class ThreadTest implements Runnable {
    private String myName;

    ThreadTest(String name) {
        this.myName = name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start. Command = "+myName);
        processCommand();
        System.out.println(Thread.currentThread().getName()+" End.");
    }

    public void runWithoutThread(){
        System.out.println("Start. Command = "+myName);
        processCommand();
        System.out.println("End.");
    }
    private void processCommand() {
        try {
            long seconds = TimeUnit.SECONDS.toMillis(2);
            System.out.println(seconds+ " seconds waiting..");
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "ThreadTest{" +
                "myName='" + myName + '\'' +
                '}';
    }
}
