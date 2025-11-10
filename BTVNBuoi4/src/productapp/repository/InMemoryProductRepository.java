package productapp.repository;

import productapp.model.Product;
import java.util.ArrayList;
import java.util.List;

public class InMemoryProductRepository implements ProductRepository{
    private final List<Product> products = new ArrayList<>();

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public boolean removeById(String id) {
        return products.removeIf(p -> p.getId() == Integer.parseInt(id));
    }

    @Override
    public Product findById(String id) {
        for (Product p : products) {
            if (p.getId() == Integer.parseInt(id)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products);
    }
}
