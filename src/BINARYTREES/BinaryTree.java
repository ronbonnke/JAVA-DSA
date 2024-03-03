package BINARYTREES;
import java.util.Scanner;
public class BinaryTree {
    Node root;

    void insert(Scanner sc){
        System.out.print("Enter root Node");
        int val = sc.nextInt();
        root= new Node(val);
        insert(sc , root);
    }
    private void insert(Scanner sc , Node node){
        System.out.println("Do you  want to insert in Left of the current Node");
        Boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Insert the left value: ");
            int val = sc.nextInt();
             node.left = new Node(val);
             insert(sc, node.left);
        }
        System.out.println("Do you want to insert right of the current Node");
        Boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Insert Right value");
            int val = sc.nextInt();
            node.right = new Node(val);
            insert(sc , node.right);
        }
    }

    void display(){
        display(root , "This is root node");
    }
    private void display(Node node , String details){
        System.out.println(details+ node.val);
        display(node.left , "This is left of : "+ node.val + "Node");
        display(node.right, "This is right of : "+ node.val + "Node");
    }



    class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }
}
