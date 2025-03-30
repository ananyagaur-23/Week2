public class Main{
    public static void main(String[] args){
        FoodItem[] order = {
                new VegItem("Corn Bread",120, 4),
                new NonVegItem("Chicken Nuggets", 100, 3)
        };

        for(FoodItem item : order) {
            System.out.println(item.getItemDetails());
            System.out.println("Total Bill: " + item.calculateTotalPrice());
            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                System.out.println(d.getDiscountDetails());
                System.out.println("Discount Applied: " + d.applyDiscount());
                System.out.println("Final Price: " + (item.calculateTotalPrice() - d.applyDiscount()));
            }
            System.out.println();
        }
    }
}