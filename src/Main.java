import Accounts.Account;
import Accounts.CheckingAccount;
import People.Customer.Customer;
import People.Employee.Teller;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Bank of America");

        Customer Caleb = new Customer();

        Branch branch = new Branch ("127 atwood ave", 10000);


        Teller elijah = new Teller("Elijah", "Olivero", "jooliv@boa.com");
        Teller joel = new Teller("Joel", "Olivero", "elioliv@boa.com");

        Customer tazz = new Customer();

        bank.addEmployee(elijah);
        bank.addEmployee(joel);
        System.out.println("Elijah's Employee ID is " + elijah.getId());
        System.out.println("Joel's Employee ID is " + joel.getId());


        Account checkings = new CheckingAccount(223949444, tazz);

        tazz.addAccount(checkings);

       checkings.deposit(-1000);

       //checkings.withdraw(-5000);

        System.out.println(tazz.getAccounts());


        //tazz.removeAccount(checkings);


        System.out.println(tazz.getAccounts());








    }
}