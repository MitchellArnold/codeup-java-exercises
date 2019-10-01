import my_phone_store.Phone;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLecture {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("numbers.isEmpty() = " + numbers.isEmpty());

        numbers.add(1);
        System.out.println("numbers.size() = " + numbers.size());
        numbers.add(5);
        System.out.println("numbers.size() = " + numbers.size());
        ArrayList<Phone> phones = new ArrayList<Phone>();
        phones.add(new Phone(5.4, "iOS"));

        System.out.println(phones.get(0));
    }

    public static void mapsExample() {
        HashMap<Long, String> users = new HashMap<>();
        users.put(1L, "fmendozaro");
        users.put(2L, "rorsinger");

    }
}
