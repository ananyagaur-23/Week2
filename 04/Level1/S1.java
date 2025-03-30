import java.util.ArrayList;
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    private String name;
    private ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayLibrary() {
        System.out.println("Library: " + name);
        System.out.println("Books:");
        for (Book book : books) {
            book.displayBook();
        }
        System.out.println();
    }
}
public class S1 {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("The Alchemist", "Paulo Coelho");
        Book b3 = new Book("To Kill a Mockingbird", "Harper Lee");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("University Library");

        lib1.addBook(b1);
        lib1.addBook(b2);
        lib2.addBook(b2);
        lib2.addBook(b3);
        lib1.displayLibrary();
        lib2.displayLibrary();
    }
}
