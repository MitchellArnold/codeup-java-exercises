package TestPacks.Friends;

public class Friend extends Person {

    public Friend(String fName, String lName, int personAge) {
        super(fName, lName, personAge);
    }
    public String sayHello(){
        return String.format("What it do?");
    }


}
