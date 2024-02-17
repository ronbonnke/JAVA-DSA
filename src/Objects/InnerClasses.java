package Objects;

import java.util.Arrays;

public class InnerClasses {


/*
    here the static is not depending on innerclass object

    it is depending on the static class and
    it is depending on the  static method (main) that's
    why its able to access the objects inside it

     */


    static class Test {
         String name;
         public Test(String name){
             this.name = name;
         }

    }

     public static void main(String[] args) {
        Test a = new Test("ron");
        Test b = new Test("bonnke");

         System.out.println(a.name);
         System.out.println(b.name);
     }

}

// outside classes cannot be static

// only the (classes inside) or (inside classes) can be static



//class Interview{
//    public static void main(String[] args) {
//        int[] arr ={1,0,0,1,0,1};
//   // result to be printed //  int[] ans = {1,1,1,0,0,0};
//        int size =0;
//        int[] res = new int[arr.length];
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i] == 1){
//                res[size] = arr[i];
//                size++;
//            }
//        }
//        System.out.println(Arrays.toString(res));
//    }
//}