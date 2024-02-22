package Enums;

public class Basic {


    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        //these are enum constants
        // public , static and final
        // since its final you cannot create child enums
        // type is week


        // constructor called
        Week(){
            System.out.println("Constructor called for " + this);
        }
        // this is not public or protected, only private or default.
        // we don't want to create new objects
        // we use enums when we use fixed group of objects
        // enums cannot be extended

        // internally: public static final week Monday = new Week();

    }


    public static void main(String[]args) {
        Week week;
        week = Week.Monday;
        for (Week day : Week.values()) {
            System.out.println(day);
                System.out.println(day.ordinal()); // to check positions
        }
    }
}
