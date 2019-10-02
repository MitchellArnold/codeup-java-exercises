package TestPacks.Encapsulation;

public class EncapsulationTest {

    public static void main(String[] args) {
        Encapsulation encap = new Encapsulation();
        encap.setName("Billy");
        encap.setAge(20);
        encap.setUsername("billyJones99");

        System.out.println("Name : " + encap.getName()  + "\nAge : " + encap.getAge());
    }
}
