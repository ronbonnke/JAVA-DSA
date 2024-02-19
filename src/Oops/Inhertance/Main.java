package Oops.Inhertance;

public class Main extends Object{
    public static void main(String[] args)  {

//        Box box1 = new Box(20,20,20);
////        System.out.println(box1.l);

        Box box2 = new BoxWeight(25,25,25,25);

//        int weight = box2.weight;
//        System.out.println(weight +" weight");
//        BoxWeight box3 = new BoxWeight(20,20,20);
//        System.out.println(box3.weight);


        BoxWeight box4 = new BoxPrice();
        System.out.println(box4.weight);

        BoxPrice box0 = new BoxPrice();
        System.out.println(box0.l);

        BoxPrice box10 = new BoxPrice(50,50,50,500,50);
        System.out.println(box10.rate +" "+ box10.weight);

        BoxWeight box15 = new BoxPrice(200,130);
        System.out.println(box15.side+" "+box15.weight+"kg");


    }
}
