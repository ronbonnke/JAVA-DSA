package Oops.Inhertance;

public class Box extends Object{

    int l;
    int h;
    int w;
    static int p = 35;
    public static void fun(){
        System.out.println(" I am a box");
    };

    Box(){
        this.l = 1;
        this.h =1;
        this.w =1;

    }
    Box(int l, int h , int w){
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(int h , int w){
        this.h = h;
        this.w= w;

    }
}
