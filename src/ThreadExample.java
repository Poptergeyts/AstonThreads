public class ThreadExample extends Thread{
    public ThreadExample(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("It's " + getName() + "...");
    }
}
