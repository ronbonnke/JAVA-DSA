package INTERFACES;

public class ElectricEngine implements Engine{


    @Override
    public void stop() {
        System.out.println("Electric engine stop");
    }

    @Override
    public void start() {
        System.out.println("Electric engine starts");
    }
    @Override
    public void acc() {
        System.out.println("Electric engine accelerate");
    }


}


