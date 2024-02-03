package Objects;

public class Student {
    int age;
    String name;
    Student(int age , String name){
        this.age = age;
        this.name = name;
    }
    Student(Student old){
        this.age = old.age;
        this.name = old.name;
    }
}
