package Objects;

 public class InnerClasses {

    static class Test {
         String name;
         public Test(String name){
             this.name = name;
         }

    }

     public static void main(String[] args) {
        Test a = new Test("ron");
        Test b = new Test("bonnke");

         System.out.println(a.name);
         System.out.println(b.name);
     }

}

// outside classes cannot be static
// only the classes inside can be static