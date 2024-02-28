package OOPS.Abstract;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(21);
        System.out.println(son.age);
        son.career();
        son.partner();
        son.greet();

        Daughter daughter = new Daughter(20);
        System.out.println(daughter.age);
        daughter.career();
        daughter.partner();
        daughter.greet();


    }
}
