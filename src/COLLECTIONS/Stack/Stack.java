package COLLECTIONS.Stack;

import java.util.Arrays;

public class Stack <T>{
    private Object[] arr;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    Stack(){
        arr = new Object[DEFAULT_SIZE];
    }
    Stack(int size){
    arr = new Object[size];
    }

    void push(T val){
       if(isFull()){
           dynamic();
       }
        arr[size] = val;
        size++;
    }

    void pop(){
        size--;
        T popped = (T)arr[size];
        arr[size] = 0;
        System.out.println(popped);
    }

    void display(){
        System.out.println(Arrays.toString(arr));
    }
    void dynamic(){
        Object[] temp = new Object[arr.length*2];
        for (int i = 0; i < arr.length; i++) {
            temp[i]= arr[i];
        }
        arr = temp;
    }
    boolean isFull(){
       return size == arr.length;
    }
}
