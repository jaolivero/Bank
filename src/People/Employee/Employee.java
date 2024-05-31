package People.Employee;

import People.Person;

public abstract class Employee extends Person {
    public String jobTitle;
    private int salary;
    private static int employeeId = 0;
    private int id;


    public Employee(String firstName, String lastName, String email) {
        super(firstName, lastName, email);
        this.id = employeeId;
        employeeId ++;
    }

    public int getId() {
        return id;
    }
}
