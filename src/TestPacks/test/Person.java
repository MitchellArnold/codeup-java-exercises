package TestPacks.test;

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
        return String.format("Greetings from %s %s.", firstName, lastName);
    }

    public String sayCleanRoom(){
        return String.format("Did you clean your room today, %s?", firstName);
    }


    public static void main(String[] args) {
        String out = String.format("Hello where I am %d", 30);
        Person matthew = new Person("Matthew", "Gotcher");
        System.out.println(matthew.sayHello());
        System.out.println(out);

    }
}