package Oops.Abstract;

public class Son extends Parent {

    public Son(int age){
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be a coder");
    }

    @Override
    public void partner() {
        System.out.println("I love wonder woman ");
    }
    public void greet(){
        System.out.println("hello everyone");
    }
}
