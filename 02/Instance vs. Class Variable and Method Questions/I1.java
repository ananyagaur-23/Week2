class I1 {
    String productName;
    double price;
    static int totalProducts = 0;

    public I1(String productName, double price) {
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
        I1 p1 = new I1("Laptop", 1200.99);
        I1 p2 = new I1("Smartphone", 799.49);

        p1.displayProductDetails();
        p2.displayProductDetails();
        I1.displayTotalProducts();
    }
}
