package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Enter a string");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Is it yes or no?");
        String answer = scanner.nextLine();
        if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")){
            return true;
        }else {
            return false;
        }

//        return answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no");


        }

    public int getInt(int min, int max) {
        String.format("Enter a number between %s and %s", min, max);
        int userNum = scanner.nextInt();
        if(userNum > min && userNum < max) {
            return userNum;
        }else {
            return 0;
        }

    }


    public int getInt() throws Exception {
        Integer number = scanner.nextInt();
        Integer result = Integer.valueOf(number);
        return result;
    }


    public double getDouble(double min, double max){
        String.format("Enter a number between %s and %s", min, max);
        int userNum = scanner.nextInt();
        if(userNum > min && userNum < max) {
            return userNum;
        }else {
            return 0;
        }
    }

    public double getDouble() throws Exception {
        Double number = scanner.nextDouble();
        Double result = Double.valueOf(number);
        return result;
    }


}
