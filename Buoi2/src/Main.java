import java.util.Scanner;

public class Main {
//    private static boolean isPrime(int n) {
//        if (n < 2)
//            return false;
//        for (int i = 2; i * i <= n; ++i)
//            if (n % i == 0)
//                return false;
//        return true;
//    }
    static void printArrayReverse(){
        for(int i = Mang.array.length; i >= 0; i--){
            System.out.print(Mang.array[i] + " ");
        }
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] nums = new int[100];
//        System.out.println("Size of array: ");
//        int size = sc.nextInt();
//        System.out.println("Enter array numbers: ");
//        for (int i = 0; i < size; i++) {
//            nums[i] = sc.nextInt();
//        }
//        System.out.println("1.Sum and product");
//        System.out.println("2.Is prime");
//        int chon = sc.nextInt();
//        switch (chon){
//            case 1:
//                int tong = 0, tich = 0;
//                for (int num : nums) {
//                    tong += num;
//                    tich *= num;
//                }
//                System.out.println("Tong: " + tong);
//                System.out.println("Tich: " + tich);
//                break;
//            case 2:
//                System.out.println("List of prime numbers in array: ");
//                for (int num : nums) {
//                    if (isPrime(num)) {
//                        System.out.print(num + " ");
//                    }
//                }
//                break;
//        }
        Mang.print();
        System.out.println();
        printArrayReverse();
    }
}