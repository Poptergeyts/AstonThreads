public class SynchronizedMethodExample {
    public synchronized void soutInfo() {
        System.out.println("This method is called by the " + Thread.currentThread().getName() + "...");
    }
}
