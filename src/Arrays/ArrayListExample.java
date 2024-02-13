package Arrays;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        // Syntax:
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(52);
        list.add(20);
        list.add(64);

        System.out.println(list.contains(57)); // checks whether the list has the given value inside it.

        System.out.println(list);
        list.set(1, 72); // sets or updates the 1st index value to 72 in the list

        list.remove(2);
        System.out.println(list);

        list.add(2, 25);
        System.out.println(list);


    }
}
