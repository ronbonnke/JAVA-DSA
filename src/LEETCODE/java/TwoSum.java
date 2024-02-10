package LEETCODE.java;
import java.util.Arrays;

// when we add two indexes we must get the target value
// if you find the target print the indexes

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        int target = 8;
        int[] res = twoSum(arr, target);
        System.out.println(Arrays.toString(res));
    }
        static public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
            for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target){
                        arr[0]= i;
                        arr[1]= j;
                    }
                }
            }
            return arr;
    }
}