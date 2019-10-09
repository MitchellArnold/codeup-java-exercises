package TestPacks.JustTests;

public class Testeroo {

    // Properties //
public static int id;
public static boolean isPerson;
public static float AccountBal;
public static double doubleNum;

    // Test Methods //
public static void testMethod(){
    id = 3;

        if(id == 1) {
            System.out.println("Good job! Your ID is number 1.");
        }else if(id ==2){
            System.out.println("Good job! Your ID is number 2.");
        }else if(id ==3){
            System.out.println("Good job! Your ID is number 3.");
        }else if(id ==4){
            System.out.println("Good job! Your ID is number 4.");
        }else if(id ==5){
            System.out.println("Good job! Your ID is number 5.");
        }else{
            System.out.println("Hey. Look at you.");
        }

//    System.out.println("You did a good job, but that's not the number 5.");
}

public static void testBoolMethod(boolean input){
    isPerson = true;

    if(isPerson == input){
        System.out.println("This looks pretty good to me!");
    }else {
        System.out.println("This will print");
    }
}

public static String testFloatMethod(float floatedNum){
    AccountBal = floatedNum;
    if(AccountBal == 0) {
        System.out.println("You've ran out of funds.");
        return String.format("Invalid");
    }else{
        System.out.println("You're gold! Keep spending.");
        return String.format("%s", AccountBal);
    }
}
    // End Test Methods //




    public static void main(String[] args) {
//        testMethod();
//          testBoolMethod(true);
        testFloatMethod(0);
    }

}

