package LinkedList.Singly;

public class SL {

    Node head;
    Node tail;

    public void insert(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
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
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
            head = temp;
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

