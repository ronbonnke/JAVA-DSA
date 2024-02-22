package Oops.Polymorphism.RTPmethoverriding;

public class Rectangle extends Shapes{
    void shape(){
        System.out.println("i am rectangular");
    }

    @Override
    void color() {

    }

    void size(){
        System.out.println("I am small");
    }
}
