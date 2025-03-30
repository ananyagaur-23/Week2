interface Taxable{
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private String prodcutId;
    private String name;
    private double price;

    Product(String prodcutId, String name, double price) {
        this.prodcutId = prodcutId;
        this.name = name;
        this.price = price;
    }
    public String getProdcutId(){
        return prodcutId;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double Price){
        this.price = price;
    }
    public abstract double calculateDiscount();
}

class Electronics extends Product implements Taxable {
    Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }
    public double calculateDiscount(){
        return getPrice() * 0.1;
    }
    public double calculateTax(){
        return getPrice() * 0.18;
    }
    public String getTaxDetails(){
        return ("18% GST on Electronics");
    }
}

class Clothing extends Product implements Taxable{
    Clothing(String productId, String name, double price){
        super(productId, name, price);
    }
    public double calculateDiscount(){
        return getPrice() * 0.2;
    }
    public double calculateTax(){
        return getPrice() * 0.05;
    }
    public String getTaxDetails(){
        return ("5% GST on Clothing");
    }
}

class Groceries extends Product{
    Groceries(String productId, String name, double price){
        super(productId,name,price);
    }
    public double calculateDiscount(){
        return getPrice() * 0.05;
    }
}