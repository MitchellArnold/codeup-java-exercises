package TestPacks.Polymorphism;

public class EmployeeTest {

    public static void doWork(Employee e){
        System.out.println(e.work());
    }

    public static void doWork(Employee e, Employee f){
        System.out.println(e.work() + "\n right here" + f.work());
    }


    public static void doPlay(Employee e){
        System.out.println(e.play());
    }
    public static void main(String[] args) {
        Employee one = new Employee();
        Employee onePointOh = new Employee();
        Employee two = new Manager();

        System.out.println(one.play());
        doWork(one);
        doWork(two);
        doPlay(two);
        doWork(onePointOh, one);
    }

}


