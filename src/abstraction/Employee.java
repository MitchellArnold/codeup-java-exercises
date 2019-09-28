package abstraction;

abstract class Employee {

    private double salary;

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;  // all this does is set; setSalary
    }

    public abstract String work(); /// if you want to be an employee, you have to work but will not be told how; you are employee, you're not told how






}
