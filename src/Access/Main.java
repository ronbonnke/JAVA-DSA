package Access;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        A obj = new A(25,"Bonnke");
        obj.getNum();
//        obj.setNum(30);
        obj.setArr(1);
        obj.setArr(1);
        obj.setArr(1);
        obj.setArr(1);
        obj.setArr(1);

        System.out.println(obj.getNum());
//      System.out.println(Arrays.toString(arr));
        obj.getArr();
    }
}