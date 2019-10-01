package PersonTest;

public class Person {
        public String firstName; // class property
        public String lastName; // class property
        public int nostrilCount; // class property

        public String sayHello() {
            return String.format("Hello from %s %s!", firstName, lastName);
            // getting the formatted sentence from properties stored in object
        } // sayHello()

        public String lookForward() {
            return String.format("I %s %s am looking forward.", firstName, lastName);
            // getting the formatted sentence from properties stored in object
        } // lookForward()

        public String smellingNose(){
            return String.format("What scent bringeth such joy to my %d nostrils.", nostrilCount);
        }

        /// Execution method ///
        public static void main(String[] args) {
            Person rick = new Person();
            rick.firstName = "Rick"; // stored in "rick" object
            rick.lastName = "Sanchez"; // stored in "rick" object
            System.out.println(rick.sayHello());
            // prints "Hello from Rick Sanchez!"

            Person matt = new Person();
            matt.firstName = "Matt";
            matt.lastName = "Jones";
            System.out.println(matt.lookForward());
            // prints "I Matt Jones am looking forward."

            Person bigRickard = new Person();
            bigRickard.nostrilCount = 2;
            System.out.println(bigRickard.smellingNose());

        }


}
