package productapp.controller;


import productapp.model.*;
import productapp.service.ProductService;
import productapp.util.InputUtils;


import java.util.List;
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    public void menu(){
        while(true){
            System.out.println("\n===== PRODUCT APP =====");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị tất cả sản phẩm");
            System.out.println("3. Tìm sản phẩm theo id");
            System.out.println("4. Xóa sản phẩm theo id");
            System.out.println("5. Thoát");

            int choice = InputUtils.readInt("Chọn chức năng (1-5): ");
            switch (choice) {
                case 1:
                    handleAdd();
                    break;
                case 2:
                    handleList();
                    break;
                case 3:
                    handleFind();
                    break;
                case 4:
                    handleRemove();
                    break;
                case 5:
                    System.out.println("Thoát chương trình. Tạm biệt!");
                    InputUtils.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
    private void handleAdd() {
        String type = InputUtils.readString("Nhập loại sản phẩm (laptop/smartphone): ");
        String name = InputUtils.readString("Nhập tên sản phẩm: ");
        String desc = InputUtils.readString("Nhập mô tả: ");
        double price = InputUtils.readDouble("Nhập giá: ");

        Product product;
        if (type.equalsIgnoreCase("laptop")) {
            String ram = InputUtils.readString("Nhập RAM: ");
            String cpu = InputUtils.readString("Nhập CPU: ");
            product = new Laptop(name, desc, price, ram, cpu);
        } else if (type.equalsIgnoreCase("smartphone")) {
            boolean has5G = InputUtils.readBoolean("Có hỗ trợ 5G không?");
            product = new SmartPhone(name, desc, price, has5G);
        } else {
            System.out.println("Loại sản phẩm không hợp lệ!");
            return;
        }

        service.save(product);
        System.out.println("Đã thêm sản phẩm: " + product.getInfo());
    }

    private void handleList() {
        List<Product> list = service.getAll();
        if (list.isEmpty()) {
            System.out.println("Chưa có sản phẩm nào!");
            return;
        }
        System.out.println("\n--- DANH SÁCH SẢN PHẨM ---");
        for (Product p : list) {
            System.out.println(p.getInfo());
        }
    }

    private void handleFind() {
        String id = InputUtils.readString("Nhập id sản phẩm cần tìm: ");
        Product found = service.getById(id);
        if (found != null) {
            System.out.println("Tìm thấy: " + found.getInfo());
        } else {
            System.out.println("Không tìm thấy sản phẩm vớiid này!");
        }
    }

    private void handleRemove() {
        String id = InputUtils.readString("Nhập id sản phẩm cần xóa: ");
        boolean removed = service.removeById(id);
        System.out.println(removed ? "Đã xóa sản phẩm thành công!" : "Không tìm thấy sản phẩm để xóa!");
    }
}
