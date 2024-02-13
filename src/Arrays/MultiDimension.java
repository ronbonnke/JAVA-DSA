package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr2D = new int[3][3];
        System.out.println(arr2D.length);

//        int[][] arr2D = {
//                {1, 2, 3},
//                {4, 5},
//                {6, 7, 8, 9}
//        };

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col] = in.nextInt();
            }
        }

        //oneway to print

//        for (int row = 0; row < 3; row++) {
//            for (int col = 0; col < arr2D[row].length; col++) {
//                System.out.print(arr2D[row][col] + " ");
//            }
//            System.out.println();
//        }


        //another way to print

        for (int row = 0; row < 3; row++) {
            System.out.println(Arrays.toString(arr2D[row]));
            }
    }
}
