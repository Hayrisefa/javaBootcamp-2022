public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ICustomerDal iCustomerDal = new MySqlCustomerDal();
        CustomerManager customerManager =new CustomerManager(new OracleCustomerDal());
        customerManager.add();

    }


}