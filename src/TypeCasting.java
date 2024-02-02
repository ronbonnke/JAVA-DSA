import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*  float num = input.nextInt();
            int num = input.nextInt();
            System.out.println(num);
        */
        //type casting
        int num = (int)(567.63f);
        System.out.println(num);
    }
}
