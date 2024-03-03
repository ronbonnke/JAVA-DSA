package REVISION;

public class CdPlayer implements Music{
    @Override
    public void start() {
        System.out.println("Music  starts");
    }

    @Override
    public void stop() {
        System.out.println(" Music stops");
    }
}
