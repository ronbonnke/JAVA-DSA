package bca;

import java.util.*;
public class ArrayListExample1{
    public static void main(String args[]){
        ArrayList<String> list =new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        System.out.println(list.size());
        System.out.println(list);
        list.remove("Grapes");
        System.out.println(list);
        System.out.println(list.size());
    }
}
