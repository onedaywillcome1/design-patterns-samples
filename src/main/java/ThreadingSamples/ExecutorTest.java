package ThreadingSamples;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by ahmetatalay on 18/08/16.
 */
public class ExecutorTest {
    public static void main(String[] args) {

        List<Future> tasks = new ArrayList<>();
        ExecutorService executors = Executors.newFixedThreadPool(10);

        for(int i =0; i< 10; i++){
            int finalI = i;
            Future f = executors.submit(() -> {
               run(finalI);
            });
            tasks.add(f);
        }
        waitTasks(tasks,executors);

    }

    public static void waitTasks( List<Future> tasks,ExecutorService executors ){
        try {
            for (Future task : tasks) {
                task.get();
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            tasks.clear();
            executors.shutdown();
        }
    }

    public static void run(int i){
        System.out.println("Test "+ i);
    }
}
