package productapp.app;

import productapp.controller.ProductController;
import productapp.service.ProductService;
import productapp.repository.InMemoryProductRepository;
import productapp.util.InputUtils;

public class Main {
    public static void main(String[] args) {
        InMemoryProductRepository repository = new InMemoryProductRepository();
        ProductService service = new ProductService(repository);
        ProductController controller = new ProductController(service);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add book");
            System.out.println("2. Find book by ID");
            System.out.println("3. Find books by category (TextBook/Novel)");
            System.out.println("4. Show all books");
            System.out.println("5. Delete book by ID");
            System.out.println("6. Calculate total value");
            System.out.println("0. Exit");

            int choice = InputUtils.inputInt("Choose option: ");

            switch (choice) {
                case 1:
                    controller.addBook();
                    break;
                case 2:
                    controller.findBookById();
                    break;
                case 3:
                    controller.findBooksByCategory();
                    break;
                case 4:
                    controller.showAllBooks();
                    break;
                case 5:
                    controller.deleteBook();
                    break;
                case 6:
                    controller.calculateTotalValue();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}