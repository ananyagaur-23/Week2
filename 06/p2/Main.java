public class Main{
    public static void main(String[] args){
        Product[] products = {
            new Electronics("E203","CPU",5000),
            new Clothing("C104","Graphic Tee",500),
            new Groceries("G505","Broccoli",250)
        };
        printFinalPrice(products);
    }

    public static void printFinalPrice(Product[] products){
        for(Product p : products){
            double tax = 0;
            if(p instanceof Taxable){
                tax = ((Taxable)p).calculateTax();
            }
            double discount = p.calculateDiscount();
            double finalPrice = p.getPrice() + tax - discount;
            System.out.println("Product: "+ p.getName());
            System.out.println("Price: "+ p.getPrice());
            System.out.println("Discount: "+ discount);
            System.out.println("Tax: "+ tax);
            System.out.println("Final price: "+ finalPrice);
            System.out.println();
        }
    }
}