package OOPS.Inheritance;

public class BoxWeight extends Box{
    int weight;
    int side;
    String color;


    BoxWeight(){
        super();
        this.weight = 1;
        this.color = "Blue";
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
