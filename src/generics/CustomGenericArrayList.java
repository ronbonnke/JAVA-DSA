package generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {

        Object[] arr;
        int Def = 5;
        int size;

    CustomGenericArrayList(){
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
        public void set(int index, T value){
        arr[index] = value;
        }
        public T remove(){
            T removed = (T)(arr[size]);
            size--;
            return removed;
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
    public static void main(String[] args) {
                CustomGenericArrayList<Integer> list3 = new CustomGenericArrayList<>();
                list3.add(25);
                list3.add(37);
                list3.add(22);
                System.out.println(list3);
                list3.remove();

        }
    }


