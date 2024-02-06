package Oops.Polymorphism.rtpmethodoverriding;

public class Circle extends Shapes{

    @Override
       void shape(){
        System.out.println("I am circle");
    }

    void color(){
        System.out.println("I am red");
    }

    @Override
    void size() {

    }
}
