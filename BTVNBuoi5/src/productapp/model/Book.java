package productapp.model;

import java.util.UUID;

public abstract class Book implements Borrowable {
    private final String id = UUID.randomUUID().toString();
    private String title;
    private String author;
    private double price;
    private int quantity;

    public Book() {
    }

    public Book(String title, String author, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract void displayInfo();

    @Override
    public boolean borrow(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
            return true;
        }
        return false;
    }

    @Override
    public int getAvailableQuantity() {
        return this.quantity;
    }
}
