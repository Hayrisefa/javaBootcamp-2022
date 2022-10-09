public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Customer customer = new Customer();
        Employee employee = new Employee();


        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();

        employeeManager.bestEmployee();

    }
}