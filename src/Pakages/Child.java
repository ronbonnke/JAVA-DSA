package Pakages;

public class Child extends Human{
    String food;
   Child(int age, int salary, String gender, String name, String food){
       super(age, name, salary, gender);
       this.food = food;

   }
   Child(){
       this.food="cereal";
   }



}
