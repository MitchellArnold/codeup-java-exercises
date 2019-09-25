import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ArraysExercises {

    static Person[] people = new Person[3];


//    static void addPerson(Person people){
////        Person people
//    }


    public static void main(String[] args) {
//        int[] numbers = {1,2,3,4,5};
//        System.out.println(Arrays.toString(numbers)); // needed to output array value not just reference

        people[0] = new Person("Michael");
        people[1] = new Person("Matthew");
        people[2] = new Person("Mitchell");
//        people[3] = new Person("Marcus");

//        System.out.println(Arrays.toString(people));
        System.out.println("args = " + Arrays.toString(people));


        for(Person persons: people) {
            System.out.println(persons);
        }

    }


}
