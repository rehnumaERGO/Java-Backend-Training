package Day7_Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {
    public static void main(String[] args) {
        // ExecutorService executorService = Executors.newSingleThreadExecutor();
        // executorService.execute(new Task1());
        // executorService.execute(new Thread(new Task2()));

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));

        executorService.shutdown();
    }
}
