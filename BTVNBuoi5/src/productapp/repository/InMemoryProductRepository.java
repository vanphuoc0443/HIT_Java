package productapp.repository;

import productapp.model.Book;
import java.util.ArrayList;
import java.util.List;

public class InMemoryProductRepository implements ProductRepository {
    private List<Book> books;

    public InMemoryProductRepository() {
        this.books = new ArrayList<>();
    }

    @Override
    public void add(Book book) {
        books.add(book);
    }

    @Override
    public Book findById(String id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(books);
    }

    @Override
    public void deleteById(String id) {
        books.removeIf(book -> book.getId().equals(id));
    }
}