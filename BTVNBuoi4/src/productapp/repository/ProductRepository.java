package productapp.repository;

import productapp.model.Product;
import java.util.List;

public interface ProductRepository {
    void save(Product product);
    boolean removeById(String id);
    Product findById(String id);
    List<Product> findAll();
}
