import java.util.Scanner;
class Item {
    int itemCode;
    String itemName;
    double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("\nItem Details:");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class L1Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Code: ");
        int itemCode = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Item Name: ");
        String itemName = sc.nextLine();
        System.out.print("Enter Item Price: ");
        double price = sc.nextDouble();

        Item item = new Item(itemCode, itemName, price);
        item.displayDetails();

        System.out.print("\nEnter Quantity: ");
        int quantity = sc.nextInt();
        double totalCost = item.calculateTotalCost(quantity);

        System.out.println("Total Cost for " + quantity + " items: $" + totalCost);

        sc.close();
    }
}
