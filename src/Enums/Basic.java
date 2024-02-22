package Enums;

public class Basic {
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        //these are enum constants
        // public , static and final
        // since its final you cannot create child enums
        // type is week
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
