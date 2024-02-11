package Zbasic;

import java.util.Scanner;


// Example 1  :normal condition writing { if , else }

//  public class Conditions {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int age =  sc.nextInt();
//
//        if(age > 18) {
//            System.out.println("adult");
//        } else {
//            System.out.println("grow up kid");
//        }
//    }
//}


// Example 2 { if , else }

//public class Conditions {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//
//        if(x % 2 == 0) {
//            System.out.println("even");
//        } else {
//            System.out.println("odd");
//        }
//    }
//}


// example 3   { if , else if }

//  public class Conditions {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if(a == b) {
//            System.out.print("both are equal");
//        } else {
//            if(a > b) {
//                System.out.println("a is greater");
//            } else {
//                if(a < b) {
//                    System.out.println("a is lesser");
//                }
//            }
//        }
//    }
//}


//Example 4 { if , else if , else }

//  public class Conditions {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if(a == b) {
//            System.out.print("both are equal");
//        } else if(a > b) {
//                System.out.println("a is greater");
//            } else {
//            System.out.println("a is lesser");
//        }
//    }
//}

//Example 5  { switch , break }

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("namste");
                break;
            case 3 :
                System.out.println("bonjour");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}


