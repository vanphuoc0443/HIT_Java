package utils;

import constant.Constant;

import java.util.Scanner;

public class InputUtils {
    private static final Scanner sc = new Scanner(System.in);
    public static String readString(String message) {
        System.out.print(message);
        String input = sc.nextLine().trim();
        while (input.isEmpty()) {
            System.out.print("Không được để trống, nhập lại: ");
            input = sc.nextLine().trim();
        }
        return input;
    }

    public static int readInt(String message) {
        while (true) {
            try {
                System.out.println(message);
                return Integer.parseInt(sc.nextLine().trim());
            }catch (NumberFormatException e) {
                System.out.println("Vui long nhap lai!");
            }

        }
    }
}
