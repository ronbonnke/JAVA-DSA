package Singleton;

public class Singleton {
    int num = 0;
private static Singleton instance;

    public static Singleton getInstance() {

        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}