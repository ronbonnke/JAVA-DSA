package Zbasic.prac;
import java.util.Scanner;

//public class Switch {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String fruits = sc.nextLine();
//
//        switch(fruits){
//            case "mango":
//                System.out.println("King of all fruits");
//                break;
//            case "Apple":
//                System.out.println("Red Color fruit");
//                break;
//            case "Orange":
//                System.out.println("round fruit");
//                break;
//            case "grapes":
//                System.out.println("small fruit");
//                break; // break is used to terminate
//            default:
//                System.out.println("enter a valid fruit");
//                // no need to add break
//        }
//    }
//}



// simple terms

//public class Switch {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String fruits = sc.nextLine();
//
//        switch (fruits) {
//            case "mango" -> System.out.println("King of all fruits");
//            case "Apple" -> System.out.println("Red Color fruit");
//            case "Orange" -> System.out.println("round fruit");
//            case "grapes" -> System.out.println("small fruit");
//            default -> System.out.println("enter a valid fruit");
//
//            // no need to add break
//        }
//    }
//}


public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();

        switch (days){
            case 1, 2, 3, 4, 5 -> System.out.println("weekdays");
            case 6, 7 -> System.out.println("weekend");
        }
    }
}

