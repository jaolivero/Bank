package Accounts;

import People.Customer.Customer;

import java.util.ArrayList;

public abstract class Account {
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private int accNumber;

    double balance = 0;

    Customer mainAccHolder;

    ArrayList<Customer> authorizedUsers = new ArrayList<Customer>();
    public Account(int accNumber, Customer customer) {
        this.accNumber = accNumber;
        mainAccHolder = customer;
    }


    public void addAuthorizedUser(Customer customer) {
        authorizedUsers.add(customer);
    }

    public void addInterest(double amount ) {

    }

    public void withdraw(double amount) {

        if(balance >= amount) {
            balance -= amount;
            System.out.println(balance);
        } else {
            System.out.println("Insufficient funds");
        }

    }

    public void deposit(double amount) {
        balance += amount;
    }
    public void checkBalance() {
        System.out.println(balance);
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    @Override
    public String toString() {
        return "Account: " + accNumber +
                ", balance=" + balance +
                ", mainAccHolder=" + mainAccHolder +
                '}';
    }
}
