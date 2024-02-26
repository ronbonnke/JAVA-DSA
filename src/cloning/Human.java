package cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;
    Human (int age, String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{2,3,5,4};
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        //shallow copying
//        return super.clone();
//    }

     @Override
    public Object clone() throws CloneNotSupportedException {
        //deep copying
        Human twin = (Human) super.clone(); // this is actually shallow copying
        twin.arr = new int[twin.arr.length];
         for (int i = 0; i < twin.arr.length; i++) {
             twin.arr[i] = this.arr[i];
         }
         return twin;
    }

}
