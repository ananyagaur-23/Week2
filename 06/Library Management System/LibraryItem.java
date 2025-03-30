interface Reservable{
    void reserveItem();
    boolean checkAvailability();
}
abstract class LibraryItem {
    String itemId;
    String title;
    String author;

    LibraryItem(String  itemId, String title, String author){
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    public String getItemId(){
        return itemId;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getItemDetails(){
        return "ID: "+itemId+"\nTitle: "+title+"\nAuthor: "+author;
    }
    public abstract int getLoanDuration();
}

class Book extends LibraryItem implements Reservable{
    private boolean available;
    Book(String  itemId, String title, String author){
        super(itemId,title,author);
        this.available = true;
    }
    public int getLoanDuration() {
        return 14;
    }
    public boolean checkAvailability() {
        return available;
    }
    public void reserveItem() {
        available =false;
    }
}

class Magazine extends LibraryItem{
    public Magazine(String  itemId, String title, String author){
        super(itemId,title,author);
    }
    public int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem implements Reservable{
    private boolean available;
    DVD(String  itemId, String title, String author){
        super(itemId,title,author);
        this.available = true;
    }

    @Override
    public int getLoanDuration() {
        return 5;
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }

    @Override
    public void reserveItem() {
        available = false;
    }
}