package Zbasic.prac;

public class Shadowing {
    static int x = 50;  //initializing class variable:  line 7 is shadowed here
         public static void main(String[] args) {
             System.out.println(x); // 10
             int x = 90; //initializing local variable:   class variable at line 4 is shadowed here
             System.out.println(x); // 90
            fun();
         }
         static void fun(){
        System.out.println(x); // print 10  because it is outside the method/function
    }
}
