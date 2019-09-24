public class oopLesson {
//        private String name;
//
//        public String getName (){
//            return name;
//        }
//
//        public void setName (String name){
//            this.name = name;
//        }
//
//        public void sayHello () {
//            System.out.println(String.format("Greetings, %s!", this.name));
//        }
//
//
//    public static void main(String[] args) {
//
//    }



 public String name; /// original properties of class object
 public String company;

 public oopLesson(String employeeName) {
     name = employeeName;
     company = "unassigned";
 }

 public oopLesson(String employeeName, String assignedCompany) {
     name = employeeName;
     company = assignedCompany;
 }

 public String getInfo() {
     return String.format("name: %s, company: %s", name, company);
 }

//public StudentAssign(String student){
//
//}



    public static void main(String[] args) {
        oopLesson employee1 = new oopLesson("Mitchell", "BeautStack");
        System.out.println(employee1.getInfo());
    }
//
// public String firstName; /// property of mitch
// public String lastName; /// property of mitch
//
// public String sayHello() {
//     return String.format("Hello from the outer rim being, %s %s!", firstName, lastName);
// }
//
//
// public String sayConvo() {
//     String convoP1 = "Drumming is what I like to do.";
//     String convoP2 = String.format("Swimming, ehh, not so much. That's coming from %s", firstName);
//    return convoP2;
// }
// ///whenever the sayHello() method is called, we see these public variables be put into action.
//
// public static void main(String[] args) {
//     Person mitch = new Person(); /// new instantiation
//     mitch.firstName = "Mitchell";
//     mitch.lastName = "Arnold";
//     System.out.println(mitch.sayHello());
//     System.out.println(mitch.sayConvo());
//     System.out.println(mitch.sayHello());
// }
 /// this reads as it should, line by line. The print method will not contain the defined property values until they are parsed.

}
