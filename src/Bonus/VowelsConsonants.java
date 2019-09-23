package Bonus;

import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine().toLowerCase();
        String a = "a";
        int shortSentence = sentence.length();

        for(int i = 0; i < shortSentence; i+= 1){
            System.out.println("There are " + shortSentence + " words in this sentence.");
            if(i == 0){
                break;
            }else{
                continue;
            }

        }


        }
    }

