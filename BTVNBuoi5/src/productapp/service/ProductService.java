package productapp.service;

import productapp.model.Book;
import productapp.model.TextBook;
import productapp.model.Novel;
import productapp.repository.ProductRepository;
import java.util.ArrayList;
import java.util.List;

public class ProductService implements IBookService {
    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addBook(Book book) {
        repository.add(book);
        System.out.println("Book added successfully!");
    }

    @Override
    public Book getBookById(String id) {
        return repository.findById(id);
    }

    @Override
    public Object getAllBooksByCategory(Object category) {
        List<Book> allBooks = repository.findAll();
        List<Book> result = new ArrayList<>();
        String categoryStr = (String) category;

        for (Book book : allBooks) {
            if (categoryStr.equalsIgnoreCase("TextBook") && book instanceof TextBook) {
                result.add(book);
            } else if (categoryStr.equalsIgnoreCase("Novel") && book instanceof Novel) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public void deleteBookById(String id) {
        repository.deleteById(id);
        System.out.println("Book deleted successfully!");
    }

    @Override
    public Object getAllBooks() {
        return repository.findAll();
    }

    @Override
    public void calculateTotalValue() {
        List<Book> allBooks = repository.findAll();
        double total = 0;

        for (Book book : allBooks) {
            total += book.getPrice() * book.getQuantity();
        }

        System.out.println("Total value of all books: " + total);
    }
}
