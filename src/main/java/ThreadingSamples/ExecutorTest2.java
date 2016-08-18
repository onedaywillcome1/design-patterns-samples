package ThreadingSamples;

import java.util.concurrent.*;

/**
 * Created by ahmetatalay on 18/08/16.
 */
public class ExecutorTest2 {
    public static void main(String[] args) {
        runExecutor();
//        runWithoutExecutor();
    }

    public static void runExecutor(){
        ExecutorService executor = Executors.newFixedThreadPool(50);
        for (int i = 0; i < 50; i++) {
            executor.execute( new ThreadTest("" + i));
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }

    public static void runWithoutExecutor(){
        for (int i = 0; i < 50; i++) {
            new ThreadTest("" + i).runWithoutThread();
        }
        System.out.println("Finished all threads");
    }
}
