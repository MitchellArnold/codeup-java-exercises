import java.lang.reflect.Array;

public class Tester {


    //// server name generator //////

    public static String[] nouns = {
            "technology",
            "clothes",
            "perspective",
            "procedure",
            "library"
    };

    public static String[] adjectives = {
            "beautiful",
            "sunny",
            "challenging"
    };

    public static Person[] people = {
            new Person("bob123"),
            new Person("stan123")
    };


    public static String returnRandEle(String[] arr) {
            int index = (int)(Math.random() * (arr.length));
            return arr[index];
    }

    public static Person returnRandEle(Person[] arr) {
        int index = (int)(Math.random() * (arr.length));
        return arr[index];
    }





    //////  Instance //////

//    Person ada = new Person();
//    ada.firstName = "Mary";
//    ada.lastName = "Poppins";


    public static void main(String[] args){
//            String message = String.format("%s-%s", returnRandEle(adjectives),returnRandEle(nouns));
//        System.out.println(message);

//            String messageObj = String.format("%s", returnRandEle(people));
//            System.out.println(Array.toString(messageObj));

//        ada.sayHello();
    }

}