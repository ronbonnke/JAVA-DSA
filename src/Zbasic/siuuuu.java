package Zbasic;

import java.util.Arrays;
public class siuuuu {
    public static void main(String[] args) {
        int[]arr = {1,2,3};
        int ans[] = Double(arr);
        System.out.println(Arrays .toString(ans));
    }
    static int[] Double(int []arr){
        int num[]= new int [arr.length];
        for(int i=0; i<arr.length; i++){
            num[i]=arr[i]*2;

        }
        return num;
    }
}