package bca;

public class Demo1 {
    public void Show() {
        System.out.println("Package called");
    }
}
class A {
    public static void main(String[] args) {
        Demo1 ob1= new Demo1();
        ob1.Show();
    }
}