class A2 {
    public String ISBN;
    protected String title;
    private String author;

    A2(String ISBN, String title, String author) {
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

class EBook extends A2 {
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