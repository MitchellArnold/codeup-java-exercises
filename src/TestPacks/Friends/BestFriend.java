package TestPacks.Friends;

public class BestFriend extends Friend{



    public BestFriend(String fName, String lName, int personAge) {
        super(fName, lName, personAge);
    }

    @Override
    public String sayHello() {
        return super.sayHello();
    }

    @Override
    public String sayCleanRoom() {
        return String.format("Did you clean your room today, %s %s?. You're not %d anymore", firstName, lastName, age);
    }

    public String sayBFLine() {
        return String.format("I can tell that we are gonna be %s friends for years.", adjective);
    }
}
