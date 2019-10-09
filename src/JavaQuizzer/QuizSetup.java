package JavaQuizzer;

import java.util.HashMap;

public class QuizSetup {
    private String q1;
    private String q2;
    private String q3;
    private String q4;
    private String q5;
    private String q6;
    private String q7;
    private String q8;
    private String q9;
    private String q10;
    private String q11;
    private String q12;
    private String q13;
    private String q14;
    private String q15;
    private String q16;
    private String q17;
    private String q18;
    private String q19;
    private String q20;

    public  String getQuestion(){
        return q1;
    }

    public static void main(String[] args) {
        HashMap<String, String> questions = new HashMap<>();
        questions.put("A class is used to define a custom type in Java.", "Java II");
        questions.put("A field is a variable that belongs to an object or class.", "Java II");
        questions.put("An object is an instance of a class.", "Java II");



        /// Print out
        System.out.println("::: WELCOME :::");
        System.out.println("This quizzlet is intended for study purposes material \nand to freshen up on interview questions.\n\n");
        System.out.println(questions);
    }


    //// Gets the question number
//    public void String testRun(){
//        for (int i = 0; i <= 20; i++) {
//            System.out.println("I'm at point " + i);
//        }
//    }


//    public String getQuestionNum(String userQ) {
//        String ;
//        return ;
//    }

}
