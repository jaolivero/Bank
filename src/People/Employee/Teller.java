package People.Employee;

import People.Customer.Customer;

public class Teller extends Employee {


    Customer customer;

    private double cashAvaliable = 1000;




    //Admin Level -enum manager class should be the highest admin.

    public Teller(String firstName, String lastName, String email) {

        super(firstName, lastName, email);


    }
}
