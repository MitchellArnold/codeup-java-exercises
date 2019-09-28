package abstraction;

public class CodeupTest {

    public static void main(String[] args) {
//        Employee tim = new Employee(); // this doesn't explain enought information of Employee; not specific enough
        Employee[] employees = new Employee[2];

        Employee bob = new Accountant();
        Dev fer = new Dev();

        fer.setSalary(2);
        bob.setSalary(3);

        employees[0] = bob;
        employees[1] = fer;


        // 9 - 5 work hours
        for (Employee emp : employees) {
            System.out.println(emp.work());
            System.out.println("Pay $" + emp.getSalary());
        }


    }
}
