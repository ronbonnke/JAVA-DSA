package REVISION;

public class NewCar {
    private Car c;
    private CdPlayer play;
    NewCar(){
        c = new Car();
        play = new CdPlayer();
    }
    void start(){
        c.start();
    }
    void stop(){
        c.stop();
    }
    void Musicstart(){
        play.start();
    }
    void Musicstop(){
        play.stop();
    }
    void brake(){
        c.brake();
    }


}
