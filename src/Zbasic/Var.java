package Zbasic;

import java.util.Arrays;

public class Var {
    public static void main(String[] args) {
        fun(8,12,"ron", "bonnke");
    }
    static void fun(int a, int b, String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}
// ...v    used to delare many Arguments
