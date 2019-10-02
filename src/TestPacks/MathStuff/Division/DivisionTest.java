package TestPacks.MathStuff.Division;

import java.util.Scanner;

public class DivisionTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Input.\n");
        System.out.println("Enter a Integer:");
        Double number = sc.nextDouble();
        System.out.println("Enter a divisor:");
        Double divisor = sc.nextDouble();

        try {
            System.out.println("Okay, so... " + number + " divided by " + divisor + "...");
            double result = number / divisor;
            System.out.println("I can divide by " + divisor + " and it equals " + result);
        } catch (Exception e){
            System.out.println("Wait, I can't do that.");
        }




    }
}
