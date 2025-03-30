public class Main{
    public static void main(String[] args){
        LibraryItem[] items = {
                new Book("B23","Winds Speak","Shady Brook"),
                new Magazine("M79","People Time","Local Times"),
                new DVD("D40","Champak Games","TimTim Games")
        };
        for(LibraryItem item : items){
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: "+item.getLoanDuration()+" days");

            if(item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available: " + r.checkAvailability());
                r.reserveItem();
                System.out.println("Reserved. Available now: " + r.checkAvailability());
            }
            else {
                System.out.println("Not Reservable");
            }
            System.out.println();
        }
    }
}