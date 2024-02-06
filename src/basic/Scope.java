package basic;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        lol(a);

        // block scope
        {
            a = 50;
            int c = 80;
            System.out.println(a);
            System.out.println("c: "+c);

        }
        int c = 10;
        System.out.println("c: "+c);
        System.out.println(a);
    }

    // function scope
    static void lol(int a){
        a = 5;
        System.out.println(a);
    }
}