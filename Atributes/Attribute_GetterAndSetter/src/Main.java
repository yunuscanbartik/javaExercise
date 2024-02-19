//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setDescription("Gigabyte Laptop");
        product.setPrice(32000);
        product.setStockAmount(1);
        product.setRenk("kırmızı");
        product.setId(1);
        product.setCode("0123");
        System.out.println(product.getName());

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getCode());
    }
}