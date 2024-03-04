package RECURSION;

public class Recursion {
    public static void main(String[] args) {
        func1(1);
    }
    static public void func1(int val) {
        if (val == 5) {
            return;
        }
        System.out.println(val);
        func1(val + 1);
    }
}