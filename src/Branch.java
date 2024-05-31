import People.Customer.Customer;
import People.Employee.Employee;
import java.util.ArrayList;


public class Branch {
    String address;
    int cashAvailable;

    boolean isOpen = false;
    ArrayList <Customer> customers = new ArrayList<>();
    ArrayList <Employee> branchEmployees = new ArrayList<>();


    public Branch(String address, int cashAvailable) {
        this.address = address;
        this.cashAvailable = cashAvailable;
    }




    private void addCustomer(Customer customer) {
        customers.add(customer);
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCashAvailable() {
        return cashAvailable;
    }

    public void setCashAvailable(int cashAvailable) {
        this.cashAvailable = cashAvailable;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Employee> getEmployees() {
        return branchEmployees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.branchEmployees = employees;
    }
}
