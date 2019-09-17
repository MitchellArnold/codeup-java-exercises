import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args){

        // #1 (main)
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.\n", pi);

        // #1 (scanner)
        Scanner input = new Scanner(System.in);

        System.out.println("Enter input: ");
        int userInput = input.nextInt();
//        System.out.println(userInput == 45);  /// checks for value
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
        // if you run and enter string, the Exception error will be thrown.

        // #2

        System.out.print("Enter three words: ");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        // it will only store three variables

        // #3

//        System.out.println("Enter a sentence: ");
//        String sentence = scanner.next();
//
//        System.out.println(sentence);
        // this will not capture sentence with whitespace involved

        // #4
//        System.out.println("Enter a sentence: ");
//        String sentenceTotal = scanner.nextLine();
//
//        System.out.println(sentenceTotal);

        // #1 (Calculate)
        System.out.println("Enter the length of a CodeUp classroom: ");
        String classroomLength = input.nextLine();
        System.out.println("Enter the width of a CodeUp classroom: ");
        String classroomWidth = input.nextLine();
        int length = Integer.parseInt(classroomLength);
        int width = Integer.parseInt(classroomWidth);

        // #2
        int area = length * width;
        int perimeter = (length * 2) + (width * 2);
        System.out.println("Here is the area: " + area);
        System.out.println("Here is the perimeter: " + perimeter);




    }
}
