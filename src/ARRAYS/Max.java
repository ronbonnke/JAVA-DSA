package ARRAYS;

public class Max {
    public static void main(String[] args) {
        int[] arr = {22, 91, 33, 15, 64};
        System.out.println(maxiRange(arr,2,4));
    }

    static int maxiRange(int[] arr, int start, int end){
       //work on edge cases
        if (end > start){
            return -1;
        }
        if (arr == null){
            return -1;
        }

        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int maxi(int[] arr){
        //ec
        if (arr.length == 0){
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
