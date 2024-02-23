package Access;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Arrays;

public class A {
    private int num;
    public String name;
    protected int[]arr;
    int size =0;



    public int getNum() {
        return num;

    }

//    public void setNum(int num) {
//        this.num = num;
//    }


    public void setArr(int a) {

        arr[size] = a;
        size++;

    }

    public int[] getArr() {
        return arr;
    }

    public A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
