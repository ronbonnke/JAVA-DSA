package basic;


import java.util.Scanner;

public class Practise {




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String fru = in.nextLine();
            fruit(fru);
        }

    }
    static void fruit(String name){
        System.out.println(name);
    }
}
