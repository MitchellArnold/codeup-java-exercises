package test;

public class Person {
    public String firstName;
    public String lastName;

//    public Person(){}


    public Person(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }

//    Person matthew = new Person();
    public String sayHello(){
        return String.format("Greetings from Tennessee. \n %s %s", firstName, lastName);
    }

    public String sayCleanRoom(){
        return String.format("Did you clean your room today, %s?", firstName);
    }

    public static void main(String[] args) {
    Person matthew = new Person("Matthew", "Gotcher");
        System.out.println("matthew.sayHello() = " + matthew.sayHello());
        System.out.println("matthew.sayCleanRoom() = " + matthew.sayCleanRoom());
    }
    
}