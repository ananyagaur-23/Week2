import java.util.*;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    int orderId;
    List<Product> productList = new ArrayList<>();
    Customers customer;

    public Order(int orderId, Customers customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : productList) {
            total += p.getPrice();
        }
        return total;
    }

    public void printOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        for (Product p : productList) {
            System.out.println("Product: " + p.getName() + ", Price: $" + p.getPrice());
        }
        System.out.println("Total: $" + calculateTotal());
    }
}

class Customers {
    String name;
    List<Order> orders = new ArrayList<>();

    public Customers(String name) {
        this.name = name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public String getName() {
        return name;
    }

    public List<Order> getOrders() {
        return orders;
    }
}

class ECommercePlatform {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1000);
        Product p2 = new Product("Phone", 600);
        Product p3 = new Product("Headphones", 150);

        Customers c1 = new Customers("Emma");

        Order o1 = new Order(101, c1);
        o1.addProduct(p1);
        o1.addProduct(p3);

        Order o2 = new Order(102, c1);
        o2.addProduct(p2);

        c1.placeOrder(o1);
        c1.placeOrder(o2);

        for (Order o : c1.getOrders()) {
            o.printOrderDetails();
            System.out.println();
        }
    }
}
