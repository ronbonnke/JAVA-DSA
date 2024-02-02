package Pakages;

public class Human {
    int age;
    String name;
    int salary;
    String gender;
    Human(){
        this.name="default name";
        this.age= 1;
        this.salary=0;
        this.gender="male";

    }
    Human(int age,
    String name,
    int salary,
    String gender){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.gender= gender;
    }

}


