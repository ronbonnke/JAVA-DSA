package Zbasic;

public class Overloading {
    public static void main(String[] args) {
        fun(20);
        fun("bonnke");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}


// when two or more function having same function name is called Overloading
//or
//calling the function name many times is called method overloading or function overloading