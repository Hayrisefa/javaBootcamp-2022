public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.name="";
        product.price=10;
        productManager.add(product);
        DatabaseHelper.crud.Delete();
    }

}