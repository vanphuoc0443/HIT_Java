public class ValidationUtils {
    public static boolean isValidProduct(Animal p) {
        if (p.getName() == null || p.getName().trim().isEmpty()) {
            System.out.println(Constant.ERR_INVALID_AGE);
            return false;
        }
        if (p.getAge() < 0 || p.getAge() > 100) {
            System.out.println(Constant.ERR_INVALID_AGE);
            return false;
        }
        return true;
    }
}
