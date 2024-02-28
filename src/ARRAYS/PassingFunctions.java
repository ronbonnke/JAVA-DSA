package ARRAYS;

import java.util.Arrays;

public class PassingFunctions {
    public static void main(String[] args) {
        int[] nums = {2, 3, 7, 9, 5};
        System.out.println(Arrays.toString(nums)); // prints given inputs only
        change(nums);   // function calling
        System.out.println(Arrays.toString(nums)); // after changing values inside functions
    }
    static void change(int[] arr){
        arr[0] = 85;
        arr[2] = 69;
    }
}
