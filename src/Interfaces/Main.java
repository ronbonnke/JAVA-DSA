package Interfaces;

public class Main {
    public static void main(String[] args) {

        Car obj = new Car();
        obj.brake();
        obj.acc();
        obj.start();
        obj.stop();

        Media mus = new CDPlayer();
        mus.start();
        mus.stop();

        PowerEngine pow = new PowerEngine();
        pow.acc();
        pow.start();
        pow.stop();

    }
}