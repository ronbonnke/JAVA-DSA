package Zbasic.searching;

import java.util.Scanner;
public class Binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = arr.length - 1;
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                System.out.println(mid);
                break;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            }
        }
    }
}
