import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double quantity;
    private double pricePerUnit;

    public Product(String name, double quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public double getTotalPrice() {
        return quantity * pricePerUnit;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}

class Customer {
    private String name;
    private List<Product> products;

    public Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }
}

public class BillGenerator {

    public double generateBill(Customer customer) {
        double total = 0;
        for (Product product : customer.getProducts()) {
            total += product.getTotalPrice();
        }
        return total;
    }

    public void printBill(Customer customer) {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Purchased Items:");
        for (Product product : customer.getProducts()) {
            System.out.printf("%s - %.2f units @ $%.2f = $%.2f%n",
                    product.getName(),
                    product.getQuantity(),
                    product.getPricePerUnit(),
                    product.getTotalPrice());
        }
        double total = generateBill(customer);
        System.out.printf("Total Bill: $%.2f%n", total);
    }
}

public class BillLog {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice");

        customer.addProduct(new Product("Apples", 2, 3));
        customer.addProduct(new Product("Milk", 1, 2));

        BillGenerator billGen = new BillGenerator();
        billGen.printBill(customer);
    }
}
