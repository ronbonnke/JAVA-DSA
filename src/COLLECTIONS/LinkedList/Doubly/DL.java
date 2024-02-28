package COLLECTIONS.LinkedList.Doubly;

public class DL {

    Node head;

    void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null){
            head.prev = node;
        }
            head = node;
    }


    void display() throws Exception{
        Node temp = head;
        Node last = null;
        if (head == null) {
            throw new Exception("no linked list");
        }
        while (temp != null){
            System.out.print(temp.val + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println(" END");
    }


    class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
}
