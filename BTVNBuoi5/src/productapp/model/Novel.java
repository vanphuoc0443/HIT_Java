package productapp.model;

public class Novel extends Book {
    private String genre;

    public Novel() {
    }

    public Novel(String title, String author, double price, int quantity, String genre) {
        super(title, author, price, quantity);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("=== NOVEL ===");
        System.out.println("ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: " + getPrice());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Genre: " + genre);
    }
}