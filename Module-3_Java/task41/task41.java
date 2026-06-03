import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class task41 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        List<Future<Integer>> futures = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            final int taskId = i;
            Callable<Integer> callable = () -> {
                int result = taskId * taskId;
                System.out.println("Task " + taskId + " executed by " +
                                   Thread.currentThread().getName() +
                                   " -> result = " + result);
                Thread.sleep(100);
                return result;
            };
            futures.add(executor.submit(callable));
        }

        System.out.println("\nCollecting results...\n");
        int total = 0;
        for (int i = 0; i < futures.size(); i++) {
            try {
                int result = futures.get(i).get();
                System.out.println("Future " + (i + 1) + " result: " + result);
                total += result;
            } catch (Exception e) {
                System.out.println("Error retrieving result: " + e.getMessage());
            }
        }

        System.out.println("\nSum of all results: " + total);
        executor.shutdown();
    }
}
