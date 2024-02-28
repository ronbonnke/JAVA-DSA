package OOPS.Polymorphism.RTPmethoverriding;

public class Main extends Object{

    public static void main(String[] args) {
        Shapes shape1 = new Cube();
        shape1.shape();
        shape1.color();
        shape1.size();

        Shapes shape2 = new Rectangle();
        shape2.size();
        shape2.shape();
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
