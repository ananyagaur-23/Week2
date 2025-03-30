public class C1 {
    String title;
    String author;
    double price;

    public C1() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public C1(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        C1 defaultBook = new C1();
        System.out.println("Default Book:");
        defaultBook.displayDetails();

        System.out.println();

        C1 paramBook = new C1("The Alchemist", "Paulo Coelho", 12.99);
        System.out.println("Parameterized Book:");
        paramBook.displayDetails();
    }
}
