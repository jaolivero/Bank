package People.Customer;


import Accounts.Account;
import Accounts.CheckingAccount;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    final ArrayList<Account> accounts = new ArrayList<>();


    public Customer() {

    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account customerAccount) {

        accounts.removeIf(account -> account.getAccNumber() == customerAccount.getAccNumber());

    }

}
