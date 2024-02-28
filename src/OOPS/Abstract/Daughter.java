package OOPS.Abstract;

public class Daughter extends Parent {

    Daughter(int age){
        super(age);
    }
    @Override
    void career() {
        System.out.println("I am going to be a model designer");
    }

    @Override
    public void partner() {
        System.out.println("I love spiderman");
    }
    public void greet(){
        System.out.println("hello everyone");
    }
}
