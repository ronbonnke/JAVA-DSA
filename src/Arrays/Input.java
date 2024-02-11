package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[4];

        String[] str = new String[4];
//        for (int i = 0; i < arr.length; i++) {
        for (int i = 0; i < str.length; i++) {
//            arr[i] = sc.nextInt();
            str[i] = sc.next();
        }
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(str));
    }
}
