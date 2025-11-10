package productapp.app;

import productapp.controller.ProductController;
import productapp.repository.InMemoryProductRepository;
import productapp.service.ProductService;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService(new InMemoryProductRepository());
        ProductController controller = new ProductController(service);
        controller.menu();
    }
}