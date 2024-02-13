package Arrays;

public class Xor {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};

        int single  =0;
        for(int num : arr){
            single ^= num;
        }
        System.out.println(single);
    }
}
