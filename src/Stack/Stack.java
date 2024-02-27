package Stack;

import java.util.Arrays;

public class Stack {
    int[] arr;
    int def_size = 10;
    int size = -1;
    Stack(){
        this.arr = new int[def_size];
    }
    Stack(int size){
        this.arr = new int[size];
    }
    void push(int val){
        size++;
        this.arr[size] = val;
    }

    void pop(){

//        arr[size] = 0;
        size--;

    }
    void display(){
        System.out.println(Arrays.toString(arr));
        System.out.print("[ ");
        for (int i = 0; i <= size; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println(" ]");
    }
}
