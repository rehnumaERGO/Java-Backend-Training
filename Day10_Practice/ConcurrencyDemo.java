package Day10_Practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Using Threads directly
        Thread t1 = new Thread(new MyTask(counter));
        Thread t2 = new Thread(new MyTask(counter));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Unsafe count (no sync): " + counter.count);
        System.out.println("Synchronized/Locked count: " + counter.syncCount);
        System.out.println("Atomic count: " + counter.atomicCount);

        System.out.println("\n--- Now using ExecutorService ---");

        // Using ExecutorService (thread pool)
        Counter poolCounter = new Counter();
        ExecutorService executor = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 4; i++) {
            executor.execute(new MyTask(poolCounter));
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
            // wait for all tasks to finish
        }

        System.out.println("ExecutorService Unsafe count: " + poolCounter.count);
        System.out.println("ExecutorService Synchronized/Locked count: " + poolCounter.syncCount);
        System.out.println("ExecutorService Atomic count: " + poolCounter.atomicCount);
    }
}