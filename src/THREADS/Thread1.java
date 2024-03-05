package THREADS;

public class Thread1 extends Thread {

    public Thread1(String threadName){
        super(threadName);
    }


    @Override
    public void run() {
        synchronized (this){
            for (int i = 0; i < 5; i++) {
                System.out.println("inside "+ Thread.currentThread() +" " + i);
            }
        }

    }
}
