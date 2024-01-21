import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threads {
    public static void main(String[] args) {
        // ============== First task ================
        Thread thread1 = new Thread(() -> System.out.println("It's first thread..."));
        ThreadExample thread2 = new ThreadExample("second thread");

        thread1.start();
        thread2.start();

        // ============== Second task ================
        SynchronizedMethodExample synchronizedMethodExample = new SynchronizedMethodExample();
        Runnable runnable = synchronizedMethodExample::soutInfo;

        Thread thread3 = new Thread(synchronizedMethodExample::soutInfo, "third thread");
        Thread thread4 = new Thread(runnable, "fourth thread");

        thread3.start();
        thread4.start();

        // ============== Third task ================
        ExecutorService executor = Executors.newCachedThreadPool();

        // ============== Fourth task ================
        for (int i = 0; i < 5; i ++) {
            executor.submit(new Task(i));
        }
        executor.shutdown();
    }
}
