package service;
import Model.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private static CustomerService customerService = null;
    private CustomerService() {
    }

    public static CustomerService getInstance() {
        if (null == customerService) {
            customerService = new CustomerService();
        }
        return customerService;
    }

    ArrayList<Customer> customers = new ArrayList<>();

    public void addCustomer(String email, String firstName, String lastName){
        Customer customer = new Customer(firstName, lastName, email);
        customers.add(customer);
    }

    public Customer getCustomer(String customerEmail){
        for (Customer customer : customers) {
            if (customer.getEmail().equals(customerEmail)) {
                return customer;
            }
        }
        return null;

    }
    public List<Customer> getAllCustomers() {
        return customers;
    }

}
