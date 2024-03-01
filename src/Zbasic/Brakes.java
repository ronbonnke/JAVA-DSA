package Zbasic;

public interface Brakes {
    public default void start(){
        System.out.println(" my car starts ");
    }
    public default void stop(){
        System.out.println(" my car stops ");
    }
}
