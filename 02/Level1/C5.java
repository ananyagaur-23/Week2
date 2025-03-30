class C5 {
    String title;
    String author;
    double price;
    boolean availibility;

    public C5(String title, String author, double price, boolean availibility) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availibility = availibility;
    }
    public void display() {
        System.out.println("Title of Book: " + title);
        System.out.println("Author of Book: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability of Book: " + (availibility ? "Available" : "Not Available"));
    }
    public String borrowBook() {
        if (availibility) {
            availibility = false;
            return "You have borrowed " + title;
        }
        return "Sorry, " + title + " is not available";
    }
    public static void main(String[] args) {
        C5 book1 = new C5("1984", "George Orwell", 15.99, true);
        System.out.println(book1.borrowBook());
        System.out.println(book1.borrowBook());
    }
}
