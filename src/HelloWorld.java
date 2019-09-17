public class HelloWorld {

    public static void main(String[] args){
        // Intro exercise
//        System.out.println("Hello, world!");
//        System.out.print("Hello, world!\n");

        // Syntax, Types, and Variables
        // #1
//        int myFavoriteNumber = 42;
//        System.out.println(myFavoriteNumber);
        // #2
//        String myString = "This is the string of strings";
//        System.out.println(myString);
        // #3
//        myString = 'A';  ///incompatible type; compilation error, you cannot be converted to java.lang.String
        // #4
//        myString = 3.14159; /// double cannot be converted to java.lang.String
        // #5
        long myNumber;
//        System.out.println(myNumber); // variable hasn't been initialized
        // #6
//        myNumber = 3.14; /// needs to be casted as a double instead of long
        // #7
        myNumber = 123L;
        // #8
        myNumber = 123; // long requires a longer sequence than int; already a value assigned to variable;
        // #9
//        myNumber = 3.14F; // incompatible types; myNumber = (long) 3.14F or declare at first (float) myNumber
        // #10
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        // the first block outputs variable then increments and prints, second line prints variable
        // the second block increments to variable and prints, the prints variable again.

        // #11
//       String class; // cannot create variable because it is a keyword type

        // #12
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
        // cannot cast due to declaration; runtime error

        // #13
//        int x = 4;
//        x += 5;

//        int x = 3;
//        int y = 4;
//        y += x;

//        int x = 10;
//        int y = 2;
//        x /= (int) y;
//        y -= (int) x;

        // #14
//        When you assign to value larger than numeric value to specified type, it must fit within parameter range of specified variable type. If you increment past that point, it loops over between the value start / stop points.


    }
}