//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Product product = new Product(1,"Laptop","Gigabyte Laptop", 30000, 2, "Pembe","4123");
    Manager manager = new Manager();
    manager.Add(product);
    System.out.println(product.getCode());
    }
}