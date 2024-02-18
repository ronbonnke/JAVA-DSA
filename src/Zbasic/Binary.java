package Zbasic;

public class Binary {
    public static void main(String[] args) {
        int[]arr ={3,4,5,6,7,8,9};
        int target = 3;
        int start = 0;
        int end = arr.length-1;
        for(int i=0; i<arr.length; i++){
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                System.out.println(mid);
                break;
            }
            if(target<arr[mid]){
                end = mid-1;
            }
            if(target>arr[mid]){
                start = mid+1;
            }
        }
    }
}
