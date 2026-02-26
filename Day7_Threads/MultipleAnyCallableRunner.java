package Day7_Threads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        List<CallableTask> tasks = List.of(new CallableTask("Mickie"), new CallableTask("Donkey"),
                new CallableTask("Goofy"));
        String result = executorService.invokeAny(tasks);

        System.out.println(result);

        executorService.shutdown();
    }
}
