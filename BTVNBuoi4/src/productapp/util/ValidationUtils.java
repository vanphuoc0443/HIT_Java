package productapp.util;

import productapp.model.Product;
import productapp.common.Constants;

public class ValidationUtils {

    public static boolean isValidProduct(Product p) {
        if (p.getName() == null || p.getName().trim().isEmpty()) {
            System.out.println(Constants.EMPTY_NAME);
            return false;
        }
        if (p.getPrice() < 0) {
            System.out.println(Constants.NEGATIVE_PRICE);
            return false;
        }
        return true;
    }
}
