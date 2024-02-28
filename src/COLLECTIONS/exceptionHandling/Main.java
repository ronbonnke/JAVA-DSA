package COLLECTIONS.exceptionHandling;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try{
            //divide(a,b);


            //mimicing
            String name = "bonnke";
            if (name.equals("bonnke")){
                throw new MyExceptions("name is bonnke");
            }
        }
        catch(MyExceptions e) {
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Normal exception");
        }
        finally
        {
            System.out.println("it will always execute");
        }
    }
    static int divide(int a, int b) throws Exception {
          if (b == 0){
              throw new ArithmeticException("IT CANNOT DIVIDE BY ZERO");
        }
        if(a  == 10){
            throw new Exception("Is EQUAL");
        }
        return a/b;
    }
}
