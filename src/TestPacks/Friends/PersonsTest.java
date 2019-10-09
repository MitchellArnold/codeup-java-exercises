package TestPacks.Friends;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonsTest{


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Person Test...\n\n");
        System.out.println("___       ________________ _____________________  ____________\n" +
                "__ |     / /__  ____/__  / __  ____/_  __ \\__   |/  /__  ____/\n" +
                "__ | /| / /__  __/  __  /  _  /    _  / / /_  /|_/ /__  __/   \n" +
                "__ |/ |/ / _  /___  _  /___/ /___  / /_/ /_  /  / / _  /___   \n" +
                "____/|__/  /_____/  /_____/\\____/  \\____/ /_/  /_/  /_____/   \n" +
                "                                                              \n" +
                "______________     _____________  ___________   ________________________\n" +
                "___  __/_  __ \\    ___  __/__  / / /__  ____/   ___  __ \\___  _/_  ____/\n" +
                "__  /  _  / / /    __  /  __  /_/ /__  __/      __  / / /__  / _  / __  \n" +
                "_  /   / /_/ /     _  /   _  __  / _  /___      _  /_/ /__/ /  / /_/ /  \n" +
                "/_/    \\____/      /_/    /_/ /_/  /_____/      /_____/ /___/  \\____/   \n" +
                "                                                                        \n");

//        int inputNum = sc.nextInt();
//        singleDigit = inputNum;
//        String out = String.format("Hello where I am %d", singleDigit);
//        Person matthew = new Person("Matthew", "Gotcher");
//        System.out.println(matthew.sayHello());
//        System.out.println(matthew.sayCleanRoom());
//        System.out.println(matthew);
//        System.out.println(out);
       /* System.out.println("Enter a first name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter a last name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter an age: ");
        Integer age = sc.nextInt();
        Person mitch = new BestFriend(firstName, lastName, age);
//        System.out.println(mitch.toString());
        System.out.println(mitch.sayCleanRoom());
//        System.out.println(mitch.speakLingo());
        Person p1 = new Person("john", "jacob", 22);
        Person p2 = new Friend("mitch", "jason", 59);
        System.out.println(p1.sayHello());
        System.out.println(p2.sayHello());*/

        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);

        for(Integer num : ints) {
            System.out.println(num);
            num++;
            System.out.println(num);
        }




    }
}
