public class Person {
    ///properties
    private String name;

    public Person(){
        System.out.println("New person");
    }

    ///returns name
    public Person(String userName){
        name = userName;
    }
    ///changes the original name
    public String setName(String name){
        this.name = name;
        return name;
    }
    ///formats a sentence using current values ( original / copies )
    public String sayHello() {
        return String.format("Greetings, %s!", name);
    }


    public static void main(String[] args) {
        Person user1 = new Person("Mitchell");
        System.out.println(user1.sayHello());
    }
}
