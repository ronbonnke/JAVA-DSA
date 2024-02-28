package OOPS.Inheritance;

public class BoxColor extends BoxWeight{
     String color;

     BoxColor(){
         super();
         this.color = "blue";
     }
     BoxColor(String color){
         this.color= color;
     }
}
