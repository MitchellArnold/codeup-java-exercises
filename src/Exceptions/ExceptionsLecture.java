package Exceptions;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionsLecture {

    public static String getIndentationPreference() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("What type of indentation do you prefer?");
        String indentationPreference = sc.nextLine();

        if (indentationPreference.equals("tabs")) {
            WrongIndentationTypeException customException;
            customException = new WrongIndentationTypeException("Wrong!");
//            throw customException;
            // throws new custom exception
        }

        if(indentationPreference.equals("-1")){
            throw new Exception("App is being updated at the moment");
        }

        return indentationPreference;
    }


    public static void main(String[] args) {

        try{
            getIndentationPreference();
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }

        int[] numbers = {1, 2, 3};
        try{
            System.out.println(numbers[999]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("There was an error");
//            e.printStackTrace();
        }

        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
    }
}
