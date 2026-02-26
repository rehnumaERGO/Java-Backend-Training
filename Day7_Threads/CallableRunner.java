package Day7_Threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> welcomeFuture = executorService.submit(new CallableTask("Mickie"));
        System.out.println("\n New CallableTask(\"Mickie\") executed");
        String welcomeMessage = welcomeFuture.get();
        System.out.println(welcomeMessage);
        System.out.println("\nMain completed");
    }
}
