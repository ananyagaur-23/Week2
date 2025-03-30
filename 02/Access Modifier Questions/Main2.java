public class Main2 {
    public static void main(String[] args) {
        EBook ebook = new EBook("978-3-16-148410-0", "Java Programming", "James Gosling");
        ebook.displayDetails();

        ebook.setAuthor("Joshua Bloch");
        System.out.println("\nUpdated EBook Details:");
        ebook.displayDetails();
    }
}