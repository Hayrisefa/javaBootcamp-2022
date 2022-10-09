public class CustomerManager {
    private ICustomerDal iCustomerDal;

    public CustomerManager (ICustomerDal customerDal) {
        this.iCustomerDal=customerDal;
    }

    public void add(){
        //iş kodları
       iCustomerDal.add();

    }
}
