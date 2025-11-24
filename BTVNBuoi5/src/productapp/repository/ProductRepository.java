package productapp.repository;

import productapp.model.Book;
import java.util.List;

public interface ProductRepository {
    void add(Book book);
    Book findById(String id);
    List<Book> findAll();
    void deleteById(String id);
}