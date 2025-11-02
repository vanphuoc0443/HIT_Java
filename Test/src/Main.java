import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int first,second;
//        first = sc.nextInt();
//        second = sc.nextInt();
//        System.out.println(first+second);
//        System.out.println(first-second);
//        System.out.println(first*second);
//        System.out.println(first/second);
//        System.out.println(first%second);

        int hour, minute, second, secondT;
        second = sc.nextInt();
        hour = second / 3600;
        minute = second / 60;
        secondT = second % 60;
        System.out.println("Hour: " + hour + " Minute: " + minute + " Second: " + secondT);
    }
}