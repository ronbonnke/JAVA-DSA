package COLLECTIONS.LinkedList.Doubly;

public class DLL {

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

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if (head == null){
            node.prev = null;
            head = node;
            return;
        }
        while (last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
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
        while (last != null){
            System.out.print(last.val+ " -> ");
            last = last.prev;
        }
        System.out.println(" START");
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
