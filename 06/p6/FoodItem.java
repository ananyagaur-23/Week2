interface Discountable{
    double applyDiscount();
    String getDiscountDetails();
}
abstract class FoodItem {
    String itemName;
    double price;
    int quantity;

    FoodItem(String itemName, double price, int quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity =quantity;
    }
    public String getItemName(){
        return itemName;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public String getItemDetails(){
        return ("Item: "+itemName+"\nPrice: "+price+"\nQuantity: "+quantity);
    }
    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem implements Discountable{
    VegItem(String itemName, double price, int quantity){
        super(itemName,price,quantity);
    }
    public double calculateTotalPrice(){
        return getPrice() * getQuantity();
    }
    public double applyDiscount(){
        return calculateTotalPrice() * 0.10;
    }
    public String getDiscountDetails(){
        return "10% discount on Veg items";
    }
}

class NonVegItem extends FoodItem implements Discountable{
    NonVegItem(String itemName, double price, int quantity){
        super(itemName,price,quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 30;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }
    public String getDiscountDetails() {
        return "5% discount on Non-Veg items";
    }
}