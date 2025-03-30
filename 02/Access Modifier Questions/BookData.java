class BookData {
    public String ISBN;
    protected String title;
    private String author;

    BookData(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends BookData {
    EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    void displayDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }
}
public class Main{
    public static void main(String[] args) {
        EBook ebook = new EBook("978-3-16-148410-0", "Java Programming", "James Gosling");
        ebook.displayDetails();

        ebook.setAuthor("Joshua Bloch");
        System.out.println("\nUpdated EBook Details:");
        ebook.displayDetails();
    }
}