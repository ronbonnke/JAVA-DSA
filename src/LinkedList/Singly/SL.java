package LinkedList.Singly;

public class SL {

    Node head;
    Node tail;
    int size;

    public void insert(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }


    void last(int val){
        Node node = new Node(val);
        Node temp = head;
        while (temp != null){

            if (temp.next == null){
                temp.next = node;
                temp = node;
            }
            temp = temp.next;
        }
        size++;
    }
    void removeLast() throws Exception{
        if (head == null) {
            throw new Exception("No single link list");
        }

        if (head.next == null) {

            head = null;
            return;
        }
     Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;

        }
        System.out.println(" end");
    }

    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
}

