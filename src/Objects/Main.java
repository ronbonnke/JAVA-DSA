package Objects;

public class Main {
    public static void main(String[] args) {
       Student rollno1 = new Student(20,"ron");
       Student rollno2 = new Student(32,"stephen");
       Student rollno3 = new Student(rollno2);
       rollno3.name = "ron";
//        System.out.println(rollno3.name);
//        System.out.println(rollno2.name);
        Student rollno4 = rollno3;

        rollno3.name="deved";

        System.out.println(rollno4.name);
        System.out.println(rollno3.name);

        Student rollno5 = new Student(rollno1);
        rollno5.age = 15;
        System.out.println(rollno5.age);

        Student rollno6 = rollno1;
        rollno6.age = 45;
        System.out.println(rollno1.age);
        System.out.println(rollno6.age);
    }
}