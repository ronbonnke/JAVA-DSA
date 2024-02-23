package Thread;

public class TestThread {
    public static void main(String[] args) {



        Thread1 thread = new Thread1();
        thread.start();
        System.out.println("I am main ended");





        System.out.println("I am main started");
    }
}
