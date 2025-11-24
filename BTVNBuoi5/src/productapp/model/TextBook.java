package productapp.model;

public class TextBook extends Book {
    private String subject;

    public TextBook() {
    }

    public TextBook( String title, String author, double price, int quantity, String subject) {
        super(title, author, price, quantity);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        System.out.println("=== TEXTBOOK ===");
        System.out.println("ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: " + getPrice());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Subject: " + subject);
    }
}