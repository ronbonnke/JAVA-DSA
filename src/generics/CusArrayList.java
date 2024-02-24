package generics;

import java.util.Arrays;

public class CusArrayList {
  int[] arr;
  int Def = 10;
  int size;

  CusArrayList(){
      arr = new int[Def];
  }
  void add(int value){
      if(isFull()){
          doubles();
      }
      arr[size] = value;
      size++;
  }
  void doubles(){
int[] temp = new int[arr.length*2];
      for (int i = 0; i < arr.length; i++) {
          temp[i] = arr[i];
      }
      arr = temp;
    }


  void get(int index){
      System.out.println(arr[index]);
  }
  void set(int index, int value){
      arr[index] = value;
  }
  void remove(){
      int removed = arr[size];
     size--;
     System.out.println(removed);
  }
  void delete(int index){
      for (int i = index; i < size-1; i++) {
          arr[i] = arr[i+1];
      }
      size--;
  }
  boolean isFull(){
      if(size == arr.length){
         return true;
      }
      return false;
  }


    @Override
    public String toString() {
        return  Arrays.toString(arr);
    }
}
