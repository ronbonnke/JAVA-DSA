package Zbasic;


public class car implements model, engine, Brakes {

    @Override
    public void start() {
        engine.super.start();
    }

    @Override
    public void stop() {
        engine.super.stop();
    }

}
