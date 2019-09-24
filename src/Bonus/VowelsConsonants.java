package Bonus;

import javax.print.DocFlavor;
import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {


        System.out.println("Enter a sentence: ");
        isVowel();
    }

    public static String isVowel() {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().toLowerCase();
        int vowels = 0;
        int consanants = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u') {
                vowels += 1;
            } else {
                consanants += 1;
            }

        }
        return "This sentence contains " + vowels + " vowels.";
    }
}
