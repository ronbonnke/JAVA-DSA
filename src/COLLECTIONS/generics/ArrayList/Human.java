package COLLECTIONS.generics.ArrayList;

public class Human {
    int age;
    String name;
    float salary;


    Human(){
        this.age = 20;
        this.name = "bonnke";
        this.salary = 520.54f;
    }
    Human(int age, String name, Float salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Human hu = new Human();
        System.out.println(hu.salary);
    }

}
