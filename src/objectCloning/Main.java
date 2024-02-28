package objectCloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        Human ron = new Human(20,"bonnke");

        Human twin = (Human)ron.clone();

        System.out.println(Arrays.toString(twin.arr));
        System.out.println(twin.name);

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(ron.arr));
    }
}
