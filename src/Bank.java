import People.Employee.Employee;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Optional;

public class Bank {
    int id;

    //Api code to find banks real routing number
    int routingNumber;
    String name;

    ArrayList<Branch> branches = new ArrayList<>();
    ArrayList<Employee> employees = new ArrayList<>();


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

    public Bank(String name) {
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
            System.out.println("Hired " + newEmployee.getFirstName());
        } else {
            System.out.println("Employee " + newEmployee.fullName() + " already exists");
        }
    }

//    public void getBankInfo(String bankName) {
//        String url = "https://api.apilayer.com/bank_data/check_blz_code?blz_code=blz_code";
//        //Api info to assure Bank info is simple and up to date
//        HttpClient httpClient = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder(
//                URI.create(url)).GET().build();
//
//        try {
//            HttpResponse<InputStream> response = httpClient.send(request, HttpResponse.BodyHandlers.ofInputStream());
//            int statusCode = response.statusCode();
//            System.out.println("HTTP status: " + statusCode);
//
//            System.out.println(response.body());
//        } catch (IOException | InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

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
