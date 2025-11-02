import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu N: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Nhap mang:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int choice;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Tinh tong cac phan tu trong mang");
            System.out.println("2. In ra phan tu lon nhat, nho nhat trong mang");
            System.out.println("3. Sap xep mang theo chieu tang dan");
            System.out.println("4. In ra so nguyen to lon nhat trong mang");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Tong = " + Ham.sumArray(a));
                    break;

                case 2:
                    System.out.println("Lon nhat = " + Ham.maxArray(a));
                    System.out.println("Nho nhat = " + Ham.minArray(a));
                    break;

                case 3:
                    Ham.sortArray(a);
                    System.out.println("Mang sau khi sap xep:");
                    for (int x : a) System.out.print(x + " ");
                    System.out.println();
                    break;

                case 4:
                    int largestPrime = Ham.largestPrime(a);
                    if (largestPrime == -1)
                        System.out.println("Khong co so nguyen to!");
                    else
                        System.out.println("So nguyen to lon nhat = " + largestPrime);
                    break;

                case 0:
                    System.out.println("Da thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (choice != 0);
    }
}
