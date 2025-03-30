class ProductDetails {
    String productName;
    double price;
    static int totalProducts = 0;

    public ProductDetails(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Name of the product: " + productName);
        System.out.println("Price: $" + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        ProductDetails p1 = new ProductDetails("Laptop", 1200.99);
        ProductDetails p2 = new ProductDetails("Smartphone", 799.49);

        p1.displayProductDetails();
        p2.displayProductDetails();
        ProductDetails.displayTotalProducts();
    }
}
