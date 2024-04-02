package Accounts;

import People.Customer.Customer;

import java.util.ArrayList;

public abstract class Account {
    private int accNumber;

    double balance = 0;

    Customer mainAccHolder;
    ArrayList<Customer> authorizedUsers = new ArrayList<Customer>();

    public Account(Customer customer) {
        mainAccHolder = customer;
    }


    public void addAuthorizedUser(Customer customer) {
        authorizedUsers.add(customer);
    }

    public void addInterest(double amount  ) {

    }

    public void withdraw(double amount) {


    }
    public void deposit(double amount) {

    }

}
