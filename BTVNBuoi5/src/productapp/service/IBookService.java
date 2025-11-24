package productapp.service;

import productapp.model.Book;

public interface IBookService {
    void addBook(Book book);
    Book getBookById(String id);
    Object getAllBooksByCategory(Object category);
    void deleteBookById(String id);
    Object getAllBooks();
    void calculateTotalValue();
}
