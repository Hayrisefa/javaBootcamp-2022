public class MySqlCustomerDal implements ICustomerDal,IRepository{
    @Override
    public void add() {
        System.out.println("Eklendi : MySql");
    }

    @Override
    public void delete() {

    }
}
