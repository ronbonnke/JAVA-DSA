package Oops;

public class Box {
    public static void main(String[] args) {

//        Human human1 = new Human();
//        human1.age=22;
//        human1.name="Ron";
//        human1.gender="male";
//        System.out.println(human1.age+" "+ human1.name+" "+human1.gender);


        Human human2 = new Human(20,"ron","Male");
        System.out.println(human2.age+" "+ human2.name+" "+human2.gender);

        Human human3 = new Human();
        Human human4 = new Human();
//        System.out.println(human3.name);
//        System.out.println(human4.name);
        Human human5 = new Human(human2);
        System.out.println(human5.age);


    }

}

class Human{
    int age;
    String name;
    String gender;
    Human(int age, String name1, String gender1){
        this.age= age;
        this.name = name1;
        this.gender= gender1;
    }
    Human(){
        this.age=  25;
        this.name= "Step";
        this.gender="Male";
    }
    Human(Human other){
        this.age = other.age;
        this.name= other.name;
        this.gender = other.gender;
    }

}
