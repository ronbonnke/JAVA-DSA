package COLLECTIONS.exceptionHandling;

public class Mmain {
    public static void main(String[] args) throws MyExceptions{
        int a =20;
        int b = 30;
//        System.out.println(a+b);
        try{
            if( a + b == 50){
                throw new MyExceptions("you cannot add this");
            }

        }
        catch(MyExceptions m){
            System.out.println(m.getMessage());
        }

    }
}
