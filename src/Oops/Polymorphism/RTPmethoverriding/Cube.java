package Oops.Polymorphism.RTPmethoverriding;

public class Cube extends Shapes{
    void shape(){
        System.out.println("I am cube");
    }

    @Override
    void color() {
        System.out.println("greenish");
    }

    @Override
    void size() {
        System.out.println("100");
    }
}
