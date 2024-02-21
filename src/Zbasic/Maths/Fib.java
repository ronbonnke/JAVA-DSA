package Zbasic.Maths;

import java.util.Scanner;


// Example 1

//  public class Fib {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        int count = 2;
//
//        while (count <= n){
//            int temp = b;
//            b = b+a;
//            a = temp;
//            count++;
//        }
//        System.out.println(b);
//    }
//}





// Example 2

//public class Fib {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        if (n <= 0) {
//            System.out.println("Please enter a positive integer.");
//            return;
//        }
//
//        int a = 0;
//        int b = 1;
//        int count = 2;
//
//        System.out.print(a + " " + b + " "); // Printing the first two terms
//
//        while (count < n) {
//            int temp = b;
//            b = b + a;
//            a = temp;
//            count++;
//            System.out.print(b + " "); // Print each term in the series
//        }
//    }
//}


// Example 3


public class Fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            return;
        }

        int a = 0, b = 1;

        System.out.print(a + " " + b + " "); // Print the first two terms

        for (int i = 2; i < n; i++) {
            int temp = b;
            b = b + a;
            a = temp;
            System.out.print(b + " "); // Print each term in the series
        }
    }
}


