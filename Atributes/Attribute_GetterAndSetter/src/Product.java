import javax.naming.Name;

public class Product {

    //Attribute | field
    private int id;    // sadece tanımlandığı blokta geçerlidir.
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String code;
    public String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
