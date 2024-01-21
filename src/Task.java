public class Task implements Runnable{
    private final String name;

    public Task(int number) {
        this.name = String.valueOf(number);
    }

    @Override
    public void run() {
        try {
            System.out.println("Task " + name + " is running by " + Thread.currentThread().getName() + "...");
            Thread.sleep(1000);
            System.out.println("Task " + name + " was completed in one second...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
