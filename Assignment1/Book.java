package Assignment1;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.isbn = "0000000000";
        this.available = true;
    }

    // Parameterized constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }

    // Getters
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    //settters with validation
    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Invalid title. Title cannot be empty.");
        }
    }

    public void setAuthor(String author) {
        if (author != null && !author.isEmpty()) {
            this.author = author;
        } else {
            System.out.println("Invalid author. Author cannot be empty.");
        }
    }

    public void setIsbn(String isbn) {
        if (isbn != null && !isbn.isEmpty()) {
            this.isbn = isbn;
        } else {
            System.out.println("Invalid ISBN. ISBN cannot be empty.");
        }
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Available: " + (available ? "Yes" : "No"));
        System.out.println("----------------------------");
    }

}
