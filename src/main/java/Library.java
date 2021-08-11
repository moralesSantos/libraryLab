import java.util.List;
import java.util.ArrayList;

public class Library extends Book{
    // Add the missing implementation to this class
    private String name;
    private String libLocation;
    final private String libHours = "9:00 AM to 5:00PM";

    private ArrayList<Book> bookList = new ArrayList<Book>();


   public Library(String location){
       this.libLocation = location;
   }

   public void addBook(Book book){
       this.bookList.add(book);
    }

    public void printOpeningHours(){
        System.out.println("Libraries are open daily from: " + getLibHours());
    }

    public String getLibHours(){
       return libHours;
    }

    public String getLibLocation(){
       return this.libLocation;
    }

    public void printAddress(){
        System.out.println(getLibLocation());
    }

    public void borrowBook(String title){
       boolean available = false;
       for (Book b : this.bookList) {
           if (b.title.equals(title)) {
               available = true;
               if (!b.borrowed) {
                   System.out.println("You succesfully rented: " + title);
                   b.borrowed = true;
               } else System.out.println("Sorry, this book is already borrowed");
           }
       }
       if (!available){
           System.out.println("Sorry, this book is not in our catalog");
       }
    }


    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");


        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        firstLibrary.printOpeningHours();
        System.out.println();
//
        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();
//
//        Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
//        System.out.println();
//
//        // Print the titles of all available books from both libraries
//        System.out.println("Books available in the first library:");
//        firstLibrary.printAvailableBooks();
//        System.out.println();
//        System.out.println("Books available in the second library:");
//        secondLibrary.printAvailableBooks();
//        System.out.println();
//
//        // Return The Lords of the Rings to the first library
//        System.out.println("Returning The Lord of the Rings:");
//        firstLibrary.returnBook("The Lord of the Rings");
//        System.out.println();
//
//        // Print the titles of available from the first library
//        System.out.println("Books available in the first library:");
//        firstLibrary.printAvailableBooks();
    }
}
