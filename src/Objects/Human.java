package Objects;

public class Human {
    int age;
    int salary;
    String name;

    int get(){
        return age;
    }


    Human(int years, int wage, String nam){
        this.age = years;
        this.salary = wage;
        this.name = nam;

    }
    Human(Human prev){
        this.name = prev.name;
        this.salary= prev.salary;
        this.age = prev.age;
    }
}

