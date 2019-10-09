package TestPacks.Friends;

import java.util.Scanner;

public class Person {

    public String firstName;
    public String lastName;
    public String adjective;
    public int age;
    public static int singleDigit;




    public Person(String fName, String lName, int personAge) {
        this.firstName = fName;
        this.lastName = lName;
        this.age = personAge;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    //    Person matthew = new Person();
    public String sayHello(){
        return String.format("Greetings from %s %s.", firstName, lastName);
    }

    public String sayCleanRoom(){
        return String.format("Did you clean your room today, %s?", firstName);
    }

    public String speakLingo() {
        return String.format("This right here %s is how it's done.", firstName);
    }


}

