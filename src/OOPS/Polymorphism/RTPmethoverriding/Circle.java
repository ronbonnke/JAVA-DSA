package OOPS.Polymorphism.RTPmethoverriding;

public class Circle extends Shapes{

    @Override
       void shape(){
        System.out.println("I am circle");
    }
    @Override
    void color(){
        System.out.println("I am red");
    }

    @Override
    void size() {
        System.out.println("200");
    }
}
