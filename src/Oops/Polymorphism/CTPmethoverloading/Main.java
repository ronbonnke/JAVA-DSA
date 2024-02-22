package Oops.Polymorphism.CTPmethoverloading;

public class Main {

    public static void main(String[] args) {
        int a= 20;
        int b =  30;
        int c = 10;
        double a1 = 1;
        int a2 = 2;
        String name = " ron";

        sum(a, b);
        sum(name,a);
        sum(a, b, c);
        double res = sum( a1, a2);
        System.out.println(res);
    }
    static void sum(int a , int b){
        System.out.println(a+b);
    }
    static void sum(int a, int b , int c){
        System.out.println(a+b+c);
    }
    static void sum(String name, int a){
        System.out.println("My name is "+ name+ " And i am "+ a);
    }
    static double sum(double a, int b){
        return a+ b;
    }

}
