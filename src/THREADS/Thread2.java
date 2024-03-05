package THREADS;

public class Thread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("I am tread2 prints "+i );
        }
    }
}
