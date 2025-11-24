package utils;

import model.Student;
import constant.*;
public class ValidationUtils {
    public static boolean isValidProduct(Student p) {
        if (p.getName() == null || p.getName().trim().isEmpty()) {
            System.out.println(Constant.ERR_EMPTY_NAME);
            return false;
        }
        if (p.getAge() < 0 || p.getAge() > 100) {
            System.out.println(Constant.ERR_AGE);
            return false;
        }
        return true;
    }
}
