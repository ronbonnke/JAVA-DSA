package generics.ArrayList;

import java.util.Arrays;

public class CusArrayList <T>{
    Object[] arr;
  int Def = 5;
  int size;

  CusArrayList(){
      arr = new Object[Def];
  }
  void add(T value){
      if(isFull()){
          doubles();
      }
      arr[size] = value;
      size++;
  }
  void doubles(){
Object[] temp = new Object[arr.length+2];

        //copy the current items to new array
      for (int i = 0; i < arr.length; i++) {
          temp[i] = arr[i];
      }
      arr = temp;
    }


   public T get(int index){
      return (T)arr[index];
  }
  void set(int index, int value){
      arr[index] = value;
  }
  void remove(){
      int removed = (int) arr[size];
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
