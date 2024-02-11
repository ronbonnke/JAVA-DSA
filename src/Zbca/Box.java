package Zbca;
public class Box {
    int length,breadth,height;
    Box() {
        length=breadth=height=2;
        System.out.println("Intialized with default constructor");
    }
    Box(int l, int b) {
        length=l;
        breadth=b;
        height=2;
        System.out.println("Initialized with parameterized constructor having 2 params");
    }
    Box(int l, int b, int h) {
        length=l;
        breadth=b;
        height=h;
        System.out.println("Initialized with parameterized constructor having 3 params");
    }
    public int getVolume() {
        return length*breadth*height;
    }
    public static void main(String args[]) {
        Box box1 = new Box();
        System.out.println("The volume of Box 1 is :"+ box1.getVolume());
        Box box2 = new Box(10,20);
        System.out.println("Volume of Box 2 is :" + box2.getVolume());
        Box box3 = new Box(10,20,30);
        System.out.println("Volume of Box 3 is :" + box3.getVolume());
    }
}