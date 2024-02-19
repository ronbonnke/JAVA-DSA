package Oops.Inhertance;

public class BoxWeight extends Box{
    int weight;
    int side;



    BoxWeight(){
        super();
        this.weight = 1;

    }
    BoxWeight(int l ,int h,int w, int weight){
       super(l,h,w);
        this.weight = weight;
    }
    BoxWeight(int h , int w, int weight){
        super(h , w);
        this.weight = weight;
    }
    BoxWeight(int side){
        this.side=side;
    }

}
