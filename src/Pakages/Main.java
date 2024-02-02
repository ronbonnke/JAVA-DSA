package Pakages;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.name = " ron";
        System.out.println(human1.name);
        Child child1 = new Child();
        child1.food="food";
        child1.age=5;

        System.out.println(child1.food);
        System.out.println(child1.age);
        Child child2 = new Child(3,0,"male","ron","milk");
        System.out.println(child2.age);
    }
}
