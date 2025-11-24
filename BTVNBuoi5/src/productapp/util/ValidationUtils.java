package productapp.util;

public class ValidationUtils {

    public static boolean isValidId(String id) {
        return id != null && !id.trim().isEmpty();
    }

    public static boolean isValidPrice(double price) {
        return price > 0;
    }

    public static boolean isValidQuantity(int quantity) {
        return quantity >= 0;
    }

    public static boolean isValidString(String str) {
        return str != null && !str.trim().isEmpty();
    }
}