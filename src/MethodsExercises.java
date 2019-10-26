import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        /// #1
//        System.out.println(addNumber(10, 4));
//        System.out.println(subtractNumber(1, 4));
//        System.out.println(multiplyNumber(2, 4));
//        System.out.println(divideNumber(8, 4));
//        System.out.println(modulaOfNumber(2, 3));

        /// #2
//        / with recursion
//        System.out.println("Please enter a number between 1 and 10.");
//        getInt(1, 10);
//        System.out.println(getInt(1,10));
//        System.out.println(getFactorial());
        /// #3

        diceRoll();
    }
//        public static int getInt(int min, int max){
//            Scanner sc = new Scanner(System.in);
//
//            if(sc.hasNextInt()){
//                System.out.println("Valid input!");
//                int userNum = sc.nextInt();
//                if(userNum >= min && userNum <= max){
//                    System.out.println("Valid range!");
//                }else{
//                    System.out.println("Invalid range!");
//                    return getInt(min, max);
//                }
//            }else {
//                System.out.println("Invalid input!");
//                return getInt(min, max);
//            }
//            return 0;
//        }



     /// sout lines
        //// #3 Methods
//        public static int getFactorial(int) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter a number from 1 to 10:");
//            int userInt = sc.nextInt();
//
//            return 0;
//        }
//




    //// #1  Methods

    // not public static Integer **

    public static double addNumber(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public static double subtractNumber(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public static double multiplyNumber(Integer num1, Integer num2) {
        return num1 * num2;
    }

    public static double divideNumber(Integer num1, Integer num2) {
        return num1 / num2;
    }

    public static Integer modulaOfNumber(Integer num1, Integer num2){
        return num1 % num2;
    }

    //// #2 Methods
//System.out.println(sc.hasNextInt() + 2)


    //// with recursion
//    public static int getInt(int min, int max){
//        Scanner sc = new Scanner(System.in);
//
//        if(sc.hasNextInt()){
//            System.out.println("Valid input!");
//            int userNum = sc.nextInt();
//            if(userNum >= min && userNum <= max){
//                System.out.println("Valid range!");
//            }else{
//                System.out.println("Invalid range!");
//            }
//        }else {
//            System.out.println("Invalid input!");
//        }
//        return 0;
//    }

    //// using loops
//    public static int getInt(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            if (sc.hasNextInt()) {
//                System.out.println("Valid input!");
//                int userNum = sc.nextInt();
//                if (userNum >= min && userNum <= max) {
//                    System.out.println("Valid range!");
//                } else {
//                    System.out.println("Invalid range!");
//                }
//            } else {
//                System.out.println("Invalid input!");
//            }
//            return 0;
//        }
//    }

//// #4
// Dice rolling

    public static int diceRoll(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sides for each dice in the pair: ");
        int userDice = sc.nextInt();
        System.out.println("Roll the dice? (Y/N)");
        String answer = sc.nextLine();

        do {
            System.out.println(userDice);


        }while (answer.equals("Y"));
        return 0;
    }



}
