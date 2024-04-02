import People.Customer.Customer;
import People.Employee.Employee;
import People.Employee.Teller;
import People.Person;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Bank of America");

        Customer Caleb = new Customer();

        Branch branch = new Branch ("127 atwood ave", 10000);

        Teller elijah = new Teller("Elijah", "Olivero");
        Teller joel = new Teller("Joel", "Olivero");

        Customer tazz = new Customer();

        bank.addEmployee(elijah);
        bank.addEmployee(joel);
        System.out.println("Elijah's Employee ID is " + elijah.getId());
        System.out.println("Joel's Employee ID is " + joel.getId());


        System.out.println(bank.getEmployees() + " all Employees");

      //  System.out.println(tazz.toString());






    }
}