import java.util.ArrayList;
import java.util.Scanner;
class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return price * quantity;
    }
}

class ShoppingCart {
    ArrayList<CartItem> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    public void addItem(String itemName, double price, int quantity) {
        cart.add(new CartItem(itemName, price, quantity));
        System.out.println(itemName + " added to cart.");
    }

    public void removeItem(String itemName) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).itemName.equalsIgnoreCase(itemName)) {
                cart.remove(i);
                System.out.println(itemName + " removed from cart.");
                return;
            }
        }
        System.out.println(itemName + " not found in cart.");
    }

    public void displayTotalCost() {
        double total = 0;
        for (CartItem item : cart) {
            total += item.getTotalCost();
        }
        System.out.println("Total Cost: $" + total);
    }
}

public class L2Q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\n1. Add Item\n2. Remove Item\n3. Display Total Cost\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Item Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Price: ");
                double price = sc.nextDouble();
                System.out.print("Enter Quantity: ");
                int quantity = sc.nextInt();
                cart.addItem(name, price, quantity);
            } else if (choice == 2) {
                System.out.print("Enter Item Name to Remove: ");
                String name = sc.nextLine();
                cart.removeItem(name);
            } else if (choice == 3) {
                cart.displayTotalCost();
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice, try again.");
            }
        }
        sc.close();
    }
}
