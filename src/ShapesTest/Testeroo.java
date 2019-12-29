package ShapesTest;

public class Testeroo {

    private static String name_one = "justin";
    static int number_one = 15;
    static int number_two = 20;


    public static String sentence(){
        return name_one + number_one;
    }


    
    public static void main(String[] args) {
        System.out.println("number_one = " + number_one);
        System.out.println("number_two = " + number_two);
        System.out.println("letter_one = " + name_one);
        System.out.println("number_one + number_two = " + number_one + number_two);
        System.out.println("sentence() = " + sentence());
    }

}
