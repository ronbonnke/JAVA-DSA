package COLLECTIONS.LinkedList.Singly;

public class Main {
    public static void main(String[] args) throws Exception {
        SLL list = new SLL();
       list.insert(10);
       list.insert(11);
       list.insert(31);
       list.insert(41);
       list.last(500);
        list.display();
      list.removeLast();
      list.display();
      list.display();


    }
}
