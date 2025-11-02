import model.User;
import service.AuthService;
import service.UserService;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static UserService userService = new UserService();
    private static AuthService authService = new AuthService(userService);
    private static User currentUser = null;

    public static void main(String[] args) {
        while (true) {
            if (currentUser == null) {
                showAuthMenu();
            } else {
                showUserMenu();
            }
        }
    }

    private static void showAuthMenu() {
        System.out.println("\n--- Menu Auth ---");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        System.out.print("Chon: ");

        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                handleLogin();
                break;
            case 2:
                register();
                break;
            case 3:
                System.exit(0);
                break;
        }
    }

    private static void handleLogin() {
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        currentUser = authService.login(username, password);
        if (currentUser != null) {
            System.out.println("Dang nhap thanh cong!");
        } else {
            System.out.println("Dang nhap that bai!");
        }
    }

    private static void register() {
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Phone: ");
        String phoneNumber = scanner.nextLine();

        if (authService.register(username, password, email, phoneNumber)) {
            System.out.println("Dang ky thanh cong!");
        } else {
            System.out.println("Dang ky that bai!");
        }
    }

    private static void showUserMenu() {
        System.out.println("\n--- Menu User ---");
        System.out.println("1. Get user by id");
        System.out.println("2. Get all user");
        System.out.println("3. Change password");
        System.out.println("4. Logout");
        System.out.print("Chon: ");

        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                getUserById();
                break;
            case 2:
                getAllUsers();
                break;
            case 3:
                changePassword();
                break;
            case 4:
                currentUser = null;
                System.out.println("Da dang xuat!");
                break;
        }
    }

    private static void getUserById() {
        System.out.print("Nhap user ID: ");
        String userId = scanner.nextLine();

        User user = userService.getUserById(userId);
        if (user != null) {
            System.out.println(user);
        } else {
            System.out.println("Khong tim thay user!");
        }
    }

    private static void getAllUsers() {
        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }

    private static void changePassword() {
        System.out.print("Mat khau moi: ");
        String newPassword = scanner.nextLine();
        System.out.print("Xac nhan mat khau moi: ");
        String confirmPassword = scanner.nextLine();

        if (authService.changePassword(currentUser.getId(), newPassword, confirmPassword)) {
            System.out.println("Doi mat khau thanh cong!");
        } else {
            System.out.println("Doi mat khau that bai!");
        }
    }
}