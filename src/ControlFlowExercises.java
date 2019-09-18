import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
        // 1) Loop Basics
//       int i = 5;
//        while(i <= 15){
//            System.out.print(i++ + " ");
//        }
        // Do While
        //// 2's
//        int count = 0;
//        do{
//            System.out.println(count);
//            count += 2;
//        }while(count % 2 == 0 && count <= 100);
        //// 5's
//        int count = 100;
//
//        do{
//            System.out.println(count);
//            count -= 5;
//        }while(count % 5 == 0 && count >= -10);
        //// 2's and squared
//        long count = 2;
//        do {
//            System.out.println(count);
//            count *= count;
//        } while (count < 1000000);
        // For loops
        //// While
//        for(int i = 5;i <= 15;i++){
//            System.out.println(i++);
//        }
        //// Do While
        // 2's
//        for(int count = 0; count % 2 == 0 && count <= 100; count += 2){
//            System.out.println(count);
//        }
        // 5's
//        for(int count = 100; count % 5 == 0 && count >= -10;count -= 5){
//            System.out.println(count);
//        }
        // 2's and squared
//        for(long count = 2;count < 1000000;count *= count){
//            System.out.println(count);
//        }

        //// FizzBuzz 2)
        int start = 1;
//        do{
//            System.out.println(start);
//            start++;
//        }while(start <= 100);
//        for (int starter = 1; starter <= 100; starter++) {
//            if (starter % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(starter);
//            }
//        }
        ///
//        for (int starter = 1; starter <= 100; starter++) {
//            if (starter % 5 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(starter);
//            }
//        }
        ///
//        for (int starter = 1; starter <= 100; starter++) {
//            if (starter % 3 == 0 && starter % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else {
//                System.out.println(starter);
//            }
//        }
        /// #3
        // Table of powers
        Scanner input = new Scanner(System.in);

//        System.out.println("Enter an integer: ");
//        String userInt = input.nextLine();
//        int userInput = Integer.parseInt(userInt);
//        long square = 0;
//        long cubed = 0;
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for(int i = 0; i <= userInput; i++){
//            long sq = i * i;
//            long cu = i * i * i;
//            System.out.println( i + "        " + sq + "        " + cu );
//        }

//        System.out.println("Numeric grade 0 - 100: ");
//        String userInt = input.nextLine();
//        int userInput = Integer.parseInt(userInt);
//
//            if(userInput >= 99){
//                System.out.println("You got an A+!");
//            }
//            else if(userInput >= 88){
//                System.out.println("You got an A!");
//            }else if(userInput >= 80){
//                System.out.println("You got a B!");
//            }else if(userInput >= 67){
//                System.out.println("You got a C!");
//            }else if(userInput >= 60){
//                System.out.println("You got a D!");
//            }else{
//                System.out.println("You got a F!");
//            }
        }

    }





    //////////////============== notes ============///////////
// (Needs main method to run)



////    When looping on these types, it's best to print before you do math

//    int count = 105;
//
//        do{
//                count-=5;
//                System.out.println(count);
//                }while(count%5==0&&count>-10);
