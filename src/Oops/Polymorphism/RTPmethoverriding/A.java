package Oops.Polymorphism.RTPmethoverriding;

public class A {
    int a =10;
    public void color(){
        System.out.println("yellow");
    }
    public void size(){
        System.out.println("20");
    }
}
 class B extends  A{
     @Override
    public void color(){
        System.out.println("green");
    }
    public void size(){
         System.out.println("10");
    }
}




        class result{
            public static void main(String[] args) {
                A obj = new B();
                obj.color();
                obj.size();

            }
        }
