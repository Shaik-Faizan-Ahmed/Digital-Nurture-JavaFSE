import java.util.ArrayList;
import java.util.List;

public class task40 {
    public static void main(String[] args) throws InterruptedException {
        int threadCount = 100_000;

        System.out.println("Launching " + threadCount + " virtual threads...");

        long startVirtual = System.currentTimeMillis();
        List<Thread> virtualThreads = new ArrayList<>();

        for (int i = 0; i < threadCount; i++) {
            Thread vt = Thread.startVirtualThread(() -> {
                String msg = "Hello from " + Thread.currentThread();
                _ = msg;
            });
            virtualThreads.add(vt);
        }

        for (Thread t : virtualThreads) {
            t.join();
        }

        long virtualTime = System.currentTimeMillis() - startVirtual;
        System.out.println("Virtual threads done in: " + virtualTime + " ms");

        System.out.println("\nLaunching " + threadCount + " platform threads...");

        long startPlatform = System.currentTimeMillis();
        List<Thread> platformThreads = new ArrayList<>();

        for (int i = 0; i < threadCount; i++) {
            Thread pt = new Thread(() -> {
                String msg = "Hello from " + Thread.currentThread();
                _ = msg;
            });
            platformThreads.add(pt);
            pt.start();
        }

        for (Thread t : platformThreads) {
            t.join();
        }

        long platformTime = System.currentTimeMillis() - startPlatform;
        System.out.println("Platform threads done in: " + platformTime + " ms");

        System.out.println("\n--- Performance Comparison ---");
        System.out.println("Virtual  threads: " + virtualTime + " ms");
        System.out.println("Platform threads: " + platformTime + " ms");
        System.out.println("Virtual threads are ~" + (platformTime / Math.max(virtualTime, 1)) + "x faster.");
    }
}
