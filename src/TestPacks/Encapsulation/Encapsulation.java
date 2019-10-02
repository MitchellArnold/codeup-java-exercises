package TestPacks.Encapsulation;

public class Encapsulation {
    private String name;
    private String username;
    private int number;
    private int age;

    public int getAge() {
        return age;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public void setAge( int newAge ) {
        age = newAge;
    }

    public void setUsername( String newUsername ) {
        username = newUsername;
    }

    public void setName( String newName ) {
        name = newName;
    }



}
