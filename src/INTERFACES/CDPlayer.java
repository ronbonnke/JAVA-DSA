package INTERFACES;

public class CDPlayer implements Media{

    @Override
    public void start() {
        System.out.println("start my music");
    }

    @Override
    public void stop() {
        System.out.println("stop my music");
    }
}
