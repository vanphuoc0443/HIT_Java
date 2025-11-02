import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static List<User> list = new ArrayList<>();

    public static void main(String[] args) {
        input();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Chuyển tiền");
            System.out.println("2. Rút tiền");
            System.out.println("3. Nạp tiền");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choose = sc.nextInt();

            switch (choose) {
                case 1:
                    System.out.print("Nhập id người gửi: ");
                    tranfer(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Nhập id người dùng: ");
                    withDraw(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Nhập id người dùng: ");
                    deposit(sc.nextInt());
                    break;
                case 4:
                    System.out.println("Tạm biệt!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
            output();
        }
    }

    public static void input() {
        System.out.print("Nhập số lượng người dùng: ");
        int nums = sc.nextInt();
        for (int i = 0; i < nums; i++) {
            int tt = i + 1;
            System.out.print("Nhập tên người dùng số " + tt + ": ");
            String name = sc.next();
            System.out.print("Nhập số tiền: ");
            double balance = sc.nextDouble();
            list.add(new User(name, balance));
        }
        output();
    }

    public static void output() {
        System.out.println("\n===== DANH SÁCH NGƯỜI DÙNG =====");
        for (User u : list) System.out.println(u);
    }

    public static User findUser(int id) {
        return list.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Không tìm thấy người dùng có id: " + id));
    }


    public static void withDraw(int id) {
        try {
            User user = findUser(id);
            System.out.print("Nhập số tiền cần rút: ");
            double amount = sc.nextDouble();
            user.withDraw(amount);
            System.out.println("Rút tiền thành công!");
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public static void deposit(int id) {
        try {
            User user = findUser(id);
            System.out.print("Nhập số tiền cần nạp: ");
            double amount = sc.nextDouble();
            user.deposit(amount);
            System.out.println("Nạp tiền thành công!");
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void tranfer(int id1) {
        try {
            User sender = findUser(id1);
            System.out.print("Nhập id người nhận: ");
            User receiver = findUser(sc.nextInt());

            System.out.print("Nhập số tiền chuyển: ");
            double amount = sc.nextDouble();

            sender.withDraw(amount);
            receiver.deposit(amount);

            System.out.println("Chuyển tiền thành công!");
        } catch (NoSuchElementException | IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
