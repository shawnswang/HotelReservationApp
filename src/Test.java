import Model.Customer;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer("first", "second", "test@domain.com");
        System.out.println(customer);
    }
}
