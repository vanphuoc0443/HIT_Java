import java.util.Arrays;

public class Ham {

    public static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i * i <= x; i++)
            if (x % i == 0) {
                return false;
            }
        return true;
    }

    public static int sumArray(int[] a) {
        int sum = 0;
        for (int x : a) {z
            sum += x;
        }
        return sum;
    }

    public static int maxArray(int[] a) {
        int max = a[0];
        for (int x : a) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public static int minArray(int[] a) {
        int min = a[0];
        for (int x : a) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    public static void sortArray(int[] a) {
        for  (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static int largestPrime(int[] a) {
        int maxPrime = -1;
        for (int x : a) {
            {
                if (isPrime(x) && x > maxPrime) {
                    maxPrime = x;
                }
            }
        }
        return maxPrime;
    }
}
