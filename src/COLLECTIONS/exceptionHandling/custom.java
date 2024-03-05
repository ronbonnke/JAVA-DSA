package COLLECTIONS.exceptionHandling;

public class custom {
    public static void main(String[] args) throws MyExceptions {
        int a=10;
        int b=20;
        try{
            if(a+b == 30){
                throw new MyExceptions("hi broiiiiiiiiiii");
            }
        }
        catch (MyExceptions g){
            System.out.println(g.getMessage());
        }
    }
}
