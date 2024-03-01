package OOPS.Polymorphism.RTPmethoverriding;

public class Rectangle extends Shapes{
    void shape(){
        System.out.println("i am rectangular");
    }


    void size(){
        System.out.println("I am small");
    }

    @Override
    void color() {

    }

}
