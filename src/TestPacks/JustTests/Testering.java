package TestPacks.JustTests;

public class Testering {
        public String firstName;
        public String lastName;

        public String sayHello(){
            return String.format("Hello from %s %s", firstName, lastName); /// any first or last name since public declaration
        }

    public static void main(String[] args) {
        Testering mitch = new Testering();
    }
}
