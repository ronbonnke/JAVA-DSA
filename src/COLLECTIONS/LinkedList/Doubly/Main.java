package COLLECTIONS.LinkedList.Doubly;

public class Main {
    public static void main(String[] args) throws Exception {
        DLL list = new DLL();
        list.insertFirst(11);
        list.insertFirst(42);
        list.insertFirst(38);
        list.insertLast(46);
        list.display();
    }
}
