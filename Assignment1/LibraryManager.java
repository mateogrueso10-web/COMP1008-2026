package Assignment1;

import java.util.*;

public class LibraryManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();

        // Adding some books to the library
        int choice;
        do {
        System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add a new book");
            System.out.println("2. Display all books");
            System.out.println("3. Display available books");
            System.out.println("4. Search books by author");
            System.out.println("5. Check out a book");
            System.out.println("6. Return a book");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number between 1 and 7: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice){
                case 1: 
                    // Add book
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();

                    System.out.print("Enter ISBN (10 or 13 chars): ");
                    String isbn = scanner.nextLine();

                    Book newBook = new Book(title, author, isbn);
                    library.add(newBook);

                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    // Display all books
                    if (library.isEmpty()) {
                        System.out.println("No books in the library.");
                    } else {
                        System.out.println("Books in the library:");
                        for (Book book : library) {
                            System.out.println(book);
                        }
                    }
                    break;
                
                case 3:
                    // Display available books
                    boolean foundAvailable = false;

                    for (Book book : library) {
                        if (book.isAvailable()) {
                            book.displayInfo();
                            foundAvailable = true;
                        }
                    }

                    if (!foundAvailable) {
                        System.out.println("No available books.");
                    }
                    break;

                case 4:
                    // Search by author
                    System.out.print("Enter author name to search: ");
                    String searchAuthor = scanner.nextLine();
                    boolean foundAuthor = false;
                    for (Book book : library) {
                        if (book.getAuthor().equalsIgnoreCase(searchAuthor)) {
                            book.displayInfo();
                            foundAuthor = true;
                        }
                    }
                    if (!foundAuthor) {
                        System.out.println("No books found by that author.");
                    }
                    break;
                
                

            }
        } while (choice != 7);
        scanner.close();


    }
}
