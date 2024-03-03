package RECURSION;

public class Recursion {
    public static void main(String[] args) {
        func1(1);
    }

    static public void func1(int val){
        if(val == 5){
            return;
        }
            System.out.println(val);
            func1(val + 1);
    }



//    static public void func2(int val){
//        System.out.println(val);
//        func3(3);
//    }
//    static public void func3(int val){
//        System.out.println(val);
//    }

}
