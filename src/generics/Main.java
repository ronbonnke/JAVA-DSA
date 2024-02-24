package generics;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        CusArrayList list = new CusArrayList();
        list.add(20);
        list.add(15);
        list.add(50);
        list.add(46);
        list.add(79);
        list.add(15);
        list.add(50);
        list.add(46);
        list.add(79);


        System.out.println(list);
        list.add(79);
        list.add(79);
        list.add(79);
        list.add(79);
        list.add(79);
        list.add(79);
        list.add(79);
        list.add(79);
        list.add(79);
        System.out.println(list);
        list.add(79);
        list.add(79);
        list.add(79);
        list.add(79);
        list.add(79);

//        System.out.println(Arrays.toString(list.arr));
        list.get(1);
//        System.out.println(list);
//        list.insert(0,40);
//        list.remove(2);
//        System.out.println(list);
        list.add(33);
//        System.out.println(list);
//        list.print();
//        System.out.println(list.removelast());
        list.add(44);
        list.delete(2);
        System.out.println(list);

    }
}
