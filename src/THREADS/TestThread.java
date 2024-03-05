package THREADS;

public class TestThread {
    public static void main(String[] args) {
        System.out.println("I am main started");
        Thread thread1 = new Thread1("Thread1");
        thread1.setDaemon(true);
        thread1.start();
        Runnable thread2 = new Thread2();
        thread2.run();
        System.out.println("I am main ended");
    }
}
