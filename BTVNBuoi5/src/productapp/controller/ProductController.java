package productapp.controller;

import productapp.model.Book;
import productapp.model.TextBook;
import productapp.model.Novel;
import productapp.service.IBookService;
import productapp.util.InputUtils;
import productapp.util.ValidationUtils;
import productapp.common.Constants;
import java.util.List;

public class ProductController {
    private IBookService bookService;

    public ProductController(IBookService bookService) {
        this.bookService = bookService;
    }

    public void addBook() {
        System.out.println("\n=== ADD NEW BOOK ===");
        System.out.println("1. TextBook");
        System.out.println("2. Novel");
        int choice = InputUtils.inputInt("Choose book type: ");

        String title = InputUtils.inputString("Enter title: ");
        String author = InputUtils.inputString("Enter author: ");
        double price = InputUtils.inputDouble("Enter price: ");
        int quantity = InputUtils.inputInt("Enter quantity: ");

        Book book = null;
        if (choice == 1) {
            String subject = InputUtils.inputString("Enter subject: ");
            book = new TextBook(title, author, price, quantity, subject);
        } else if (choice == 2) {
            String genre = InputUtils.inputString("Enter genre: ");
            book = new Novel(title, author, price, quantity, genre);
        }

        if (book != null) {
            bookService.addBook(book);
        }
    }

    public void findBookById() {
        System.out.println("\n=== FIND BOOK BY ID ===");
        String id = InputUtils.inputString("Enter book ID: ");
        Book book = bookService.getBookById(id);

        if (book != null) {
            book.displayInfo();
        } else {
            System.out.println("Book not found!");
        }
    }

    public void findBooksByCategory() {
        System.out.println("\n=== FIND BOOKS BY CATEGORY ===");
        System.out.println("1. TextBook");
        System.out.println("2. Novel");
        int choice = InputUtils.inputInt("Choose category: ");

        String category = (choice == 1) ? Constants.TEXTBOOK : Constants.NOVEL;
        List<Book> books = (List<Book>) bookService.getAllBooksByCategory(category);

        if (books.isEmpty()) {
            System.out.println("No books found in this category!");
        } else {
            for (Book book : books) {
                book.displayInfo();
                System.out.println();
            }
        }
    }

    public void showAllBooks() {
        System.out.println("\n=== ALL BOOKS ===");
        List<Book> books = (List<Book>) bookService.getAllBooks();

        if (books.isEmpty()) {
            System.out.println("No books available!");
        } else {
            for (Book book : books) {
                book.displayInfo();
                System.out.println();
            }
        }
    }

    public void deleteBook() {
        System.out.println("\n=== DELETE BOOK ===");
        String id = InputUtils.inputString("Enter book ID to delete: ");
        bookService.deleteBookById(id);
    }

    public void calculateTotalValue() {
        System.out.println("\n=== CALCULATE TOTAL VALUE ===");
        bookService.calculateTotalValue();
    }
}