package People.Employee;

import People.Customer.Customer;
import People.Person;

public class Teller extends Employee implements Person {
    Customer customer;

    private double cashAvaliable = 1000;





    //Admin Level -enum manager class should be highest admin.

    public Teller(String firstName, String lastName) {
        super(firstName, lastName);
    }





}
