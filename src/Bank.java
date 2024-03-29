import People.Employee.Employee;

import java.util.ArrayList;
import java.util.Optional;

public class Bank {
     int id;

     //Api code to find banks real routing number
     int RoutingNumber;
     String name;

     ArrayList<Branch> branches = new ArrayList();
     ArrayList <Employee> employees = new ArrayList<>();


     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getAddress() {
          return address;
     }

     public void setAddress(String address) {
          this.address = address;
     }

     String address;

     public Bank(String name){
          this.name = name;
     }

     public Bank(String name, String address) {
          this.name = name;
          this.address = address;
     }


     public void addEmployee(Employee newEmployee) {

          Optional<Employee> result =
                  employees.stream().filter(employee -> newEmployee.getId() == employee.getId()).findFirst();

          if (result.isEmpty()) {
               employees.add(newEmployee);
               System.out.println("Hired" + newEmployee.getFirstName());
          } else {
               System.out.println("Employee " + newEmployee.fullName() + " already exist");
          }
     }

     public void getBankInfo(String bankName) {





     }

          public ArrayList<Employee> getEmployees() {
               return employees;
          }

          public void setEmployees(ArrayList<Employee> employees) {
               this.employees = employees;
          }









     @Override
     public String toString() {
          return "Bank{" +
                  "bankId=" + id +
                  ", Name=" + name +
                  ", address='" + address + '\'' +
                  '}';
     }
}
