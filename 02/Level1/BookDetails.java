public class BookDetails {
    String title;
    String author;
    double price;

    public BookDetails() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public BookDetails(String title, String author, double price) {
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
        BookDetails defaultBook = new BookDetails();
        System.out.println("Default Book:");
        defaultBook.displayDetails();

        System.out.println();

        BookDetails paramBook = new BookDetails("The Alchemist", "Paulo Coelho", 12.99);
        System.out.println("Parameterized Book:");
        paramBook.displayDetails();
    }
}
