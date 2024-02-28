package INTERFACES;

public class Main {
    public static void main(String[] args) {

//        Car obj = new Car();
//        obj.brake();
//        obj.acc();
//        obj.start();
//        obj.stop();
//
//        Media mus = new CDPlayer();
//        mus.start();
//        mus.stop();
//
//        PowerEngine pow = new PowerEngine();
//        pow.acc();
//        pow.start();
//        pow.stop();


//        NiceCar car = new NiceCar();
//        car.start();
//        car.StartMusic();
//        car.UpgradeEngine();
//        car.start();
        ElectricEngine engine = new ElectricEngine();
        NiceCar car1 = new NiceCar(engine);
            car1.start();
            car1.StartMusic();
            car1.StopMusic();
            car1.UpgradeEngine();
            car1.start();

            PowerEngine engine2 = new PowerEngine();
        NiceCar car2 = new NiceCar(engine2);
            car2.start();
        car2.StopMusic();


    }
}