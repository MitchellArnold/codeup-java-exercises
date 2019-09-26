import java.util.Arrays;

public class ArraysExercises {

    static Person[] people = new Person[3];
//    String[] people = new String[3];





    public static void main(String[] args) {
//        int[] numbers = {1,2,3,4,5};
//        System.out.println(Arrays.toString(numbers)); // needed to output array value not just reference

        people[0] = new Person("Michael");
        people[1] = new Person("Matthew");
        people[2] = new Person("Mitchell");
//        people[3] = new Person("Marcus");

//        System.out.println("args = " + Arrays.toString(people));


//        for(int x=0; people.length; x++){
//
//        }

        for(Person persons: people) {
            System.out.println(persons.getName());
        }

        Person name1 = new Person("ricky");

        addPerson(people, name1);
    }


    static int[] addPerson(Person[] people, Person singlePerson){
        System.out.println(people.length);
        int[] pLength = {people.length + 1};
        System.out.println(singlePerson.getName());
        return pLength;
    }

}
