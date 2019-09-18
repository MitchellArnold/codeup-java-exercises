import java.util.Scanner;

public class Bob {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.println("Would you like to ask Bob a question? (Y/N)");
            String answer = scanner.nextLine();

            do {
                System.out.println("Ask Bob a question: ");
                String question = scanner.nextLine();
                String bobResponse;
                if (question.endsWith("?")) {
                        bobResponse = "Sure.";
                } else if (question.endsWith("!")) {
                    bobResponse = "Whoa, chill out!";
                } else if (question.isEmpty()) {
                    bobResponse = "Fine, be that way!";
                } else {
                    bobResponse = "Whatever.";
                }
                System.out.println(bobResponse);

                System.out.println("Keep going? (Y/N)");
                answer = scanner.nextLine();
            }while(answer.equalsIgnoreCase("y"));

            System.out.println("Have a good day.");
        }
}
