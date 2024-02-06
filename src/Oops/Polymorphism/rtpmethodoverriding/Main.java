package Oops.Polymorphism.rtpmethodoverriding;

public class Main extends Object{

    public static void main(String[] args) {
        Shapes shape1 = new Circle();
        shape1.shape();
        shape1.color();
        Shapes shape2 = new Rectangle();

        fun("Stephen");
       int res= fun(20);
        System.out.println(res);

    }

    static void fun(String name){
        System.out.println(name);
    }
    static int fun(int num){
        return num +1;
    }
}
