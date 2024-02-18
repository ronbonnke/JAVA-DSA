package Singleton;

public class Main {
    public static void main(String[] args) {
    }
        Singleton obj = Singleton.getInstance();

        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        // all 3 reference are pointing to one object only
}
