package THREADS;

public class TestThread {
    public static void main(String[] args) {

        System.out.println("I am main started");

        Thread thread1 = new Thread1("thread1");
        thread1.setDaemon(true);
        thread1.start();

        System.out.println("I am main ended");

    }
}
