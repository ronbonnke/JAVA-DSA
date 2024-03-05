package RECURSION;

public class Recursion {
    public static void main(String[] args) {
        func1(1);
    }
    static public void func1(int n) {
        if(n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        func1(n + 1);
    }
}