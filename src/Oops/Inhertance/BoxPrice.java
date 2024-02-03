package Oops.Inhertance;

public class BoxPrice extends BoxWeight{
    int rate;
    BoxPrice(){
        super();
        this.rate = 10;
    }
    BoxPrice(int l, int h, int w, int weight, int rate){
        super(l,h,w,weight);
        this.rate = rate;
    }
}
