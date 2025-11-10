package productapp.service;

import productapp.model.*;
import productapp.repository.ProductRepository;
import java.util.List;

public class ProductService {
    private ProductRepository repo;
    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public Product createProduct(String type, String name, String description, double price) {
        Product product;
        if ("laptop".equalsIgnoreCase(type)) {
            product = new Laptop(name, description, price, "Unknown", "Unknown");
        }else if ("smartphone".equalsIgnoreCase(type)) {
            product = new SmartPhone(name, description, price, false);
        }else {
            throw new IllegalArgumentException("Loai san pham khong hop le: " + type);
        }
        repo.save(product);
        return product;
    }

    public void save(Product product) {
        repo.save(product);
    }


    public boolean removeById(String id) {
        return repo.removeById(id);
    }


    public Product getById(String id) {
        return repo.findById(id);
    }


    public List<Product> getAll() {
        return repo.findAll();
    }

}
