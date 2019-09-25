public class Person {
    ///properties
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello \n " + name);
    }

    public Person(String userName){
        name = userName;
//        setName(userName);   /// this is recursion example from walkthrough
    }




    public static void main(String[] args) {
        Person Mitch = new Person("Mitchell");
        System.out.println(Mitch.getName());
        Mitch.setName("Arnold");
        Mitch.sayHello();


        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName())); /// working with only value
        System.out.println(person1 == person2); /// working with constructor name


//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); /// true; being that it's the same instance and not a new one
//
//        Person person1 = new Person("John");
//        Person person2 = person1; /// same instance  **think line by line**
//        System.out.println(person1.getName()); // John
//        System.out.println(person2.getName()); // John
//        person2.setName("Jane"); // when you set the name property, you are still using the same instance
//        System.out.println(person1.getName()); // Jane (not John**)
//        System.out.println(person2.getName()); // Jane


    }




}













    ///// First Run //////
//
//    public Person(){
//        System.out.println("New person");
//    }

    ///returns name
//    public Person(String userName){
//        name = userName;
//    }
//    ///changes the original name
//    public String setName(String name){
//        this.name = name;
//        return name;
//    }
//    ///formats a sentence using current values ( original / copies )
//    public String sayHello() {
//        return String.format("Greetings, %s!", name);
//    }
//
//
//    public static void main(String[] args) {
//        Person user1 = new Person("Mitchell");
//        System.out.println(user1.sayHello());
//    }
