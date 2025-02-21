package oops_encapsulation;

public class EncapsulationDemo {
    // POJO class (Plain Old Java Object) - Getter and Setter
    // it willalsso used to store the values and the use the values by consuming the variables

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name +"34534534";
    }

    // these are the private variables we use it
    private String name;

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    private String employee;

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    private int Salary;

    // encapsulation alwasys  passes through methods and variables
    // we need ot cratea  a getter and setter methods
    // Getter and Setter methods are created to a variable
    // Getter - will get the value - it will have return type
    // setter - will set the value - it will be void method
}
