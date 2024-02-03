package Oops.Inhertance;

public class Box {
    int l;
    int h;
    int w;
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
