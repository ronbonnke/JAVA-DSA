package Zbasic;

public interface engine {

    public default void start(){
        System.out.println(" engine starts ");
    }
    public default void stop(){
        System.out.println(" engine stops ");
    }
    public default void accelerate(){
        System.out.println(" my engine accelerates");
    }

}
