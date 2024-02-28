package INTERFACES.extendDemo1;


public class Main implements A, B {
    @Override
    public void fun() {
        System.out.println("have fun");
    }
    public void greet(){
        System.out.println("hello");
    }
}
