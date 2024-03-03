package REVISION;

public class Car implements Engine, Brakes{
    @Override
    public void stop() {
        System.out.println("Car stops moving ");
    }

    @Override
    public void start() {
        System.out.println("Car starts moving");
    }
    public void brake(){
        System.out.println("Car brakes ");
    }
}
